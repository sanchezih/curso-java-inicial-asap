package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee la longitud de los catetos de un triangulo rectangulo y
 * muestra la longitud de la hipotenusa segun el teorema de Pitagoras (El
 * cuadrado de la hipotenusa es igual a la suma de los cuadrados de los catetos.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo07 {

	public static void main(String[] args) {

		double cateto1 = Consola.leerDouble("Ingrese la longitud del primer cateto: ");

		double cateto2 = Consola.leerDouble("Ingrese la longitud del segundo cateto: ");

		System.out.println("Hipotenusa -> " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
	}

}
