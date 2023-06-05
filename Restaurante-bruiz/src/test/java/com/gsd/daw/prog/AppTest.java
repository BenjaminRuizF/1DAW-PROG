package com.gsd.daw.prog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.gsd.daw.prog.Restaurante;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
    /**
     * Rigorous Test :-)
     * @throws Exception 
     */
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    @DisplayName("Creacion de objeto restaurantes")
    public void creacionObjeto() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    }
    @Test
    @DisplayName("Comprobar nombre de restaurante")
    public void comprobarNombre() throws Exception {
    	Restaurante r = new Restaurante("patio", 2, 3);
    	String nombre = r.getNombre();
    	String esperado = "patio";
    	assertEquals(nombre, esperado);
    }
    @Test
    @DisplayName("Comprobar numero de mesas del restaurante")
    public void comprobarNumMesas() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	int mesas = r.getNumMesas();
    	int esperado = 2;
    	assertEquals(2, r.getNumMesas());
    }
    @Test
    @DisplayName("Comprobar numero de personas en una mesas del restaurante")
    public void comprobarGenteMesas() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	r.sentarGente(3);
    	int gente = r.getGenteEnMesa(0);
    	int esperado = 3;
    	assertEquals(gente, esperado);
    }
    @Test
    @DisplayName("Comprobar numero de sillas libres en una mesa del restaurante")
    public void comprobarSillasMesas() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	r.sentarGente(3);
    	int sillas = r.getSillasEnMesa(0);
    	int esperado = 0;
    	assertEquals(sillas, esperado);
    }
    @Test
    @DisplayName("Comprobar numero total de personas en el restaurante")
    public void comprobarTotalPersonas() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	r.sentarGente(3);
    	int total = r.getTotalPersonas();
    	int esperado = 3;
    	assertEquals(total, esperado);
    }
    @Test
    @DisplayName("Comprobar numero total de sillas libres en el restaurante")
    public void comprobarTotalSillas() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	r.sentarGente(3);
    	int gente = r.getTotalSillas();
    	int esperado = 3;
    	assertEquals(gente, esperado);
    }
    @Test
    @DisplayName("Comprobar que no se pueden sentar en el restaurante")
    public void comprobarNoSentarGente() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	int gente = r.sentarGente(4);
    	int esperado = -1;
    	assertEquals(gente, esperado);
    }
    @Test
    @DisplayName("Comprobar que se pueden levantar personas de una mesa en el restaurante")
    public void comprobarLevantarGente() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	r.sentarGente(3);
    	r.levantarMesa(0);
    	int gente = r.getGenteEnMesa(0);
    	int esperado = 0;
    	assertEquals(gente, esperado);
    }
    @Test
    @DisplayName("Comprobar que se pueden mover sillas en el restaurante")
    public void comprobarMoverSillas() throws Exception {
    	Restaurante r = new Restaurante("patio", 2,3);
    	r.sentarGente(2);
    	r.moverSillas(0, 1, 1);
    	int gente = r.getSillasEnMesa(1);
    	int esperado = 4;
    	assertEquals(gente, esperado);
    }
}
