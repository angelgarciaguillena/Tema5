package boletin2.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocioPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una lista para almacenar los socios*/
		List<Socio> socios = new ArrayList<Socio>();
		
		/*Creamos nuevos socios*/
		Socio socio1 = new Socio(123, "Juan", 29);
		Socio socio2 = new Socio(36, "Pepe", 15 );
		Socio socio3 = new Socio(2, "Alfonso", 18);
		Socio socio4 = new Socio(18, "Alberto", 21);
		
		/*Añadimos a los socios*/
		socios.add(socio1);
		socios.add(socio2);
		socios.add(socio3);
		socios.add(socio4);
		
		/*Mostramos la lista desordenada*/
		System.out.println("Lista desordenada");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
		
		/*Ordenamos la lista*/
		Collections.sort(socios);
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Mostramos la lista ordenada*/
		System.out.println("Lista ordenada");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
	}
}