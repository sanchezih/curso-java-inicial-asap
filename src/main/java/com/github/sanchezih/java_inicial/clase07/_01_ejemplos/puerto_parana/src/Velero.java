package com.github.sanchezih.java_inicial.clase07._01_ejemplos.puerto_parana.src;


public class Velero extends Embarcacion {

	private int cantMastiles;

	/**
	 * 
	 * @param matricula
	 * @param eslora
	 * @param anioFabricacion
	 * @param duenio
	 * @param valorBase
	 * @param valorAdicional
	 * @param cantMastiles
	 */
	public Velero(String matricula, double eslora, int anioFabricacion, String duenio, double valorBase,
			double valorAdicional, int cantMastiles) {
		super(matricula, eslora, anioFabricacion, duenio, valorBase, valorAdicional);
		this.cantMastiles = cantMastiles;
	}

	/**
	 * Se obtiene multiplicando el valorAdicional por la cantidad de mastiles
	 */
	@Override
	public double getPrecioAdicional() {
		return getValorAdicional() * this.cantMastiles;
	}

}
