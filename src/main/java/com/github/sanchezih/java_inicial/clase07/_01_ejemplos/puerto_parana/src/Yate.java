package com.github.sanchezih.java_inicial.clase07._01_ejemplos.puerto_parana.src;



public class Yate extends Embarcacion {

	private int camarotes;

	/**
	 * 
	 * @param matricula
	 * @param eslora
	 * @param anioFabricacion
	 * @param duenio
	 * @param valorBase
	 * @param valorAdicional
	 * @param camarotes
	 */
	public Yate(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int camarotes) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.camarotes = camarotes;
	}

	/**
	 * Se obtiene multiplicando el valorAdicional por la cantidad de camarotes
	 */
	@Override
	public double getPrecioAdicional() {
		return getValorAdicional() * this.camarotes;
	}
}
