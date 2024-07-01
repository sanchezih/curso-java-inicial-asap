package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que indica si dos numeros enteros son iguales o no. Los numeros a
 * comprobar se ingresan por teclado.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo04 {

	public static void main(String[] args) {

		int numero1 = Consola.leerEntero("Ingrese el primer numero: ");
		int numero2 = Consola.leerEntero("Ingrese el segundo número: ");

		if (numero1 == numero2) {
			System.out.println("Los numeros ingresados son iguales");
		} else {
			System.out.println("Los numeros ingresados no son iguales");
		}
	}
}
