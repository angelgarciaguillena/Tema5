package examen;

/**
 * Interfaz Velocidad encargada de implementar las funciones para subir o bajar la velocidad
 * 
 *  @author Angel
 */
public interface Velocidad {
	
	/**
	 * Funcion que sube la velocidad y devuelve true si se ha subido la velocidad
	 * o false si no
	 * 
	 * @return Devuelve true si se ha subido la velocidad o false si no
	 */
	public boolean subirVelocidad();
	
	/**
	 * Funcion que baja la velocidad y devuelve true si se ha bajado la velocidad
	 * o false si no
	 * 
	 * @return Devuelve true si se ha bajado la velocidad o false si no
	 */
	public boolean bajarVelocidad();
}