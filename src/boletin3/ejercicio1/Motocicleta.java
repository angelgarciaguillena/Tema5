package boletin3.ejercicio1;

/**
 * Clase Motocicleta que hereda de la clase Vehiculo y esta destinada a crear un nuevo
 * objeto motocicleta
 */
public class Motocicleta extends Vehiculo {
	
	/**
	 * Atributo que almacena la cinlindrada de la motocicleta
	 */
	private int cilindrada = 0;
	
	/**
	 * Atributo que almacena si la motocicleta requiere carnet
	 */
	private boolean requiereCarnet = false;
	
	/**
	 * Constructor que inicializa los atributos de la clase Motocicleta y los 
	 * de la clase Vehiculo comprobando si sus valores son validos antes de 
	 * asignarlos
	 * 
	 * @param marca Marca de la motocicleta
	 * @param modelo Modelo de la motocicleta
	 * @param color Color de la motocicleta
	 * @param matricula Matricula de la motocicleta
	 * @param cilindrada Cilindrada de la motocicleta
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		
		if(cilindrada > 0) {
			this.cilindrada = cilindrada;
			this.requiereCarnet = requiereCarnet();
		}
	}
	
	/**
	 * Funcion que devuelve la cinlindrada de la motocicleta
	 * 
	 * @return Devuelve la cilindrada de la motocicleta
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	
	/**
	 * Funcion que devuelve true si la motocicleta requiere carnet o false
	 * si no es necesario
	 * 
	 * @return Devuelve true si se necesita carnet o false si no
	 */
	public boolean isRequiereCarnet() {
		return requiereCarnet;
	}

	/**
	 * Funcion que devuelve true si la motocicleta requiere carnet o false
	 * si no requiere carnet
	 * 
	 * @return Devuelve true si requiere carnet o false si no requiere carnet
	 */
	public boolean requiereCarnet() {
		boolean carnet = true;
		
		if(this.cilindrada < 50) {
			carnet = false;
		}
		
		return carnet;
	}
	
	/**
	 * Funcion que devuelve la informacion de la motocicleta
	 * 
	 * @return Devuelve la informacion de la motocicleta
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.cilindrada + " cc - " + (this.requiereCarnet ? "Se necesita carnet" : "No se necesita carnet");
	}
}