package coop.gsd.daw.prog;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import coop.gsd.daw.prog.UtilidadesArrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    int[] positivo = {1,2,3,4};
    int[] negativo = {-1,-2,-3,-4};
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testIncrementar(){
    	int[] esperado = {2,3,4,5};
    	assertArrayEquals(esperado, UtilidadesArrays.incrementar(positivo, 1));
    }
  
    @Test
    public void testArraySinCambiarIncrementar() {
    	int [] esperado = positivo;
    	UtilidadesArrays.incrementar(positivo, 1);
    	assertArrayEquals(esperado, positivo); 
    }
    @Test
    public void testIncrementarArray(){
    	int[] esperado = {2,3,4,5};
    	UtilidadesArrays.incrementarArray(positivo, 1);
    	assertArrayEquals(esperado, positivo);
    }
   
    @Test
    public void testInvertir(){
    	int[] esperado = {4,3,2,1};
    	UtilidadesArrays.invertir(positivo);
    	assertArrayEquals(esperado, UtilidadesArrays.invertir(positivo));
    }
    @Test
    public void testArraySinCambiarInvertir() {
    	int [] esperado = positivo;
    	UtilidadesArrays.invertir(positivo);
    	assertArrayEquals(esperado, positivo); 
    }
    @Test
    public void testInvertirArray(){
    	int[] esperado = {4,3,2,1};
    	UtilidadesArrays.invertirArray(positivo);
    	assertArrayEquals(esperado, positivo);
    }
    @Test
    public void testMaximo() {
    	int Maximo = UtilidadesArrays.maximo(positivo);
    	assertEquals(4, Maximo);
    }
    @Test
    public void textMaximoIndice(){
    	int posicion = UtilidadesArrays.maximoIndice(positivo);
    	assertEquals(3, posicion);
    }
    @Test
    public void testMinimo() {
    	int Minimo = UtilidadesArrays.minimo(positivo);
    	assertEquals(1, Minimo);
    }
    @Test
    public void textMinimoIndice(){
    	int posicion = UtilidadesArrays.minimoIndice(positivo);
    	assertEquals(0, posicion);
    }
    @Test
    public void testMedia() {
    	
    	double media = UtilidadesArrays.media(positivo);
    	assertEquals(2.5, media);
    }
    
}
