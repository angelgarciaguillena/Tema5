package boletin1.ejercicio5;

/**
 * Clase Rectangulo que guarda dos de los lados del rectangulo 
 * para calcular su area
 * 
 * @author Angel
 */
public class Rectangulo extends Poligono{
	
	/**
	 * Atributo que almacena el lado 1 del rectangulo
	 */
	private double lado1 = 1;
	
	/**
	 * Atributo que almacena el lado 2 del rectangulo
	 */
	private double lado2 = 1;
	
	/**
	 * Constructor de la clase Rectangulo que guarda el numero de
	 * lados del rectangulo
	 */
	public Rectangulo() {
		super(4);
	}
	
	/**
	 * Constructor que inicializa los atributos de la clase Rectangulo comprobando si los
	 * valores son validos antes de asignarlos
	 * 
	 * @param lado1 Lado 1 del rectangulo
	 * @param lado2 Lado 2 del rectangulo
	 */
	public Rectangulo(double lado1, double lado2) {
		super(4);
		
		if(lado1 >= 1) {
			this.lado1 = lado1;
		}
		
		if(lado2 >= 1) {
			this.lado2 = lado2;
		}
	}
	
	/**
	 * Funcion que devuelve el lado 1 del rectangulo
	 * 
	 * @return Devuelve el lado 1 del rectangulo
	 */
	public double getLado1() {
		return lado1;
	}
	
	/**
	 * Funcion que modifica el valor del lado 1 del rectangulo
	 * si el valor es valido
	 * 
	 * @param lado1 Lado 1 del rectangulo
	 */
	public void setLado1(double lado1) {
		if(lado1 >= 1) {
			this.lado1 = lado1;
		}
	}
	
	/**
	 * Funcion que devuelve el lado 2 del rectangulo
	 * 
	 * @return Devuelve el lado 2 del rectangulo
	 */
	public double getLado2() {
		return lado2;
	}
	
	/**
	 * Funcion que modifica el valor del lado 2 del rectangulo
	 * si el valor es valido
	 * 
	 * @param lado2 Lado 2 del rectangulo
	 */
	public void setLado2(double lado2) {
		if(lado2 >= 1) {
			this.lado2 = lado2;
		}
	}
	
	/**
	 * Funcion que devuelve la informacion del rectangulo
	 */
	@Override
	public String toString() {
		return "Rectangulo: Lado 1 = " + lado1 + "m - Lado 2 = " + lado2 + "m";
	}
	
	/**
	 * Funcion que calcula y devuelve el area del rectangulo
	 * 
	 * @return Devuelve el area del rectangulo
	 */
	@Override
	public double area() {
		return lado1 * lado2;
	}
}
