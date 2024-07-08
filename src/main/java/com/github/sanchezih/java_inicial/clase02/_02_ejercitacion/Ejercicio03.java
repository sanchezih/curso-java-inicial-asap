package com.github.sanchezih.java_inicial.clase02._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * El programa leera por teclado un numero entero positivo y calculara la suma
 * de sus cifras.
 * 
 * Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La
 * suma de sus cifras es: 10".
 * 
 * @author ihsanch
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		int numero, suma, cifra;

		// Leer un numero entero positivo
		do {
			numero = Consola.leerEntero("Ingrese un numero entero positivo: ");
			if (numero <= 0) {
				System.out.println("El numero ingresado es invalido");
			}
		} while (numero <= 0);

		suma = 0; // Esta variable contendra la suma de las cifras del numero

		while (numero != 0) { // Mientras a n le queden cifras
			cifra = numero % 10; // Con el uso del operador Modulo obtenemos la ultima cifra
			suma = suma + cifra; // Sumamos la ultima cifra
			numero = numero / 10; // Le quitamos al numero la ultima cifra
		}

		System.out.println("La suma de sus cifras es: " + suma);
	}
}
