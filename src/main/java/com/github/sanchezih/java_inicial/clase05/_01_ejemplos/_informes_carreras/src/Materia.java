package com.github.sanchezih.java_inicial.clase05._01_ejemplos._informes_carreras.src;


public class Materia {

	private String nombre;
	private String cuatrimestre;
	private Estado estado;

	/*----------------------------------------------------------------------------*/

	public Materia(String nombre, String cuatrimestre, Estado estado) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
		this.estado = estado;
	}

	/*----------------------------------------------------------------------------*/

	public Estado getEstado() {
		return estado;
	}

}
