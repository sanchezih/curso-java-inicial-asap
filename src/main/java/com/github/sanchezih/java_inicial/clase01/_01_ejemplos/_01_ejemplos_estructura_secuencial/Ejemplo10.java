package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee un numero entero de 3 cifras y muestra por separado sus
 * cifras.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo10 {
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero de 3 cifras: "); // Se asume que el numero ingresado
																					// tiene 3 cifras

		System.out.println("Primera cifra de " + numero + " -> " + (numero / 100));
		System.out.println("Cifra central de " + numero + " -> " + (numero / 10) % 10);
		System.out.println("Ultima cifra  de " + numero + " -> " + (numero % 10));

	}
}
