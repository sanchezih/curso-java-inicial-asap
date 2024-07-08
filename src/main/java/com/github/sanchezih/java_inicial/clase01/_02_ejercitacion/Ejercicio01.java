package com.github.sanchezih.java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o
 * de 3.
 * 
 * 
 * @author ihsanch
 *
 */
public class Ejercicio01 {
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero: ");

		if (numero % 2 == 0 || numero % 3 == 0) {
			System.out.println("Es multiplo de 2 o de 3");
		} else {
			System.out.println("No es multiplo de 2 o de 3");
		}
	}
}
