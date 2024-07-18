package com.github.sanchezih.java_inicial.clase04._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide el ingreso de un numero e indica si es un numero primo o no
 * (Un numero primo es un numero natural mayor que 1 que tiene unicamente dos
 * divisores positivos distintos: el mismo y el 1).
 * 
 * @author ihsanch
 *
 */
public class Ejercicio01 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int numero = Consola.leerEntero("Ingrese un numero: ");

		if (esPrimo(numero)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
	}

	/**
	 * Retorna true si el parametro es un numero primo, false en caso contrario.
	 * 
	 * @param numero
	 * @return
	 */
	static boolean esPrimo(int numero) {
		
		boolean esPrimo = true;
		int i = 2;

		while (i < numero && esPrimo == true) {
			if (numero % i == 0) { // Si el numero es divisible por i
				esPrimo = false; // Si llego aqui es que el numero es divisible -> no es primo
			}
			i++;
		}
		return esPrimo;
	}

}
