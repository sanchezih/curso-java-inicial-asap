package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que pide por teclado el valor de un numero N y muestra por pantalla
 * todos los numeros desde 1 hasta N.
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
public class Ejemplo07 {

	/**
	 * Utilizando la estructura for
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero: ");

		System.out.println("\nNumeros del 1 al " + numero + ": ");
		for (int i = 1; i <= numero; i++) {
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
//		int numero = Consola.leerEntero("Ingrese un numero entero: ");
//		System.out.println("Numeros del 1 al " + numero + ": ");
//		int i = 1;
//		while (i <= numero) {
//			System.out.println(i);
//			i++;
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
//		System.out.println("Numeros del 1 al " + numero + ": ");
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i <= numero);
//	}

}
