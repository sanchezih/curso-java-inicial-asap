package com.github.sanchezih.java_inicial.clase02._01_ejemplos._02_ejemplos_bucles_anidados;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee por teclado un numero entero N no negativo y muestra el
 * factorial de todos los numeros desde 0 hasta N.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		int numero;
		int factorial;

		// Leer un numero entero >= 0
		do {
			numero = Consola.leerEntero("Ingrese un numero > 0: ");
		} while (numero < 0);

		// Para cada numero desde 1 hasta N
		for (int i = 0; i <= numero; i++) {

			// Se calcula su factorial
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}

			// Se muestra el factorial
			System.out.println("El factorial de " + i + " es: " + factorial);
		}
	}
}
