package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._01_ejemplos_simples;

/**
 * 
 * @author ihsanch
 *
 */
public class Ejemplo01 {

	public static void main(String[] args) {

		int[] numeros = new int[5];

		System.out.println("El array puede contener " + numeros.length + " elementos");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
