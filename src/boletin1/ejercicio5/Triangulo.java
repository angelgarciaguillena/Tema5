package boletin1.ejercicio5;

/**
 * Clase Triangulo que guarda los treslados del triangulo
 * para calcular su area
 * 
 * @author Angel
 */
public class Triangulo extends Poligono {
	
	/**
	 * Atributo que almacena el lado 1 del triangulo
	 */
	private double lado1 = 1;
	
	/**
	 * Atributo que almacena el lado 2 del triangulo
	 */
	private double lado2 = 1;
	
	/**
	 * Atributo que almacena el lado 3 del triangulo
	 */
	private double lado3 = 1;
	
	/**
	 * Constructor de la clase Triangulo que guarda el numero de
	 * lados del rectangulo
	 */
	public Triangulo() {
		super(3);
	}
	
	/**
	 * Constructor que inicializa los atributos de la clase Triangulo comprobamdo
	 * sis sus valores son validos antes de asignarlos
	 * 
	 * @param lado1 Lado 1 del triangulo
	 * @param lado2 Lado 2 del triangulo
	 * @param lado3 Lado 3 del triangulo
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		
		if(lado1 >= 1) {
			this.lado1 = lado1;
		}
		
		if(lado2 >= 1) {
			this.lado2 = lado2;
		}
		
		if(lado3 >= 1) {
			this.lado3 = lado3;
		}
	}
	
	/**
	 * Funcion que devuelve el lado 1 del triangulo
	 * 
	 * @return Devuelve el lado 1 del triangulo
	 */
	public double getLado1() {
		return lado1;
	}
	
	/**
	 * Funcion que modifica el valor del lado 1 del triangulo
	 * si el valor es valido
	 * 
	 * @param lado1 Lado 1 del triangulo
	 */
	public void setLado1(double lado1) {
		if(lado1 >= 1) {
			this.lado1 = lado1;
		}
	}
	
	/**
	 * Funcion que devuelve el lado 2 del triangulo
	 * 
	 * @return Devuelve el lado 2 del triangulo
	 */
	public double getLado2() {
		return lado2;
	}
	
	/**
	 * Funcion que modifica el valor del lado 2 del triangulo
	 * si el valor es valido
	 * 
	 * @param lado2 Lado 2 del triangulo
	 */
	public void setLado2(double lado2) {
		if(lado2 >= 1) {
			this.lado2 = lado2;
		}
	}
	
	/**
	 * Funcion que devuelve el lado 3 del triangulo
	 * 
	 * @return Devuelve el lado 3 del triangulo
	 */
	public double getLado3() {
		return lado3;
	}
	
	/**
	 * Funcion que modifica el valor del lado 3 del triangulo
	 * si el valor es valido
	 * 
	 * @param lado3 Lado 3 del triangulo
	 */
	public void setLado3(double lado3) {
		if(lado3 >= 1) {
			this.lado3 = lado3;
		}
	}
	
	/**
	 * Metodo toString que devuelve la informacion del triangulo
	 * 
	 * @return Devuelve la informacion del triangulo
	 */
	@Override
	public String toString() {
		return "Triangulo: Lado 1 = " + lado1 + "m - Lado 2 = " + lado2 + "m - Lado 3 = " + lado3 + "m";
	}
	
	/**
	 * Funcion que calcula y devuelve el area del triangulo
	 * 
	 * @return Devuelve el area del triangulo
	 */
	public double area() {
		
		double semiPerimetro;
		
		semiPerimetro = (lado1 + lado2 + lado3) / 2;
		
		return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
	}
}