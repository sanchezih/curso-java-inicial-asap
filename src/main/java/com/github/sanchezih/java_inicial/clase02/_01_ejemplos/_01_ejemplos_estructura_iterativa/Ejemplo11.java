package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee 2 numeros enteros positivos N y M y muestra los multiplos de
 * N que hay desde 1 hasta M.
 * 
 * Por ejemplo si N = 4 y M = 500 el programa mostrara los multiplos de 4 desde
 * 1 hasta 500.
 * 
 * El valor de N debera ser menor que el valor de M. Si no se ingresan valores
 * validos para N o M se mostrara un mensaje indicandolo y los pedira
 * nuevamente.
 * 
 * Solucion:
 * 
 * 1. Ingresar los valores de N y M por teclado. En este punto se debe comprobar
 * que los valores ingresados por teclado para N y M sean validos, en concreto
 * se debe comprobar que los valores de N y M sean mayores que cero y ademas que
 * el valor de N sea menor que el de M.
 * 
 * 2. Mediante un bucle for se mostraran los multiplos de N entre 1 y M.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo11 {

	public static void main(String[] args) {

		int N, M;

		// Paso1: Lectura de dos numeros enteros N Y M. N y M deben ser positivos. N
		// debe ser menor que M
		do {
			N = Consola.leerEntero("Ingrese un numero entero positivo: ");
			if (N <= 0) {
				System.out.println("Debe ingresar un numero positivo");
			}
		} while (N <= 0);

		do {
			M = Consola.leerEntero("Ingrese otro numero entero positivo mayor que " + N + ": ");
			if (M <= 0) {
				System.out.println("Debe ingresar un numero positivo");
			} else if (N >= M) {
				System.out.println("Debe ingresar un numero mayor que " + N);
			}
		} while (M <= 0 || N >= M);

		// Paso 2: Mostrar los multiplos de N desde 1 hasta M
		System.out.println("\nMultiplos de " + N + " desde 1 hasta " + M + ": ");
		for (int i = 1; i <= M; i++) {
			if (i % N == 0) {
				System.out.println(i);
			}
		}
	}
}
