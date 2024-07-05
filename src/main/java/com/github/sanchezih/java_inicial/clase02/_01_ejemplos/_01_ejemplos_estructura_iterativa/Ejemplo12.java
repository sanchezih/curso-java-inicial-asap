package com.github.sanchezih.java_inicial.clase02._01_ejemplos._01_ejemplos_estructura_iterativa;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que lee una serie de numeros enteros por teclado. La lectura de
 * numeros por teclado finaliza cuando se ingresa un 0. El programa mostrara
 * cuantos numeros se han leido.
 * 
 * Solucion:
 * 
 * Para resolver este ejercicio vamos a utilizar un bucle while para la lectura
 * de numeros por teclado.
 * 
 * Para contar los numeros que se han introducido se utilizara una variable
 * contador cuyo valor se incrementara en uno cada vez que se introduzca un
 * numero. Cuando finalice la lectura de numeros, se mostrara el valor de esta
 * variable que sera la cantidad de numeros que se han ingresado. El cero no se
 * debe contar como numero ingresado.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo12 {
	public static void main(String[] args) {

		String texto = "Ingrese un numero entero (0 para finalizar): ";

		int contador = 0;
		int n = Consola.leerEntero(texto);

		while (n != 0) {
			contador++;
			n = Consola.leerEntero(texto);
		}
		System.out.println("Se han ingresado " + contador + " numeros");
	}
}
