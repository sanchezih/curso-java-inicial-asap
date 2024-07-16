package com.github.sanchezih.java_inicial.clase04._01_ejemplos._01_metodos;

import com.github.sanchezih.util.io.Consola;

public class Ejemplo04 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int numero1 = Consola.leerEntero("Ingrese el primer numero: ");
		int numero2 = Consola.leerEntero("Ingrese el segundo numero: ");
		mostrarDeMenorAMayor(numero1, numero2);
	}

	/**
	 * Recibe 2 enteros y muestra los numeros entre el menor y el mayor
	 * 
	 * @param numero1
	 * @param numero2
	 */
	static void mostrarDeMenorAMayor(int numero1, int numero2) {

		int mayor, menor;

		// Se desconoce cual de los parametros es el menor y cual es mayor.

		if (numero1 > numero2) { // Si numero1 es el mayor
			mayor = numero1;
			menor = numero2;
		} else { // Si numero2 es el mayor
			mayor = numero2;
			menor = numero1;
		}

		for (int i = menor; i <= mayor; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

}
