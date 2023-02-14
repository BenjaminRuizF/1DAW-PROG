package net.benja.practicas.ProveedoresGasoil_bruiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Proveedor {
	private String nombreProveedor;
	private Precio[] precios;

	public void leerFichero(String args) {
		try {
			File f = new File(args);
			Scanner inputFile = new Scanner(f);

			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				System.out.println(line);
				String[] array;
				
 				for (int i = 0; i < ; i++) {
					array[i] = line.split(" ");
 				}
 				for (int i = 0; i < array.length; i++) {
					
				}
					/*for (int j = 0; j < 10; j++) {

						precio2[j] = precio[1];
					}
				}*/

			}

			inputFile.close();
		} catch (FileNotFoundException e) {
			System.err.println("ERROR: no se puede abrir el fichero");

		}
		/*if (precios == null) {
			precios = new Precio[1];
			precios[0] = line;
			return;
		} else {
			Precio[] aux = new Precio[precios.length + 1];
			System.arraycopy(precios, 0, aux, 0, precios.length);
			aux[precios.length] = line;
			precios = aux;
		}*/

	}

	public Proveedor(String nombreDeFichero) {
		this.nombreProveedor = nombreDeFichero;
	}

	public double getImporte(int dia, int mes, int anio) {
		return 0;
	}

	public double getMediaMensual(int mes, int anio) {
		return 0;
	}

	// public Precio getPrecioMinimo() {

	// }

}
