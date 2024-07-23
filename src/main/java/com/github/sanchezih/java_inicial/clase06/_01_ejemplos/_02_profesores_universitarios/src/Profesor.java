package com.github.sanchezih.java_inicial.clase06._01_ejemplos._02_profesores_universitarios.src;

public abstract class Profesor extends Persona {

	private String idProfesor;

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	public Profesor() {
		super();
		this.idProfesor = "Unknown";
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param id
	 */
	public Profesor(String nombre, String apellido, int edad, String id) {
		super(nombre, apellido, edad);
		this.idProfesor = id;
	}

	/*----------------------------------------------------------------------------*/

	public String getIdProfesor() {
		return this.idProfesor;
	}

	public void mostrarDatos() {
		System.out.println("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellido()
				+ " con id de profesor: " + getIdProfesor());
	}

	@Override
	public String toString() {
		return super.toString().concat("\nid: ").concat(this.idProfesor);
	}

	/**
	 * Metodo abstracto que se debe implementar obligatoriamente en las subclases
	 */
	public abstract float importeSalario();

}