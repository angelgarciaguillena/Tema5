package boletin1.ejercicio4;

public class Electrodomestico {
	
	/**
	 * Precio del electrodometico
	 */
	private double precioBase = 100;
	
	/**
	 * Color del electrodomestico
	 */
	private Colores color = Colores.BLANCO;
	
	/**
	 * Consumo energetico del electrodomestico
	 */
	private ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	
	/**
	 * Peso del electrodomestico
	 */
	private double peso = 5;
	
	/**
	 * Enumerado de posibilidades de consumo energetico
	 */
	enum ConsumoEnergetico{
		A,B,C,D,F
	}
	
	/**
	 * Enumerado de posibilidades de colores
	 */
	enum Colores{
		BLANCO,NEGRO,ROJO,AZUL,GRIS
	}
	
	public Electrodomestico(double precio, double peso) {
		
	}
}
