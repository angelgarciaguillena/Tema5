package boletin4.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CuentaBancariaPrincipal {
	
	public static void main(String[] args) {
		
		/*Creamos una lista para almacenar los titulares*/
		List<Titular> titulares = new ArrayList<Titular>();
		
		/*Creamos una lista para almacenar las cuentas*/
		List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
		
		/*Creamos varios titulares*/
		Titular titular1 = new Titular("12345678A", "Pepe", "Martinez", 123456789);
		Titular titular2 = new Titular("87654321B", "Manuel", "Martinez", 987654321);
		Titular titular3 = new Titular("12345678B", "Alfonso", "Rodriguez", 123454321);
		Titular titular4 = new Titular("87654321A", "Juan", "Ortiz", 987656789);
		
		/*Añadimos a los titulares*/
		titulares.add(titular1);
		titulares.add(titular2);
		titulares.add(titular3);
		titulares.add(titular4);
		
		/*Creamos varias cuentas bancarias*/
		CuentaBancaria cuenta1 = new CuentaBancaria(1234, titular1);
		CuentaBancaria cuenta2 = new CuentaBancaria(5678, titular2);
		CuentaBancaria cuenta3 = new CuentaBancaria(4321, titular3);
		CuentaBancaria cuenta4 = new CuentaBancaria(8765, titular4);
		
		/*Añadimos a las cuentas*/
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		cuentas.add(cuenta3);
		cuentas.add(cuenta4);
		
		/*Añadimos saldo a las cuentas*/
		cuenta1.ingresar(2);
		cuenta2.ingresar(20);
		cuenta3.ingresar(80);
		cuenta4.ingresar(40);
		
		/*Mostramos las listas desordenadas*/
		System.out.println("Lista desordenada cuentas:");
		for(CuentaBancaria cuenta : cuentas) {
			System.out.println(cuenta);
		}
		
		System.out.println("\n" + "Lista desordenada titulares:");
		for(Titular titular : titulares) {
			System.out.println(titular);
		}
		
		/*Ordenamos las listas*/
		/*Sin expresion LAMBDA usando interfaz*/
		Collections.sort(titulares, new ComparadoraApellidoNombre()); 
		
		/*Con expresion LAMBDA*/
		Comparator<Titular> compararApellidoNombre = (a,b) -> {
			int resultado;
			
			if (a.getApellido().compareTo(b.getApellido()) != 0) {
				resultado = a.getApellido().compareTo(b.getApellido());
			} else {
				resultado = a.getNombre().compareTo(b.getNombre());
			}
			
			return resultado;
		};
		titulares.sort(compararApellidoNombre);
		
		/*Sin expresion LAMBDA usando interfaz*/
		Collections.sort(cuentas, new ComparadoraSaldo()); 
		
		/*Con expresion LAMBDA*/
		Comparator<CuentaBancaria> compararSaldo = (a,b) -> {
			return (int) (a.getSaldo() - b.getSaldo());
		};
		cuentas.sort(compararSaldo);
		
		/*Mostramos las listas ordenada*/
		System.out.println("\n" + "Lista ordenada cuentas:");
		for(CuentaBancaria cuenta : cuentas) {
			System.out.println(cuenta);
		}
		
		System.out.println("\n" + "Lista ordenada titulares:");
		for(Titular titular : titulares) {
			System.out.println(titular);
		}
	}
}