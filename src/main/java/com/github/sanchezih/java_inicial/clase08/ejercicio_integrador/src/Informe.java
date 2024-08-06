package com.github.sanchezih.java_inicial.clase08.ejercicio_integrador.src;

import com.google.gson.Gson;

public class Informe {

	private double porcReprobados;
	private double promTiempoAutosAprobados;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param porcReprobados
	 * @param promTiempoAutosAprobados
	 */
	public Informe(double porcReprobados, double promTiempoAutosAprobados) {
		this.porcReprobados = porcReprobados;
		this.promTiempoAutosAprobados = promTiempoAutosAprobados;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		Gson gson = new Gson();
		return gson.toJson(this, Informe.class);
	}

}