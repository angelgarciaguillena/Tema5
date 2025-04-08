package boletin4.ejercicio4;

/**
 * Clase destinada a crear un nuevo objeto libro
 * 
 * @author Angel
 */
public class Libro extends Ficha {

	/**
	 * Atributo que almacena el autor del libro
	 */
	private String autor = "No especificado";
	
	/**
	 * Atributo que almacena la editorial del libro
	 */
	private String editorial = "No especificado";
	
	/**
	 * Constructor que inicializa los atributos de la clase Libro y los heredados
	 * de la clase Ficha y comprueba si los valores son validos antes de asignarlos
	 * 
	 * @param identificador Identificador del libro
	 * @param titulo Titulo del libro
	 * @param autor Autor del libro
	 * @param editorial Editorial del libro
	 */
	public Libro(int identificador, String titulo, String autor, String editorial) {
		super(identificador, titulo);
		
		if(autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		
		if(editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}
	
	/**
	 * Funcion que devuelve el autor
	 * 
	 * @return Devuelve el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Funcion que devuelve la editorial
	 * 
	 * @return Devuelve la editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Funcion que devuelve el tiempo de prestamo del libro
	 * 
	 * @return Devuelve el tiempo de prestamo del libro
	 */
	@Override
	public int tiempoPrestamo() {
		return 15;
	}
	
	/**
	 * Metodo que devuelve la informacion del libro
	 * 
	 * @return Devuelve la informacion del libro
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.autor + " - " + this.editorial;
	}
}