package net.benja.practicas.ProveedoresGasoil_bruiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class Proveedor {
	private String nombreProveedor;
	private String line;
	private int contador;
	private double importe;
	private int anio;
	private int mes;
	private int dia;
	private Date fecha;
	private Precio[] precios;

	/**
	 * Constructor que saca el nombre del fichero de la ruta
	 * 
	 * @param nombreDeFichero recibe la ruta completa del fichero
	 */
	public Proveedor(String nombreDeFichero) {
		int primerSeparador = nombreDeFichero.lastIndexOf("\\");
		int segundoSeparador = nombreDeFichero.lastIndexOf(".");
		this.nombreProveedor = nombreDeFichero.substring(primerSeparador + 1, segundoSeparador);
		leerFichero(nombreDeFichero);
	}
	
	public String getNombreProveedor() {
		return nombreProveedor;
	}

	/**
	 * Metodo que inicializa el array precios y almacena las lineas del fichero
	 * 
	 * @param fichero recibe un fichero
	 * @throws IllegalArgumentException
	 */
	public void leerFichero(String fichero){
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
				throw new IllegalArgumentException("Necesitas una linea minimo");
			}
			if (contador > 999) {
				throw new IllegalArgumentException("No puede haber mas de 1000 lineas");
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
			throw new IllegalArgumentException("Fichero invalido");

		}

	}

	/**
	 * Metodo que recibe lineas y las divide en variables
	 * 
	 * @param linea recibe linea a linea del fichero
	 */
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

	/**
	 * Metodo que devuelve el importe del dia indicado
	 * 
	 * @param dia  indicado para buscar el importe de este
	 * @param mes  al cual pertenece el dia
	 * @param anio al cual pertenecen el mes y el dia
	 * @return el importe de la fecha indicada
	 */
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

	/**
	 * Metodo que recibe un mes y saca la media de importes de este
	 * 
	 * @param mes  al cual se le hace la media de importes
	 * @param anio al cual pertenece el mes
	 * @return la media aritmetica de importes
	 */
	public double getMediaMensual(int mes, int anio) {
		Date mesMedia;
		int contadorMedia = 0;
		int dia = 1;
		double suma = 0;
		if (anio < 1000) {
			return 0;
		}
		if (mes < 1 || mes > 12) {
			return 0;
		}

		for (int i = 0; i < precios.length; i++) {
			mesMedia = new Date(anio - 1900, mes - 1, dia);
			if (mesMedia.compareTo(precios[i].getFecha()) == 0) {
				suma += precios[i].getImporte();
				contadorMedia++;
				dia++;
				if(dia>31) {
					break;
				}
			}
		}
		if (contadorMedia < 1) {
			return 0;
		} else
			return suma / contadorMedia;
	}

	/**
	 * Metodo que devuelve el minimo importe de todos los objetos precios
	 * 
	 * @return el objeto del importe minimo
	 */
	public Precio getPrecioMinimo() {
		double numeroMinimo = Double.MAX_VALUE;
		int posicion = 0;
		for (int i = 0; i < precios.length; i++) {
			if (precios[i].getImporte() < numeroMinimo) {
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
