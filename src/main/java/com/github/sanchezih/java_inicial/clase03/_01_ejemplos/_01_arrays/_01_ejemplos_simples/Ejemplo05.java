package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._01_ejemplos_simples;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que guarda en un array 10 numeros enteros que se leen por teclado. A
 * continuacion se recorre el array y calcula cuantos numeros son positivos,
 * cuantos negativos y cuantos ceros.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 10;
		int[] numeros = new int[CANT_ELEMENTOS];

		int contPositivos = 0, contNegativos = 0, cero = 0;
		

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Consola.leerEntero("numeros[" + i + "]= ");
		}

		// Se recorre el array para contar positivos, negativos y ceros
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 0) {
				contPositivos++;
			} else if (numeros[i] < 0) {
				contNegativos++;
			} else {
				cero++;
			}
		}

		System.out.println("Positivos: " + contPositivos);
		System.out.println("Negativos: " + contNegativos);
		System.out.println("Ceros: " + cero);
	}
}
