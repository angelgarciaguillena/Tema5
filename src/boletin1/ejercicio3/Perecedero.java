package boletin1.ejercicio3;

public class Perecedero extends Productos{
	
	/**
	 * Dias de caducidad del producto
	 */
	private int diasACaducar = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase y comprueba si los valores son validos para
	 * asignarlos a los atributos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param diasACaducar Dias que quedan para que caduque el producto
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		
		if(diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}
	
	/**
	 * Funcion que devuelve los dias que quedan para que caduque el producto
	 * 
	 * @return Devuelve los dias que falta para que el producto caduque
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}
	
	/**
	 * Funcion que modifican los dias que falta para que caduque el producto
	 * 
	 * @param diasACaducar Dias que faltan para que caduque el producto
	 */
	public void setDiasACaducar(int diasACaducar) {
		if(diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
		}
	}
	
	/**
	 * Funcion para mostrar la informacion del producto
	 * 
	 * @return Devuelve la informacion del producto
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + diasACaducar;
	}
	
	/**
	 * Funcion para calcular el total de la compra
	 * 
	 * @param cantidad Cantidad de productos que se va a comprar
	 * @return Devuelve el total de la compra
	 */
	public double calcular(int cantidad) {
		double total;
		
		total = super.calcular(cantidad);
		
		if(diasACaducar == 1) {
			total /= 4;
		} else if(diasACaducar == 2) {
			total /= 3;
		} else if(diasACaducar == 3) {
			total /= 2;
		}
		
		return total;
	}
}