package boletin3.ejercicio1;

/**
 * Clase Camion que hereda de la clase Vehiculo y se encarga de crear un nuevo objeto camion
 */
public class Camion extends Vehiculo{
	
	/**
	 * Atributo que almacena el peso maximo del camion
	 */
	private double pesoMaximo = 0;
	
	/**
	 * Atributo que almacena si el camion puede transportar mercancias peligrosas
	 */
	private boolean mercanciaPeligrosa = false;
	
	/**
	 * Constructor que inicializa los atributos de la clase Camion y los de la clase Vehiculo
	 * comprobando si los valores son validos antes de asignarlos
	 * 
	 * @param marca Marca del camion
	 * @param modelo Modelo del camion
	 * @param color Color del camion
	 * @param matricula Matricula del camion
	 * @param pesoMaximo Peso maximo del camion
	 * @param mercanciaPeligrosa Indica si el vehiculo puede transportar mercancias peligrosas
	 */
	public Camion(String marca, String modelo, String color, String matricula, double pesoMaximo, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		
		if(pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		}
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	/**
	 * Funcion que devuelve true si el camion puede transportar mercancias peligrosas
	 * o false si no puede
	 * 
	 * @return Devuelve true si el camion puede transportar mercancias peligrosaso false si no puede
	 */
	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	/**
	 * Funcion que modifica si el camion puede transpoprtar mercancias peligrosas
	 * 
	 * @param mercanciaPeligrosa Indica si el camion puede transportar mercancias peligrosas
	 */
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	/**
	 * Funcion que devuelve el peso maximo del camion
	 * 
	 * @return Devuelve el peso maximo del camion
	 */
	public double getPesoMaximo() {
		return pesoMaximo;
	}
	
	/**
	 * Funcion que devuelve la informacion del camion
	 * 
	 * @return Devuelve la informacion del camion
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.pesoMaximo + " kg - " + (this.mercanciaPeligrosa ? "El camion puede transportar mercancias peligrosas" : "El camion no puede transportar mercancias peligrosas");
	}
}