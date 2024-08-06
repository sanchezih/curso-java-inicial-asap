package com.github.sanchezih.java_inicial.clase08.ejercicio_integrador.src;

public abstract class Vehiculo {

	private String patente;
	private String marca;
	private int cilindrada;

	/*----------------------------------------------------------------------------*/

	public Vehiculo(String patente, String marca, int cilindrada) {
		this.patente = patente;
		this.marca = marca;
		this.cilindrada = cilindrada;
	}

	/*----------------------------------------------------------------------------*/

	public int getCilindrada() {
		return cilindrada;
	}

}
