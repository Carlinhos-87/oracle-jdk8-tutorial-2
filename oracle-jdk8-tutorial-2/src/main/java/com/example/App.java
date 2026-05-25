package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		/*
		 * El array es un identificador que hace referencia a una zona de memoria, a
		 * diferencia de una variable que hace referencia a una sola ubicacion en la
		 * memoria, y que puede contener elementos de un mismo tipo de datos. A los
		 * elementos del array se puede acceder utilizando un indice numérico entero,
		 * entre corchetes
		 */

		/*
		 * ¿Como se declara un array actualmente? Por ejemplo, un array de String, El
		 * identificador nombres es un array donde cada elemento del array es de tipo
		 * String
		 * 
		 * Ventajas: En lugar de crear una variable por cada elemento ahora solo tenemos
		 * un nombre para todo el conjunto de elementos y es mucho más escalable porque
		 * podremos tratar, 10, 20 0 un millon de elementos de la misma manera
		 * 
		 * si no existieran los array, entonces:
		 */

		String nombre1;
		String nombre2;
		;
		;
		String nombreX;

		// con array
		String[] nombres = { "Yodalis", "Marisol", "Youssef", };

		System.out.println("Array original de nombres");
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);

		System.out.println("El array de nombres tiene " + nombres.length + " elementos");

		/*
		 * Tamaño fijo implica que no se pueden agregar mas elementos al array, pero si
		 * se pueden modificar los elementos existentes nombres[3] = "Elida";
		 */

		nombres[2] = "Elida";
		System.out.println(nombres[2]);

		int[] arrayNumerosEnteros = { 1, 2, 3, 4, 5 };

		Manzana[] manzanas = {
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),
				Manzana.builder().color("Verde").sabor("Acida").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),
				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build()

		};

		System.out.println("El array de Manzana tiene ");
		System.out.println(manzanas[0]);
		System.out.println(manzanas[1]);
		System.out.println(manzanas[2]);

		/*
		 * Hasta el momento los arrays que hemos creado son de tamaño fijo, es decir, no
		 * se pueden modificar una vez creados
		 * 
		 * Declarar arrays que sean modificables, es decir, que se le puedan agregar o
		 * eliminar elementos o modificar los elementos existentes
		 */

		String[] nombres2 = new String[3];

		/*
		 * El array de nombres2 tiene 3 elementos, pero todos los elementos son null
		 * porque no se les ha asignado valor aun. Con la sentencia anterior se ha
		 * reservado espacio en la memoria para 3 elementos de tipo String. No sera
		 * poible pasarse de la cantidad de elementos reservados para el array que en el
		 * caso anterior es de 3
		 */

		// Agregando elementos al array de nombres2

		nombres2[0] = "Leyla";
		nombres2[1] = "Miguel";
		nombres2[2] = "Jonatan";

	}
}