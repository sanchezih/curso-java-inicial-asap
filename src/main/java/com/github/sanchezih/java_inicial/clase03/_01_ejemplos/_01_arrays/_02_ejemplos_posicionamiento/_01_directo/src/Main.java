package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._02_ejemplos_posicionamiento._01_directo.src;

public class Main {

	public static void main(String[] args) {

		Historial historial = new Historial();

		// Pagos de enero
		historial.acumularGasto(new PagoDeFactura(5000, "Fibertel", 1));
		historial.acumularGasto(new PagoDeFactura(3000, "Netflix", 1));

		// Pagos de febrero
		historial.acumularGasto(new PagoDeFactura(5000, "Fibertel", 2));
		historial.acumularGasto(new PagoDeFactura(3000, "Netflix", 2));

		// Pagos de marzo
		historial.acumularGasto(new PagoDeFactura(6500, "Fibertel", 3));
		historial.acumularGasto(new PagoDeFactura(3200, "Netflix", 3));

		historial.mostrarGastosMensuales();

	}

}
