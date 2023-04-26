package net.benja.practicas.CsvToDb_bruiz;

import LecturaCsv.Lectura;
import alumnos.Alumnos;
/**
 * Hello world!
 *
 */
public class App {
	static Lectura l1 = new Lectura();
	public static void main(String[] args) {
		l1.leerFichero(args);
	}
}
