package net.benja.practicas.CalculadoraDeNota_bruiz;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testBoleano() {
    	Calculadora C1 = new Calculadora();
    	String [] array = {"C-1"};
    	//String [] array2 = {"H-1"};
    	assertTrue(C1.entradas(array));

  
    }
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
