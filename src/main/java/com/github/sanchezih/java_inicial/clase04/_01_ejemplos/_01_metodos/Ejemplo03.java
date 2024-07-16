package com.github.sanchezih.java_inicial.clase04._01_ejemplos._01_metodos;

/**
 * Programa que llena un array de 6 enteros con numeros aleatorios entre 1 y 100
 * y muestra el numero mas grande.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo03 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final int CANT_ELEMENTOS = 6;
		int array[] = new int[CANT_ELEMENTOS];

		// Se llena el array con valores aleatorios entre 1 y 100
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
		}

		// Se muestra el array completo
		System.out.println("Los valores son:");
		mostrarArray(array);

		// Se obtiene y se muestra el numero mayor
		System.out.println("\nEl numero mayor es: " + getMayorEntero(array));
	}

	/**
	 * Recibe un array de enteros y retorna el entero mas grande
	 * 
	 * @param array
	 * @return
	 */
	static int getMayorEntero(int[] array) {

		int mayor = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	/**
	 * 
	 * @param array
	 */
	static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
