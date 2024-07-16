package com.github.sanchezih.java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide 10 numeros por teclado, los almacena en un array y que
 * luego muestra el maximo valor, el minimo y las posiciones que ocupan en el
 * array.
 * 
 * @author ihsanch
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 6;
		int[] array = new int[CANT_ELEMENTOS];

		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int posicionMaximo = 0;
		int posicionMinimo = 0;

		System.out.println("Ingrese " + CANT_ELEMENTOS + " numeros");
		for (int i = 0; i < array.length; i++) {
			array[i] = Consola.leerEntero("numeros[" + i + "]= ");

			if (array[i] <= minimo) {
				minimo = array[i];
				posicionMinimo = i + 1;
			}

			if (array[i] >= maximo) {
				maximo = array[i];
				posicionMaximo = i + 1;
			}
		}

		System.out.println("El maximo es " + maximo + " y la posicion es " + (posicionMaximo));
		System.out.println("El minimo es " + minimo + " y la posicion es " + (posicionMinimo));
	}
}
