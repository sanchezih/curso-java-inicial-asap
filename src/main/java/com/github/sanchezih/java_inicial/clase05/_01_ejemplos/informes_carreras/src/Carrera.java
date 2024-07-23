package com.github.sanchezih.java_inicial.clase05._01_ejemplos.informes_carreras.src;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

	private List<Alumno> alumnos;

	/*----------------------------------------------------------------------------*/

	public Carrera() {
		this.alumnos = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public Informe getInformeMaxMaterias() {
		int maxCantAprobadas = maxCantMateriasAprobadas();
		Informe informe = new Informe(maxCantAprobadas);

		for (Alumno alumno : this.alumnos) {
			if (alumno.getCantMateriasAprobadas() == maxCantAprobadas) {
				AlumnoSimplificado as = new AlumnoSimplificado(alumno.getNombre(), alumno.getMail());
				informe.addAlumnoSimplificado(as);
			}
		}
		return informe;
	}

	/**
	 * 
	 * @return
	 */
	private int maxCantMateriasAprobadas() {
		int max = 0;
		int cantAprobadas = -1;

		for (Alumno alumno : this.alumnos) {
			cantAprobadas = alumno.getCantMateriasAprobadas();
			if (cantAprobadas > max) {
				max = cantAprobadas;
			}
		}
		return max;
	}
	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public void mostrarInformeMaxMaterias() {
		Informe informe = this.getInformeMaxMaterias();
		System.out.println(informe.toString());
	}
}
