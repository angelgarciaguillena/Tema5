package boletin4.ejercicio2;

import java.util.Comparator;

/**
 * Clase que compara los socios para indicar su posicion
 * 
 * @author Angel
 */
public class ComparadoraSocioNombreAlfabetico implements Comparator<Socio>{
	
	/**
	 * Metodo compare que compara dos nombres y devuelve la posicion que ocupa los socios
	 * 
	 * @return Devuelve la posicion que ocupan los socios
	 */
	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
}