package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class tiempo_desde_medianoche {

	/**
	 * Recibe por pantalla una hora la descompone y llama al metodo errores
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una hora con minutos y segundos separados por (:)");
		String hora = teclado.next();
		String[] descompuesto = hora.split(":");
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		for (int i = 0; i < descompuesto.length; i++) {
			if (i == 0) {
				horas = Integer.parseInt(descompuesto[i]);
			} else if (i == 1) {
				minutos = Integer.parseInt(descompuesto[i]);
			} else if (i == 2) {
				segundos = Integer.parseInt(descompuesto[i]);
			}
		}
		errores(horas, minutos, segundos);
		teclado.close();
	}

	/**
	 * metodo que controla los posibles errores
	 * 
	 * @param horas    la hora introducida
	 * @param minutos  los minutos introducidos
	 * @param segundos los segundos introducidos
	 */
	public static void errores(int horas, int minutos, int segundos) {
		if (horas > 23 || horas < 0) {
			System.err.println("La hora indicada es erronea");
		} else if (minutos > 60 || minutos < 0) {
			System.err.println("Los minutos indicados son erroneos");
		} else if (segundos > 60 || segundos < 0) {
			System.err.println("Los segundos indicados son erroneos");
		}
		horasPasadas(horas, minutos);
		System.out.println(" ");
		minutosPasados(horas, minutos, segundos);
		System.out.println(" ");
		segundosPasados(horas, minutos, segundos);
	}

	/**
	 * metodo que calcula las horas pasadas desde las 00:00:00
	 * 
	 * @param horas   la hora introducida
	 * @param minutos los minutos introducidos
	 */
	public static void horasPasadas(int horas, int minutos) {
		if (minutos == 60) {
			System.out.println("Han pasado " + (horas + 1) + " horas desde las 00:00:00");
		} else
			System.out.println("Han pasado " + horas + " horas desde las 00:00:00");
	}

	/**
	 * metodo que calcula los minutos pasados desde las 00:00:00
	 * 
	 * @param horas    la hora introducida
	 * @param minutos  los minutos introducidos
	 * @param segundos los segundos introducidos
	 */
	public static void minutosPasados(int horas, int minutos, int segundos) {
		int min = horas * 60;
		if (segundos == 60) {
			System.out.println("Han pasado " + (min + minutos + 1) + " minutos desde las 00:00:00");
		} else
			System.out.println("Han pasado " + (min + minutos) + " minutos desde las 00:00:00");
	}

	/**
	 * metodo que calcula los segundos pasados desde las 00:00:00
	 * 
	 * @param horas    la hora introducida
	 * @param minutos  los minutos introducidos
	 * @param segundos los segundos introducidos
	 */
	public static void segundosPasados(int horas, int minutos, int segundos) {
		int min = (horas * 60) + minutos;
		int seg = min * 60;
		System.out.println("Han pasado " + (seg + segundos) + " segundos desde las 00:00:00");
	}
}
