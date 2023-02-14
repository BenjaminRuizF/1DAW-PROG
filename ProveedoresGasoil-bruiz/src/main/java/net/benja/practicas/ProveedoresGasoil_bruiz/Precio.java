package net.benja.practicas.ProveedoresGasoil_bruiz;

import java.sql.Date;

public class Precio {
	private Date fecha;
	private double importe;
	public Precio(Date fecha, double importe) {
		this.fecha = fecha;
		this.importe = importe;
		
	}
	public Date getFecha() {
		return fecha;
	}
	public double getImporte() {
		return importe;
	}
	
}
