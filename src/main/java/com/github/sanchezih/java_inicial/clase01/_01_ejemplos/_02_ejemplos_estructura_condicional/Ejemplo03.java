package com.github.sanchezih.java_inicial.clase01._01_ejemplos._02_ejemplos_estructura_condicional;

import java.io.IOException;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee un caracter por teclado e indica si es una letra mayuscula.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo03 {

	public static void main(String[] args) throws IOException {

		char caracter = Consola.leerCaracter("Ingrese un caracter: ");

		if (Character.isUpperCase(caracter)) { // Se utiliza el metodo isUpperCase de la clase Character
			System.out.println("Es una letra mayuscula");
		} else {
			System.out.println("No es una letra mayuscula");
		}
	}
}
