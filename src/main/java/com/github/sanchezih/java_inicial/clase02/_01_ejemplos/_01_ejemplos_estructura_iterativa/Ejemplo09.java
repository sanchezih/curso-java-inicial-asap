package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que pide dos numeros enteros por teclado y muestra los numeros desde
 * el menor hasta el mayor de los numeros ingresados.
 * 
 * Los dos numeros ingresados deben ser distintos. Si son iguales se mostrara un
 * mensaje indicandolo y los pedira nuevamente.
 * 
 * Solucion:
 * 
 * 1. Ingresar los dos numeros por teclado. Como los numeros deben ser distintos
 * utilizaremos una estructura repetitiva do .. while para repetir la lectura
 * mientras los numeros que se ingresen sean iguales.
 * 
 * 2. Calculamos cual es el mayor y cual es el menor.
 * 
 * 3. Finalmente se muestran por pantalla los numeros desde el menor hasta el
 * mayor. Para ello utilizaremos la estructura repetitiva for.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo09 {
	public static void main(String[] args) {

		int numero1, numero2, menor, mayor;

		// Paso 1: Lectura de dos numeros enteros distintos
		do {
			numero1 = Consola.leerEntero("Ingrese un numero entero: ");
			numero2 = Consola.leerEntero("Ingrese otro numero entero distinto del anterior: ");

			if (numero1 == numero2) {
				System.out.println("Error: Los numeros deben ser distintos");
			}
		} while (numero1 == numero2);

		// Paso 2: Calcular cual de los numeros es el mayor y cual el menor
		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}

		// Paso 3: Mostrar por pantalla los numeros desde el menor hasta el mayor.
		System.out.println("\nNúmeros desde " + menor + " hasta " + mayor + " : ");
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
}
