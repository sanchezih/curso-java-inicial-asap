package com.github.sanchezih.java_inicial.clase07._02_ejercitacion.comercio_informatico.src;

public class ServicioArmado extends Servicio {

	private static final double VALOR_HORA = 250;

	/**
	 * 
	 * @param cantHoras
	 */
	public ServicioArmado(int cantHoras) {
		super(cantHoras);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public double getValorHora() {
		return VALOR_HORA;
	}

}
