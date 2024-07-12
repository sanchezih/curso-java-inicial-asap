package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._01_ejemplos_simples;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee por teclado 6 numeros enteros y los guarda en un array. A
 * continuacion calcula y muestra por separado la media de los valores positivos
 * y la de los valores negativos.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo04 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 6;
		int[] numeros = new int[CANT_ELEMENTOS];

		// Variables
		int i;
		int contPositivos = 0, contNegativos = 0;
		double acuPositivos = 0, acuNegativos = 0; // Acumuladores para las sumas de positivos y negativos

		// Se pide que se ingresen los numeros para llenar el array
		for (i = 0; i < CANT_ELEMENTOS; i++) {
			numeros[i] = Consola.leerEntero("array[" + i + "]= ");
		}

		// Se recorre el array para sumar por separado los numeros positivos y los
		// negativos
		for (i = 0; i < CANT_ELEMENTOS; i++) {
			if (numeros[i] > 0) { // Sumar positivos
				acuPositivos += numeros[i];
				contPositivos++;
			} else if (numeros[i] < 0) { // Sumar negativos
				acuNegativos += numeros[i];
				contNegativos++;
			}
		}

		// Se calculan y muestran las medias
		if (contPositivos != 0) {
			System.out.println("Media de los valores positivos: " + acuPositivos / contPositivos);
		} else {
			System.out.println("No se ingresaron numeros positivos");
		}

		if (contNegativos != 0) {
			System.out.println("Media de los valores negativos: " + acuNegativos / contNegativos);
		} else {
			System.out.println("No se ingresaron numeros negativos");
		}
	}
}
