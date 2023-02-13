package net.benja.practicas.ProveedoresGasoil_bruiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Proveedor {
	private String nombreProveedor;
	Precio [] array;
	public void leerFichero(String args) {
        String[] precio2 = new String[100];
        try {
            File f = new File(args);
            Scanner inputFile = new Scanner(f);

            while (inputFile.hasNext()) {
                String line = inputFile.nextLine();
                 System.out.println(line);
                for (int i = 0; i < 1; i++) {
                    String precio[] = line.split(" ");

                    for (int j = 0; j < 10; j++) {

                        precio2[j] = precio[1];
                    }
                }
                
            }


            inputFile.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: no se puede abrir el fichero");
            
        }

    }
	public Proveedor(String nombreDeFichero) {
		this.nombreProveedor= nombreDeFichero;
	}

	public double getImporte(int dia, int mes, int anio) {
		return 0;
	}

	public double getMediaMensual(int mes, int anio) {
		return 0;
	}

	//public Precio getPrecioMinimo() {

	//}

}
