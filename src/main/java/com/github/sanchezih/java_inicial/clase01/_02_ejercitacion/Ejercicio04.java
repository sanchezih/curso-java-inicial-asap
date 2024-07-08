package com.github.sanchezih.java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que comprueba si un anio es bisiesto. Un anio es bisiesto si es
 * divisible por 4 y no lo es por 100 o si es divisible por 400.
 * 
 * 
 * @author ihsanch
 *
 */
public class Ejercicio04 {

	public static void main(String[] args) {

		int anio = Consola.leerEntero("Ingrese el anio: ");

		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			System.out.println("Es un anio bisiesto");
		} else {
			System.out.println("No es un anio bisiesto");
		}
	}
}
