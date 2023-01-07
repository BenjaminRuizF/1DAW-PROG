package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class chaca_flus {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero entero");
		int num = teclado.nextInt();
		chaca(num);
		chacaFlus(num);
		chacaFlusDefinitivo(num);
	}

	/**
	 * Metodo que cada vez que haya un multiplo de 4 lo cambie por "chaca"
	 * 
	 * @param num el numero escrito por pantalla
	 */
	public static void chaca(int num) {
		System.out.println("CHACA");
		for (int i = 1; i <= num; i++) {
			if (i % 4 == 0) {
				System.out.println("chaca");
			} else
				System.out.println(i);
		}
	}

	/**
	 * Metodo que cada vez que haya un multiplo de 4 lo cambie por "chaca" y cada
	 * multiplo de 5 lo cambie por "flus"
	 * 
	 * @param num el numero escrito por pantalla
	 */
	public static void chacaFlus(int num) {
		System.out.println("CHACAFLUS");
		for (int i = 1; i <= num; i++) {
			if (i % 4 == 0 && i % 5 == 0) {
				System.out.println("chaca \nflus");
			} else if (i % 4 == 0) {
				System.out.println("chaca");
			} else if (i % 5 == 0) {
				System.out.println("flus");
			} else
				System.out.println(i);
		}
	}

	/**
	 * Metodo que cada vez que haya un multiplo de 4 lo cambie por "chaca", cada
	 * multiplo de 5 lo cambie por "flus" y cada 5 lineas ponga una linea de
	 * asteriscos"******"
	 * 
	 * @param num el numero escrito por pantalla
	 */
	public static void chacaFlusDefinitivo(int num) {
		System.out.println("CHACAFLUS DEFINITIVO");
		for (int i = 1; i <= num; i++) {
			if (i % 4 == 0 && i % 5 == 0) {
				System.out.println("chacaFlus");
				System.out.println("*********");
			} else if (i % 4 == 0) {
				System.out.println("chaca");
			} else if (i % 5 == 0) {
				System.out.println("flus");
				System.out.println("*********");
			} else
				System.out.println(i);
		}
	}

}
