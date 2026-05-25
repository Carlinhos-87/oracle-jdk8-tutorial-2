package com.example;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {

		// Crear un objeto Manzana sin especificar ninguna propiedad de la Manzana
		// Se utiliza el constructor sin parametros

		Manzana manzana1 = new Manzana();

		/*
		 * ¿Como imprimir en la consola el objeto refenreciado por la variable manzana1
		 */
		System.out.println("------- Imprimiendo manzana1 -------");
		System.out.println(manzana1);

		// Si quisiera crear un objeto Manzana y solamente quisiera especificar
		// la variedad de la Manzana, me daría error porque yo no tengo un constructor
		// que reciba un solo parametro

		/*
		 * Utilizando lombok no necesitamos tener todos los constructores definidos,
		 * solamente el constructor sin parametros o por defecto y el constructor que
		 * recibe todos los campos de la clase
		 * 
		 * Utilizando el PATRON BUILDER DE LOMBOK, es posible construir cualquier objeto
		 * aunque no tengas su constructor explicitamente y tampoco estariamos obligados
		 * a suministrar los campos o propiedades del objeto en un orden determinado
		 */

		// El Patron Builder NO fue inventado por lombok, pero lo ha mejorado bastante

		// El Patron Builder es patron factoria, es decir, creacional, que permite crear
		// o instanciar objetos sin tener explicitamente su constructor

		Manzana manzana2 = Manzana.builder()
				.variedad("Golden")
				.build();
		/*¿Como imprimir en la consola el objeto referenciado por la variable manzana1?*/
		
		//Manzana manzana2 = new Manzana("Golden");
		System.out.println("------- Imprimiendo manzana2 -------");
		System.out.println(manzana2);

		/*
		 * ¿Cómo comparar dos objetos Manzana para saber si son iguales o no? Vamos a
		 * crear dos objetos Manzana para que sean de la misma variedad y precio
		 */
		
		//Manzana manzana3 = new Manzana("reineta", new BigDecimal(2.0));
		
		Manzana manzana3 = Manzana.builder()
				.variedad("Reineta")
				.precio(new BigDecimal(2.0))
				.build();
				
		//Manzana manzana4 = new Manzana("reineta", new BigDecimal(2.0));

		Manzana manzana4 = Manzana.builder()
				.variedad("Reineta")
				.precio(new BigDecimal(2.0))
				.build();
		
		
		int x = 5;
		int y = 5;

		/*
		 * Si quiero comprobar si las variables x e y son iguales, podemos utilizar una
		 * sentencia de Java que la tienen todos los lenguajes de programación,
		 * denominada sentencia condicional if - else, que evalua una condición entre
		 * parentesis y que si se cumple se ejecuta el grupo de sentencias que aparecen
		 * en el bloque encerrado entre las llaves de apertura y cierre, y si no se
		 * cumple la condicion se podra ejecutar la o las sentencias que estan en
		 * siguiente bloque
		 */

		if (x == y) {
			System.out.println("Las variables son iguales ");
		} else {
			System.out.println("El valor de las variables es diferente");
		}
		if (manzana3 == manzana4) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		/*
		 * Para saber si el contenido de dos objetos es el mismo se utiliza el metodo
		 * equals, porque el operador == lo que comprueba en el caso de objetos es si
		 * dichos objetos estan en la misma ubicacion de la memoria
		 */

		if (manzana3.equals(manzana4))
			System.out.println("El contenido de ambos objetos es el mismo");
		else
			System.out.println("El contenido de ambos objetos es diferente");

	}

}