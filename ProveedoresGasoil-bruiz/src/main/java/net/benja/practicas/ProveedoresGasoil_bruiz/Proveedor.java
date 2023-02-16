package net.benja.practicas.ProveedoresGasoil_bruiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;
import java.util.Scanner;

public class Proveedor {
	public String nombreProveedor;
	public String fechaPorPantalla;
	private String line;
	private int contador;
	private double importe;
	private int anio;
	private int mes;
	private int dia;
	private Date fecha;
	private Precio[] precios;

	public Proveedor(String nombreDeFichero) {
		int primerSeparador = nombreDeFichero.lastIndexOf("\\");
		int segundoSeparador = nombreDeFichero.lastIndexOf(".");
		this.nombreProveedor = nombreDeFichero.substring(primerSeparador + 1, segundoSeparador);
		leerFichero(nombreDeFichero);
	}

	public void leerFichero(String fichero) {
		try {
			File f = new File(fichero);
			Scanner inputFile = new Scanner(f);
			Scanner fileScanner = new Scanner(f);
			while (inputFile.hasNextLine()) {
				inputFile.nextLine();
				contador++;
			}
			inputFile.close();
			if (contador < 1) {
				System.err.println("Necesitas minimo una linea");
				return;
			}
			if (contador > 1000) {
				System.err.println("No puedes tener mas de 1000 lineas");
				return;
			}
			if (precios == null) {
				precios = new Precio[contador];
			}
			for (int i = 0; i < contador; i++) {
				line = fileScanner.nextLine();
				separarLineas(line);
				Precio P = new Precio(fecha, importe);
				precios[i] = P;
			}
			fileScanner.close();

		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");

		}

	}

	public void separarLineas(String linea) {
		int espacio = linea.lastIndexOf(" ");
		int ultimoGuion = linea.lastIndexOf("-");
		int primerGuion = linea.indexOf("-");
		anio = Integer.parseInt(linea.substring(0, primerGuion));
		mes = Integer.parseInt(linea.substring(primerGuion + 1, ultimoGuion));
		dia = Integer.parseInt(linea.substring(ultimoGuion + 1, espacio));
		importe = Double.parseDouble(linea.substring(espacio, linea.length()));
		fecha = new Date(anio - 1900, mes - 1, dia);
	}
	

	public double getImporte(int dia, int mes, int anio) {
		Date fechaImporte;
		if (anio < 1000) {
			return 0;
		}
		if (mes < 1 || mes > 12) {
			return 0;
		}
		if (dia < 1 || dia > 31) {
			return 0;
		}
		fechaImporte = new Date(anio - 1900, mes - 1, dia);
		for (int i = 0; i < precios.length; i++) {
			if (fechaImporte.compareTo(precios[i].getFecha()) == 0) {
				return precios[i].getImporte();

			}
		}
		return 0;
	}

	public double getMediaMensual(int mes, int anio) {
		Date mesMedia;
		int contadorMedia = 1;
		double suma = 0;
		if (anio < 1000) {
			return 0;
		}
		if (mes < 1 || mes > 12) {
			return 0;
		}
		
		for (int i = 0; i < precios.length; i++) {
			mesMedia = new Date(anio - 1900, mes - 1, contadorMedia);
			if (mesMedia.compareTo(precios[i].getFecha()) == 0) {
				suma += precios[i].getImporte();
				contadorMedia++;
			}
		}
		if (contador<2) {
			return 0;
		}else return suma / (contadorMedia-1);
	}
	public Precio getPrecioMinimo() {
		double numeroMinimo = Double.MAX_VALUE;
		int posicion = 0;
		for (int i = 0; i < precios.length; i++) {
			if(precios[i].getImporte()<numeroMinimo) {
				numeroMinimo = precios[i].getImporte();
				posicion = i;
			}
		}
		return precios[posicion];
		
		}
	@Override
	public String toString() {
		String cadena = "";
		for (int i = 0; i < precios.length; i++) {
			cadena += precios[i].getFecha().toString() + " => " + precios[i].getImporte() + "\n";
		}
		return nombreProveedor + "\n" + cadena;
	}

	

}
