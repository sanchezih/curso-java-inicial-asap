package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

/**
 * Programa que muestra los numeros del 1 al 10 utilizando la instruccion
 * do..while.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo02 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Numeros del 1 al 10: ");

		// Lo que este dentro del do se ejecutara al menos 1 vez
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
