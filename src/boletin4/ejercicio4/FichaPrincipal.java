package boletin4.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FichaPrincipal {
	
	public static void main(String[] args) {
		
		/*Creamos varios objetos*/
		Libro libro = new Libro(1, "Libro", "Autor", "Editorial");
		DVD DVD = new DVD(3, "DVD", "Director", 1867, "SERIE");
		Revista revista1 = new Revista(2, "Revista", 1, 1976);
		Revista revista2 = new Revista(2, "Revista2", 2, 2004);
		
		/*Creamos una lista para almacenar las fichas*/
		List<Ficha> fichas = new ArrayList<Ficha>();
		
		/*Creamos un comparador segun el orden alfabetico con una clase anonima*/
		Comparator<Ficha> comparadorFichaOrdenAlfabetico = new Comparator<Ficha>(){
			@Override
			public int compare(Ficha o1, Ficha o2) {
				return o1.compareTo(o2);
			}
		};
		
		/*Añadimos las fichas a la lista*/
		fichas.add(DVD);
		fichas.add(revista1);
		fichas.add(revista2);
		fichas.add(libro);
		
		/*Mostramos el libro*/
		System.out.println("Libro");
		System.out.println(libro.toString());
		System.out.println(libro.tiempoPrestamo() + " dias de prestamo");
		
		/*Mostramos la revista*/
		System.out.println("\n" + "Revista");
		System.out.println(revista1.toString());
		System.out.println(revista1.tiempoPrestamo() + " dias de prestamo");
		
		/*Mostramos el dvd*/
		System.out.println("\n" + "DVD");
		System.out.println(DVD.toString());
		System.out.println(DVD.tiempoPrestamo() + " dias de prestamo");
		
		/*Mostramos si las dos revistas son iguales*/
		System.out.println();
		System.out.println(revista1.equals(revista2));
		
		/*Mostramos la lista desordenada*/
		System.out.println("\n" + "Lista desordenada:");
		for(Ficha ficha : fichas) {
			System.out.println(ficha);
		}
		
		/*Ordenamos la lista por el identificador*/
		Collections.sort(fichas);
		
		/*Mostramos la lista ordenada por identificador*/
		System.out.println("\n" + "Lista ordenada por identificador:");
		for(Ficha ficha : fichas) {
			System.out.println(ficha);
		}
		
		/*Ordenamos la lista por orden alfabetico mediante la interfaz*/
		Collections.sort(fichas, new ComparadoraFichaOrdenAlfabetico());
		
		/*Ordenamos la lista por orden alfabetico mediante la clase anonima*/
		fichas.sort(comparadorFichaOrdenAlfabetico);
		
		/*Ordenamos la lista mediante la expresion LAMBDA Forma 1*/
		fichas.sort((Ficha a, Ficha b) -> a.getTitulo().compareTo(b.getTitulo()));
		
		/*Ordenamos la lista mediante expresion LAMBDA Forma 2*/
		Comparator<Ficha> comparadorAlfabetico = (a,b) -> {
			return a.getTitulo().compareTo(b.getTitulo());
		};
		fichas.sort(comparadorAlfabetico);
		
		/*Mostramos la lista ordenada por orden alfabetico*/
		System.out.println("\n" + "Lista ordenada por orden alfabetico:");
		for(Ficha ficha : fichas) {
			System.out.println(ficha);
		}
	}
}