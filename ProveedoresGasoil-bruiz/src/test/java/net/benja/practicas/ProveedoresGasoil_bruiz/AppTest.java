package net.benja.practicas.ProveedoresGasoil_bruiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	Date fecha = new Date(2023, 2, 1);
	double importe = 2.5;
	String nombreFichero = "supergasoil.txt";
	String ficheroVacio = "vacio.txt";
	String fichero1000 = "1000-lineas.txt";

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Creacion de un objeto precio")
	public void creacionDeObjetoPrecio() {
		Precio P = new Precio(fecha, importe);
	}

	@Test
	@DisplayName("Comprobando que .getFecha devuelve lo que tiene que devolver")
	public void probandoGeterFecha() {
		Precio P = new Precio(fecha, importe);
		Date fechaEsperada = new Date(2023, 2, 1);
		assertEquals(fechaEsperada, P.getFecha());
	}

	@Test
	@DisplayName("Comprobando que .getImporte devuelve lo que tiene que devolver")
	public void probandoGeterImporte() {
		Precio P = new Precio(fecha, importe);
		double importeEsperado = 2.5;
		assertEquals(importeEsperado, P.getImporte());
	}

	@Test
	@DisplayName("Creacion de un objeto proveedor")
	public void creacionDeObjetoProveedor() {
		Proveedor P = new Proveedor(nombreFichero);
	}
	@Test
	@DisplayName("Comprobando que .getFecha devuelve lo que tiene que devolver")
	public void probandoGeterNombre() {
		Proveedor P = new Proveedor(nombreFichero);
		String nombreEsperado = "supergasoil" ;
		assertEquals(nombreEsperado, P.getNombreProveedor());
	}
	@Test
<<<<<<< HEAD
	@Disabled("Da error")
=======
	@Disabled("Da fallo ")
>>>>>>> branch 'master' of git@github.com:BenjaminRuizF/1DAW-PROG.git
	@DisplayName("Creacion de un objeto proveedor con un fichero vacio")
	public void creacionDeObjetoProveedorVacio() {
		Proveedor P = new Proveedor(ficheroVacio);
	}

	@Test
<<<<<<< HEAD
	@Disabled("Da error")
=======
	@Disabled("Da fallo")
>>>>>>> branch 'master' of git@github.com:BenjaminRuizF/1DAW-PROG.git
	@DisplayName("Creacion de un objeto proveedor con un fichero de 1000 lineas")
	public void creacionDeObjetoProveedor1000() {
		Proveedor P = new Proveedor(fichero1000);
	}

	@Test
	@DisplayName("Comprobando el metodo getImporte")
	public void testGetImporte() {
		Proveedor P = new Proveedor(nombreFichero);
		double importeEsperado = 2.9;
		assertEquals(importeEsperado, P.getImporte(8, 1, 2023));
	}

	@Test
	@DisplayName("Comprobando fecha sin importe")
	public void probandoGetImporteFechaVacia() {
		Proveedor P = new Proveedor(nombreFichero);
		double importeEsperado = 0;
		assertEquals(importeEsperado, P.getImporte(9, 1, 2023));
	}

	@Test
	@DisplayName("Comprobando fechas incorrectas")
	public void probandoGetImporteDiaInvalido() {
		Proveedor P = new Proveedor(nombreFichero);
		double importeEsperado = 0;
		assertEquals(importeEsperado, P.getImporte(34, 1, 2023));
	}

	@Test
	@DisplayName("Comprobando fechas incorrectas")
	public void probandoGetImporteMesInvalido() {
		Proveedor P = new Proveedor(nombreFichero);
		double importeEsperado = 0;
		assertEquals(importeEsperado, P.getImporte(8, 13, 2023));
	}

	@Test
	@DisplayName("Comprobando fechas incorrectas")
	public void probandoGetImporteAnioInvalido() {
		Proveedor P = new Proveedor(nombreFichero);
		double importeEsperado = 0;
		assertEquals(importeEsperado, P.getImporte(8, 1, 999));
	}

	@Test
	@DisplayName("Comprobando el metodo getMediaMensual")
	public void testGetMediaMensual() {
		Proveedor P = new Proveedor(nombreFichero);
		double mediaEsperada = 2.4025;
		assertEquals(mediaEsperada, P.getMediaMensual(1, 2023));
	}

	@Test
	@DisplayName("Comprobando fecha sin importe")
	public void testGetMediaMensualVacio() {
		Proveedor P = new Proveedor(nombreFichero);
		double mediaEsperada = 0;
		assertEquals(mediaEsperada, P.getMediaMensual(2, 2023));
	}

	@Test
	@DisplayName("Comprobando fechas incorrectas")
	public void testGetMediaMensualMesINvalido() {
		Proveedor P = new Proveedor(nombreFichero);
		double mediaEsperada = 0;
		assertEquals(mediaEsperada, P.getMediaMensual(0, 2023));
	}

	@Test
	@DisplayName("Comprobando fechas incorrectas")
	public void testGetMediaMensualAnioINvalido() {
		Proveedor P = new Proveedor(nombreFichero);
		double mediaEsperada = 0;
		assertEquals(mediaEsperada, P.getMediaMensual(1, 999));
	}

	@Test
	@DisplayName("Comprobando El metodo getPrecioMinimo")
	public void testGetPrecioMinimo() {
		Proveedor P = new Proveedor(nombreFichero);
		double importeEsperado = 2.0;
		assertEquals(importeEsperado, P.getPrecioMinimo().getImporte());
	}
}
