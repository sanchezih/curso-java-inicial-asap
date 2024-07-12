package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._01_ejemplos_simples;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que busca un numero entero dentro de un array de 5 enteros (Todos
 * los numeros se leeran por teclado). Si lo encuentra, indica en que posicion
 * de array se encontro, si no lo encuentra, lo indica con un mensaje.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo03 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 5;
		int[] array = new int[CANT_ELEMENTOS];

		// Variables
		int numeroABuscar;
		int j = 0;
		boolean encontrado = false;

		// Se pide que se ingresen los numeros para llenar el array
		for (int i = 0; i <= CANT_ELEMENTOS - 1; i++) {
			array[i] = Consola.leerEntero("Ingrese un numero entero: ");
		}

		// Se pide que se ingrese el numero que se buscara
		numeroABuscar = Consola.leerEntero("Ingrese numero a buscar: ");

		// Se busca el numero en el array
		while (j < array.length && !encontrado) {
			if (array[j] == numeroABuscar) {
				encontrado = true;
			}
			j++;
		}

		// Se muestra el mensaje correspondiente al resultado de la busqueda
		if (encontrado) {
			System.out.println("Encontado en la posicion " + (j - 1));
		} else {
			System.out.println("Numero no encontrado");
		}

	}
}
