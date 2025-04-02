package boletin3.ejercicio4;

/**
 * Clase encargada de crear un nuevo objeto Contacto
 * 
 * @author Angel
 */
public class Contacto implements Comparable<Contacto>{

	/**
	 * Atributo que almacena el nombre del contacto
	 */
	private String nombre = "No especificado";
	
	/**
	 * Atributo que almacena el telefono del contacto
	 */
	private int telefono = 000000000;
	
	/**
	 * Constructor que inicializa los atributos de la clase Contacto y comprueba si los valores
	 * son correctos antes de asignarlos
	 * 
	 * @param nombre Nombre del contacto
	 * @param telefono Telefono del contacto
	 */
	public Contacto(String nombre, int telefono) {
		
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if(telefono > 999999999 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}
	
	/**
	 * Funcion que devuelve el nombre del contacto
	 * 
	 * @return Devuelve el nombre del contacto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Funcion que devuelve el telefono del contacto
	 * 
	 * @return Devuelve el telefono del contacto
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * Funcion que devuelve la informacion del contacto
	 * 
	 * @return Devuelve la informacion del contacto
	 */
	@Override
	public String toString() {
		return this.nombre + " - " + this.telefono;
	}
	
	/**
	 * Funcion que indica si los contactos son iguales o no dependiendo de si sus nombres son iguales
	 * y devuelve true si son iguales o false si no lo son
	 * 
	 * @return Devuelve true si los contactos son iguales o false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		Contacto contacto2 = (Contacto) obj;
		return this.nombre.equalsIgnoreCase(contacto2.nombre);
	}
	
	/**
	 * Metodo compareTo para indicar la posicion de cada uno de los contactos
	 * y devuelve la posicion del contacto
	 * 
	 * @return Devuelve la posicion del contacto
	 */
	@Override
	public int compareTo(Contacto contacto2) {
		return this.nombre.compareTo(contacto2.nombre);
	}	
}