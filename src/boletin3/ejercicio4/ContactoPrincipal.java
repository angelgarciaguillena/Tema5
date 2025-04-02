package boletin3.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContactoPrincipal {
	
	public static void main(String[] args) {
		
		/*Creamos una lista que almacena los contactos*/
		List<Contacto> contactos = new ArrayList<Contacto>();
		
		/*Creamos varios contactos*/
		Contacto contacto1 = new Contacto("Alonso", 485393932);
		Contacto contacto2 = new Contacto("Alonso", 628224971);
		Contacto contacto3 = new Contacto("Paco", 623233214);
		Persona persona1 = new Persona("Fernando", 737232631, "12/07/2000");
		Persona persona2 = new Persona("Fernando", 797563576, "21/03/2007");
		Empresa empresa1 = new Empresa("Empresa", 928471659, "enlace1");
		Empresa empresa2 = new Empresa("Empresa", 922899123, "enlace2");

		/*Añadimos los contactos a la lista*/
		contactos.add(contacto3);
		contactos.add(contacto2);
		contactos.add(contacto3);
		contactos.add(persona1);
		contactos.add(empresa1);
		
		/*Creamos un bucle for each para recorrer la lista*/
		System.out.println("Contactos:");
		for(Contacto contacto : contactos) {
			System.out.println(contacto.toString());
		}
		
		/*Ordenamos la lista*/
		Collections.sort(contactos);
		
		/*Creamos un bucle for each para recorrer la lista*/
		System.out.println("\n" + "Contactos:");
		for(Contacto contacto : contactos) {
			System.out.println(contacto.toString());
		}
		
		/*Comparamos si los contactos son iguales*/
		System.out.println();
		System.out.println(contacto1.equals(contacto2));
		System.out.println(contacto1.equals(empresa1));
		System.out.println(empresa1.equals(empresa2));
		System.out.println(persona1.equals(persona2));
	}
}