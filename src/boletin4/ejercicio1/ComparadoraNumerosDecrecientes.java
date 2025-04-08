package boletin4.ejercicio1;

import java.util.Comparator;

/**
 * Clase Comparadora encargada de indicar el orden de los numeros
 */
public class ComparadoraNumerosDecrecientes implements Comparator<Integer>{
	
	/**
	 * Metodo compare que indica la posicion de los numeros
	 * 
	 * @return Devueolve la posicion de los numeros
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}