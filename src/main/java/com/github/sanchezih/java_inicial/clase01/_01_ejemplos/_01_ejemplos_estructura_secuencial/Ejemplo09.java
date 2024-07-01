package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que calcula el area de un triangulo en funcion de las longitudes de
 * sus lados (a, b, c), segun la siguiente formula:
 * 
 * Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) donde p = (a+b+c)/2
 * 
 * Para calcular la raiz cuadrada se utiliza el metodo Math.sqrt()
 * 
 * @author ihsanch
 *
 */
public class Ejemplo09 {
	public static void main(String[] args) {

		double a = Consola.leerDouble("Ingrese la longitud del primer lado del triangulo: ");

		double b = Consola.leerDouble("Ingrese la longitud del segundo lado del triangulo: ");

		double c = Consola.leerDouble("Ingrese la longitud del tercer lado del triangulo: ");

		double p = (a + b + c) / 2;

		System.out.println("Area -> " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
	}
}
