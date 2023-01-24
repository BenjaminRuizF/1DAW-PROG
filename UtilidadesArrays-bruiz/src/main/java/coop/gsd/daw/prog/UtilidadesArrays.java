package coop.gsd.daw.prog;


/**
 * @author Benjamin
 *
 */
public class UtilidadesArrays {

	/**
	 * Método que devuelve un nuevo array con cada miembro aumentado por el número 
	 * @param array para incrementar en un nuevo array
	 * @param incrementar es el número que se utiliza para incrementar los valores del array
	 * @return un nuevo array con cada miembro aumentado por el incrementar
	 */
	public static int[] incrementar(int[] array, int incrementar) {

		int[] array2 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i] + incrementar;
		}
		return array2;
	}

	/**
	 * Método que modifica el array con cada miembro aumentado por el número 
	 * @param array para incrementar con incrementarArray
	 * @param incrementarArray es el número que se utiliza para incrementar los valores del array
	 */
	public static void incrementarArray(int[] array, int incrementarArray) {
		for (int i = 0; i < array.length; i++) {
			array[i] += incrementarArray;
		}
	}

	/**
	 * Método que invierte el array en uno nuevo
	 * @param array el array para invertir
	 * @return un nuevo array invertido
	 */
	public static int[] invertir(int[] array) {
		int primero = 0;
		int[] array2 = new int[array.length];
		for (int i = array.length - 1; i > -1; i--) {
			array2[primero] = array[i];
			primero++;
		}
		return array2;
	}

	/**
	 * Método que modifica el array invirtiendolo
	 * @param array para invertir
	 */
	public static void invertirArray(int[] array) {
		int swap = 0;
		int ultimo = array.length - 1;
		for (int i = 0; i < array.length / 2; i++) {
			swap = array[i];
			array[i] = array[ultimo];
			array[ultimo] = swap;
			ultimo--;

		}
	}

	/**
	 * Método que devuelve el mayor entero del array 
	 * @param array donde se busca el mayor entero
	 * @return el valor del mayor entero del array
	 */
	public static int maximo(int[] array) {
		int numero = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numero) {
				numero = array[i];
			}
		}
		return numero;

	}

	/**
	 * Método que devuelve la posición del mayor entero del array
	 * si hay dos devuelve el primero de ellos
	 * @param array para buscar el mayor entero
	 * @return la posición del mayor entero del array
	 */
	public static int maximoIndice(int[] array) {
		int numero = 0;
		int posicion = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numero) {
				numero = array[i];
				posicion = i;
			}
		}
		return posicion;
	}

	/**
	 * Método que devuelve la media de los valores del array
	 * @param array con los números para hacer la media
	 * @return la media aritmética de los números del array
	 */
	public static double media(int[] array) {
		double suma = 0;
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			contador++;
		}
		double media = suma / contador;
		return media;
	}

	/**
	 * Método que devuelve el menor entero del array 
	 * @param array donde se busca el menor entero
	 * @return el valor del menor entero del array
	 */
	public static int minimo(int[] array) {
		int numero = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < numero) {
				numero = array[i];
			}
		}
		return numero;
	}

	/**
	 * Método que devuleve la posición del menor entero del array
	 * si hay dos devuelve el primero de ellos
	 * @param array para buscar el menor entero
	 * @return la posición del menor entero del array
	 */
	public static int minimoIndice(int[] array) {
		int numero = array[0];
		int posicion = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < numero) {
				numero = array[i];
				posicion = i;
			}
		}
		return posicion;
	}
}
//Cambio desde casa
