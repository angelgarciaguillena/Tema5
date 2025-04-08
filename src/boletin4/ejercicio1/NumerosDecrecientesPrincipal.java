package boletin4.ejercicio1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class NumerosDecrecientesPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una lista para almacenar los numeros*/
		Integer numeros[] = new Integer[20];
		
		/*Creamos una clase Random para generar numeros aleatorios*/
		Random rand = new Random();
		
		/*Creamos un comparador usando una clase anonima*/
		 Comparator<Integer> comparadorNumeros = new Comparator<Integer>() {
	            @Override
	            public int compare(Integer a, Integer b) {
	                return b - a;  
	            }
	        };
		
		/*Creamos un bucle para generar los numeros*/
		for(int i = 0; i < 20; i++) {
			numeros[i] = (rand.nextInt(0,101));
		}
		
		/*Mostramos la tabla desordenada*/
		System.out.println("Tabla desordenada:");
		System.out.println(Arrays.toString(numeros));
		
		/*Ordenamos la lista*/
		/*Sin expresion LAMBDA usando la interfaz*/
		Arrays.sort(numeros, new ComparadoraNumerosDecrecientes()); 
		
		/*Sin expresion LAMBDA usando clase anonima*/
		Arrays.sort(numeros, comparadorNumeros); 
		
		/*Con expresion LAMBDA Forma 1*/
		Arrays.sort(numeros, (Integer a, Integer b) -> b - a); 
		
		/*Con expresion LAMBDA Forma 2*/
		Comparator<Integer> compararNumeros = (a,b) ->{
			return b - a;
		};
		Arrays.sort(numeros, compararNumeros);
		
		/*Mostramos la lista ordenada*/
		System.out.println("\n" + "Lista ordenada:");
		System.out.println(Arrays.toString(numeros));
	}
}