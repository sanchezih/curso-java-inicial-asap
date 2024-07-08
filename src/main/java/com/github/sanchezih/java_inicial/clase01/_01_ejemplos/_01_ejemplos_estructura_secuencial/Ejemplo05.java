package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee por teclado el valor del radio de una circunferencia y
 * calcula y muestra por pantalla la longitud y el area de la circunferencia.
 * 
 * Longitud de la circunferencia = 2 * PI * Radio
 * 
 * Area de la circunferencia = PI * Radio^2
 * 
 * @author ihsanch
 *
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		double radio = Consola.leerDouble("Ingrese radio de la circunferencia: ");
		
		double longitud = 2 * Math.PI * radio; // 2 * PI * Radio
		
		double area = Math.PI * Math.pow(radio, 2); // PI * Radio^2

		System.out.println("Longitud de la circunferencia -> " + longitud);
		System.out.println("Area de la circunferencia -> " + area);
	}

}
