package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee un numero entero por teclado e indica si el numero es
 * multiplo de 10.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo02 {

	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero: ");

		if (numero % 10 == 0) {
			System.out.println("Es multiplo de 10");
		} else {
			System.out.println("No es multiplo de 10");
		}
	}
}
