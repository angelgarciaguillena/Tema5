package boletin1.ejercicio4;

import java.util.HashSet;
import java.util.Set;

public class ElectrodomesticoPrincipal {
	
	/*Creamos una lista*/
	private static Set<Electrodomestico> electrodomesticos = new HashSet<Electrodomestico>();
	
	public static void main(String[] args) {
		
		/*Creamos varios objetos*/
		Electrodomestico electrodomestico1 = new Lavadora(55, "ROJO", "A", 20, 32);
		Electrodomestico electrodomestico2 = new Lavadora(27, "AZUL", "B", 36, 15);
		Electrodomestico electrodomestico3 = new Television(38, "NEGRO", "F", 82, 170, true);
		Electrodomestico electrodomestico4 = new Television(44, "BLANCO", "C", 77, 87, false);
		
		/*Añadimos los objetos a la lista*/
		electrodomesticos.add(electrodomestico1);
		electrodomesticos.add(electrodomestico2);
		electrodomesticos.add(electrodomestico3);
		electrodomesticos.add(electrodomestico4);
		
		/*Mostramos los electrodomesticos*/
		mostrarLista();
		
		/*Mostramos el precio de las lavadoras*/
		mostrarPrecioLavadora();
		
		/*Mostramos el precio de los televisores*/
		mostrarPrecioTelevisor();
		
		/*Mostramos la suma de los precios*/
		System.out.println("Total: " + sumaPrecios());
	}
	
	private static void mostrarLista() {
		
		/*Hacemos un for each para recorrer la lista*/
		for(Electrodomestico electrodomestico : electrodomesticos) {
			/*Mostramos el precio base*/
			System.out.println("Precio base: " + electrodomestico.getPrecioBase());
			
			/*Actualizamos el precio*/
			electrodomestico.precioFinal();
			
			/*Mostramos el precio actualizado del articulo*/
			System.out.println("Precio final: " + electrodomestico.getPrecioBase() + "\n");
		}
	}
	
	private static void mostrarPrecioLavadora() {
		
		/*Hacemos un for each para recorrer la lista*/
		for(Electrodomestico electrodomestico : electrodomesticos) {
			
			/*Si el electrodomestico es una lavadora*/
			if(electrodomestico instanceof Lavadora) {
				
				/*Mostramos el precio de la lavadora*/
				System.out.println("Lavadora: " + electrodomestico.getPrecioBase());
			}
		}
	}
	
	private static void mostrarPrecioTelevisor() {
		
		/*Hacemos un for each para recorrer la lista*/
		for(Electrodomestico electrodomestico : electrodomesticos) {
			
			/*Si el electrodomestico es una television*/
			if(electrodomestico instanceof Television) {
				
				/*Mostramos el precio de la television*/
				System.out.println("Televisor: " + electrodomestico.getPrecioBase());
			}
		}
	}
	
	private static double sumaPrecios() {
		
		/*Creamos una variable para almacenar la suma de los electrodomesticos*/
		double total = 0;
		
		/*Hacemos un for each para recorrer la lista*/
		for(Electrodomestico electrodomestico : electrodomesticos) {
			
			/*Si el electrodomestico es un electrodomestico*/
			if(electrodomestico instanceof Electrodomestico) {
				
				/*Sumamos el dinero del electrodomestico*/
				total += electrodomestico.getPrecioBase();
			}
		}
		
		/*Devolvemos el total de los precios de los electrodomesticos*/
		return total;
	}
}