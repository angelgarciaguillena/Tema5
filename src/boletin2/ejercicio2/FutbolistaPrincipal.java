package boletin2.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FutbolistaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una lista que almacene a los futbolistas*/
		List<Futbolista> futbolistas = new ArrayList<Futbolista>();
		
		/*Creamos los futbolistas*/
		Futbolista futbolista1 = new Futbolista(10, "Alfonso", 42, 82);
		Futbolista futbolista2 = new Futbolista(8, "Alberto", 37, 94);
		Futbolista futbolista3 = new Futbolista(2, "Pablo",22, 55);
		Futbolista futbolista4 = new Futbolista(7, "Antonio", 18, 69);
		Futbolista futbolista5 = new Futbolista(11, "Jose", 55, 72);
		
		/*Añadimos a los futbolistas*/
		futbolistas.add(futbolista1);
		futbolistas.add(futbolista2);
		futbolistas.add(futbolista3);
		futbolistas.add(futbolista4);
		futbolistas.add(futbolista5);
		
		/*Mostramos la lista desordenada*/
		System.out.println("Lista desordenada");
		for(Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
		
		/*Ordenamos la lista*/
		Collections.sort(futbolistas);
		
		/*Hacemos un salto de linea*/
		System.out.println();
		
		/*Mostramos la lista ordenada*/
		System.out.println("Lista ordenada");
		for(Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}
}