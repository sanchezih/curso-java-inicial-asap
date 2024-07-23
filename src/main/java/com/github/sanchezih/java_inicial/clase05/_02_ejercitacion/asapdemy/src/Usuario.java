package com.github.sanchezih.java_inicial.clase05._02_ejercitacion.asapdemy.src;



public class Usuario {

	private String id;
	private String nombre;
	private String email;
	private boolean esBecado;

	/*----------------------------------------------------------------------------*/

	public Usuario(String id, String nombre, String email, boolean esBecado) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.esBecado = esBecado;
	}

	/*----------------------------------------------------------------------------*/

	public String getId() {
		return id;
	}

	public boolean esBecado() {
		return esBecado;
	}

}
