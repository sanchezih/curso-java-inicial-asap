package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee una velocidad en Km/h y muestra esa velocidad en m/s.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo06 {
	public static void main(String[] args) {

		double velocidad = Consola.leerDouble("Ingrese la velocidad en Km/h: ");

		System.out.println(velocidad + " Km/h -> " + velocidad * 1000 / 3600 + " m/s");
	}

}
