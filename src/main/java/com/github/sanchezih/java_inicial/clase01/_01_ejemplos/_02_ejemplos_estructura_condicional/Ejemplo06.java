package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee 2 numeros enteros por teclado e indica si la ultima cifra de
 * dichos numeros es la misma.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo06 {
	public static void main(String[] args) {

		int numero1 = Consola.leerEntero("Ingrese el primer numero entero: ");
		int numero2 = Consola.leerEntero("Ingrese el segundo numero entero: ");

		// Para obtener la ultima cifra de un numero se utiliza el operador % (resto).
		if (numero1 % 10 == numero2 % 10) {
			System.out.println("La ultima cifra de los dos numeros es igual");
		} else {
			System.out.println("La ultima cifra de los dos numeros es distinta");
		}
	}
}
