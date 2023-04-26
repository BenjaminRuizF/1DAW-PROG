package LecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import alumnos.Alumnos;

public class Lectura {
	private String[] leer = new String[1000];
	try {
		File f = new File(fichero);
		Scanner inputFile = new Scanner(f);
		while (inputFile.hasNext()) {
			leer
			
		}

		inputFile.close();
	}catch(FileNotFoundException e) {
		System.err.println("No se puede abrir el fichero");
	}

}
