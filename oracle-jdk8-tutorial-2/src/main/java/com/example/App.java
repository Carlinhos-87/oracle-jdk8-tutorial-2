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

		/*
		 * System.out.println("El array de Manzana tiene ");
		 * System.out.println(manzanas[0]); System.out.println(manzanas[1]);
		 * System.out.println(manzanas[2]);
		 */

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

		/*
		 * SENTENCIAS DE CONTROL DE FLUJO. En general permiten modificar el flujo de
		 * ejecucion de un programa en dependencia del cumplimiento de una o varias
		 * condiciones, aqui estarian las sentencias condicionales if - else y switch -
		 * expression
		 * 
		 * Y por otra parte, pero como parte tambien de las sentencias de control de
		 * flujo estarian las que permiten ejecutar en bucle un conjunto de sentencias
		 * entre las que estarían
		 * 
		 * 1- sentencia for clasica 2- sentencia for mejorada 3- sentencia while 4-
		 * sentencia do - while
		 * 
		 * Por ultimo las sentencias break y continue
		 */

		/*
		 * La sentencia for clasica, se utiliza cuando se conoce a priori la cantidad de
		 * veces que se van a ejecutar un conjunto de instrucciones. Tambien se puede
		 * utilizar para recorrer los elementos de un array
		 */

		/*
		 * Para imprimir o mostrar en la consola los elementos de un array, por ejemplo,
		 * el array de nombres hay que recorrer los elementos del array
		 */

		/* Si intentaramos mostrar por la consola los elemetos del array nombres */

		System.out.println("Intentando imprimir los elementos del array nombres");
		System.out.println(nombres);

		/*
		 * La sentencia anterior solamente mostró por la consola la direcion de memoria
		 * de la zona donde estan almacenados los elementos del array, pero los
		 * elementos como tal no los ha mostrado, para mostrar los elementos del array
		 * se necesita una sentencia de control de flujo que en bucle recorra todos los
		 * elementos del array de nombres, y podría ser la sentencia for clásica en
		 * primer lugar y en segundo lugar la sentencia for mejorada
		 */

		System.out
				.println("Recorriendo/Iterando los elementos del array de nombres " + "con una sentencia for clasica");

		for (int i = 0; i <= nombres.length - 1; i++) {
			System.out.println(nombres[i]);
		}

		System.out.println("La sentencia for ha concluido");

		/* OPERADOR DE AUTO INCREMENTO (++) Y DE AUTO DECREMENTO (--) */

		int ii = 0;

		++ii;

		ii++;

		/*
		 * Para comprobar la diferencia entre las dos instrucciones anteriores se puede
		 * utilizar una herramiento de linea de comandos llamado jshell y comprobaremos
		 * que el operador de autoincremento cuando esta solo, es lo mismo que este al
		 * principio que al final, que no es igual a cuando esta en una expresion
		 */

		/*
		 * Ejemplo de creaccion de un array de numeros fraccionarios, tipo double, que
		 * tiene parte entera y parte fraccionaria. Los valores del array se tienen que
		 * generar de forma aleatoria y con números entre 0 y 100,
		 * 
		 * Sabemos que debemos de utilizar el metodo random() de la biblioteca Math,
		 * pero no sabemos como hacer que genere números aleatorios entre 0 y 100.
		 * 
		 * Por tanto vamos a utilizar la herramienta jshell para averiguar como hacer
		 * que se genere los numeros aleatorios que quedemos
		 */

		System.out.println("Array de numeros de tipo Double, generado de forma aleatoria ");

		double[] arrayDeDoubles = new double[20];

		System.out.println("Array original, con los valores por defecto ");
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		
		}
		//Rellenando el array con valores generados aleatoriamente
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			arrayDeDoubles[i] = Math.random() * 100 - 1; 
		}
		//Mostrando el array resultante
		
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}
		
		/*Ejercicio 1 - Modificar el ejemplo anterior para que el array sea de 100 numeros
		 * enteros generados aleatoriamente
		 * 
		 *  Sugerencia, hacer un commit previamente a ponerse con la solucion del ejercicio,
		 *  para que puedas modificar el codigo sin que se pierda el codigo del ejemplo
		 *  original*/
		
		
		
	}
}
