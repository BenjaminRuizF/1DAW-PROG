package com.gsd.daw.prog;

import java.util.Arrays;

/**
 * Representa un Restaurante y la gestión de las mesas. El Restaurante tiene
 * nombre y lleva la cuenta las sillas que tiene por mesa y la gente que hay
 * sentada en dos arrays de longitud fija de la mísma longitud.
 * <p>
 * Un array controla cuantas sillas hay por cada mesa y el otro controla cuanta
 * gente hay sentada en ese momento.
 * <p>
 * La clase Restaurante también lleva la cuenta del número de instancias que se
 * han creado (el número de objetos Restaurante que se han instanciado).
 *
 */
public class Restaurante {
	private static Exception IllegalArgumentException;
	// TODO: crea aqui los miembros de datos que necesites.
	private String nombre;
	private int[] Restaurante;
	private int[] genteEnMesa;
	private final int MINIMO = 1;
	private static int contadorRest = 0;
	private int numSillasPorMesa;

	/**
	 * Inicializa el restaurante. El restaurante inicialmente no tiene ninguna
	 * persona (no hay gente sentada) y tiene numSillasPorMesa en cada mesa.
	 * <p>
	 * Si los parametros de inicialización no son correctos se lanza una
	 * IllegalArgumentException
	 * 
	 * @param nombre           nombre del restaurante, no puede ser vacío ni null
	 * @param numMesas         numero de mesas del restaurante, no puede ser ni cero
	 *                         ni negativo
	 * @param numSillasPorMesa numero inicial de sillas en cada mesa, no puede ser
	 *                         ni cero ni negativo
	 */
	public Restaurante(String nombre, int numMesas, int numSillasPorMesa) throws Exception {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		if (numMesas < MINIMO || numSillasPorMesa < MINIMO) {
			throw IllegalArgumentException;
		}
		this.nombre = nombre;
		this.numSillasPorMesa = numSillasPorMesa;
		Restaurante = new int[numMesas];
		for (int i = 0; i < Restaurante.length; i++) {
			Restaurante[i] = numSillasPorMesa;
		}
		genteEnMesa = new int[numMesas];
		contadorRest++;
	}

	/**
	 * Devuelve un String con el nombre del restaurante y un listado de las mesas.
	 * <p>
	 * El listado muestra cada mesa con las sillas que tiene y la gente que tiene
	 * sentada en ese momento.
	 * <p>
	 * Implementalo como quieras, es una ayuda para ti mismo, para ver con facilidad
	 * el estado de un restaurante. Este método no se testeará su funcionalidad,
	 * solo su existencia.
	 */

	public String toString() {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.

		return "Restaurante [nombre=" + nombre + ", Restaurante=" + Arrays.toString(Restaurante) + ", genteEnMesa="
				+ Arrays.toString(genteEnMesa) + "]";
	}

	/**
	 * Devuelve el nombre del restaurante.
	 * 
	 * @return el nombre del restaurante
	 */
	public String getNombre() {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		return nombre;
	}

	/**
	 * Devuelve el numero de mesas que tiene el restaurante.
	 * 
	 * @return el numero de mesas del restaurante
	 */
	public int getNumMesas() {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		return Restaurante.length;
	}

	/**
	 * Devuelve el numero de gente que está sentada en una mesa en este momento. Si
	 * el numero de mesa no está dentro de límites se lanza una
	 * IllegalArgumentException
	 * 
	 * @param numMesa el número de mesa
	 * @return el numero de gente que está sentada en este momento en la mesa
	 * @throws Exception
	 */
	public int getGenteEnMesa(int numMesa) throws Exception {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		int retorno = 0;
		if (numMesa > genteEnMesa.length || numMesa < 0) {
			throw IllegalArgumentException;
		}
		for (int i = 0; i < genteEnMesa.length; i++) {
			if (i == numMesa) {
				retorno = genteEnMesa[i];
			}
		}
		return retorno;
	}

	/**
	 * Devuelve el numero de gente que está sentada en una mesa en un momento dado.
	 * Si el numero de mesa no está dentro de límites se lanza una
	 * IllegalArgumentException
	 * 
	 * @param numMesa el número de mesa
	 * @return el numero de gente que está sentada en este momento en la mesa
	 */
	public int getSillasEnMesa(int numMesa) throws Exception {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		int retorno = 0;
		if (numMesa > Restaurante.length || numMesa < 0) {
			throw IllegalArgumentException;
		}
		for (int i = 0; i < Restaurante.length; i++) {
			if (i == numMesa) {
				retorno = Restaurante[i];
			}
		}
		return retorno;
	}

	/**
	 * Devuelve el número total de restaurantes que se han creado
	 * 
	 * @return el numero total de restaurantes
	 */
	public static int getNumRestaurantes() {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		return contadorRest;
	}

	/**
	 * Devuelve el numero total de personas que hay en el restaurante en este
	 * momento
	 * 
	 * @return el numero total de personas que hay
	 */
	public int getTotalPersonas() {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		int retorno = 0;
		for (int i = 0; i < genteEnMesa.length; i++) {
			retorno += genteEnMesa[i];
		}
		return retorno;
	}

