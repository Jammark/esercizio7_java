package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SumThread extends Thread {

	private static final Logger log = LoggerFactory.getLogger(SumThread.class);

	private long sum = 0l;
	private Integer[] valori;

	public SumThread(Integer[] valori, String name) {
		super(name);
		this.valori = valori;
	}

	public long getSum() {
		return sum;
	}

	@Override
	public void run() {

		super.run();
		log.info(this.getName() + " size: " + this.valori.length);

		for (Integer i : this.valori) {
			if (i == null) {
				System.out.println("is null");
				continue;
			}
			this.sum += i.longValue();
		}
	}

}
