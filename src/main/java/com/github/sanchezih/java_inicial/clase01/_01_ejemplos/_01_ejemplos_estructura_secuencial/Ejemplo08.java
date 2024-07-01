package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que toma como dato de entrada un numero que corresponde a la
 * longitud del radio de una esfera y calcula y muestra el volumen de la esfera.
 * 
 * La formula para calcular el volumen de la esfera es v = (4/3) * PI * r^3
 * 
 * @author ihsanch
 *
 */
public class Ejemplo08 {
	public static void main(String[] args) {

		double radio = Consola.leerDouble("Ingrese el radio de la esfera: ");
		double volumen = (4.0 / 3) * Math.PI * Math.pow(radio, 3);

		System.out.println("Volumen de la esfera de radio " + radio + " = " + volumen);
	}
}
