package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class buscad_y_encontrareis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero entero");
		int num = teclado.nextInt();
		int[] array = {1,2,3,4,5,6,7,8,9};
		buscarNumero(num, array);
		buscarPosicion(num, array);
	}
	
	 
	 /**Metodo que compara el numero con los numeros del array y si coincide con alguno devuelve true sino devuelve false
	 * @param num el numero para buscar en el array
	 * @param array el array relleno
	 * @return un boleano en cada caso
	 */
	public static boolean buscarNumero(int num, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]== num) {
				System.out.println("True");
				return true;
			}
		}
		System.out.println("False");
		return false;
	}
	/**Metodo que compara el numero con los numeros del array y si coincide con alguno devuelve su posicion sino devuelve -1
	 * @param num numero indicado por pantalla
	 * @param array donde buscar el numero
	 * @return la posicion del numero o -1
	 */
	public static int buscarPosicion(int num, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]== num) {
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return -1;
	}

}
