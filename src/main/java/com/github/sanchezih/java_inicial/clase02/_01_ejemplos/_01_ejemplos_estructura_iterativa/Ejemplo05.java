package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

/**
 * Programa que muestra los numeros del 10 al 1 utilizando la instruccion
 * do..while.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo05 {
	public static void main(String[] args) {

		System.out.println("Numeros del 10 al 1: ");
		int i = 10;

		do {
			System.out.println(i);
			i--;
		} while (i >= 1);
	}
}
