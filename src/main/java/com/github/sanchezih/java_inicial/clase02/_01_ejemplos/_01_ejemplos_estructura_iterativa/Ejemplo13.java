package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Se considera que un numero es narcisista si la suma de sus cifras elevadas al
 * numero de cifras que tiene el numero es igual al propio numero.
 * 
 * Por ejemplo, el numero 153 es un numero narcisista. El numero tiene 3 cifras
 * y si sumamos cada una de sus cifras elevada al cubo el resultado es el propio
 * numero:
 * 
 * 1^3 + 5^3 + 3^3 -> 1 + 125 + 27 = 153
 * 
 * Otro ejemplo de numero narcisista es el 1634
 * 
 * 1^4 + 6^4 + 3^4 + 4^4 -> 1 + 1296 + 81 + 256 = 1634
 * 
 * El programa pedira que se ingrese por teclado un numero entero positivo y
 * determinara si es un numero narcisista o no lo es.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo13 {
	public static void main(String[] args) {

		int numero, aux, cifra, cantDeCifras = 0;
		double suma;

		// Lectura de un numero entero positivo
		do {
			numero = Consola.leerEntero("Ingrese un numero entero positivo: ");
			if (numero <= 0) {
				System.out.println("Error. Debe ser un numero entero positivo");
			}
		} while (numero <= 0);

		// Contar las cifras del numero
		aux = numero;
		while (aux != 0) {
			cantDeCifras++;
			aux = aux / 10;
		}

		System.out.println("El numero tiene " + cantDeCifras + " de cifras");

		suma = 0; // Variable que contendra la suma de las cifras
		aux = numero;

		while (aux != 0) { // Mientras le queden cifras al numero...
			cifra = aux % 10; // Con el uso del operador Modulo obtenemos la ultima cifra
			suma = suma + Math.pow(cifra, cantDeCifras); // Elevamos la cifra al numero de cifras y se suma
			aux = aux / 10; // Le quitamos al numero la ultima cifra
		}

		// Si la suma es igual al numero sera un numero narcisista
		if (suma == numero) {
			System.out.println("El numero es narcisista");
		} else {
			System.out.println("El numero no es narcisista");
		}
	}
}
