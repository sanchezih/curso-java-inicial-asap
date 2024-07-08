package com.github.sanchezih.java_inicial.clase02._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B son
 * numeros amigos si la suma de los divisores propios de A es igual a B y la
 * suma de los divisores propios de B es igual a A.
 * 
 * Los divisores propios de un número incluyen la unidad pero no el propio
 * numero.
 * 
 * Un ejemplo de numeros amigos son los numeros 220 y 284.
 * 
 * Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
 * 
 * La suma de los divisores propios de 220 da como resultado 284
 * 
 * Los divisores propios de 284 son 1, 2, 4, 71 y 142.
 * 
 * La suma de los divisores propios de 284 da como resultado 220.
 * 
 * Por lo tanto 220 y 284 son amigos.
 * 
 * Otras parejas de numeros amigos son:
 * 
 * 1184, 1210
 * 
 * 2620, 2924
 * 
 * 5020, 5564
 * 
 * 6232, 6368
 * 
 * 10744, 10856
 * 
 * 12285, 14595
 * 
 * 17296, 18416
 * 
 * @author ihsanch
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		int i;
		int suma = 0;
		int numero1 = Consola.leerEntero("Ingrese el primer numero: ");
		int numero2 = Consola.leerEntero("Ingrese el segundo numero: ");

		for (i = 1; i < numero1; i++) { // for para sumar todos los divisores propios de numero1
			if (numero1 % i == 0) {
				suma = suma + i;
			}
		}

		// Si la suma de los divisores de n1 es igual a n2
		if (suma == numero2) {
			suma = 0;
			for (i = 1; i < numero2; i++) { // Sumo los divisores propios de numero2
				if (numero2 % i == 0) {
					suma = suma + i;
				}
			}

			// Si la suma de los divisores de numero2 es igual a numero1
			if (suma == numero1) {
				System.out.println("Son Amigos");
			} else {
				System.out.println("No son amigos");
			}
		} else {
			System.out.println("No son amigos");
		}
	}
}
