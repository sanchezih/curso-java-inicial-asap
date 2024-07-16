package com.github.sanchezih.java_inicial.clase04._01_ejemplos._01_metodos;

import com.github.sanchezih.util.io.Consola;

/**
 * 
 * @author ihsanch
 *
 */
public class Ejemplo02 {

	public static void main(String[] args) {

		int numero1 = Consola.leerEntero("Ingrese un numero: ");
		int numero2 = Consola.leerEntero("Ingrese otro numero: ");

		int mayor = getMayorDeDos(numero1, numero2);
		System.out.println("El mayor es: " + mayor);
	}

	/**
	 * Recibe 2 enteros por parametro y retorna el mayor. Se asume que son
	 * distintos.
	 * 
	 * @param numero1
	 * @param numero2
	 * @return
	 */
	static int getMayorDeDos(int numero1, int numero2) {
		return numero1 > numero2 ? numero1 : numero2;
	}

}
