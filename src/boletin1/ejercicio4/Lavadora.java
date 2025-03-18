package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico{
	
	/**
	 * Atributo carga de la clase lavadora
	 */
	private int carga = 5;
	
	/**
	 * Constructor que inicializa los atributos heredaros de la clase Electrodomestico
	 * comprobando si los valores son validos antes de asignarlos
	 * 
	 * @param precio Precio de la lavadora
	 * @param peso Peso de la lavadora
	 */
	public Lavadora(double precio, int peso) {
		super(precio, peso);
	}
	
	/**
	 * Constructor que se encarga de inicializar los atributos de la clase lavadora
	 * y los de la clase Electrodomestico y comprueba los valores antes de asignarlos
	 * 
	 * @param precio Precio de la lavadora
	 * @param color Color de la lavadora
	 * @param consumo Consumo de la lavadora
	 * @param peso Peso de la lavadora
	 * @param carga Carga de la lavadora
	 */
	public Lavadora(double precio, String color, String consumo, int peso, int carga) {
		super(precio, color, consumo, peso);
		
		if(carga > 0) {
			this.carga = carga;
		}
	}
	
	/**
	 * Funcion que devuelve la carga maxima de la lavadora
	 * 
	 * @return Devuelve la carga maxima de la lavadora
	 */
	public int getCarga() {
		return carga;
	}
	
	/**
	 * Funcion que actualiza el precio final si la carga de la lavadora
	 * es mayor a 30 kg
	 */
	@Override
	public void precioFinal() {
		
		super.precioFinal();
		
		if(this.carga > 30) {
			setPrecioBase(getPrecioBase() + 50);
		}
	}
}