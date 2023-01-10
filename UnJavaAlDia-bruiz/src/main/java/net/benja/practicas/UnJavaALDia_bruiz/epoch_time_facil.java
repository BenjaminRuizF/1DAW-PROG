package net.benja.practicas.UnJavaALDia_bruiz;

import java.util.Scanner;

/**
 * @author Benjamin
 *
 */
public class epoch_time_facil {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una fecha en formato (YYYY-MM-DD_HH:MM:SS)");
		String hora = teclado.next();
		String[] descompuesto = hora.split("_");
		separar(descompuesto);

	}

	/**
	 * Metodo que guarda cada cifra del array en su variable correspondiente
	 * 
	 * @param descompuesto recibe un array con la fecha dividida en año, mes, dia y
	 *                     hora, minuto, segundo
	 */
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

	/**
	 * Metodo que controla los posibles errores
	 * 
	 * @param anio    la varible que tiene el año indicado
	 * @param mes     la varible que tiene el mes indicado
	 * @param dia     la varible que tiene el dia indicado
	 * @param hora    la varible que tiene la hora indicada
	 * @param minuto  la varible que tiene el minuto indicado
	 * @param segundo la varible que tiene el segundo indicado
	 */
	public static void errores(int anio, int mes, int dia, int hora, int minuto, int segundo) {

		if (anio < 1970) {
			System.err.println("El anio indicado es erroneo");
		} else

		if (mes < 1 || mes > 12) {
			System.err.println("El mes indicado es erroneo");
		}
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia < 1 || dia > 31) {
				System.err.println("El dia indicado es erroneo");
			} else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia < 1 || dia > 30) {
					System.err.println("El dia indicado es erroneo");
				}
			}
		}
		if (hora > 23 || hora < 0) {
			System.err.println("La hora indicada es erronea");
		} else

		if (minuto > 60 || minuto < 0) {
			System.err.println("Los minutos indicados son erroneos");
		} else

		if (segundo > 60 || segundo < 0) {
			System.err.println("Los segundos indicados son erroneos");
		} else
			restaFechas(anio, mes, dia, hora, minuto, segundo);

	}

	/**
	 * Metodo que resta la fecha con 1970-01-01 y pasa lo restante ha segundos e
	 * imprime por pantalla el total
	 * 
	 * @param anio    la varible que tiene el año indicado ya pasado por el control
	 *                de errores
	 * @param mes     la varible que tiene el mes indicado ya pasado por el control
	 *                de errores
	 * @param dia     la varible que tiene el dia indicado ya pasado por el control
	 *                de errores
	 * @param hora    la varible que tiene la hora indicada ya pasado por el control
	 *                de errores
	 * @param minuto  la varible que tiene el minuto indicado ya pasado por el
	 *                control de errores
	 * @param segundo la varible que tiene el segundo indicado ya pasado por el
	 *                control de errores
	 */
	public static void restaFechas(int anio, int mes, int dia, int hora, int minuto, int segundo) {
		int segTotal = 0;
		int anioFinal = anio - 1970;
		int mesFinal = mes - 01;
		int diaFinal = dia - 01;
		segTotal += anioFinal * 31535965;
		segTotal += mesFinal * 2628000;
		segTotal += diaFinal * 86400;
		segTotal += hora * 3600;
		segTotal += minuto * 60;
		segTotal += segTotal + segundo;
		System.out.println("Los segundos pasados desde el 1970-01-01_00:00:00 son " + segTotal);
	}

}
