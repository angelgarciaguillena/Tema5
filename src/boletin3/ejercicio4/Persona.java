package boletin3.ejercicio4;

/**
 * Clase destinada a crear un nuevo objeto Persona
 * 
 * @author Angel
 */
public class Persona extends Contacto {
	
	/**
	 * Atributo que almacena el cumpleaños de la persona
	 */
	private String cumpleaños = "No especificado";
	
	/**
	 * Constructor que inicializa los atributos de la clase Persona y los heredados de 
	 * la clase Contacto comprobando si los valores son validos antes de asignarlos
	 * 
	 * @param nombre Nombre de la persona
	 * @param telefono Telefono de la persona
	 * @param cumpleaños Cumpleaños de la persona
	 */
	public Persona(String nombre, int telefono, String cumpleaños) {
		super(nombre, telefono);
		
		if(cumpleaños != null && !cumpleaños.isBlank()) {
			this.cumpleaños = cumpleaños;
		}
	}
	
	/**
	 * Funcion que devuelve el cumpleaños de la persona
	 * 
	 * @return Devuelve el cumpleaños de la persona
	 */
	public String getCumpleaños() {
		return cumpleaños;
	}
	
	/**
	 * Funcion que devuelve la informacion de la persona
	 * 
	 * @return Devuelve la informacion de la persona
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.cumpleaños;
	}
}