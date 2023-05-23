package lecturaCsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;

import net.benja.practicas.CsvToDb_bruiz.App;
import alumnos.Alumnos;

public class Lectura {
	private Alumnos[] args;
	private Alumnos[] argsnull;
	private String fichero;
	private String curso;
	private int numClase;
	private String id1;
	private int contador;

	public Lectura() {
		args = new Alumnos[1000];
	}

	public Alumnos[] leerFichero(String fich) {
		try {
			File f = new File(fich);
			Scanner inputFile = new Scanner(f);
			Scanner fileScanner = new Scanner(f);
			while (inputFile.hasNextLine()) {
				inputFile.nextLine();
				contador++;
			}
			App.LOGGER.log(Level.INFO, "Se han leido {0} alumnos", contador);
			while (fileScanner.hasNext()) {
				for (int i = 0; i < contador; i++) {
					String line = fileScanner.nextLine();
					separarLineas(line);
					Alumnos A = new Alumnos(curso, numClase, id1);
					args[i] = A;
				}
			}

			inputFile.close();
			App.LOGGER.log(Level.INFO, "Se han creado {0} objetos alumno", contador);
			return args;
		} catch (FileNotFoundException e) {
			App.LOGGER.log(Level.SEVERE, "No se ha podido abri el fichero {0}", fich);
			return argsnull;
		}
	}

	public void separarLineas(String linea) {
		String[] ficheroSeparado = linea.split(",");
		curso = ficheroSeparado[0];
		numClase = Integer.parseInt(ficheroSeparado[1]);
		id1 = ficheroSeparado[2];
	}
}
