package com.github.sanchezih.java_inicial.clase08.ejercicio_integrador.src;

public class Auto extends Vehiculo {

	private int cantPuertas;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param patente
	 * @param marca
	 * @param cilindrada
	 * @param cantPuertas
	 */
	public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}

}
