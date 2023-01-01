package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Arrays;
import java.util.Scanner;

public class epoch_time_facil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una fecha en formato (YYYY-MM-DD_HH:MM:SS)");
		String hora = teclado.next();
		String[] descompuesto = hora.split("_");
		separar(descompuesto);

	}

	public static void separar(String[] descompuesto) {
		String[] horaMinSeg = descompuesto[1].split(":");
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		for (int i = 0; i < horaMinSeg.length; i++) {
			if (i == 0) {
				hora = Integer.parseInt(horaMinSeg[i]);
			} else if (i == 1) {
				minuto = Integer.parseInt(horaMinSeg[i]);
			} else if (i == 2) {
				segundo = Integer.parseInt(horaMinSeg[i]);
			}
		}
		String[] anioMesDia = descompuesto[0].split("-");
		int dia = 0;
		int mes = 0;
		int anio = 0;
		for (int i = 0; i < anioMesDia.length; i++) {
			if (i == 0) {
				anio = Integer.parseInt(anioMesDia[i]);
			} else if (i == 1) {
				mes = Integer.parseInt(anioMesDia[i]);
			} else if (i == 2) {
				dia = Integer.parseInt(anioMesDia[i]);
			}
		}
		errores(anio, mes, dia, hora, minuto, segundo);
	}

	public static void errores(int anio, int mes, int dia, int hora, int minuto, int segundo) {
		if (anio < 1970) {
			System.err.println("El anio indicado es erroneo");
		} else
			anio += anio * 31535965;
		if (mes < 1 || mes > 12) {
			System.err.println("El mes indicado es erroneo");
		} else
			mes += mes * 2628000;
		if (dia < 1 || dia > 31) {
			System.err.println("El dia indicado es erroneo");
		} else
			dia += dia * 86400;
		if (hora > 23 || hora < 0) {
			System.err.println("La hora indicada es erronea");
		} else
			hora += hora * 3600;
		if (minuto > 60 || minuto < 0) {
			System.err.println("Los minutos indicados son erroneos");
		} else
			minuto += minuto * 60;
		if (segundo > 60 || segundo < 0) {
			System.err.println("Los segundos indicados son erroneos");
		}
	}

}
