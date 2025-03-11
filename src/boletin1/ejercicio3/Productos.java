package boletin1.ejercicio3;

public class Productos {
	
	/**
	 * Nombre del producto
	 */
	private String nombre = "";
	
	/**
	 * Precio del producto
	 */
	private double precio = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Productos
	 *  comprueba los valores y los asigna si son correctos
	 *  
	 * @param nombre Nombre del prodcuto
	 * @param precio Precio del producto
	 */
	public Productos(String nombre, double precio) {
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if(precio >= 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * Funcion que devuelve el nombre del producto
	 * 
	 * @return Devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Funcion para modificar el nombre del producto
	 * 
	 * @param nombre Nombre del producto
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Funcion para mostrar el precio del producto
	 * 
	 * @return Devuelve el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Funcion para modificar el precio del producto
	 * 
	 * @param precio Precio del producto
	 */
	public void setPrecio(double precio) {
		if(precio >= 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * Funcion para mostrar la informacion del producto
	 * 
	 * @return Devuelve la informacion del producto
	 */
	@Override
	public String toString() {
		return nombre + " - " + precio;
	}
	
	/**
	 * Funcion para calcular el precio total de la compra
	 * 
	 * @param cantidad Cantidad de productos
	 * @return Devuelve el precio multiplicado por la cantidad de productos
	 */
	public double calcular(int cantidad) {
		return this.precio * cantidad;
	}
}