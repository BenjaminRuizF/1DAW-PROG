package net.benja.practicas.UnJavaALDia_bruiz;
/* ¡¡Hay que ponerlo en la clase app para que funcione!!
 		
 		el_mayor_de_3 numeros = new el_mayor_de_3();
		numeros.Mayores(args); 
 */

/**
 * @author Benjamin
 *
 */
public class el_mayor_de_3 {
	int num1;
	int num2;
	int num3;
	float decimal;
	float mayor = 0;

	/**
	 * Metodo que guarda los numeros enteros en variables
	 * 
	 * @param numeros donde se recoje el array de la linea de argumentos
	 */
	public void Mayores(String[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (i == 0) {
				num1 = Integer.parseInt(numeros[i]);
			} else if (i == 1) {
				num2 = Integer.parseInt(numeros[i]);
			} else if (i == 2) {
				num3 = Integer.parseInt(numeros[i]);
			}
		}
		Enteros();
		Decimales(numeros);
	}

	/**
	 * Metodo que coje los numeros enteros y los compara para saber cual es el mayor
	 * de los tres
	 */
	public void Enteros() {
		System.out.println("Mayor de los 3 enteros:");
		if (num1 > num2 && num1 > num3) {
			System.out.println("Elmayor de los 3 es el" + num1);
			System.out.println(" ");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Elmayor de los 3 es el " + num2);
			System.out.println(" ");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("Elmayor de los 3 es el " + num3);
			System.out.println(" ");
		} else if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println("Los 3 numeros son iguales");
			System.out.println(" ");
		} else if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Hay dos numeros iguales");
			System.out.println(" ");
		}
	}

	/**
	 * Metodo que compara los numeros decimales y saca por pantalla el mayor de los
	 * tres
	 * 
	 * @param numeros el array de linea de comandos
	 */
	public void Decimales(String[] numeros) {
		System.out.println("Mayor de los 3 decimales:");
		for (int i = 0; i < numeros.length; i++) {
			if (i > 2) {
				decimal = Float.parseFloat(numeros[i]);
				if (decimal > mayor) {
					mayor = decimal;
				}
			}
		}
		System.out.println("El mayor de los tres decimales es " + mayor);
	}

}
