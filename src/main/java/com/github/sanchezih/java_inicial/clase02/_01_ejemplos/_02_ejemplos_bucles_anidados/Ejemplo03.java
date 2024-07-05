package com.github.sanchezih.java_inicial.clase02._01_ejemplos._02_ejemplos_bucles_anidados;

/**
 * Programa que muestra todos los valores de un contador de 5 digitos empezando
 * por 00000 y acabando en 99999 con la particularidad que cada vez que se deba
 * mostrar un 3 se muestre E.
 * 
 * Para resolverlo anidamos 5 bucles for, uno para cada digito del contador.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo03 {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++) {
						for (int m = 0; m <= 9; m++) {
							System.out.print(i != 3 ? i : "E"); // Uso del ternario
							System.out.print(j != 3 ? j : "E");
							System.out.print(k != 3 ? k : "E");
							System.out.print(l != 3 ? l : "E");
							System.out.println(m != 3 ? m : "E");
						}
					}
				}
			}
		}
	}
}
