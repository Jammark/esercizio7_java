package esercizio1;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new SymbolThread('*', Colors.ANSI_GREEN);
		Thread t2 = new SymbolThread('#', Colors.ANSI_PURPLE);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();

	}

}
