package coop.gsd.daw.prog;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
		
    int[] positivo = {1,2,3,4};
    int[] negativo = {-1,-2,-3,-4};
    int[] vacio;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    @DisplayName("Creacion de un objeto")
    public void testCreacionObj() {
    	UtilidadesArrays U1 = new UtilidadesArrays();
    }
    @Test
    @DisplayName("Incrementar array positivo en un segundo array")
    public void testIncrementar(){
    	int[] esperado = {2,3,4,5};
    	assertArrayEquals(esperado, UtilidadesArrays.incrementar(positivo, 1));
    }
    @Test
    @DisplayName("Incrementar array negativo en un segundo array")
    public void testIncrementarNegativo(){
    	int[] esperado = {0,-1,-2,-3};
    	assertArrayEquals(esperado, UtilidadesArrays.incrementar(negativo, 1));
    }
    @Test
    @DisplayName("Comprobar que no se incrementa el array introducido")
    public void testArraySinCambiarIncrementar() {
    	int [] esperado = positivo;
    	UtilidadesArrays.incrementar(positivo, 1);
    	assertArrayEquals(esperado, positivo); 
    }
    @Test
    @DisplayName("Incrementar array positivo")
    public void testIncrementarArray(){
    	int[] esperado = {2,3,4,5};
    	UtilidadesArrays.incrementarArray(positivo, 1);
    	assertArrayEquals(esperado, positivo);
    }
    @Test
    @DisplayName("Incrementar array negativo")
    public void testIncrementarArrayNegativo(){
    	int[] esperado = {0,-1,-2,-3};
    	UtilidadesArrays.incrementarArray(negativo, 1);
    	assertArrayEquals(esperado, negativo);
    }
    @Test
    @DisplayName("Invertir array positivo en un segundo array")
    public void testInvertir(){
    	int[] esperado = {4,3,2,1};
    	UtilidadesArrays.invertir(positivo);
    	assertArrayEquals(esperado, UtilidadesArrays.invertir(positivo));
    }
    @Test
    @DisplayName("Invertir array negativo en un segundo array")
    public void testInvertirNegativo(){
    	int[] esperado = {-4,-3,-2,-1};
    	UtilidadesArrays.invertir(negativo);
    	assertArrayEquals(esperado, UtilidadesArrays.invertir(negativo));
    }
    @Test
    @DisplayName("Comprobar que no se invierte el array introducido")
    public void testArraySinCambiarInvertir() {
    	int [] esperado = positivo;
    	UtilidadesArrays.invertir(positivo);
    	assertArrayEquals(esperado, positivo); 
    }
    @Test
    @DisplayName("Invertir array positivo")
    public void testInvertirArray(){
    	int[] esperado = {4,3,2,1};
    	UtilidadesArrays.invertirArray(positivo);
    	assertArrayEquals(esperado, positivo);
    }
    @Test
    @DisplayName("Invertir array negativo")
    public void testInvertirArrayNegativo(){
    	int[] esperado = {-4,-3,-2,-1};
    	UtilidadesArrays.invertirArray(negativo);
    	assertArrayEquals(esperado, negativo);
    }
    @Test
    @DisplayName("Maximo valor del array positivo")
    public void testMaximo() {
    	int Maximo = UtilidadesArrays.maximo(positivo);
    	assertEquals(4, Maximo);
    }
    @Test
    @DisplayName("Maximo valor del array negativo")
    public void testMaximoNegativo() {
    	int Maximo = UtilidadesArrays.maximo(negativo);
    	assertEquals(-1, Maximo);
    }
    @Test
    @DisplayName("Posicion del maximo valor del array positivo")
    public void textMaximoIndice(){
    	int posicion = UtilidadesArrays.maximoIndice(positivo);
    	assertEquals(3, posicion);
    }
    @Test
    @DisplayName("Posicion del maximo valor del array negativo")
    public void textMaximoIndiceNegativo(){
    	int posicion = UtilidadesArrays.maximoIndice(negativo);
    	assertEquals(0, posicion);
    }
    @Test
    @DisplayName("Minimo valor del array positivo")
    public void testMinimo() {
    	int Minimo = UtilidadesArrays.minimo(positivo);
    	assertEquals(1, Minimo);
    }
    @Test
    @DisplayName("Minimo valor del array negativo")
    public void testMinimoNegativo() {
    	int Minimo = UtilidadesArrays.minimo(negativo);
    	assertEquals(-4, Minimo);
    }
    @Test
    @DisplayName("Minimo valor del array recorriendo el metodo entero")
    public void testMinimo2() {
    	int[] array = {200,23,1,3};
    	int Minimo = UtilidadesArrays.minimo(array);
    	assertEquals(1, Minimo);
    }
    @Test
    @DisplayName("Posicion del minimo valor del array positivo")
    public void testMinimoIndice(){
    	int posicion = UtilidadesArrays.minimoIndice(positivo);
    	assertEquals(0, posicion);
    }
    @Test
    @DisplayName("Posicion del minimo valor del array negativo")
    public void testMinimoIndiceNegativo(){
    	int posicion = UtilidadesArrays.minimoIndice(negativo);
    	assertEquals(3, posicion);
    }
    @Test
    @DisplayName("posicion del minimo valor del array recorriendo el metodo entero")
    public void testMinimoIndice2() {
    	int[] array = {200,23,1,3};
    	int posicion = UtilidadesArrays.minimoIndice(array);
    	assertEquals(2, posicion);
    }
    @Test
    @DisplayName("Media del array positivo")
    public void testMedia() {
    	double media = UtilidadesArrays.media(positivo);
    	assertEquals(2.5, media);
    }
    @Test
    @DisplayName("Media del array negativo")
    public void testMediaNegativo() {
    	double media = UtilidadesArrays.media(negativo);
    	assertEquals(-2.5, media);
    }
    
}
