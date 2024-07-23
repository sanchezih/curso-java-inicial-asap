package com.github.sanchezih.java_inicial.clase06._01_ejemplos._01_cuentas_bancarias.src;

public class CajaDeAhorro extends CuentaBancaria {

	private double interesesGanados;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param numero
	 * @param titular
	 */
	public CajaDeAhorro(int numero, String titular) {
		super(numero, titular);
		this.interesesGanados = 0;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param interesesGanados
	 */
	public void setInteresesGanados(double interesesGanados) {
		this.interesesGanados = interesesGanados;
	}

	/**
	 * 
	 */
	public void pagarIntereses() {
		setSaldo(getSaldo() + interesesGanados);
		interesesGanados = 0;
	}

}
