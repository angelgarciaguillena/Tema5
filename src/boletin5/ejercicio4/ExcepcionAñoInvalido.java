package boletin5.ejercicio4;

/**
 * Clase encargada de deolver el mensaje del error que se ha producido
 */
public class ExcepcionAñoInvalido extends Exception{
	
	/**
	 * Funcion encargada de devolver el mensaje que se lanza en caso de error
	 * 
	 * @return Devuelve el mensaje de error
	 */
	@Override
	public String toString() {
		return "Error: El año introducido es negativo";
	}
	
	/**
	 * Funcion encargada de lanzar el mensaje con el error en caso de que ocurra
	 * 
	 * @return Devuelve el mensaje con el error
	 */
	@Override
	public String getMessage() {
		return "Error: El año introducido es negativo";
	}
}