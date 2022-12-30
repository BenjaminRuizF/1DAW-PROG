package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class celsius_a_farhenheit {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una temperatura en grados celsius (°C)");
		double grados = teclado.nextFloat();
		control(grados);
		teclado.close();
	}

	/**
	 * Metodo que controla que el numero se redonde solo a dos decimales y llama al
	 * conversor
	 * 
	 * @param grados el numero ingresado por la persona
	 */
	public static void control(double grados) {
		double num = (Math.round(grados * 100.0) / 100.0);
		conversion(num);
	}

	/**
	 * Metodo que pasa de grados a farenheit
	 * 
	 * @param grados el numero que hay que cambiar
	 */
	public static void conversion(double grados) {
		double farenheit = (grados * 1.8 + 32);
		System.out.println("La temperatura de " + grados + " °C en farenheit es "
				+ (Math.round(farenheit * 100.0) / 100.0) + " °F");

	}
}
