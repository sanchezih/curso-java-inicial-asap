package com.github.sanchezih.java_inicial.clase05._02_ejercitacion.asapdemy.src;

public class Main {

	public static void main(String[] args) {

		// Creacion de usuarios
		Usuario usuarioVictoria = new Usuario("victoria", "Victoria", "victoria@mail.com", true);
		Usuario usuarioAgustina = new Usuario("agustina", "Agustina", "agustina@mail.com", true);
		Usuario usuarioMartin = new Usuario("martin", "Martin", "martin@mail.com", false);
		Usuario usuarioFelipe = new Usuario("felipe", "Felipe", "felipe@mail.com", true);

		Usuario autorCarlos = new Usuario("carlos", "Carlos", "carlos@mail.com", false);

		// Creacion de categorias y agregado de cursos a cada una
		Categoria categoriaDesarrolloWeb = new Categoria("ca01", "Desarrollo Web");
		categoriaDesarrolloWeb.agregarCurso(new Curso("cu01", "Introduccion a Angular", 150, 5, autorCarlos));
		categoriaDesarrolloWeb.agregarCurso(new Curso("cu02", "Introduccion a PHP", 150, 5, autorCarlos));
		categoriaDesarrolloWeb.agregarCurso(new Curso("cu03", "Introduccion a Java", 150, 5, autorCarlos));

		Categoria categoriaDesarrolloMovil = new Categoria("ca02", "Desarrollo Movil");
		categoriaDesarrolloMovil.agregarCurso(new Curso("cu03", "Google Flutter", 150, 5, autorCarlos));
		categoriaDesarrolloMovil.agregarCurso(new Curso("cu04", "Introuccion a Swift", 150, 5, autorCarlos));

		Categoria categoriaDesignThinking = new Categoria("ca03", "Design Thinking");
		categoriaDesignThinking.agregarCurso(new Curso("cu05", "Ludificacion", 150, 5, autorCarlos));

		/*----------------------------------------------------------------------------*/

		Asapdemy asapdemy = new Asapdemy();

		asapdemy.agregarCategoria(categoriaDesarrolloWeb);
		asapdemy.agregarCategoria(categoriaDesarrolloMovil);
		asapdemy.agregarCategoria(categoriaDesignThinking);

		asapdemy.agregarUsuario(usuarioVictoria);
		asapdemy.agregarUsuario(usuarioAgustina);
		asapdemy.agregarUsuario(usuarioMartin);
		asapdemy.agregarUsuario(usuarioFelipe);
		asapdemy.agregarUsuario(autorCarlos);

		System.out.println("Intento suscribir a las siguientes personas a los siguientes cursos:\n");

		asapdemy.mostrarResultadoAlSuscribirseACurso("victoria", "cu01");
		asapdemy.mostrarResultadoAlSuscribirseACurso("victoria", "cu01");
		asapdemy.mostrarResultadoAlSuscribirseACurso("martin", "cu01");
		asapdemy.mostrarResultadoAlSuscribirseACurso("felipe", "cu01");
	}

}
