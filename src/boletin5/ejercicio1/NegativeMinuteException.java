package boletin5.ejercicio1;

/**
 * Clase encargada de lanzar el mensaje con el error
 * cuando se produzca
 * 
 * @author Angel
 */
public class NegativeMinuteException extends Exception{
	
	/**
	 * Funcion toString encargada de devolver el mensaje que se lanzara
	 * en caso de error
	 * 
	 * @return Devuelve el mensaje que se lanza en caso de error
	 */
	@Override
	public String toString() {
		return "Error: Los minuto introducidos no pueden ser negativos";
	}
	
	/**
	 * Funcion encargada de devolver el mensaje del error cuando se produzca
	 * 
	 * @return Devuelve el mensaje con el error producido
	 */
	@Override
	public String getMessage() {
		return "Error: Los minuto introducidos no pueden ser negativos";
	}
}