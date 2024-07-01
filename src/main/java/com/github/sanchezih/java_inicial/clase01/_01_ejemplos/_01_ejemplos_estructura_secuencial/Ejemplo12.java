package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee 2 numero enteros N y M y le quita a N sus M ultimas cifras.
 * 
 * Por ejemplo, si N = 123456 y M = 2, el nuevo valor de N sera 1234.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo12 {
	public static void main(String[] args) {

		int N = Consola.leerEntero("Ingrese el valor de N: ");

		int M = Consola.leerEntero("Ingrese el valor de M: ");

		// Math.pow devuelve un numero de tipo double es necesario convertirlo a int
		// para hacer la division entre enteros
		N = N / (int) Math.pow(10, M);
		
		System.out.println("Numero modificado " + N);
	}
}
