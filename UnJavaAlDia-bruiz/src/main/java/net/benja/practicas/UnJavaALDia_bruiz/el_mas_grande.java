package net.benja.practicas.UnJavaALDia_bruiz;

/**
 * @author Benjamin
 *
 */
public class el_mas_grande {

	public static void main(String[] args) {
		int [] array = {1,2,343,456,4321,5467};
		mayorArray(array);
		mayorPosicionArray(array);
		menorArray(array);
		mediaArray(array);
	}
	/**Metodo que saca el entero mas grande del array
	 * @param array el array indicado
	 */
	public static void mayorArray(int[] array) {
		int mayor = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>mayor) {
				mayor = array[i];
			}
		}
		System.out.println("El numero mas grande del array es el "+mayor);
	}
	/**Metodo que saca la posicion del entero mas grande
	 * @param array el array indicado
	 */
	public static void mayorPosicionArray(int[] array) {
		int mayor = 0;
		int pos = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>mayor) {
				mayor = array[i];
				pos = i;
			}
		}
		System.out.println("La posicion de el numero mas grande del array es el "+pos);
	}
	/**Metodo que saca el entero mas pequeño del array
	 * @param array el array indicado
	 */
	public static void menorArray(int[] array) {
		int menor = 1000000000;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<menor) {
				menor = array[i];
			}
		}
		System.out.println("El numero mas pequeño del array es el "+menor);
	}
	/**Metodo que hace la media al array
	 * @param array el array indicado
	 */
	public static void mediaArray(int[] array) {
		int contador = 0;
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			contador++;
			suma+=array[i];
		}
		System.out.println("La media del array es "+(suma/contador));
		
	}

}
