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
	private String ip;
	private String nombreBD;
	private String user;
	private String passwd;
	private String fichero;

	public Alumnos(String curso, int numClase, String id1) {
		this.curso = curso;
		this.numClase = numClase;
		this.id1 = id1;
	}
	
	public Alumnos( String ip, String nombreBD, String user, String passwd, String fichero) {
		this.ip = ip;
		this.nombreBD = nombreBD;
		this.user = user;
		this.passwd = passwd;
		this.fichero = fichero;
	}

	public void conectarBd(String ip, String nombreBD, String user, String passwd) {
		try {
			Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@//" + ip + "/" + nombreBD, user, passwd);
			
			jdbcDemo(conn1, fichero);
		} catch (SQLException e) {
			System.err.println("Las BBDD no son lo tuyo: " + e.getMessage());
		}
	}

	private static void jdbcDemo(Connection conn, String fichero) throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery( "SELECT * FROM Estudiantes_tbl" );
		Alumnos[] alumnos;
		Lectura lectura = new Lectura();
		alumnos = lectura.leerFichero(fichero);
		for (int i = 0; i < alumnos.length; i++) {
			String curso = alumnos[i].getCurso();
			int numClase = alumnos[i].getNumClase();
			String id1 = alumnos[i].getId1();
			stmt.executeUpdate("INSERT INTO estudiantes_tbl(NUM_LISTA,MODULO,ID1) VALUES (" + numClase + ",'" + curso + "','" + id1 + "');");
		}
		 
		
		
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
