package alumnos;


public class Alumnos {
	private String curso;
	private int numClase;
	private String id1;
	public Alumnos(String curso, int numClase, String id1) {
		this.curso = curso;
		this.numClase = numClase;
		this.id1 = id1;
	}
	@Override
	public String toString() {
		return "Alumnos [curso=" + curso + ", numClase=" + numClase + ", id1=" + id1 + "]";
	}
	

	}
	
