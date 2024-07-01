package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee un numero entero de 5 cifras y muestra sus cifras igual que
 * en el ejemplo.
 * 
 * Por ejemplo, para un numero 12345, la salida debe ser:
 * 
 * 1
 * 
 * 12
 * 
 * 123
 * 
 * 1234
 * 
 * 12345
 * 
 * @author ihsanch
 *
 */
public class Ejemplo11 {

	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero de 5 cifras: "); // Se asume que el numero ingresado
																					// tiene 5 cifras

		System.out.println(numero / 10000);
		System.out.println(numero / 1000);
		System.out.println(numero / 100);
		System.out.println(numero / 10);
		System.out.println(numero);
	}
}
