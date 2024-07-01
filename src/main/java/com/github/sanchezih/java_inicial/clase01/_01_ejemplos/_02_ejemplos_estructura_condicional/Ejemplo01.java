package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee un numero entero por teclado e indica si es par o impar.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo01 {
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero entero: ");

		// El operador % se le llama el operador de modulo. Calcula el resto despues de
		// dividir el primer operando por el segundo.
		int resto = numero % 2;

		if (resto == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
