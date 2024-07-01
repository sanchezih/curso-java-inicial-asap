package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee por teclado 3 numeros enteros, calcula el mayor de los 3 y
 * lo muestra.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo08 {

	public static void main(String[] args) {

		int numero1 = Consola.leerEntero("Ingrese el primer numero: ");
		int numero2 = Consola.leerEntero("Ingrese el segundo numero: ");
		int numero3 = Consola.leerEntero("Ingrese el tercer numero: ");

		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El mayor es: " + numero1);
			} else {
				System.out.println("el mayor es: " + numero3);
			}
		} else if (numero2 > numero3) {
			System.out.println("El mayor es: " + numero2);
		} else {
			System.out.println("El mayor es: " + numero3);
		}
	}

}
