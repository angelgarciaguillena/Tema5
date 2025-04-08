package boletin4.ejercicio3;

/**
 * Clase Futbolista destinada a crear un nuevo futbolista
 * 
 * @author Angel
 */
public class Futbolista implements Comparable<Futbolista> {
	
	/**
	 * Atributo que almacena el numero de la camiseta del futbolista
	 */
	private int camiseta = 0;
	
	/**
	 * Atributo que almacena el nombre del futbolista
	 */
	private String nombre = "No especificado";
	
	/**
	 * Atributo que almacena la edad del futbolista
	 */
	private int edad = 0;
	
	/**
	 * Atributo que almacena el numero de goles del futbolista
	 */
	private int goles = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Futbolista comprobando
	 * si sus valores son validos antes de asignarlos
	 * 
	 * @param camiseta Numero de camiseta del futbolista
	 * @param nombre Nombre del futbolista
	 * @param edad Edada del futbolista
	 * @param goles Goles del futbolista
	 */
	public Futbolista(int camiseta, String nombre, int edad, int goles) {
		
		if(camiseta >= 0) {
			this.camiseta = camiseta;
		}
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if(edad >= 0) {
			this.edad = edad;
		}
		
		if(goles >= 0) {
			this.goles = goles;
		}
	}
	
	/**
	 * Funcion que se encarga de devolver el numero de camiseta del futbolista
	 * 
	 * @return Devuelve el numero de camiseta del futbolista
	 */
	public int getCamiseta() {
		return camiseta;
	}

	/**
	 * Funcion que se encarga de modificar el numero de camiseta del jugador 
	 * comprobando si su valor es valido antes de asignarlo
	 * 
	 * @param camiseta Numero de camiseta del jugador
	 */
	public void setCamiseta(int camiseta) {
		if(camiseta >= 0) {
			this.camiseta = camiseta;
		}
	}

	/**
	 * Funcion que se encarga de devolver el nombre del futbolista
	 * 
	 * @return Devuelve el nombre del futbolista
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Funcion que se encarga de modificar el nombre del jugador 
	 * comprobando si su valor es valido antes de asignarlo
	 * 
	 * @param nombre Nombre del jugador
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Funcion que se encarga de devolver la edad del futbolista
	 * 
	 * @return Devuelve la edad del futbolista
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Funcion que se encarga de modificar la edad del jugador 
	 * comprobando si su valor es valido antes de asignarlo
	 * 
	 * @param edad Edad del jugador
	 */
	public void setEdad(int edad) {
		if(edad >= 0) {
			this.edad = edad;
		}
	}

	/**
	 * Funcion que se encarga de devolver el numero de goles del futbolista
	 * 
	 * @return Devuelve el numero de goles del futbolista
	 */
	public int getGoles() {
		return goles;
	}

	/**
	 * Funcion que se encarga de modificar el numero de goles del jugador 
	 * comprobando si su valor es valido antes de asignarlo
	 * 
	 * @param goles Numero de goles del jugador
	 */
	public void setGoles(int goles) {
		if(goles >= 0) {
			this.goles = goles;
		}
	}

	/**
	 * Metodo toString que devuelve una cadena con la informacion del futbolista
	 * 
	 * @return Devuelve la informacion del futbolista
	 */
	@Override
	public String toString() {
		return "Futbolista: Dorsal " + camiseta + " - " + nombre + " - " + edad + " años - " + goles + " goles";
	}
	
	/**
	 * Metodo equals que compara si dos futbolistas son iguales o no y devuelve true 
	 * si son iguales o false si no lo son
	 * 
	 * @return Devuelve true si los futbolistas son iguales o false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;
		
		Futbolista futbolista = (Futbolista) obj;
		
		if(this.camiseta == futbolista.camiseta && this.nombre.equalsIgnoreCase(futbolista.nombre)) {
			iguales = true;
		}
		
		return iguales;
	}
	
	/**
	 *  Metodo compareTo para indicar la posicion de cada uno de los futbolistas
	 * y devuelve la posicion del futbolista
	 * 
	 * @return Devuelve la posicion del futbolista
	 */
	@Override
	public int compareTo(Futbolista o) {
		
		int resultado = 0;
		
		if(this.camiseta == o.camiseta) {
			resultado = this.nombre.compareTo(o.nombre);
		} else {
			resultado = this.camiseta - o.camiseta;
		}
		
		return resultado;
	}	
}