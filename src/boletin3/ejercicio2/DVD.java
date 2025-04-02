package boletin3.ejercicio2;

public class DVD extends Ficha{
	
	

	/**
	 * Enumerado con los posibles tipos de dvd
	 */
	enum Tipo{
		PELICULA, DOCUMENTAL, SERIE
	}
	
	/**
	 * Atributo que almacena el director del dvd
	 */
	private String director = "No especificado";
	
	/**
	 * Atributo que almacena el año del dvd
	 */
	private int año = 0;
	
	/**
	 * Atributo que almacena el tipo de dvd
	 */
	private Tipo tipo = Tipo.PELICULA;
	
	/**
	 * Constructor que inicializa los atributos de la clase DVD y los 
	 * atributos heredados de la clase Ficha y comprueba si los valores
	 * son validos antes de asignarlos
	 * 
	 * @param identificador Identificador del dvd
	 * @param titulo Titulo del dvd
	 * @param director Director del dvd
	 * @param año Año del dvd
	 * @param tipo Tipo de dvd
	 */
	public DVD(int identificador, String titulo, String director, int año, String tipo) {
		super(identificador, titulo);
		
		if(director != null && !director.isBlank()) {
			this.director = director;
		}
		
		if(año >= 0) {
			this.año = año;
		}
		
		switch(tipo) {
		case "DOCUMENTAL","PELICULA", "SERIE" ->{
			this.tipo = Tipo.valueOf(tipo);
		}
		}
	}
	
	/**
	 * Funcion que devuelve el director del dvd
	 * 	
	 * @return Devuelve el director del dvd
	 */
	public String getDirector() {
		return director;
	}
	
	/**
	 * Funcion que devuelve el año del dvd
	 * 
	 * @return Devuelve el año del dvd
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Funcion que devuelve el tipo de dvd
	 * 
	 * @return Devuelve el tipo de dvd
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Funcion que devuelve el tiempo de prestamo del dvd
	 * 
	 * @return Devuelve el tiempo de prestamo del dvd
	 */
	@Override
	public int tiempoPrestamo() {
		return 5;
	}
}