package com.github.sanchezih.java_inicial.clase06._02_ejercitacion.administrador_de_personal.src;



public class Main {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		empresa.agregarEmpleado(new EmpleadoAComision("11111111", "Maria", "Perez", 2018, 22));
		empresa.agregarEmpleado(new EmpleadoAComision("22222222", "Carina", "Vazquez", 2015, 23));

		empresa.agregarEmpleado(new EmpleadoASalarioFijo("33333333", "Julia", "Rossi", 2016));

		/*----------------------------------------------------------------------------*/

		// Test ejercicio B
		System.out.println("Ejercicio B: Muestro los salarios de los empleados");
		empresa.mostrarSalarios();

		// Test ejercicio C
		System.out.println("\nEjercicio C: El empleado con mas clientes captados es "
				+ empresa.empleadoConMasClientes().getNombre() + " ("
				+ ((EmpleadoAComision) empresa.empleadoConMasClientes()).getCantClientesCaptados() + " clientes)");

	}

}
