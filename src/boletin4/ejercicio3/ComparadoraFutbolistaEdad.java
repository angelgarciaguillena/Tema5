package boletin4.ejercicio3;

import java.util.Comparator;

/**
 * Clase encargada de determinar el orden de los futbolistas segun su edad de forma
 * ascendente
 * 
 * @author Angel
 */
public class ComparadoraFutbolistaEdad implements Comparator<Futbolista> {
	
	/**
	 * Funcion compare encargada de asignar la posicion al jugador por su edad de forma
	 * ascendente y devuelve la posicion del jugador
	 * 
	 * @return Devuelve la posicion del jugador
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o1.getEdad() - o2.getEdad();
	}
}