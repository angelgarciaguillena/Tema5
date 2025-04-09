package boletin4.ejercicio3;

import java.util.Comparator;

/**
 * Clase encargada de asignar la posicion de los futbolistas segun sus goles de 
 * forma descendente
 * 
 * @author Angel
 */
public class ComparadoraFutbolistaGoles implements Comparator<Futbolista>{
	
	/**
	 * Funcion compare encargada de calcular y devolver la posicion de los futbolistas 
	 * segun sus goles de forma descendente
	 * 
	 * @return Devuelve la posicion del futbolista de forma descendente
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getGoles() - o1.getGoles();
	}
}