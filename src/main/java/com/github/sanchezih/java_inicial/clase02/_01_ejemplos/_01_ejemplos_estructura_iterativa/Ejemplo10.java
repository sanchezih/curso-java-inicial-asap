package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que pide dos numeros enteros A y B por teclado y muestra los numeros
 * pares que hay entre A y B.
 * 
 * A debe ser menor que B. Si no es asi, se mostrara un mensaje indicandolo y
 * los pedira nuevamente.
 * 
 * Solucion:
 * 
 * 1. Ingresar los dos numeros por teclado. Como A debe ser menor que B se
 * utilizara una estructura repetitiva do .. while para repetir la lectura
 * mientras A sea mayor o igual que B.
 * 
 * 2. Mostrar los numeros pares desde A hasta B. Para ello utilizaremos la
 * estructura repetitiva for.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo10 {
	public static void main(String[] args) {

		int A, B;

		// Paso 1: Lectura de dos numeros enteros A Y B. A debe ser menor que B
		do {

			A = Consola.leerEntero("Ingrese un numero entero: ");
			B = Consola.leerEntero("Ingrese otro numero entero mayor que el anterior: ");

			if (A >= B) {
				System.out.println("Error: El segundo numero debe ser mayor que el primero");
			}
		} while (A >= B);

		// Paso 2: Mostrar los numeros pares entre A y B.
		System.out.println("\nNumeros pares desde " + A + " hasta " + B + ": ");
		for (int i = A; i <= B; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
