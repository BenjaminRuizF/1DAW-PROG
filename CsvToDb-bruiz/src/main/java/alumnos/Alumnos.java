package alumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Alumnos {
	private String curso;
	private int numClase;
	private String id1;

	public Alumnos(String curso, int numClase, String id1) {
		this.curso = curso;
		this.numClase = numClase;
		this.id1 = id1;
	}

	private void jdbcDemo(Connection conn) throws SQLException {
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(
				"INSERT INTO ... (curso,numClase,id1) VALUES ('" + curso + "'," + numClase + ",'" + id1 + "')");
		stmt.close();
		conn.close();
	}

}
