package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee 2 numeros enteros por teclado y los muestra por pantalla.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo01 {

	public static void main(String[] args) {

		// Declaracion de variables
		int n1;
		int n2;

		// Leer el primer numero
		System.out.println("Ingrese un numero entero: ");
		n1 = Consola.leerEntero();

		// Leer el segundo numero
		System.out.println("Ingrese otro numero entero: ");
		n2 = Consola.leerEntero();

		// Mostrar resultado
		System.out.println("Se han ingresado los numeros: " + n1 + " y " + n2);

	}

}
