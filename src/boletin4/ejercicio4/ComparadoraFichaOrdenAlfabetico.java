package boletin4.ejercicio4;

import java.util.Comparator;

/**
 * Clase que se encarga de calcular la posicion de la ficha segun su orden alfabetico
 */
public class ComparadoraFichaOrdenAlfabetico implements Comparator<Ficha>{
	
	/**
	 * Funcion que calcula y devuelve la posicion de la ficha segun su orden alfabetico
	 * 
	 * @return Devuelve la posicion de la ficha segun su orden alfabetico
	 */
	@Override
	public int compare(Ficha o1, Ficha o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}
}