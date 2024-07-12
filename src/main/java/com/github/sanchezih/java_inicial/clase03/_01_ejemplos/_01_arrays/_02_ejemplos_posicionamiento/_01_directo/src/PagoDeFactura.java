package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._02_ejemplos_posicionamiento._01_directo.src;

public class PagoDeFactura {

	private double importe;
	private String empresa;
	private int mes;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param importe
	 * @param empresa
	 * @param mes
	 */
	public PagoDeFactura(double importe, String empresa, int mes) {
		this.importe = importe;
		this.empresa = empresa;
		this.mes = mes;
	}

	/*----------------------------------------------------------------------------*/

	public double getImporte() {
		return importe;
	}

	public int getMes() {
		return mes;
	}

}
