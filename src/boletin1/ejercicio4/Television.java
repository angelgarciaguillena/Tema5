package boletin1.ejercicio4;

public class Television extends Electrodomestico {
	
	/**
	 * Pulgadas del televisor
	 */
	private int pulgadas = 20;
	
	/**
	 * Sintonizador del televisor
	 */
	private boolean sintonizadorTDT = false;
	
	/**
	 * Constructor que inicializa los atributos precio y peso provenientes de la
	 * clase padre y comprueba si los valores son validos
	 * 
	 * @param precio Precio de la television
	 * @param peso Peso de la television
	 */
	public Television(double precio, int peso) {
		super(precio, peso);
	}
	
	/**
	 * Constructor que se encarga de inicializar los atributos de la clase Television
	 * y los de la clase Electrodomestico y comprueba los valores antes de asignarlos
	 * 
	 * @param precio Precio de la lavadora
	 * @param color Color de la lavadora
	 * @param consumo Consumo de la lavadora
	 * @param peso Peso de la lavadora
	 * @param pulgadas Pulgadas del televisor
	 * @param sintonizador Sintonizador del televisor
	 */
	public Television(double precio, String color, String consumo, int peso, int pulgadas, boolean sintonizador) {
		super(precio, color, consumo, peso);
		
		if(pulgadas > 0) {
			this.pulgadas = pulgadas;
		}
		
		this.sintonizadorTDT = sintonizador;
	}
	
	/**
	 * Funcion que devuelve las pulgadas del televisor
	 * 
	 * @return Devuelve las pulgadas del televisor
	 */
	public int getPulgadas() {
		return pulgadas;
	}
	
	/**
	 * Funcion que devuelve si el televisor puede sintonizar con la TDT o no
	 * 
	 * @return Devuelve true si se puede sintonizar con TDT o false si no
	 * se puede sintonizar
	 */
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * Funcion que actualiza el precio final dependiendo de las pulgadas y la sintonizacion
	 * del televisor
	 */
	@Override
	public void precioFinal() {
		
		super.precioFinal();
		
		if(pulgadas > 40) {
			setPrecioBase(getPrecioBase() + (getPrecioBase() * 0.3));
		}
		
		if(sintonizadorTDT) {
			setPrecioBase(getPrecioBase() + 50);
		}
	}
}