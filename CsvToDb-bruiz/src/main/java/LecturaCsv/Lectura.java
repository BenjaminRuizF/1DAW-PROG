package LecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import alumnos.Alumnos;

public class Lectura {
	private Alumnos alumnos[] = new Alumnos[1000];
	private String array[] = new String[1000];

	public void leerFichero(String fichero) {
		try {
			File f = new File(fichero);
			Scanner inputFile = new Scanner(f);
			int i = 0;
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				array[i] = line;
				i++;
			}
			separarLineas();
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");
		}
		

	}

	public void separarLineas() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				String separador[] = array[i].split(",");
				String curso = separador[0];
				int numClase = Integer.parseInt(separador[1]);
				String id1 = separador[2];
				alumnos[i] = new Alumnos(curso, numClase, id1);
			}
		}
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i]!=null)
			System.out.println(alumnos[i].toString());
		}

	}

}
