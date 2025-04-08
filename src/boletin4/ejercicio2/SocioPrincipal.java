package boletin4.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocioPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una lista para almacenar los socios*/
		List<Socio> socios = new ArrayList<Socio>();
		
		/*Creamos nuevos socios*/
		Socio socio1 = new Socio(123, "Juan", 29);
		Socio socio2 = new Socio(36, "Pepe", 15 );
		Socio socio3 = new Socio(2, "Alfonso", 18);
		Socio socio4 = new Socio(18, "Carlos", 21);
		
		/*Creamos un comparador para la edad usando una clase anonima*/
		Comparator<Socio> compararSociosEdad = new Comparator<Socio>() {
			@Override
			public int compare(Socio o1, Socio o2) {
				return o1.getEdad() - o2.getEdad();
			}
		};
		
		/*Creamos un comparador para los nombres usando una clase anonima*/
		Comparator<Socio> compararSociosNombres = new Comparator<Socio>() {
			@Override
			public int compare(Socio o1, Socio o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};	
		
		/*Añadimos a los socios*/
		socios.add(socio1);
		socios.add(socio2);
		socios.add(socio3);
		socios.add(socio4);
		
		/*Mostramos la lista desordenada*/
		System.out.println("Lista desordenada:");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
		
		/*Ordenamos la lista por edad*/
		/*Sin expresion LAMBDA usando interfaz*/
		Collections.sort(socios, new ComparadoraSocioEdad()); 
		
		/*Sin expresion LAMBDA usando clase anonima*/
		socios.sort(compararSociosEdad);
		
		/*Con expresion LAMBDA Forma 1*/
		socios.sort((Socio a, Socio b) -> a.getEdad() - b.getEdad()); 
		
		/*Con expresion LAMBDA Forma 2*/
		Comparator<Socio> compararEdad = (a,b) -> {
			return a.getEdad() - b.getEdad();
		};
		socios.sort(compararEdad);
		
		/*Mostramos la lista ordenada*/
		System.out.println("\n" + "Lista ordenada por edad:");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
		
		/*Ordenamos la lista por nombre*/
		/*Sin expresion LAMBDA con interfaz*/
		Collections.sort(socios, new ComparadoraSocioNombreAlfabetico());
		
		/*Sin expresion LAMBDA con clase anonima*/
		socios.sort(compararSociosNombres);
		
		/*Con expresion LAMBDA Forma 1*/
		socios.sort((Socio a, Socio b) -> a.getNombre().compareTo(b.getNombre())); 
		
		/*Con expresiones LAMBDA Forma 2*/
		Comparator<Socio> comparadorNombre = (a,b) -> {
			return a.getNombre().compareTo(b.getNombre());
		};
		socios.sort(comparadorNombre);
		
		/*Mostramos la lista ordenada por nombres*/
		System.out.println("\n" + "Lista ordenada por nombre:");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
	}
}