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
	  public static void conexion(String Ip, String nombrePdb, String usuario, String passwd) {
	        try {
	            Connection conn1 = DriverManager.getConnection( "jdbc:oracle:thin:@//"+Ip+"/"+nombrePdb+"," +usuario+"," +passwd );
	            jdbcDemo( conn1 );
	        } catch ( SQLException e ) {
	            System.err.println( "Las BBDD no son lo tuyo: " + e.getMessage() );
	        }
	    }

	    private static void jdbcDemo( Connection conn ) throws SQLException {
	        Statement stmt = conn.createStatement();
	        ResultSet resultSet = stmt.executeQuery( "SELECT * FROM prueba_tb" );	       
	        resultSet.close();
	        stmt.close();
	        conn.close();
	    }
	@Override
	public String toString() {
		return "Alumnos [curso=" + curso + ", numClase=" + numClase + ", id1=" + id1 + "]";
	}
	

	}
	
