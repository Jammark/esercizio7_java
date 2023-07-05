package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class RegistroPresenze {

	private List<Presenza> presenze = new ArrayList<>();

	public RegistroPresenze() {
		super();
	}

	public RegistroPresenze(String s) {
		super();
		String[] arr = s.split("#");
		for (String string : arr) {
			this.presenze.add(Presenza.from(string));
		}

	}

	public void aggiungi(Presenza p) {
		this.presenze.add(p);
	}

	public String stampa() {
		String result = "";
		for (Presenza p : this.presenze) {
			result += p.stampa() + "#";
		}

		return result.substring(0, result.length() - 1);
	}

	@Override
	public String toString() {
		return "RegistroPresenze [presenze=" + presenze + "]";
	}

}
