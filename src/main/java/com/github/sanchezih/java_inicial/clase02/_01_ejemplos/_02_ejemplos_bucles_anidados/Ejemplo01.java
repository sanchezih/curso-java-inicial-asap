package com.github.sanchezih.java_inicial.clase02._01_ejemplos._02_ejemplos_bucles_anidados;

import java.util.Scanner;

import ar.edu.ort.p1.util.Consola;

/**
 * Que es un numero perfecto?
 * 
 * Un numero es perfecto si es igual a la suma de todos sus divisores positivos
 * sin incluir el propio numero.
 * 
 * Por ejemplo, el numero 6 es perfecto.
 * 
 * El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor
 * para comprobar si es perfecto.
 * 
 * Si sumamos 1 + 2 + 3 = 6
 * 
 * Los siguientes numeros perfectos despues del 6 son 28, 496, 8128, 33550336,
 * 8589869056.
 * 
 * El programa pide por teclado un numero y muestra si es perfecto o no.
 * Mediante un bucle for sumaremos los divisores del numero. Al final si esta
 * suma es igual al numero mostraremos el mensaje correspondiente.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo01 {
	public static void main(String[] args) {
		
		int suma = 0;
		int n = Consola.leerEntero("Ingrese un numero: ");

		for (int i = 1; i < n; i++) { // i son los divisores. Se divide desde 1 hasta n-1
			if (n % i == 0) {
				suma = suma + i; // Si es divisor se suma
			}
		}

		if (suma == n) { // Si el numero es igual a la suma de sus divisores es perfecto
			System.out.println("Es perfecto");
		} else {
			System.out.println("No es perfecto");

		}
	}
}
