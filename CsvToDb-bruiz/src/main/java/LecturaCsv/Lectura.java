package LecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import alumnos.Alumnos;

public class Lectura {
	private Alumnos[] args;
	private String fichero;
	public Lectura(String fichero) {
		this.fichero = fichero;
		 args = new Alumnos[1000];
	}
	
	{
	try {
		File f = new File(fichero);
		Scanner inputFile = new Scanner( f );
		int num = 0;
		while (inputFile.hasNext()) {
			
			String[] line = inputFile.nextLine().split(",");
			int numClase = Integer.parseInt(line[1]);
			args[num] = new Alumnos(line[0],numClase,line[2]);
			
		}

		inputFile.close();
	} catch (FileNotFoundException e) {
		System.err.println("ERROR: no se puede abrir el fichero");
	}
}
}