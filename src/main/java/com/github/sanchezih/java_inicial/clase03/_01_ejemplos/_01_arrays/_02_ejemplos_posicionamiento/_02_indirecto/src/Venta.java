package com.github.sanchezih.java_inicial.clase03._01_ejemplos._01_arrays._02_ejemplos_posicionamiento._02_indirecto.src;

public class Venta {

	private String fecha;
	private double importe;
	private String legajoVendedor;

	/*----------------------------------------------------------------------------*/

	public Venta(String fecha, double importe, String legajoVendedor) {
		this.fecha = fecha;
		this.importe = importe;
		this.legajoVendedor = legajoVendedor;
	}

	/*----------------------------------------------------------------------------*/

	public double getImporte() {
		return importe;
	}

	public String getLegajoVendedor() {
		return legajoVendedor;
	}

}
