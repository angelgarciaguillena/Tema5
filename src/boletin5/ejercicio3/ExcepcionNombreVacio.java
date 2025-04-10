package boletin5.ejercicio3;

/**
 * Clase encargada de devolver el mensaje del error cuando se produce
 * 
 * @author Angel
 */
public class ExcepcionNombreVacio extends Exception{
	
	/**
	 * Funcion encargada de devolver el mensaje que se lanza cuando
	 * se produce el error
	 * 
	 * @return Devuelve el mensaje que se lanza en caso de error
	 */
	@Override
	public String toString() {
		return "Error: No se ha introducido ningun nombre";
	}
	
	/**
	 * Funcion encargada de lanzar el mensaje cuando se produce el error
	 * 
	 * @return Devuelve el mensaje de error
	 */
	@Override
	public String getMessage() {
		return "Error: No se ha introducido ningun nombre";
	}
}