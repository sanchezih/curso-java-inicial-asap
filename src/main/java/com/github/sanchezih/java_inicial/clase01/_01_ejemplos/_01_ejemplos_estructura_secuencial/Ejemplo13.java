package com.github.sanchezih.java_inicial.clase01._01_ejemplos._01_ejemplos_estructura_secuencial;

import ar.edu.ort.p1.util.Consola;

/**
 * Programa que calcula el precio de venta de un producto conociendo su precio
 * por unidad (sin IVA), el numero de productos vendidos y el porcentaje de IVA
 * aplicado. Los datos anteriores se leeran por teclado.
 * 
 * @author ihsanch
 *
 */
public class Ejemplo13 {

	public static void main(String[] args) {

		double precioUnidad = Consola.leerDouble("Ingrese el precio por unidad del producto: ");

		double cantidad = Consola.leerDouble("Ingrese el numero de productos vendidos: ");

		double iva = Consola.leerDouble("Ingrese el % de IVA: ");

		double precioSinIva = precioUnidad * cantidad;
		double totalIva = precioSinIva * iva / 100;

		System.out.println("Precio de venta -> " + (precioSinIva + totalIva));
	}
}
