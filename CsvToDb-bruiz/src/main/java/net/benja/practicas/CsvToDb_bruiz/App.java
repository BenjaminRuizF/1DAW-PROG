package net.benja.practicas.CsvToDb_bruiz;

import LecturaCsv.Lectura;
import alumnos.Alumnos;
/**
 * Hello world!
 *
 */
public class App {
	private static final int NUMARGS = 5;
	static Lectura l1 = new Lectura();
	Alumnos profe = new Alumnos("1ASIR", 0, "bruiz");
	public static void main(String[] args) {
		if (args.length != NUMARGS) {
			System.err.println("La cantidad de argumentos indicados son diferentes a los necesario");
		}
		l1.leerFichero(args[4]);
		profe.co
		
	}
}
