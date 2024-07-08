package com.github.sanchezih.java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide por teclado la fecha de nacimiento de una persona (dia,
 * mes, anio) y calcula su numero de la suerte.
 * 
 * El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de
 * nacimiento y a continuacion sumando las cifras obtenidas en la suma.
 * 
 * Por ejemplo: Si la fecha de nacimiento es 12/07/1980
 * 
 * Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
 * 
 * Numero de la suerte: 28
 * 
 * @author ihsanch
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {

		System.out.println("Ingrese una fecha de nacimiento");

		int dia = Consola.leerEntero("dia: ");
		int mes = Consola.leerEntero("mes: ");
		int anio = Consola.leerEntero("anio");

		int suma = dia + mes + anio;

		int cifra1 = suma / 1000; // obtiene la primera cifra
		int cifra2 = suma / 100 % 10; // obtiene la segunda cifra
		int cifra3 = suma / 10 % 10; // obtiene la tercera cifra
		int cifra4 = suma % 10; // obtiene la ultima cifra
		int suerte = cifra1 + cifra2 + cifra3 + cifra4;

		System.out.println("Su numero de la suerte es: " + suerte);
	}
}