	/**
	 * Devuelve el numero total de sillas que hay en el restaurante en este momento
	 * 
	 * @return el numero total de sillas
	 */
	public int getTotalSillas() {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		int retorno = 0;
		for (int i = 0; i < Restaurante.length; i++) {
			retorno += Restaurante[i];
		}
		return retorno;
	}

	/**
	 * Sienta a numPersonas en la primera mesa en la que quepan
	 * <p>
	 * Busca la primera mesa libre en la que se puedan sentar ese numero de
	 * personas. Es decir la primera mesa que no tenga gente sentada y tenga sillas
	 * suficientes para ese numero de gente, si la encuentra sienta a la gente y
	 * devuelve el número de mesa.
	 * <p>
	 * Si no la encuentra devuelve -1
	 * 
	 * @param numPersonas el numero de gente a sentar
	 * @return el numero de mesa en el que ha conseguido sentar a las personas o -1
	 *         si no ha conseguido sentarles
	 */
	public int sentarGente(int numPersonas) {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.

		for (int i = 0; i < Restaurante.length; i++) {
			if (numSillasPorMesa == Restaurante[i] && numPersonas <= Restaurante[i]) {
				Restaurante[i] -= numPersonas;
				genteEnMesa[i] = numPersonas;
				return i;
			}
		}
		return -1;
	}

	/**
	 * Levanta a la gente de una mesa. Deja el número de gente sentada a cero.
	 * <p>
	 * Si el numero de mesa no está dentro de límites se lanza una
	 * IllegalArgumentException.
	 * 
	 * @param numMesa el numero de mesa que se levanta
	 */
	public void levantarMesa(int numMesa) {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		for (int i = 0; i < Restaurante.length; i++) {
			if (i == numMesa) {
				Restaurante[i] = numSillasPorMesa;
				genteEnMesa[i] = 0;
			}
		}
	}

	/**
	 * Mueve sillas de una mesa a otra.
	 * <p>
	 * Para mover sillas tiene que haber suficientes y no pueden tener gente
	 * sentada.
	 * <p>
	 * Si el numero de mesa de origen o destino no está dentro de límites se lanza
	 * una IllegalArgumentException.
	 * <p>
	 * Si se solicita mover mas sillas de las que hay o mas sillas de las que hay
	 * libres, no se mueve ninguna y se devuelve -1
	 * 
	 * @param mesaOrigen  numero de mesa de origen
	 * @param mesaDestino numero de mes de destino
	 * @param numSillas   numero de sillas a mover de la mesa de origen a la de
	 *                    destino
	 * @return el numero de sillas movido, si se hizo con éxito o -1 si no se pudo
	 */
	public int moverSillas(int mesaOrigen, int mesaDestino, int numSillas) throws Exception {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		if (mesaOrigen > Restaurante.length || mesaOrigen < 0) {
			throw IllegalArgumentException;
		}
		if (mesaDestino > Restaurante.length || mesaDestino < 0) {
			throw IllegalArgumentException;
		}
		if (numSillas > Restaurante[mesaOrigen]) {
			return -1;
		}
		Restaurante[mesaOrigen] -= numSillas;
		Restaurante[mesaDestino] += numSillas;
		return numSillas;
	}

	/**
	 * Intenta sentar a numPersonas en una mesa.
	 * <p>
	 * Si hay mesa libre y caben todos, los sienta.
	 * <p>
	 * Si no hay ninguna mesa libre devuelve -1.
	 * <p>
	 * La diferencia con sentarGente() es que si hay mesa libre pero no hay
	 * suficientes sillas, busca sillas libres en otras mesas y las va moviendo
	 * hasta que consigue sillas suficientes y sienta a la gente.
	 * <p>
	 * Si no consigue mover sillas libres de otras mesas devuelve -1
	 * 
	 * @param numPersonas numero de personas a sentar
	 * @return el numero de mesa en el que ha conseguido sentar a las personas o -1
	 *         si no ha conseguido sentarles. Las causas de no conseguir sentarles
	 *         serían que no haya mesa libre, que no haya suficientes sillas libres
	 *         en las otras mesas.
	 * @throws Exception
	 */
	public int sentarGenteMoviendoSillas(int numPersonas) throws Exception {
		// TODO: tu código. Si hay un return es solo para que eclipse no muestre un feo
		// error, haz con el lo que consideres.
		int contadorLibre = 0;
		int sillasfaltantes = numPersonas - numSillasPorMesa;
		int mesaLibre = 0;
		for (int i = 0; i < Restaurante.length; i++) {
			if (Restaurante[i] == numSillasPorMesa && contadorLibre < 1) {
				contadorLibre++;
				mesaLibre = i;
			}
		}
		if (contadorLibre < 1) {
			return -1;
		}
		for (int i = 0; i < Restaurante.length; i++) {
			if (numPersonas <= Restaurante[i]) {
				Restaurante[i] -= numPersonas;
				genteEnMesa[i] = numPersonas;
				return i;
			}
			if (numPersonas > Restaurante[i]) {
				moverSillas(i, mesaLibre, sillasfaltantes);
			}
		}
		return -1;
	}
}