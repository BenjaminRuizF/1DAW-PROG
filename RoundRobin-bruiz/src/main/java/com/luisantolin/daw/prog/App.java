package com.luisantolin.daw.prog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RoundRobinWithList lista = new RoundRobinWithList();
        RoundRobinWithArray array = new RoundRobinWithArray();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        array.add("uno");
        array.add("dos");
        array.add("tres");
        array.add("cuatro");
        lista.sacar();
        System.out.println("===================");
        array.sacar();
        System.out.println("===================");
        System.out.println(lista.size());
        System.out.println("===================");
        System.out.println(array.size());
        System.out.println("===================");
        System.out.println(lista.next());
        System.out.println(lista.next());
        System.out.println(lista.next());
        System.out.println(lista.next());
        System.out.println(lista.next());
        lista.resetIterator();
        System.out.println(lista.next());
        System.out.println(lista.next());
        System.out.println("===================");
        System.out.println(array.next());
        System.out.println(array.next());
        System.out.println(array.next());
        System.out.println(array.next());
        System.out.println(array.next());
        array.resetIterator();
        System.out.println(array.next());
        System.out.println(array.next());
        System.out.println("===================");
        //System.out.println(lista.del());
        System.out.println("===================");
        //System.out.println(array.del());
        System.out.println("===================");
        System.out.println(lista.size());
        System.out.println("===================");
        System.out.println(array.size());
        System.out.println("===================");
        System.out.println(lista.get(1));
        System.out.println(lista.get(9));
        System.out.println("===================");
        System.out.println(lista.get(2));
        System.out.println(lista.get(10));
    }
}
