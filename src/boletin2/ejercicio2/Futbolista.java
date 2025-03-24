package boletin2.ejercicio2;

/**
 * Clase Futbolista destinada a crear un nuevo futbolista
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