package net.benja.practicas.CsvToDb_bruiz;

/**
 * Hello world!
 *
 */
public class App {
	private static final int NUMARGS = 5;
	public static void main(String[] args) {
		if (args.length != NUMARGS) {
			System.err.println("La cantidad de argumentos indicados son diferentes a los necesario");
		}
	}
}
