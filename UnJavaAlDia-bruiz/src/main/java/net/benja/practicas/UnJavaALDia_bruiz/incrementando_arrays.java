package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author b.ruiz
 *
 */
public class incrementando_arrays {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero para multiplicar los numeros del array");
		int num = teclado.nextInt();
		System.out.println("Dime un numero para la segunda parte del ejercicio");
		int num2 = teclado.nextInt();
		multiplicarArray(array, num);
		multiplicarEnteros(num, num2);
	}
	/**Metodo que multiplica los numeros del array por el numero ingresado por pantalla
	 * @param array para multiplicar los numeros de dentro
	 * @param num el numero que multiplica los numeros del array
	 */
	public static void multiplicarArray(int[]array, int num) {
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * num;
		}
		System.out.println(Arrays.toString(array));
	}
	/**Metodo que multiplica dos numeros
	 * @param num el numero que entra por pantalla para multiplicar
	 * @param num2 numero que ingresa para multiplicar por el otro
	 */
	public static void multiplicarEnteros(int num, int num2) {
		num2 = num*num2;
		System.out.println(num2);
	}

}
