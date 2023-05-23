package alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import lecturaCsv.Lectura;
import net.benja.practicas.CsvToDb_bruiz.App;

public class Alumnos {
	private String curso;
	private int numClase;
	private String id1;
	private String fichero;

	public Alumnos(String curso, int numClase, String id1) {
		this.curso = curso;
		this.numClase = numClase;
		this.id1 = id1;
	}

	public Alumnos(String fichero) {
		this.fichero = fichero;
	}

	public void conectarBd(String ip, String nombreBD, String user, String passwd) {
		try {
			App.LOGGER.log(Level.INFO, "Iniciando conexion hacia jdbc:oracle:thin:@//{0}/"+nombreBD, ip);
			Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@//" + ip + "/" + nombreBD, user, passwd);
			App.LOGGER.log(Level.INFO, "Conexion: OK");
			jdbcDemo(conn1, fichero);

		} catch (SQLException e) {
			App.LOGGER.log(Level.SEVERE, "Las BBDD no son lo tuyo {0}",e.getMessage());
			
		}
	}

	private static void jdbcDemo(Connection conn, String fichero) throws SQLException {
		Statement stmt = conn.createStatement();
		Alumnos[] alumnos;
		Lectura lectura = new Lectura();
		alumnos = lectura.leerFichero(fichero);
		if (alumnos[0] == null) {
			return;
		}
		int cont = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				continue;
			}
			String curso = alumnos[i].getCurso();
			int numClase = alumnos[i].getNumClase();
			String id1 = alumnos[i].getId1();
			stmt.executeQuery("INSERT INTO estudiantes_tbl(NUM_LISTA,MODULO,ID1) VALUES (" + numClase + ",'" + curso+ "','" + id1 + "')");
			App.LOGGER.log(Level.FINE,
					"Se ha introducido el Alumno: " + numClase + " de la Clase: " + curso + " con Id: " + id1);
			cont++;
		}
		App.LOGGER.log(Level.INFO, "Se han insertado {0} alumnos", cont);
		App.LOGGER.log(Level.INFO, "Insercion: OK");
		stmt.close();
		conn.close();
	}

	public String getCurso() {
		return curso;
	}

	public int getNumClase() {
		return numClase;
	}

	public String getId1() {
		return id1;
	}
}
