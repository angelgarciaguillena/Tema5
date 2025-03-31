package boletin3.ejercicio2;

public class Libro extends Ficha {

	/**
	 * Atributo que almacena el autor del libro
	 */
	private String autor;
	
	/**
	 * Atributo que almacena la editorial del libro
	 */
	private String editorial;
	
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

	@Override
	public int tiempoPrestamo() {
		return 0;
	}

}
