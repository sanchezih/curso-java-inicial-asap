package com.github.sanchezih.java_inicial.clase04._02_ejercitacion;

/**
 * Programa que genera un array de 8 enteros aleatorios entre 1 y 10, lo ordena
 * utilizando el algoritmo de ordenamiento de burbuja y lo muestra.
 * 
 * @author ihsanch
 *
 */
public class Ejercicio02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final int CANT_ELEMENTOS = 8;
		int array[] = new int[CANT_ELEMENTOS];

		// Se llena el array con valores aleatorios entre 1 y 100
		for (int i = 0; i < CANT_ELEMENTOS; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
		}

		// Se muestra el array completo
		System.out.println("Los valores son:");
		mostrarArray(array);

		ordenarArrayConMetodoBurbuja(array);

		// Se muestra el array ordenado
		System.out.println("Array ordenado:");
		mostrarArray(array);
	}

	/**
	 * 
	 * @param array
	 */
	static void ordenarArrayConMetodoBurbuja(int array[]) {
		int tamanio = array.length;
		int aux;

		// Ordenaremos utilizando la ordenacion por intercambio
		for (int i = 0; i < tamanio - 1 - 1; i++) {
			for (int j = 0; j < tamanio - i - 1; j++) {
				if (array[j] > array[j + 1]) // Si el elemento j es mayor que el j+1
				{
					aux = array[j]; // Los intercambiamos

					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

	/**
	 * 
	 * @param array
	 */
	static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
