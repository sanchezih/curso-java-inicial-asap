package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee 2 numeros enteros por teclado e indica cual de los 2 es el
 * mayor o si son iguales.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		int numero1 = Consola.leerEntero("Ingrese el primer numero: ");
		int numero2 = Consola.leerEntero("Ingrese el segundo numero: ");

		if (numero1 > numero2) {
			System.out.println("El mayor es " + numero1);
		} else if (numero1 < numero2) {
			System.out.println("El mayor es " + numero2);
		} else {
			System.out.println("Los numeros son iguales");
		}
	}
}
