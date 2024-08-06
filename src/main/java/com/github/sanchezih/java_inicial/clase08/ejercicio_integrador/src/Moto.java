package com.github.sanchezih.java_inicial.clase08.ejercicio_integrador.src;

public class Moto extends Vehiculo {

	private boolean tieneEspejos;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param patente
	 * @param marca
	 * @param cilindrada
	 * @param tieneEspejos
	 */
	public Moto(String patente, String marca, int cilindrada, boolean tieneEspejos) {
		super(patente, marca, cilindrada);
		this.tieneEspejos = tieneEspejos;
	}

}
