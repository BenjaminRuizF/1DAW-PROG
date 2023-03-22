package LecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {
	public void leerFichero(String fichero) {
		try {
			File f = new File(fichero);
			Scanner inputFile = new Scanner( f );

			inputFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
		}
}
