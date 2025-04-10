package examen;

/**
 * Interfaz Volumen encargada de implementar las funciones para
 * subir o bajar el volumen
 * 
 * @author Angel
 */
public interface Volumen {
	
	/**
	 * Funcion que sube el volumen y devuelve true si se ha cambiado o
	 * false si no se ha realizado
	 * 
	 * @return Devuelve true si se ha realizado o false si no
	 */
	public boolean subirVolumen();
	
	/**
	 * Funcion que baja el volumen y devuelve true si se ha realizado o 
	 * false si no se ha realizado
	 * 
	 * @return Devuelve true si se ha realizado o false si no
	 */
	public boolean bajarVolumen();
}