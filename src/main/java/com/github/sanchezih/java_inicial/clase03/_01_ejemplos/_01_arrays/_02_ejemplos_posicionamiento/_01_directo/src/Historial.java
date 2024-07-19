package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._02_ejemplos_posicionamiento._01_directo.src;

import com.github.sanchezih.util.ds.UtilArrays;

public class Historial {

	private static final int CANT_MESES = 12;
	private double[] gastosMensuales = new double[CANT_MESES];

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param pagoDeFactura
	 */
	public void acumularGasto(PagoDeFactura pagoDeFactura) {
		this.gastosMensuales[pagoDeFactura.getMes() - 1] += pagoDeFactura.getImporte(); // Acumulador
	}

	/**
	 * 
	 */
	public void mostrarGastosMensuales() {
		UtilArrays.mostrar(this.gastosMensuales);
	}
}
