package boletin3.ejercicio1;

import java.util.Scanner;

public class VehiculoPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la velocidad del turismo*/
		int velocidad;
		
		/*Creamos una variable para almacenar el tiempo que el turismo mantiene esa velocidad*/
		int tiempo;
		
		/*Creamos un turismo*/
		Turismo turismo = new Turismo("Audi", "A5", "Blanco", "1234ABC", 5, "PARTICULAR");
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Mostramos la informacion del turismo*/
		System.out.println(turismo.toString());
		
		/*Arrancamos el turismo*/
		turismo.arrancar();
		
		/*Pedimos al usuario que introduzca la velocidada a la que se quiere mantener el turismo*/
		System.out.println("Introduce la velocidad a la que ira el turismo");
		
		/*Leemos la velocidad del turismo introducida por el usuario*/
		velocidad = sc.nextInt();
		sc.nextLine();
		
		/*Aceleramos el turismo llamando a la funcion*/
		turismo.acelerar(velocidad);
		
		/*Pedimos al usuario que introduzca cuanto tiempo quiere que se mantenga el vehiculo a esa velocidad*/
		System.out.println("Introduce el tiempo que quieres que se mantenga a esa velocidad");
		
		/*Leemos el tiempo introducido por el usuario*/
		tiempo = sc.nextInt();
		sc.nextLine();
		
		/*Mostramos al usuario el tiempo en el que el turismo se ha mantenido a esa velocidad*/
		System.out.println("El turismo se ha mantenido a esa velocidad durante " + tiempo + " segundos");
		
		/*Pedimos al usuario que introduzca la velocidada a la que se quiere disminuir el turismo*/
		System.out.println("Introduce la velocidad a la que disminuira el turismo");
		
		/*Leemos la velocidad del turismo introducida por el usuario*/
		velocidad = sc.nextInt();
		
		/*Desaceleramos el turismo llamando a la funcion*/
		turismo.desacelerar(velocidad);
		
		/*Paramos el coche*/
		System.out.println("\n" + "Se esta parando el vehiculo...");
		turismo.parar();
		
		/*Mostramos la velocidad, el estado del motor y la marcha a la que va el turismo*/
		System.out.println("\n" + "Estado del turismo:");
		System.out.println(turismo.getVelocidad() + " km/h");
		System.out.println(turismo.getMarcha() + " ª marcha");
		System.out.println(turismo.isEncendido() ? "El vehiculo esta encendido" : "El vehiculo esta apagado");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}