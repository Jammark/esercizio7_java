package esercizio3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger log = LoggerFactory.getLogger(Main.class);

	private static File file = new File("info.txt");

	public static void main(String[] args) {
		RegistroPresenze rp = new RegistroPresenze();
		rp.aggiungi(new Presenza("Paolo", 4));
		rp.aggiungi(new Presenza("Patrizio", 7));
		rp.aggiungi(new Presenza("Mauro", 2));

		try {
			saveOnDisk(rp.stampa());
			String output = readFromDisk();
			rp = new RegistroPresenze(output);
			log.info(rp.toString());
		} catch (IOException e) {
			log.error("Eccezione: " + e.getMessage());
		}

	}

	public static void saveOnDisk(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo, "UTF-8");

	}

	public static String readFromDisk() throws IOException {
		if (file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return content;

		} else {
			System.out.println("File non trovato!");
			return "";
		}
	}

}
