package boletin5.ejercicio1;

import java.util.Scanner;

public class HoraPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar las horas*/
		int hora = 0;
		
		/*Creamos una variable para almacenar los minutos*/
		int minuto = 0;
		
		/*Creamos una variable para almacenar los segundos*/
		int segundo = 0;
		
		/*Creamos una variable para almacenar si la hora es valida o no*/
		boolean valida = false;
		
		/*Creamos un objeto hora vacio*/
		Hora h = null;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para pedir la hora hasta que sea valido*/
		do {
			/*Creamos un try catch para que si los valores de entrada no son 
			 * validos lanzar el mensaje
			 */
			try {
				/*Pedimos la hora al usuario*/
				System.out.println("Introduce la hora");
				hora = sc.nextInt();
				
				/*Pedimos los minutos al usuario*/
				System.out.println("Introduce los minutos");
				minuto = sc.nextInt();
				
				/*Pedimos los segundos al usuario*/
				System.out.println("Introduce los segundos");
				segundo = sc.nextInt();
				
				/*Creamos una nueva hora*/
				h = new Hora(hora, minuto, segundo);
			/*Si los segundos, minutos u horas son negativos lanzamos el mensaje de error*/
			} catch (NegativeSecondException | NegativeMinuteException | NegativeHourException e) { 
				System.out.println(e.getMessage());
			} 
		}while(!valida);
		
		/*Reiniciamos la variable*/
		valida = false;
		
		/*Creamos un bucle do while para pedir la hora hasta que sea valido*/
		do {
			/*Creamos un try catch para que si el valor no son 
			 * validos lanzar el mensaje*/
			try {
				/*Pedimos la hora al usuario*/
				System.out.println("Introduce la hora");
				hora = sc.nextInt();
				
				/*Cambiamos las horas de la hora*/
				h.setHora(hora);
				
				valida = true;
			}catch(NegativeHourException e) { /*Si la hora son negativos lanzamos el mensaje de error*/
				System.out.println(e.getMessage());
			}
		}while(!valida);
		
		/*Reiniciamos la variable*/
		valida = false;
		
		/*Creamos un bucle do while para pedir los minutos hasta que sea valido*/
		do {
			/*Creamos un try catch para que si el valor no son 
			 * validos lanzar el mensaje*/
			try {
				/*Pedimos los minutos al usuario*/
				System.out.println("Introduce los minutos");
				minuto = sc.nextInt();
				
				/*Cambiamos los minutos de la hora*/
				h.setMinuto(minuto);
				
				valida = true;
			}catch(NegativeMinuteException e) { /*Si los minutos son negativos lanzamos el mensaje de error*/
				System.out.println(e.getMessage());
			}
		}while(!valida);
		
		/*Reiniciamos la variable*/
		valida = false;
		
		/*Creamos un bucle do while para pedir los segundos hasta que sea valido*/
		do {
			/*Creamos un try catch para que si el valor no son 
			 * validos lanzar el mensaje*/
			try {
				/*Pedimos los segundos al usuario*/
				System.out.println("Introduce los segundos");
				segundo = sc.nextInt();
				
				/*Cambiamos los segundos de la hora*/
				h.setSegundo(segundo);
				
				valida = true;
			}catch(NegativeSecondException e) { /*Si los segundos son negativos lanzamos el mensaje de error*/
				System.out.println(e.getMessage());
			}	
		}while(!valida);
		
		/*Mostramos la hora*/
		System.out.println(h.toString());
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}