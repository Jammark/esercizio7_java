package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {


		List<Integer> lista = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 3000; i++) {
			lista.add(r.nextInt(100));

		}
		Integer[] arr = new Integer[0], arr2 = new Integer[0], arr3 = new Integer[0];
		SumThread t1 = new SumThread((Integer[]) lista.subList(0, 1000).toArray(arr), "Thread1");
		SumThread t2 = new SumThread((Integer[]) lista.subList(1000, 2000).toArray(arr), "Thread2");
		SumThread t3 = new SumThread((Integer[]) lista.subList(2000, 3000).toArray(arr), "Thread3");



		try {
			t1.start();
			t2.start();
			t3.start();

			t1.join();
			t2.join();
			t3.join();

			long sum = t1.getSum() + t2.getSum() + t3.getSum();
			log.info("La somma è pari a: " + sum);
		} catch (InterruptedException | NullPointerException e) {
			log.error(e.getMessage());
		}
	}

}
