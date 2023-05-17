package alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import LecturaCsv.Lectura;

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
			Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@//" + ip + "/" + nombreBD, user, passwd);
			System.out.println("Conectado a la base de datos");
			jdbcDemo(conn1, fichero);

		} catch (SQLException e) {
			System.err.println("Las BBDD no son lo tuyo: " + e.getMessage());
		}
	}

	private static void jdbcDemo(Connection conn, String fichero) throws SQLException {
		Statement stmt = conn.createStatement();
		Alumnos[] alumnos;
		Lectura lectura = new Lectura();
		alumnos = lectura.leerFichero(fichero);
		if(alumnos[0]==null) {
			return;
		}
		
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i]==null) {
				continue;
			}
			String curso = alumnos[i].getCurso();
			int numClase = alumnos[i].getNumClase();
			String id1 = alumnos[i].getId1();
			stmt.executeQuery("INSERT INTO estudiantes_tbl(NUM_LISTA,MODULO,ID1) VALUES (" + numClase + ",'" + curso+ "','" + id1 + "')");
		}
		System.out.println("Alumnos insertados");
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
