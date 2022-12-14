package net.benja.practicas.CalculadoraDeNota_bruiz;

public class App {

	public static void main(String[] args) {
		Calculadora Calculadora = new Calculadora();
		Calculadora.salir(Calculadora.entradas(args));
		Calculadora.calculadoraDeNota(args);
	}
}