package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author b.ruiz
 *
 */
public class los_ultimos_seran_los_primeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un array de numeros enteros separados por comas, como maximo 15 numeros");
		String sinDescomponer = teclado.next();
		String[] descompuesto = sinDescomponer.split(",");
		int[] array = new int[descompuesto.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < descompuesto.length; j++) {
				array[i] = Integer.parseInt(descompuesto[i]);
			}
		}
		invertirArray(array);
	}

	/**Metodo que invierte el array 
	 * @param array recibe el array que hay que invertir
	 */
	public static void invertirArray(int[] array) {
		int ultimo = array.length -1;
		int swap = 0;
		for (int i = 0; i < array.length/2; i++) {
			swap = array[i];
			array[i]= array[ultimo];
			array[ultimo] = swap;
			ultimo--;
		}
		System.out.println(Arrays.toString(array));
	}

}
