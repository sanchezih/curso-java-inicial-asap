package com.github.sanchezih.java_inicial.clase02._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que muestra los N primeros numeros de la serie de Fibonacci. El
 * valor de N se lee por teclado.
 * 
 * La serie de fibonacci la forman una serie de numeros tales que:
 * 
 * El primer termino de la serie es el numero 1. El segundo termino de la serie
 * es el numero 1. Los siguientes terminos de la serie de fibonacci se obtienen
 * de la suma de los dos anteriores:
 * 
 * 1, 1, 2, 3, 5, 8, 13...
 * 
 * @author ihsanch
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		int numero, fibo1, fibo2, i;

		do {
			numero = Consola.leerEntero("Ingrese un numero >1: ");
		} while (numero <= 1);

		System.out.println("Los " + numero + " primeros terminos de la serie de Fibonacci son: ");

		fibo1 = 1;
		fibo2 = 1;

		System.out.print(fibo1 + " ");
		for (i = 2; i <= numero; i++) {
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
	}
}
