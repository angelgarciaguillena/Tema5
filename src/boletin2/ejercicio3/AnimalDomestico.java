package boletin2.ejercicio3;

/**
 * Clase Animal domestico destinada a crear un nuevo animal domestico
 * 
 * @author Angel
 */
public abstract class AnimalDomestico implements Animal{
	
	/**
	 * Atributo que almacena el nombre del animal
	 */
	private String nombre = "No especificado";
	
	/**
	 * Atributo que almacena la raza del animal
	 */
	private String raza = "No especificado";
	
	/**
	 * Atributo que almacena el peso del animal
	 */
	private double peso = 0.1;
	
	/**
	 * Atributo que almacena el color del animal 
	 */
	private String color = "No especificado";
	
	/**
	 * Constructor quie inicializa los atributos de la clase AnimalDomestico
	 * comprobando si sus valores son validos antes de asignarlos
	 * 
	 * @param nombre Nombre del animal
	 * @param raza Raza del animal
	 * @param peso Peso del animal
	 * @param color Color del animal
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		
		if(nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if(raza != null && !raza.isBlank()) {
			this.raza = raza;
		}
		
		if(peso > 0) {
			this.peso = peso;
		}
		
		if(color != null && !color.isBlank()) {
			this.color = color;
		}
	}
	
	/**
	 * Funcion que devuelve el peso del animal
	 * 	
	 * @return Devuelve el peso del animal
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Funcion que modifica el peso del animal comprobando si el valor es 
	 * valido antes de asignarlo
	 * 
	 * @param peso Peso del animal
	 */
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	/**
	 * Funcion que devuelve el nombre del animal
	 * 
	 * @return Devuelve el nombre del animal
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Funcion que devuelve la raza del animal
	 * 
	 * @return Devuelve la raza del animal
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * Funcion que devuelve el color del animal
	 * 
	 * @return Devuelve el color del animal
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo que indica que el animal ha sido vacunado
	 */
	public void vacunar() {
		System.out.println("Ha sido vacunado");
	}
	
	/**
	 * Metodo que indica si el animal ha hecho caso o no devolviendo
	 * true si le ha hecho caso o false si no lo ha hecho
	 * 
	 * @return True si le ha hecho caso o false si no lo ha hecho
	 */
	public abstract boolean hacerCaso();
	
	/**
	 * Metodo que representa la accion de comer del animal
	 */
	@Override
	public void comer() {
		System.out.println("Ñam Ñam Ñam");
	}
	
	/**
	 * Metodo que representa la accion de dormir del animal
	 */
	@Override
	public void dormir() {
		System.out.println("zzz");
	}
	
	/**
	 * Metodo que representa el ruido que hace el animal
	 */
	@Override
	public abstract void hacerRuido();
	
	/**
	 * Metodo encargado de devolver la informacion del animal
	 * 
	 * @return Devuelve la informacion del animal
	 */
	@Override
	public String toString() {
		return this.nombre + " - " + this.raza + " - " + this.peso + "kg - " + this.color;
	}
}