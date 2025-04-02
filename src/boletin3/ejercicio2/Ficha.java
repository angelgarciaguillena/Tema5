package boletin3.ejercicio2;

public abstract class Ficha {
	
	/**
	 * Atributo que almacena el numero identificador de la ficha
	 */
	private int identificador = 0;
	
	/**
	 * Atributo que almacena el titulo de la ficha
	 */
	private String titulo = "No especificado";
	
	/**
	 * Constructor que inicializa los atributos de la clase Ficha y 
	 * comprueba si los valores son validos
	 * 
	 * @param identificador Numero identificador de la ficha
	 * @param titulo Titulo de la ficha
	 */
	public Ficha(int identificador, String titulo) {
		
		if(identificador >= 0) {
			this.identificador = identificador;
		}
		
		if(titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	
	/**
	 * Funcion que devuelve el identificador de la ficha
	 * 
	 * @return Devuelve el identificador de la ficha
	 */
	public int getIdentificador() {
		return identificador;
	}
	
	/**
	 * Funcion que devuelve el titulo de la ficha
	 * 
	 * @return Devuelve el titulo de la ficha
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Metodo que determina el tiempo de prestamo del objeto
	 * 
	 * @return Devuelve el tiempo de prestamo
	 */
	public abstract int tiempoPrestamo();
}