package com.github.sanchezih.java_inicial.clase06._01_ejemplos._01_cuentas_bancarias.src;


public abstract class CuentaBancaria {

	private int numero;
	private String titular;
	private double saldo;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 * @param numero
	 * @param titular
	 */
	public CuentaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}

	/*----------------------------------------------------------------------------*/

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double monto) {
		this.saldo += monto;
	}

	/**
	 * 
	 * @param monto
	 * @return
	 */
	public boolean extraer(double monto) {
		if (monto > saldo) {
			return false;
		} else {
			saldo -= monto;
			return true;
		}
	}
}
