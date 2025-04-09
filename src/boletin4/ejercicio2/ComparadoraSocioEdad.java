package boletin4.ejercicio2;

import java.util.Comparator;

/**
 * Clase que se encarga de asignar la posicion correspondiente de cada Socio
 * 
 * @author Angel
 */
public class ComparadoraSocioEdad implements Comparator<Socio> {
	
	/**
	 * Funcion compare encargada de comparar y devolver la posicion que ocupan los socios
	 * 
	 * @return Devuelve la posicion que ocupan los socios
	 */
	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getEdad() - o2.getEdad();
	}
}