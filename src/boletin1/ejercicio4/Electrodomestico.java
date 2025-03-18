package boletin1.ejercicio4;

public class Electrodomestico {
	
	/**
	 * Precio del electrodometico
	 */
	private double precioBase = 100;
	
	/**
	 * Color del electrodomestico
	 */
	private Color color = Color.BLANCO;
	
	/**
	 * Consumo energetico del electrodomestico
	 */
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	
	/**
	 * Peso del electrodomestico
	 */
	private int peso = 5;
	
	/**
	 * Enumerado de posibilidades de consumo energetico
	 */
	enum ConsumoEnergetico{
		A,B,C,D,E,F
	}
	
	/**
	 * Enumerado de posibilidades de colores
	 */
	enum Color{
		BLANCO,NEGRO,ROJO,AZUL,GRIS
	}
	
	/**
	 * Constructor que inicializa los atributos precio y peso y comprueba
	 * si los valores son validos para asignarlos
	 * 
	 * @param precio Precio del electrodomestico
	 * @param peso Peso del electrodomestico
	 */
	public Electrodomestico(double precio, int peso) {
		
		if(precio > 0) {
			this.precioBase = precio;
		}
		
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	/**
	 * Constructor que inicializa los atributos de la clase Electrodomestico y
	 * comprueba si los valores son validos antes de asignarlos
	 * 
	 * @param precio Precio del electrodomestico
	 * @param color Color del electrodomestico
	 * @param consumo Consumo del electrodomestico
	 * @param peso Peso del electrodomestico
	 */
	public Electrodomestico(double precio, String color, String consumo, int peso) {
		
		if(precio > 0) {
			this.precioBase = precio;
		}
		
		if(peso > 0) {
			this.peso = peso;
		}
		
		compruebaColor(color);
		
		compruebaConsumoEnergetico(consumo);
	}
	
	/**
	 * Funcion que devuekve el precio del electrodomestico
	 * 
	 * @return Devuelve precio del electrodomestico
	 */
	public double getPrecioBase() {
		return precioBase;
	}
	
	/**
	 * Funcion que cambia el precio del electrodomestico
	 * 
	 * @param precioBase Precio del electrodomestico
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	/**
	 * Funcion que develve el color del electrodomestico
	 * 
	 * @return Devuelve el color del electrodomestico
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Funcion que devuelve el consumo del electrodomestico
	 * 
	 * @return Devuelve el consumo del electrodomestico
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	/**
	 * Funcion que devuelve el peso del electrodomestico
	 * 
	 * @return Devuelve el peso del electrodomestico
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Funcion que comprueba si el valor del color es valido y
	 * si lo es actualiza el valor
	 * 
	 * @param color Color del electrodomestico
	 */
	private void compruebaColor(String color) {
		if(color != null) {
			switch(color) {
			case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" ->{
				this.color = Color.valueOf(color);
			}
			default ->{
				this.color = Color.BLANCO;
			}
			}
		}
	}
	
	/**
	 * Funcion que comprueba si el valor del consumo es valido y
	 * si lo es actualiza el valor
	 * 
	 * @param consumo Consumo del electrodomestico
	 */
	private void compruebaConsumoEnergetico(String consumo) {
		if(consumo != null) {
			switch(consumo) {
			case "A", "B", "C", "D", "F" ->{
				this.consumoEnergetico = ConsumoEnergetico.valueOf(consumo);
			}
			default ->{
				this.consumoEnergetico = ConsumoEnergetico.F;
			}
			}
		}
	}
	
	/**
	 * Funcion que calcula el precio final del articulo sumandole al precio base
	 * segun el consumo y el peso
	 */
	public void precioFinal() {
		switch(this.consumoEnergetico) {
		case A ->{
			this.precioBase += 100;
		}
		case B ->{
			this.precioBase += 80;
		}
		case C ->{
			this.precioBase += 60;
		}
		case D ->{
			this.precioBase += 50;
		}
		case E ->{
			this.precioBase += 30;
		}
		case F ->{
			this.precioBase += 10;
		}
		}
		
		if(this.peso >= 0 && this.peso < 20) {
			this.precioBase += 10;
		} else if(this.peso >= 20 && this.peso < 50) {
			this.precioBase += 50;
		} else if(this.peso >= 50 && this.peso < 80) {
			this.precioBase += 80;
		} else if(this.peso >= 80) {
			this.precioBase += 100;
		}
	}
}
