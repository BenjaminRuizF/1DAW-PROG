package LecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import alumnos.Alumnos;

public class Lectura {
	private Alumnos[] args;
	private String fichero;
	private String curso;
	private int numClase;
	private String id1;
	
	public Lectura(String fichero) {
		this.fichero = fichero;
		 args = new Alumnos[1000];
	}
	
{
		try {
			File f = new File(fichero);
			Scanner inputFile = new Scanner( f );

			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
			}

			inputFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
}
	public void separarLineas(String linea) {
		String[] ficheroSeparado = linea.split(",");
		curso = ficheroSeparado[0];
		numClase = Integer.parseInt(ficheroSeparado[1]);
		id1 = ficheroSeparado[2];
		
	}
}