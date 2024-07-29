package com.github.sanchezih.java_inicial.clase07._02_ejercitacion.comercio_informatico.src;

import java.util.ArrayList;
import java.util.List;

public class Historial {

	private List<Facturable> facturables;

	/*----------------------------------------------------------------------------*/

	public Historial() {
		this.facturables = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public double montoTotalFacturado() {
		double total = 0;
		for (Facturable facturable : this.facturables) {
			total += facturable.getMontoFacturacion(); // total = total + facturable.getMontoFacturacion();
		}
		return total;
	}

	/*----------------------------------------------------------------------------*/

	public int cantServiciosSimples() {
		int cont = 0;
		for (Facturable facturable : this.facturables) {
			if (facturable instanceof ServicioDeReparacion) {
				ServicioDeReparacion sdr = (ServicioDeReparacion) facturable; // Downcasting
				if (sdr.esServicioSimple()) {
					cont++;
				}
			}
		}
		return cont;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarFacturable(Facturable facturable) {
		this.facturables.add(facturable);
	}
}
