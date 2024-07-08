package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee un numero entero por teclado y muestra por pantalla el doble
 * y el triple de ese numero.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo03 {

	public static void main(String[] args) {
		
		int numero = Consola.leerEntero("Introduce un numero entero:");

		System.out.println("Numero ingresado: " + numero);
		System.out.println("Doble de " + numero + " -> " + 2 * numero);
		System.out.println("Triple de " + numero + " -> " + 3 * numero);

	}

}
