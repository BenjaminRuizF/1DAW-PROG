package coop.gsd.daw.prog;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

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
    public void testCreacionObj() {
    	UtilidadesArrays U1 = new UtilidadesArrays();
    }
    @Test
    public void testIncrementar(){
    	int[] esperado = {2,3,4,5};
    	assertArrayEquals(esperado, UtilidadesArrays.incrementar(positivo, 1));
    }
    @Test
    public void testIncrementarNegativo(){
    	int[] esperado = {0,-1,-2,-3};
    	assertArrayEquals(esperado, UtilidadesArrays.incrementar(negativo, 1));
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
    public void testIncrementarArrayNegativo(){
    	int[] esperado = {0,-1,-2,-3};
    	UtilidadesArrays.incrementarArray(negativo, 1);
    	assertArrayEquals(esperado, negativo);
    }
    @Test
    public void testInvertir(){
    	int[] esperado = {4,3,2,1};
    	UtilidadesArrays.invertir(positivo);
    	assertArrayEquals(esperado, UtilidadesArrays.invertir(positivo));
    }
    @Test
    public void testInvertirNegativo(){
    	int[] esperado = {-4,-3,-2,-1};
    	UtilidadesArrays.invertir(negativo);
    	assertArrayEquals(esperado, UtilidadesArrays.invertir(negativo));
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
    public void testInvertirArrayNegativo(){
    	int[] esperado = {-4,-3,-2,-1};
    	UtilidadesArrays.invertirArray(negativo);
    	assertArrayEquals(esperado, negativo);
    }
    @Test
    public void testMaximo() {
    	int Maximo = UtilidadesArrays.maximo(positivo);
    	assertEquals(4, Maximo);
    }
    @Test
    public void testMaximoNegativo() {
    	int Maximo = UtilidadesArrays.maximo(negativo);
    	assertEquals(-1, Maximo);
    }
    @Test
    public void textMaximoIndice(){
    	int posicion = UtilidadesArrays.maximoIndice(positivo);
    	assertEquals(3, posicion);
    }
    @Test
    public void textMaximoIndiceNegativo(){
    	int posicion = UtilidadesArrays.maximoIndice(negativo);
    	assertEquals(0, posicion);
    }
    @Test
    public void testMinimo() {
    	int Minimo = UtilidadesArrays.minimo(positivo);
    	assertEquals(1, Minimo);
    }
    @Test
    public void testMinimoNegativo() {
    	int Minimo = UtilidadesArrays.minimo(negativo);
    	assertEquals(-4, Minimo);
    }
    @Test
    public void testMinimo2() {
    	int[] array = {200,23,1,3};
    	int Minimo = UtilidadesArrays.minimo(array);
    	assertEquals(1, Minimo);
    }
    @Test
    public void testMinimoIndice(){
    	int posicion = UtilidadesArrays.minimoIndice(positivo);
    	assertEquals(0, posicion);
    }
    @Test
    public void testMinimoIndiceNegativo(){
    	int posicion = UtilidadesArrays.minimoIndice(negativo);
    	assertEquals(3, posicion);
    }
    @Test
    public void testMinimoIndice2() {
    	int[] array = {200,23,1,3};
    	int posicion = UtilidadesArrays.minimoIndice(array);
    	assertEquals(2, posicion);
    }
    @Test
    public void testMedia() {
    	double media = UtilidadesArrays.media(positivo);
    	assertEquals(2.5, media);
    }
    @Test
    public void testMediaNegativo() {
    	double media = UtilidadesArrays.media(negativo);
    	assertEquals(-2.5, media);
    }
    
}
