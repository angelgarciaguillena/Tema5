package boletin4.ejercicio5;

import java.util.Comparator;

/**
 * Clase que se encarga de devolver el orden de los titulares
 * 
 * @author Angel
 */
public class ComparadoraApellidoNombre implements Comparator<Titular> {
	
	/**
	 * Funcion que compara por el apellido y sino por el nombre y devuelve la posicion correspondiente
	 * del titular
	 * 
	 * @return Posicion del titular
	 */
	@Override
	public int compare(Titular o1, Titular o2) {
		int resultado;
		
		if (o1.getApellido().compareTo(o2.getApellido()) != 0) {
			resultado = o1.getApellido().compareTo(o2.getApellido());
		} else {
			resultado = o1.getNombre().compareTo(o2.getNombre());
		}
		
		return resultado;
	}
}