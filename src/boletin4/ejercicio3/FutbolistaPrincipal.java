package boletin4.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FutbolistaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una lista que almacene a los futbolistas*/
		List<Futbolista> futbolistas = new ArrayList<Futbolista>();
		
		/*Creamos los futbolistas*/
		Futbolista futbolista1 = new Futbolista(10, "Alfonso", 42, 82);
		Futbolista futbolista2 = new Futbolista(8, "Alberto", 37, 94);
		Futbolista futbolista3 = new Futbolista(10, "Pablo",22, 55);
		Futbolista futbolista4 = new Futbolista(7, "Antonio", 18, 69);
		Futbolista futbolista5 = new Futbolista(11, "Jose", 55, 72);
		
		/*Creamos un comparador para la edad usando una clase anonima*/
		Comparator<Futbolista> comparadorFutbolistaEdad = new Comparator<Futbolista>() {
			@Override
			public int compare(Futbolista o1, Futbolista o2) {
				return o1.getEdad() - o2.getEdad();
			}
		};
		
		/*Creamos un comparador para la camiseta usando una clase anomina*/
		Comparator<Futbolista> comparadorFutbolistaGoles = new Comparator<Futbolista>() {
			@Override
			public int compare(Futbolista o1, Futbolista o2) {
				return o2.getGoles() - o1.getGoles();
			}
		};
		
		/*Añadimos a los futbolistas*/
		futbolistas.add(futbolista1);
		futbolistas.add(futbolista2);
		futbolistas.add(futbolista3);
		futbolistas.add(futbolista4);
		futbolistas.add(futbolista5);
		
		/*Mostramos la lista desordenada*/
		System.out.println("Lista desordenada:");
		for(Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		/*Ordenamos la lista por edad con interfaz*/
		Collections.sort(futbolistas, new ComparadoraFutbolistaEdad());
		
		/*Ordenamos la lista por edad con clase anonima*/
		futbolistas.sort(comparadorFutbolistaEdad);
		
		/*Ordenamos la lista por edad con expresion LAMBDA Forma 1*/
		futbolistas.sort((Futbolista a, Futbolista b) -> a.getEdad() - b.getEdad());
		
		/*Ordenamos la lista por edad con expresion LAMBDA Forma 2*/
		Comparator<Futbolista> comparadorEdad = (a,b) -> {
			return a.getEdad() - b.getEdad();
		};
		futbolistas.sort(comparadorEdad);
		
		/*Mostramos la lista ordenada por edad*/
		System.out.println("\n" + "Lista ordenada por edad:");
		for(Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		/*Ordenamos la lista por numero de goles con interfaz*/
		Collections.sort(futbolistas, new ComparadoraFutbolistaGoles());
		
		/*Ordenamos la lista por numero de goles con clase anonima*/
		futbolistas.sort(comparadorFutbolistaGoles);
		
		/*Ordenamos la lista por numero de goles con expresion LAMBDA Forma 1*/
		futbolistas.sort((Futbolista a, Futbolista b) -> b.getGoles() - a.getGoles());
		
		/*Ordenamos la lista por numero de goles con expresion LAMBDA Forma 2*/
		Comparator<Futbolista> comparadorGoles = (a,b) -> {
			return b.getGoles() - a.getGoles();
		};
		futbolistas.sort(comparadorGoles);
		
		/*Mostramos la lista ordenada por numero de goles*/
		System.out.println("\n" + "Lista ordenada por numero de goles:");
		for(Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}