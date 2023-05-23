package net.benja.practicas.CsvToDb_bruiz;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import alumnos.Alumnos;

/**
 * Hello world!
 *
 */
public class App {
	public static Logger LOGGER = Logger.getLogger("LOGGER");
	private final static int MAXARGS = 5;
	// private static Level level;

	public static void main(String[] args) {
		InputStream ficheroDeConfiguracion = App.class.getClassLoader().getResourceAsStream("config/logging-prod.properties");
		try {
			LogManager.getLogManager().readConfiguration(ficheroDeConfiguracion);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		Level level;
		String nivel = System.getenv().get("LOG_LEVEL");
		switch (nivel) {
		case "ALL":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "CONFIG":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "FINE":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "FINER":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "FINEST":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "SEVERE":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "INFO":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;
		case "WARNING":
			level = Level.parse(nivel);
			LOGGER.setLevel(level);
			break;

		default:
			System.err.println("Nivel invalido");
			break;
		}

		if (args.length != MAXARGS) {
			LOGGER.log(Level.SEVERE, "Numero de argumentos invalidos \"{0}\" ", args);
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
