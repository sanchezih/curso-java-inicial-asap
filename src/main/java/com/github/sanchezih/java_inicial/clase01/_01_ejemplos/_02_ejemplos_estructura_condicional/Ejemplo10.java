package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import ar.edu.ort.p1.util.Consola;

/**
 * * Programa que comprueba si un numero entero de tres cifras es palindromo.
 * 
 * Si el numero ingresado no tiene tres cifras se muestra un mensaje indicandolo
 * y el programa finaliza.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo10 {

	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero de 3 cifras: ");

		if (numero >= 100 && numero <= 999) { // Si el numero tiene 3 cifras
			if (numero % 10 == numero / 100) { // Si la ultima cifra es igual a la primera
				System.out.println("El numero es palindromo");
			} else {
				System.out.println("El numero no es palindromo");
			}
		} else { // Si el numero no tiene 3 cifras
			System.out.println("No es un numero de 3 cifras");
		}
	}
}
