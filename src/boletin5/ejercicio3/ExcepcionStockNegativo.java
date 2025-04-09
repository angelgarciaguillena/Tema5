package boletin5.ejercicio3;

/**
 * Clase encargada de devolver el mensaje del error cuando se produce
 * 
 * @author Angel
 */
public class ExcepcionStockNegativo extends Exception{
	
	/**
	 * Funcion encargada de devolver el mensaje que se lanza cuando
	 * se produce el error
	 * 
	 * @return Devuelve el mensaje que se lanza en caso de error
	 */
	public String toString() {
		return "Error: El stock introducido no puede ser negativo";
	}
	
	/**
	 * Funcion encargada de lanzar el mensaje cuando se produce el error
	 * 
	 * @return Devuelve el mensaje de error
	 */
	public String getMessage() {
		return "Error: El stock introducido no puede ser negativo";
	}
}