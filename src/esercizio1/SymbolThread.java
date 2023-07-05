package esercizio1;

public class SymbolThread extends Thread {

	private char symbol;
	private String color;

	public SymbolThread(char s, String color) {
		this.symbol = s;
		this.color = color;
	}

	@Override
	public void run() {

		super.run();
		for (int i = 1; i < 11; i++) {
			try {
				Thread.sleep(1000l);
				System.out.println(this.color + Thread.currentThread().getName() + " :" + i + " --" + symbol);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
