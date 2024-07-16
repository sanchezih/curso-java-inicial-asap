package com.github.sanchezih.java_inicial.clase03._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee la altura de N personas y calcula:
 * 
 * 1. La altura media.
 * 
 * 2. Cuantas personas tienen una altura superior a la media.
 * 
 * 3. Cuantas tienen una altura inferior a la media.
 * 
 * El valor de N se pide por teclado y debe ser entero positivo.
 * 
 * @author ihsanch
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		int i, N, cantMasAltosQueMedia = 0, cantMasBajosQueMedia = 0;
		double media = 0;

		// Leer el numero de personas
		do {
			N = Consola.leerEntero("Cantidad de personas: ");
		} while (N <= 0);

		// Se crea el array de tamanio N
		double[] estaturas = new double[N];

		// Se leen las alturas
		System.out.println("Lectura de la altura de las personas: ");
		for (i = 0; i < N; i++) {
			estaturas[i] = Consola.leerDouble("Persona " + (i + 1) + "= ");
			media = media + estaturas[i]; // Se suma la estatura leida para calcular la media
		}

		// Se calcula la media
		media = media / N;

		// Se recorre todo el array para ver cuantos hay mas altos que la media y
		// cuantos mas bajos
		for (i = 0; i < estaturas.length; i++) {
			if (estaturas[i] > media) { // Si la estatura es mayor que la media
				cantMasAltosQueMedia++;
			} else if (estaturas[i] < media) { // Si es menor
				cantMasBajosQueMedia++;
			}
		}

		// Mostrar resultados
		System.out.println("Estatura media: " + media);
		System.out.println("Personas con estatura superior a la media: " + cantMasAltosQueMedia);
		System.out.println("Personas con estatura inferior a la media: " + cantMasBajosQueMedia);
	}
}
