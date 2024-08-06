package com.github.sanchezih.java_inicial.clase08.ejercicio_integrador.src;

public abstract class Examen implements Evaluable {

	private Persona persona;
	private String fecha;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param fecha
	 * @param persona
	 */
	public Examen(String fecha, Persona persona) {
		this.fecha = fecha;
		this.persona = persona;
	}

}
