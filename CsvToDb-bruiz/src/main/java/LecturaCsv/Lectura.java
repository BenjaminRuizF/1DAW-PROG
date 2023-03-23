package LecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Lectura {

	public void leerFichero(String fichero) {
		String array[]=new String[115];
		try {
			File f = new File(fichero);
			Scanner inputFile = new Scanner(f);
			int i = 00;
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				array[i] = line;
				i++;
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}
}
