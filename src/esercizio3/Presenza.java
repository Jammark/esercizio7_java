package esercizio3;

public class Presenza {

	private String dipendente;
	private int giorni;

	public Presenza(String dipendente, int giorni) {
		this.dipendente = dipendente;
		this.giorni = giorni;

	}

	public String getDipendente() {
		return dipendente;
	}

	public int getGiorni() {
		return giorni;
	}

	public String stampa() {
		return dipendente + "@" + giorni;
	}

	@Override
	public String toString() {
		return "Presenza [dipendente=" + dipendente + ", giorni=" + giorni + "]";
	}

	public static Presenza from(String s) {
		String[] arr = s.split("@");
		try {
			return new Presenza(arr[0], Integer.parseInt(arr[1]));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}

	}

}
