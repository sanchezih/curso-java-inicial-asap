package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee una cantidad de grados C y muestra por pantalla ese valor en
 * grados F.
 * 
 * La formula para pasar de grados C a F es: F = 32 + ( 9 * C / 5)
 * 
 * @author ihsanch
 *
 */
public class Ejemplo04 {

	public static void main(String[] args) {

		double gradosC = Consola.leerDouble("Ingrese grados centigrados: ");
		double gradosF = 32 + (9 * gradosC / 5);

		System.out.println(gradosC + " ºC = " + gradosF + " ºF");
	}

}
