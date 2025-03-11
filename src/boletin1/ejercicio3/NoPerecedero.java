package boletin1.ejercicio3;

public class NoPerecedero extends Productos{
	
	/**
	 * Tipo de producto
	 */
	private String tipo = "";
	
	/**
	 * Cponstructor que inicializa los atributos de la claase y comprueba si los valores
	 * son correctos para asignarselos a los atributos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param tipo Tipo del producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		
		if(tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * Funcion para devolver el tipo de producto
	 * 
	 * @return Devuelve el tipo del producto
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * Funcion para modificar el tipo del producto
	 * 
	 * @param tipo Tipo de producto
	 */
	public void setTipo(String tipo) {
		if(tipo != null && !tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * Funcion para mostrar la informacion del producto
	 * 
	 * @return Devuelve la informacion del producto
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + tipo;
	}
	
	/**
	 * Funcion para calcular el precio total de la compra
	 * 
	 * @param cantidad Cantidad de productos
	 * @return Devuelve el precio multiplicado por la cantidad de productos
	 */
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}
}