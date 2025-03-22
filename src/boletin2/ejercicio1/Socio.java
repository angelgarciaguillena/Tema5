package boletin2.ejercicio1;

/**
 * Clase Socio destinada a crear un nuevo socio
 */
public class Socio implements Comparable<Socio> {
	
	/**
	 * Atributo que almacena el id del socio
	 */
	private int id = 0;
	
	/**
	 * Atributo que almacena el nombre del socio
	 */
	private String nombre = "No especificado";
	
	/**
	 * Atributo que almacena la edad del socio
	 */
	private int edad = 0;
	
	/**
	 * Constructor que inicializa la clase Socio y comprueba los valores
	 * antes de asignarlos
	 * 
	 * @param id Id del socio
	 * @param nombre Nombre del socio
	 * @param edad Edada del socio
	 */
	public Socio(int id, String nombre, int edad) {
		if(id >= 0) {
			this.id = id;
		}
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if(edad >= 0) {
			this.edad = edad;
		}
	}
	
	/**
	 * Metodod toString que devuelve una cadena con la informacion del socio
	 * 
	 * @return Devuelve una cadena con la informacion del socio
	 */
	@Override
	public String toString() {
		return "Socio: " + id + " - " + nombre + " - " + edad + " años";
	}
	
	/**
	 * Metodo compareTo para indicar la posicion de cada uno de los socios
	 * y devuelve la posicion del socio
	 * 
	 * @return Devuelve la posicion del socio
	 */
	@Override
	public int compareTo(Socio o) {
		return this.id - o.id;
	}
}