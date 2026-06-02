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
						.precio(new BigDecimal("0.55")).build(),
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),
				Manzana.builder().color("Verde").sabor("Dulce").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),
				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build(),
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(), };

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
		// Rellenando el array con valores generados aleatoriamente
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			arrayDeDoubles[i] = Math.random() * 100 - 1;
		}
		// Mostrando el array resultante

		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}

		/*
		 * Ejercicio 1 - Modificar el ejemplo anterior para que el array sea de 100
		 * numeros enteros generados aleatoriamente
		 * 
		 * Sugerencia, hacer un commit previamente a ponerse con la solucion del
		 * ejercicio, para que puedas modificar el codigo sin que se pierda el codigo
		 * del ejemplo original
		 */

		// Rellenando el array con valores generados aleatoriamente enteros
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			arrayDeDoubles[i] = (int) (Math.random() * 100 - 1);
		}
		// Mostrando el array resultante

		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}

		// Solucion ejercicio 1 correcto:
		System.out.println("----- Solucion ejercicio Uno -----");
		long[] numerosEnteros = new long[100];

		System.out.println("Array original de numeros enteros: ");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		System.out.println("Array resultante, generado aleatoriamente");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			numerosEnteros[i] = Math.round(Math.random() * 100 - 1);
		}

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		/*
		 * Sentencia FOR mejorada
		 * 
		 * Se recomienda su uso siempre que no haya que trabajar con el indice o los
		 * indices de un array
		 */

		System.out.println("----- Sentencia FOR mejorada (mal llamada for - each) -----");

		for (long numeroEntero : numerosEnteros) {
			System.out.println(numeroEntero);

		}

		/*
		 * Ejercicio 2, recorrer el array numeros enteros y solamente mostrar aquellos
		 * elementos que son de indice par
		 * 
		 * ¿Cuando un valor es par? Cuando el resultado del residuo de la division es
		 * igual a cero
		 * 
		 * El residuo de la division la da el operador %, o tambien mod en una
		 * calculadora (modulo)
		 */

		// Solucion al ejercicio 2, usando una sentencia for clasica
		System.out.println("----- Ejercicio 2 -----");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			if (i % 2 == 0) {
				System.out.println("indice:" + i + ", numero " + numerosEnteros[i]);
			}
		}

		/*
		 * Ejercicio 3, recorrer el array de numeros enteros y mostrar solamente los
		 * elementos impares
		 */
		System.out.println("----- Ejercicio 3 -----");

		for (long n : numerosEnteros) {

			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
		/*
		 * Ejercicio 4, recorrer el array de numeros enteros y mostrar solamente los que
		 * sean de indice impar
		 */
		System.out.println("----- Ejercicio 4 -----");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			if (i % 2 != 0) {
				System.out.println("indice:" + i + ", numero " + numerosEnteros[i]);
			}
		}
		/*---------- SENTENCIAS DE ASIGNACIÓN COMPUESTAS ---------*/

		/*
		 * Primero: En java existen dos tipoas de datos, los tipos de datos primitivos
		 * cuyo nombre es todo minúsculas, como por ejemplo int, long, byte, short,
		 * boolean, double, float... y por otra parte NO TIENEN propiedades ni metodos
		 * ¿Como lo sabemos? Porque le aplicamos el operador (.) a continuacion y no se
		 * muestra nada
		 */

		int e = 20;

		/*
		 * Segundo: Existen los tipos de datos no primitivos, que son aquellos cuyo
		 * nombre comienza con mayuscula, como por ejemplo String, BigDecimal, Manzana,
		 * etc. Estos tipos de datos no primitivos SI TIENEN propiedades y metodos
		 */

		Integer e2 = 200;

		/* Existe una excepcion y es que el tipo datos String no tiene primitivo */

		// Tamaño fijo
		String[] nombres3 = { "Elida", "Jakelin", "Miguel", "Juan Carlos" };

		// Tamaño variable
		String[] nombres4 = new String[100];

		/*
		 * Recorrer el array de nombres3 y mostrar solamente los nombres que tengan mas
		 * de 5 caracteres
		 */

		for (String nombre : nombres3) {
			if (nombre.length() > 5) {
				System.out.println(nombre);
			}
		}

		/*
		 * Tercero: Existen las sentencias de asignacion compuestas, que son aquellas
		 * que permiten modificar el valor de una variable utilizando un operador de
		 * asignacion compuesto, como por ejemplo +=, -=, *=, /=, %=, etc.
		 */

		/*
		 * MUY IMPORTANTE: Siempre que sea posible las variables se deben declarar de un
		 * tipo de datos primitivo, porque de esta manera el lenguaje no tiene que hacer
		 * ninguna conversacion implicita o explicita
		 * 
		 * El tipo de datos objeto, la contraparte del primitivo, realmente NO EXISTE,
		 * el tipo objeto es un envoltorio del tipo primitivo
		 */

		byte v1 = 20;
		short v2 = 30;

		// v2 = (short) (v2 + v1);

		v2 += v1; // v2 = v2 + v1

		/*
		 * Lo anterior es un ejemplo de la potencia de las sentencias de asignacion
		 * compuestas De no utilizar una sentencia de asignacion compuesta en el ejemplo
		 * anterior tendriamos que terminar haciendo un type casting (casteo) que
		 * significa obligar a convertir a un tipo de datos concreto, que debe evitarse
		 * en la medida de lo posible
		 * 
		 * Concretamente en la operación anterior, los operandos v1 y v2 se convierten
		 * al tipo int y el resultado se obtiene como un entero tambien y no se puede
		 * almacenar en la variable v2 al no ser que se realice un casteo a short
		 * 
		 * Todo lo anterior lo realiza la sentencia de asignacion compuesta
		 */

		/*
		 * Conceptos de contador y acumulador, implementados a través del uso de las
		 * sentencias de asignacion compuestas
		 * 
		 * A modo de ejemplo 1: vamos a recorrer el array de manzanas y calcular el peso
		 * promedio de todas las manzanas
		 * 
		 * A modo de ejemplo 2: recorrer el array de manzanas y mostrar solamente las
		 * manzanas cuyo peso sea superior al promedio, sea de color verde y de sabor
		 * dulce y de tamaño mayor de cinco
		 */

		/* Solucion al ejemplo 1 */

		// Contador para llevar la cuenta del total de manzanas a las cuales le hemos
		// leido el peso,
		// para luego poder calcular el promedio
		int counter = 0;
		// Acumulador para ir sumando el peso de cada manzana, para luego poder calcular
		// el promedio
		double acumuladorPeso = 0.0; // Sumatoria del peso de las manzanas
		// Sentencia for mejorada porque no se pide nada del índice del array de
		// manzanas
		System.out.println("----- Ejemplo 1 -----");

		for (Manzana m : manzanas) {
			counter++; // counter = counter + 1

			// acumuladorPeso = acumuladorPeso + m.getPeso();
			acumuladorPeso += m.getPeso();
		}

		// fuera del bucle for se calcula el promedio

		double pesoPromedio = acumuladorPeso / counter;
		// Imprimir el resultado del peso promedio de las manzanas por la consola
		System.out.println("El peso promedio de las manzanas es: " + pesoPromedio);

		/*
		 * Solucion al ejemplo 2, utilizacion del operador logico relacional && que en
		 * otros lenguajes de programacion seria el operador AND e implica que tienen
		 * que ser verdaderas las condiciones a la izquierda y a la derecha del operador
		 * para que la condicion completa, al evaluar la expresion sea verdadera Se le
		 * llama tambien al operador && de cortocircuito porque la primera condicion que
		 * encuentre que es falsa ya no continua evaluando las restantes
		 */

		System.out.println("----- Ejemplo 2 -----");

		for (Manzana man : manzanas) {
			if (man.getPeso() > pesoPromedio && man.getColor().equals("Verde") && man.getSabor().equals("Dulce")
					&& man.getSize() > 5) {
				System.out.println("El numero de manzanas que cumplen la condicion es: " + man);
			}

		}
		/* Demostracion de que el operador logico && es de corto-circuito */

		BigDecimal precio = new BigDecimal(0.80);

		System.out.println("Precio original: " + precio);

		for (Manzana man : manzanas) {

			if (man.getPeso() > pesoPromedio && man.getColor().equals("Verde") && man.getSize() > 7
					&& man.getPrecio().equals(precio = new BigDecimal(2.00)) && man.getSabor().equals("Dulce"))
				System.out.println(man.toString());
		}

		System.out.println("Precio modificado ???? " + precio);

		/*
		 * OPERADOR LOGICO OR (||). Este operador dará como resultado verdadero, si al
		 * menos una de las condiciones que se evaluan en la expresion es verdadera.
		 * 
		 * A direncia del OPERADOR AND (&&), el operador OR no es de corto-circuito, es
		 * decir, que si una expresion no se cumple siempre va a evaluar las siguientes
		 */

		// A continuacion, un ejemplo sencillo para demostrar el funcionamiento del
		// operador OR (||)

		boolean t1 = false;
		boolean t2 = false;
		boolean t3 = true;

		if (t1 || t2 || t3) {
			System.out.println("La expresion es verdadera");
		} else {
			System.out.println("La expresion es falsa");
		}

		/*
		 * Operador de negacion NOT (!)
		 * 
		 * A modo de ejemplo: ¿Que sucederia si se niega la variable t3, en la condicion
		 * de la sentencia if anterior?
		 */

		if (t1 || t2 || !t3) {
			System.out.println("La expresion es verdadera");
		} else {
			System.out.println("La expresion es falsa");
		}

		/* En la misma expresion se pueden tener operadores OR (||) y AND (&&) */

		if (!t1 && t2 && !t3 || !t1) {
			System.out.println("La expresion es verdadera");
		} else {
			System.out.println("La expresion es falsa");
		}

		/*
		 * Ejercicio 1 del lunes 1 de Junio:
		 * 
		 * Respecto al array de manzana, recorrerlo con una sentencia for mejorada y
		 * mostrar por la consola la manzana que incluyan en el nombre de la variedad la
		 * palabra Delicious, y ademas sean de color Rojo, o que tengan un precio
		 * inferior o igual al precio promedio
		 */

		System.out.println("----- Ejercicio 1 del lunes 1 de Junio -----");

		int counter2 = 0;
		double acumuPrecio = 0.0;

		for (Manzana man2 : manzanas) {
			counter2++;
			acumuPrecio += man2.getPrecio().doubleValue();
		}
		double precioPromedio = acumuPrecio / counter2;
		System.out.println("El precio promedio de las manzanas es: " + precioPromedio);

		for (Manzana manza : manzanas) {
			if (manza.getVariedad().contains("Delicious") && manza.getColor().equals("Roja")
					|| manza.getPrecio().doubleValue() <= precioPromedio) {
				System.out.println("La manzana que cumple la condicion es: " + manza);
			}
		}

		/*
		 * Ahora viene la sentencia Switch case
		 * 
		 * Es una variante de la sentencia IF - ELSE, preferible cuando una sentencia if
		 * - else hay que evaluar mas de 3 o 4 condiciones, porque el codigo se hace
		 * dificil de mantener y poco legible
		 */

		/*
		 * A modo de ejemplo vamos a crear un enumerable con los dias de la semana y
		 * mostrar un mensaje en dependencia del dia de la semana que se trate
		 * 
		 * Se propone crear un metodo a nivel de la clase APP que recibe un tipo enum y
		 * devuelva un tipo String con el mensaje segun el dia de la semana en cuestion
		 */

		/*
		 * Solucion: Primero: con una sentencia IF-ELSE en el cuerpo del metodo Segundo:
		 * con una sentencia SWITCH CASE en el cuerpo del metodo
		 */

		// Invocacion o llamada del metodo infoDiaSemana con parametro correspondiente
		// al viernes

		// Invocar el metodo infoDiaSemana al cual le hemos quitado el modificador
		// static

		// System.out.println(infoDiaSemana(DiaSemana.VIERNES));

		System.out.println(new App().infoDiaSemana(DiaSemana.SABADO));
	}

	/*
	 * Metodo de instancia, es decir, sin el modificador static, que recibe un tipo
	 * enum y devuelve un String, se necesita una instancia (objeto) de la clase App
	 * para poder invocar el metodo infoDiaSemana, porque es un metodo de instancia
	 */

	String infoDiaSemana(DiaSemana diaSemana) {

		// Utilizando sentencia switch - case 
		// para evaluar el valor del parametro diaSemana y devolver un mensaje
		
		switch (diaSemana) {
		case LUNES : return "Primer dia de la semana, a trabajar";
			
		case MARTES : return "Hemos pasado el lunes";
			
		case MIERCOLES : return "Nos acercamos al fin de semana";
			
		case JUEVES : return "Es juernes, los nuevos viernes, a disfrutar!!!";
			
		case VIERNES : return "Es viernes y el cuerpo lo sabe";
			
		case SABADO : 
		case DOMINGO: return "Es fin de semana";
			
		default : return "El dia recibido no existe";
		}	

	}

}