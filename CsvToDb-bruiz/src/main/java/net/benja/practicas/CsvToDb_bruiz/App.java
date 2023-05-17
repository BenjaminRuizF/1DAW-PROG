package net.benja.practicas.CsvToDb_bruiz;

import alumnos.Alumnos;

public class App {
	private final static int MAXARGS = 5;

	public static void main(String[] args) {
		if (args.length != MAXARGS) {
			System.err.println("Argumentos invalidos");
			return;
		}
		String ip = args[0];
		String nombreBD = args[1];
		String user = args[2];
		String passwd = args[3];
		String fichero = args[4];
		Alumnos bd = new Alumnos(fichero);
		bd.conectarBd(ip, nombreBD, user, passwd);

	}
}
