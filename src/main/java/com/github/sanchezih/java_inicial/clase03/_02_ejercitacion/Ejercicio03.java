package com.github.sanchezih.java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide 5 numeros enteros, los almacena en un array, e indica por
 * pantalla si dicho array es capicua.
 * 
 * @author ihsanch
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Creacion del array
		final int CANT_ELEMENTOS = 5;
		int[] array = new int[CANT_ELEMENTOS];

		int ini = 0;
		int fin = array.length - 1;
		boolean esCapicua = true;

		System.out.println("Ingrese " + CANT_ELEMENTOS + " numeros");
		for (int i = 0; i < array.length; i++) {
			array[i] = Consola.leerEntero("numeros[" + i + "]= ");
		}

		while (ini <= fin && esCapicua) {
			esCapicua = (array[ini++] == array[fin--]);
		}

		if (esCapicua) {
			System.out.println("El array es capicua");
		} else {
			System.out.println("El array NO es capicua");
		}
	}

}
