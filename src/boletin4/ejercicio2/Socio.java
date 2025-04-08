package boletin4.ejercicio2;

/**
 * Clase Socio destinada a crear un nuevo socio
 * 
 * @author Angel
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
	 * Funcion que devuelve el nombre de la persona
	 * 	
	 * @return Devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Funcion que modifica el nombre de la persona si su valor es valido
	 * 
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Funcion que devuelve la edad de la persona
	 * 	
	 * @return Devuelve la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Funcion que modifica la edad de la persona si su valor es valido
	 * 
	 * @param edad Edad de la persona
	 */
	public void setEdad(int edad) {
		if(edad >= 0) {
			this.edad = edad;
		}
	}

	/**
	 * Funcion que devuelve el id de la persona
	 * 	
	 * @return Devuelve el id de la persona
	 */
	public int getId() {
		return id;
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