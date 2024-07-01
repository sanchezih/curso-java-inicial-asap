package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee un nombre y lo muestra por pantalla.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo02 {

	public static void main(String[] args) {

		String nombre = Consola.leer("Ingrese un nombre: ");
		System.out.println("Buenos dias " + nombre);
	}
}
