package com.github.sanchezih.java_inicial.clase01._02_ejercitacion;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa para convertir una calificacion numerica en alfabetica.
 * 
 * El programa lee por teclado una calificacion numerica entre 0 y 10 y muestra
 * por pantalla su correspondiente calificacion alfabetica.
 * 
 * La equivalencia entre la calificacion numerica y la alfabetica se muestra en
 * esta tabla:
 * 
 * 0 <= nota < 5 Insuficiente
 * 
 * 5 <= nota < 6 Suficiente
 * 
 * 6 <= nota < 7 Bien
 * 
 * 7 <= nota < 9 Notable
 * 
 * 9 <= nota <= 10 Sobresaliente
 * 
 * La calificacion numerica que se introduce por teclado debe estar comprendida
 * entre 0 y 10 para poder obtener su equivalente calificacion alfabetica. Si la
 * calificacion introducida no es valida se muestra un mensaje indicandolo y el
 * programa finaliza.
 * 
 * @author ihsanch
 *
 */
public class Ejercicio03 {
	public static void main(String[] args) {

		int nota = Consola.leerEntero("Ingrese una nota entre 0 y 10: ");

		if (nota < 0 || nota > 10) {
			System.out.println("Nota incorrecta");
		} else if (nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota < 6) {
			System.out.println("Suficiente");
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
	}
}
