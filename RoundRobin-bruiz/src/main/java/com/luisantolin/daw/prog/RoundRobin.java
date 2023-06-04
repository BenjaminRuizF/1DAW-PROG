package com.luisantolin.daw.prog;

/**
 * Este interfaz describe las funciones necesarias para implementar una Cola Circular.
 * 
 * Una Cola Circular tiene los siguientes comportamientos básicos: 1. solo se pueden añadir elementos al final 2. solo se pueden
 * borrar elementos del principio 3. el siguiente elemento al último es el primero (circular)
 * 
 * Ejemplos de uso:
 * 
 * 1. dada una cola circular con elementos "uno", "dos", "tres" la función get(0) devuelve "uno" 2. dada una cola circular con
 * elementos "uno", "dos", "tres" la función get(1) devuelve "dos" 3. dada una cola circular con elementos "uno", "dos", "tres"
 * la función add("cuatro") modifica la cola que queda "uno", "dos", "tres", "cuatro" 4. dada una cola circular con elementos
 * "uno", "dos", "tres" la función del() devuelve "uno" y modifica la cola que queda "dos", "tres" 5. dada una cola circular con
 * elementos "uno", "dos", "tres" la función next() devuelve "uno", si se le vuelve a llamar otra vez next() devuelve "dos", si
 * se le vuelve a llamar otra vez next() devuelve "tres", y si se le vuelve a llamar otra vez next() devuelve "uno"
 * 
 * @author lantolin
 *
 */
public interface RoundRobin {
    /**
     * Añade el String dado al final de la cola
     * 
     * @param nuevo el String a añadir
     */
    public void add( String nuevo );

    /**
     * Añade los Strings del array de strings al final de la cola.
     * 
     * @param nuevos los Strings que se quieren añadir
     */
    public void add( String[] nuevos );

    /**
     * Borra el primer elemento de la cola y devuelve el String que hubiera en el
     * 
     * @return
     */
    public String del();

    /**
     * Devuelve el número de elementos que hay en la cola
     * @return
     */
    public int size();

    
    /**
     * Devuelve el siguiente elemento de la cola.
     * La primera vez que se ejecuta devuelve el primer elemento.
     * El siguiente elemento al último vuelve a ser el primero.
     * @return
     */
    public String next();

    /**
     * Resetea el iterador del método next() haciendo que la próxima vez 
     * que se le llame devuelva el primer elemento de la cola.
     */
    public void resetIterator();

    /**
     * Devuelve el elemento de la posición index
     * @param index la posición del elemento que se solicita
     * Esta función también se comporta de forma circular.
     * Si la cola está vacía este método devuelve null.
     * Si se pasa un número negativo este método devuelve null.
     * Ejemplo: en una cola de 4 elementos, get(1) devuelve el 2o elemento, y get(5) también devuelve el 2o elemento
     * @return el String almacenado en el elemento de la posición index
     */
    public String get( int index );

}