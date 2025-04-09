package boletin5.ejercicio1;

/**
 * Clase encargada de lanzar un mensaje con el error que se ha producido
 * 
 * @author Angel
 */
public class NegativeSecondException extends Exception{
	
	/**
	 * Funcion toString encargada de devolver el mensaje que se lanza en caso
	 * de error
	 * 
	 * @return Devuelve un mensaje con el error
	 */
	@Override
	public String toString() {
		return "Error: Los segundos introducidos no pueden ser negativos";
	}
	
	/**
	 * Funcion getMessage encargada de devolver el mensaje con el error que
	 * se ha producido
	 * 
	 * @return Devuelve el mensaje con el error
	 */
	@Override
	public String getMessage() {
		return "Error: Los segundos introducidos no pueden ser negativos";
	}
}