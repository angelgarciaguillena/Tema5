package boletin5.ejercicio4;

import java.util.Scanner;

public class FechaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el dia*/
		int dia;
		
		/*Creamos una variable para almacenar el mes*/
		int mes;
		
		/*Creamos una variable para almacenar el año*/
		int año;
		
		/*Creamos una variable que almacenara si la fecha es valida o no*/
		boolean valida = false;
		
		/*Creamos un objeto fecha*/
		Fecha fecha = null;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que siga pidiendo la fecha en caso de que se produzca un error*/
		do {
			/*Hacemos un try catch para notificar los errores al usuario en caso de que se produzcan*/
			try {
				/*Preguntamos al usuario que introduzca un dia*/
				System.out.println("Introduce un dia");
				dia = sc.nextInt();
				
				/*Pedimos al usuario que introduzca un mes*/
				System.out.println("Introduce un mes");
				mes = sc.nextInt();
				
				/*Pedimos al usuario que introduzca un año*/
				System.out.println("Introduce un año");
				año = sc.nextInt();
				
				/*Creamos una fecha nueva con los datos introducidos por el usuario*/
				fecha = new Fecha(dia, mes, año);
				valida = true;
				
			/*Si el dia, mes o año no estan dentro del rango valido saltara un error*/
			} catch (ExcepcionDiaInvalido | ExcepcionMesInvalido | ExcepcionAñoInvalido e) {
				System.out.println(e.getMessage());
			}
		}while(!valida);
		
		/*Mostramos la fecha*/
		System.out.println(fecha.toString());
		
		/*Reiniciamos la variable*/
		valida = false;
		
		/*Modificamos el dia*/
		/*Creamos un bucle do while para que siga pidiendo la fecha en caso de que se produzca un error*/
		do {
			/*Hacemos un try catch para notificar los errores al usuario en caso de que se produzcan*/
			try {
				
				/*Preguntamos al usuario que introduzca un dia*/
				System.out.println("Introduce un dia");
				dia = sc.nextInt();
				
				/*Cambiamos el dia de la fecha*/
				fecha.setDia(dia);
				valida = true;
			
			/*Si el dia no esta dentro del rango valido saltara un error*/
			} catch (ExcepcionDiaInvalido e) {
				System.out.println(e.getMessage());
			}
		}while(!valida);
		
		/*Reiniciamos la variable*/
		valida = false;
		
		/*Creamos un bucle do while para que siga pidiendo la fecha en caso de que se produzca un error*/
		do {
			/*Hacemos un try catch para notificar los errores al usuario en caso de que se produzcan*/
			try {
				
				/*Pedimos al usuario que introduzca un mes*/
				System.out.println("Introduce un mes");
				mes = sc.nextInt();
				
				/*Cambiamos el mes de la fecha*/
				fecha.setMes(mes);
				valida = true;
				
			/*Si el mes no esta dentro del rango valido saltara un error*/
			} catch (ExcepcionMesInvalido e) {
				System.out.println(e.getMessage());
			}
		}while(!valida);
		
		/*Reiniciamos la variable*/
		valida = false;
		
		/*Creamos un bucle do while para que siga pidiendo la fecha en caso de que se produzca un error*/
		do {
			/*Hacemos un try catch para notificar los errores al usuario en caso de que se produzcan*/
			try {
				
				/*Pedimos al usuario que introduzca un año*/
				System.out.println("Introduce un año");
				año = sc.nextInt();
				
				/*Cambiamos el año de la fecha*/
				fecha.setAño(año);
				valida = true;
				
			/*Si el año no esta dentro del rango valido saltara un error*/
			} catch (ExcepcionAñoInvalido e) {
				System.out.println(e.getMessage());
			}
		}while(!valida);
		
		/*Pasamos al dia siguiente llamando a la funcion*/
		fecha.diaSiguiente();
		
		/*Mostramos la fecha*/
		System.out.println(fecha.toString());
		
		/*Comprobamos si el año es bisiesto o no*/
		System.out.println(fecha.esBisiesto() ? "Es bisiesto" : "No es bisiesto");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}