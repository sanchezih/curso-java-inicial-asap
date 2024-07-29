package com.github.sanchezih.java_inicial.clase07._02_ejercitacion.comercio_informatico.src;

public class Main {

	public static void main(String[] args) {

		Historial historial = new Historial();

		historial.agregarFacturable(new Insumo("Percha", 150, 5.0));

		historial.agregarFacturable(new ServicioArmado(4));

		historial.agregarFacturable(new ServicioDeReparacion(1, 5));
		historial.agregarFacturable(new ServicioDeReparacion(2, 7));
		historial.agregarFacturable(new ServicioDeReparacion(1, 8));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio 1
		System.out.println("Ejercicio 1: El monto total facturado es: $" + historial.montoTotalFacturado());

		System.out.println();

		/*----------------------------------------------------------------------------*/

		// Test ejercicio 2
		System.out.println("Ejercicio 2: La cantidad de servicios de reparacion con nivel de dificultad menor a 2 es: "
				+ historial.cantServiciosSimples());

	}

}
