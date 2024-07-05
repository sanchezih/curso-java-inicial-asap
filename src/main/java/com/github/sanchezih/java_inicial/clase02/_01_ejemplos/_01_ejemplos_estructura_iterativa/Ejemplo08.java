package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que pide por teclado el valor de un numero entero N y muestra los
 * numeros desde N hasta 1 ambos incluidos.
 * 
 * Realizar 3 implementaciones:
 * 
 * 1. Utilizando la estructura for
 * 
 * 2. Utilizando la estructura while
 * 
 * 3. Utilizando la estructura do .. while
 * 
 * @author ihsanch
 *
 */
public class Ejemplo08 {

	/**
	 * Utilizando la estructura for
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numero = Consola.leerEntero("Ingrese un numero entero: ");
		System.out.println("Numeros del " + numero + " al 1 utilizando for: ");

		for (int i = numero; i >= 1; i--) {
			System.out.println(i);
		}
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Utilizando la estructura while
	 * 
	 * @param args
	 */
//	public static void main(String[] args) {
//
//		int numero = Consola.leerEntero("Ingrese un numero entero: ");
//
//		System.out.println("Numeros del " + numero + " al 1 utilizando while: ");
//
//		while (numero >= 1) {
//			System.out.println(numero);
//			numero--;
//		}
//	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Utilizando la estructura do .. while
	 * 
	 * @param args
	 */
//	public static void main(String[] args) {
//		int numero = Consola.leerEntero("Ingrese un numero entero: ");
//		System.out.println("Numeros del " + numero + " al 1 utilizando do .. while: ");
//
//		do {
//			System.out.println(numero);
//			numero--;
//		} while (numero >= 1);
//	}

}
