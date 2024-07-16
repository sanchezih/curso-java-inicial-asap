package com.github.sanchezih.java_inicial.clase04._01_ejemplos._01_metodos;

import com.github.sanchezih.util.io.Consola;

/**
 * 
 * @author ihsanch
 *
 */
public class Ejemplo01 {

	public static void main(String[] args) {

		int cantidad = Consola.leerEntero("Ingrese un numero: ");

		System.out.println("---------------------------");
		mostrarFrase(cantidad);
		System.out.println("---------------------------");
	}

	/**
	 * Recibe como parametro un entero y muestra por pantalla N veces, el mensaje
	 * "Funcionalidad ejecutandose"
	 * 
	 * @param cantidad
	 */
	static void mostrarFrase(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Esta es una aplicacion Java");
		}
	}
}
