package net.benja.practicas.UnJavaALDia_bruiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cuanto_dia_ha_pasado {

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
		sacarPorcentaje(horas, minutos, segundos);
	}

	public static void sacarPorcentaje(int horas, int minutos, int segundos) {
		 DecimalFormat df = new DecimalFormat("#.00");
		float horaTotal = segundos / 3600;
		horaTotal += minutos / 60;
		horaTotal += horas;
		System.out.println("El porcentaje de dia pasado desde las 00:00:00 es de "+df.format((horaTotal/24)*100)+"%");
	}

}
