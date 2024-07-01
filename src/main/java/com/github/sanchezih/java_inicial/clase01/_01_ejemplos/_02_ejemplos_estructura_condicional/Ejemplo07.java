package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de tres
 * y de cinco.
 * 
 * 
 * @author ihsanch
 *
 */
public class Ejemplo07 {
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero: ");

		// Se utiliza el operador AND
		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("Es multiplo de 3 y de 5");
		} else {
			System.out.println("No es multiplo de 3 y de 5");
		}
	}
}
