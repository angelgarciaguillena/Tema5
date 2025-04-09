package boletin5.ejercicio1;

/**
 * Clase encargada de lanzar el mensaje de erroren caso de
 * que se produzca
 * 
 * @author Angel
 */
public class NegativeHourException extends Exception{
	
	/**
	 * Funcion toString encargada de devolver el mensaje que se lanza
	 * en caso de error
	 * 
	 * @return Devuelve un mensaje con el error
	 */
	@Override
	public String toString() {
		return "Error: La hora introducida no puede ser negativa";
	}
	
	/**
	 * Funcion getMessage encargada de devolver el error que se 
	 * ha producido
	 * 
	 * @return Devuelve un mensaje con el error que se ha producido
	 */
	@Override
	public String getMessage() {
		return "Error: La hora introducida no puede ser negativa";
	}
}