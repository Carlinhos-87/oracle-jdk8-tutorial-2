package com.example;



public class AppApuntes {
	public static void main(String[] args) {
	
		infoDiaSemana3(DiaSemana.MIERCOLES);
	}	
	
	static void infoDiaSemana3(DiaSemana diaSemana) {


		switch (diaSemana) {
		case LUNES:
			System.out.println("Primer dia de la semana, a trabajar");
			break;
		case MARTES:
			System.out.println("Hemos pasado el lunes");
			break;

		case MIERCOLES:
			System.out.println("Nos acercamos al fin de semana");
			break;

		case JUEVES:
			System.out.println("Es juernes, los nuevos viernes, a disfrutar!!!");
			break;

		case VIERNES:
			System.out.println("Es viernes y el cuerpo lo sabe");
			break;

		case SABADO:
		case DOMINGO:
			System.out.println("Es fin de semana");
			break;

		default:
			System.out.println("El dia recibido no existe");
		}
	}
	public static void main2(String[] args) {
			
			System.out.println(new App().infoDiaSemana4(DiaSemana.SABADO));
		}	
		
		String infoDiaSemana4(DiaSemana diaSemana) {

		switch (diaSemana) {

	case LUNES:
		return "Primer dia de la semana, a trabajar";

	case MARTES:
		return "Hemos pasado el lunes";

	case MIERCOLES:
		return "Nos acercamos al fin de semana";

	case JUEVES:
		return "Es juernes, los nuevos viernes, a disfrutar!!!";

	case VIERNES:
		return "Es viernes y el cuerpo lo sabe";

	case SABADO:
	case DOMINGO:
		return "Es fin de semana";

	default:
		return "El dia recibido no existe";
	}
}
		
	public static void main3(String[] args) {
		
		System.out.println(infoDiaSemana5(DiaSemana.VIERNES));
	}
		 static String infoDiaSemana5(DiaSemana diaSemana) {

			String resultado = null;

			if (diaSemana.equals(DiaSemana.LUNES)) 
				resultado = "Primer dia de la semana, a trabajar";
			else if(diaSemana.equals(DiaSemana.MARTES))
				resultado = "Hemos pasado el lunes";
			else if(diaSemana.equals(DiaSemana.MIERCOLES))
				resultado = "Nos acercamos al fin de semana";
			else if(diaSemana.equals(DiaSemana.JUEVES))
				resultado = "Es juernes, los nuevos viernes, a disfrutar!!!";
			else if(diaSemana.equals(DiaSemana.VIERNES))
				resultado = "Es viernes y el cuerpo lo sabe";
			else if(diaSemana.equals(DiaSemana.SABADO) || 
			diaSemana.equals(DiaSemana.DOMINGO))
				resultado = "Es fin de semana";
			else 
				resultado = "El dia recibido no existe";

			return resultado;
			}
		 	
}

