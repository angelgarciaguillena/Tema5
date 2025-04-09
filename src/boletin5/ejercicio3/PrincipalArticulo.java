package boletin5.ejercicio3;

import java.util.Scanner;

public class PrincipalArticulo {
	public static void main(String[] args) {
		
		/*Creamos un producto llamando a la clase Articulo*/
		Articulo producto = null;
		
		/*Creamos una variable que va a almacenar el nombre del articulo*/
		String nombre;
		
		/*Creamos una variable para almacenar el precio del articulo*/
		double precio;
		
		/*Creamos una variable para almacenar el stock del producto*/
		int stock;
		
		/*Creamos una variable para almacenar si el articulo es valido*/
		boolean valido = false;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para pedir los datos al usuario hasta 
		 * que sean correctos*/
		do {
			/*Creamos un try catch para que si los valores de entrada no son 
			 * validos lanzar el mensaje
			 */
			try {
				/*Pedimos al usuario que introduzca el nombre del producto*/
				System.out.println("Introduce el nombre del producto");
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el precio del producto*/
				System.out.println("Introduce el precio del producto");
				precio = sc.nextDouble();
				
				/*Pedimos al usuario que introduzca el stock del producto*/
				System.out.println("Introduce el stock del producto");
				stock = sc.nextInt();
				
				/*Creamos un objeto Articulo añadiendo los nuevos datos*/
				producto = new Articulo(nombre, precio, stock);
				valido = true;
				
			/*Si el nombre esta vacio o el precio es negativo o el stock es negativo 
			 * lanzamos el mensaje de error*/
			} catch (ExcepcionNombreVacio | ExcepcionPrecioNegativo | ExcepcionStockNegativo e) {
				System.out.println(e.getMessage());
				
			/*EL finally hara que se vacie el buffer del Scanner aunque salte un error*/
			} finally {
				sc.nextLine();
			}
		}while(!valido);
		
		/*Mostramos el producto*/
		System.out.println(producto);
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}