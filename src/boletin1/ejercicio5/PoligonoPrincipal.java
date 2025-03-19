package boletin1.ejercicio5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PoligonoPrincipal {
	
	/*Creamos una lista para almacenar los poligonos*/
	static Set<Poligono> poligonos = new HashSet<Poligono>();
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		/*Creamos una variable para almacenar la opcion del usuario*/
		int opcion;
		
		/*Creamos una variable para almacenar el lado 1*/
		double lado1;
		
		/*Creamos una variable para almacenar el lado 2*/
		double lado2;
		
		/*Creamos una variable para almacenar el lado 3*/
		double lado3;
		
		/*Creamos un poligono*/
		Poligono poligono;
		
		/*Creamos un bucle do while para que mientras la eleccion sea diferente a 4 seguir
		 * repitiendo*/
		do {
			
			/*Mostramos el menu llamando a la funcion*/
			menu();

			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("\n" + "Introduce una opcion");

			/*Leemos la eleccion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario
			 * realizar una funcion u otra*/
			switch (opcion) {

			/*Si la opcion es 1 introducimos un triangulo*/
			case 1 -> {
				/*Pedimos el lado 1 al usuario llamando a la funcion*/
				lado1 = pedirLado();
				
				/*Pedimos el lado 2 al usuario llamando a la funcion*/
				lado2 = pedirLado();
				
				/*Pedimos el lado 3 al usuario llamando a la funcion*/
				lado3 = pedirLado();
				
				/*Creamos un triangulo*/
				poligono = new Triangulo(lado1, lado2, lado3);
				
				/*Mostramos al usuario si el triangulo se ha añadido*/
				if(poligonos.add(poligono)) {
					System.out.println("El triangulo se ha añadido" + "\n");
				} else {
					System.out.println("El triangulo no se ha añadido" + "\n");
				}
			}

			/*Si la opcion es 2 introducimos un rectangulo*/
			case 2 -> {
				/*Pedimos el lado 1 al usuario llamando a la funcion*/
				lado1 = pedirLado();
				
				/*Pedimos el lado 2 al usuario llamando a la funcion*/
				lado2 = pedirLado();
				
				/*Creamos un rectangulo*/
				poligono = new Rectangulo(lado1, lado2);
				
				/*Mostramos al usuario si el rectangulo se ha añadido*/
				if(poligonos.add(poligono)) {
					System.out.println("El rectangulo se ha añadido" + "\n");
				} else {
					System.out.println("El rectangulo no se ha añadido" + "\n");
				}
			}

			/*Si la opcion es 3 mostramos los poligonos llamando a la funcion*/
			case 3 -> {
				System.out.println("Poligonos:" + "\n");
				mostrarPoligonos();
			}

			/*Si la opcion es 4 informamos al usuario de que ha salido del programa*/
			case 4 -> {
				System.out.println("Has salido del programa");
			}
			
			/*Si la opcion no es valida se lo informamos al usuario*/
			default -> {
				System.out.println("Opcion no valida");
			}
			}
		} while (opcion != 4);

		/*Cerramos el Scanner*/
		sc.close();
	}
	
	public static void menu() {
		/*Mostramos el menu al usuario*/
		System.out.println("Menu:");
		System.out.println("1. Introducir triangulo");
		System.out.println("2. Introducir rectangulo");
		System.out.println("3. Mostrar poligonos");
		System.out.println("4. Salir del programa");
	}
	
	private static void mostrarPoligonos() {
		/*Creamos un bucle for each para recorrer la lista de los poligonos*/
		for(Poligono poligono : poligonos) {
			
			/*Mostramos la informacion del poligono*/
			System.out.println(poligono);
			
			/*Mostramos el area del poligono*/
			System.out.println("Area: " + poligono.area() + "m^2" + "\n");
		}
	}
	
	private static double pedirLado() {
		/*Pedimos al usuario que introduzca el valor del lado*/
		System.out.println("Introduce un lado");
		
		/*Devolvemos el lado introducido por el usuario*/
		return sc.nextDouble();
	}
}