package boletin3.ejercicio2;

/**
 * Clase destinada a crear un nuevo objeto revista
 * 
 * @author Angel
 */
public class Revista extends Ficha{
	
	/**
	 * Atributo que almacena el numero de la revista
	 */
	private int numeroRevista = 0;
	
	/**
	 * Atributo que almacena el año de publicacion de la revista
	 */
	private int añoPublicacion = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Revista y
	 * los heredados de la clase Ficha y comprueba si los valores son validos
	 * antes de asignarlos
	 * 
	 * @param identificador Identificador de la revista
	 * @param titulo Titulo de la revista
	 * @param numeroRevista Numero de la revista
	 * @param añoPublicacion Año de publicacion de la revista
	 */
	public Revista(int identificador, String titulo, int numeroRevista, int añoPublicacion) {
		super(identificador, titulo);
		
		if(numeroRevista >= 0) {
			this.numeroRevista = numeroRevista;
		}
		
		if(añoPublicacion >= 0) {
			this.añoPublicacion = añoPublicacion;
		}
	}
	
	/**
	 * Funcion que devuelve el numero de la revista
	 * 
	 * @return Devuelve el numero de la revista
	 */
	public int getNumeroRevista() {
		return numeroRevista;
	}

	/**
	 * Funcion que devuelve el año de publicacion de la revista
	 * 
	 * @return Devuelve el año de publicacion de la revista
	 */
	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	/**
	 * Metodo que determina el tiempo de prestamo de la revista
	 * 
	 * @return Devuelve el tiempo de prestamo de la revista
	 */
	@Override
	public int tiempoPrestamo() {
		return 10;
	}
	
	/**
	 * Metodo que devuelve la informacion de la revista
	 * 
	 * @return Devuelve la informacion de la revista
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.numeroRevista + " - " + this.añoPublicacion;
	}
}