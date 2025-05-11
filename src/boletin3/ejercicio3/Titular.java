package boletin3.ejercicio3;

import java.util.Objects;

/**
 * Clase Ttular encargada de crear un nuevo objeto titular
 * 
 * @author Angel
 */
public class Titular implements Comparable<Titular>{
	
	/**
	 * Atributo que almacena el dni del titular
	 */
	private String dni;
	
	/**
	 * Atributo que almacena el nombre del titular
	 */
	private String nombre;
	
	/**
	 * Atributo que almacena el apellido del titular
	 */
	private String apellido;
	
	/**
	 * Atributo que almacena el telefono del titular
	 */
	private int telefono;
	
	/**
	 * Constructor que inicializa los atributos de la clase Titular comprobando
	 * que los valores sean validos antes de asignarlos
	 * 
	 * @param dni Dni del titular
	 * @param nombre Nombre del titular
	 * @param apellido Apellido del titular
	 * @param telefono Telefono del titular
	 */
	public Titular(String dni, String nombre, String apellido, int telefono) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellido != null && !apellido.isBlank()) {
			this.apellido = apellido;
		}

		if (telefono > 99999999 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}
	
	/**
	 * Funcion que devuelve el dni del titular
	 * 
	 * @return Devuelve el dni del titular
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Funcion que devuelve el nombre del titular
	 * 
	 * @return Devuelve el nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Funcion que devuelve el apellido del titular
	 * 
	 * @return Devuelve el apellido del titular
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Funcion que devuelve el telefono del titular
	 * 
	 * @return Devuelve el telefono del titular
	 */
	public int getTelefono() {
		return telefono;
	}
	
	/**
	 * Funcion que devuelve la informacion del titular	
	 * 
	 * @return Devuelve la informacion del titular
	 */
	@Override
	public String toString() {
		return "Dni: " + dni + " - Nombre: " + nombre + " - Apellido: " + apellido + " - Telefono: " + telefono;
	}
	
	/**
	 * Funcion que devuelve un numero que identifica al titular
	 * 
	 * @return Devuelve un numero que identifica al titular	
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	/**
	 * Funcion que calcula y devuelve la posicion de los titulares segun su dni
	 * 
	 * @return Devuelve la posicion del titular segun su dni
	 */
	@Override
	public int compareTo(Titular o) {
		return this.dni.compareTo(o.dni);
	}	
}