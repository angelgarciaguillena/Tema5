package boletin5.ejercicio3;

/**
 * Clase Articulo destinada a crear un nuevo objeto articulo
 * 
 * @author Angel
 */
public class Articulo {
	
	/*Inicializamos los atributos de la clase Articulo*/
	private String nombre = "Articulo";
	private double precio = 0;
	public static final int IVA = 21;
	private int cuantosQuedan = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase Articulo y comprueba
	 * que los valores sean validos para almacenarlos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param cuantosQuedan Numero que indica cuantos articulos quedan en el almacen
	 * @throws ExcepcionNombreVacio 
	 * @throws ExcepcionPrecioNegativo 
	 * @throws ExcepcionStockNegativo 
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) throws ExcepcionNombreVacio, ExcepcionPrecioNegativo, ExcepcionStockNegativo{
		
		if(nombre != null && !nombre.isEmpty() && nombre.length() < 20) {
			this.nombre = nombre;
		} else {
			throw new ExcepcionNombreVacio();
		}
		
		if(precio >= 0) {
			this.precio = precio;
		} else {
			throw new ExcepcionPrecioNegativo();
		}
		
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new ExcepcionStockNegativo();
		}
	}
	
	/**
	 * Mostramos el nombre del articulo
	 * 
	 * @return Devuelve el nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificamos el nombre del articulo y comprobamos si es valido
	 * 
	 * @param nombre Nombre del articulo
	 * @throws ExcepcionNombreVacio 
	 */
	public void setNombre(String nombre) throws ExcepcionNombreVacio {
		if(nombre != null && !nombre.isEmpty() && nombre.length() < 20) {
			this.nombre = nombre;
		} else {
			throw new ExcepcionNombreVacio();
		}
	}
	
	/**
	 * Mostramos el precio del articulo
	 * 
	 * @return Devuelve el precio del articulo
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Modificamos el precio del articulo y comprobamos si es valido
	 * 
	 * @param precio Precio del articulo
	 * @throws ExcepcionPrecioNegativo 
	 */
	public void setPrecio(double precio) throws ExcepcionPrecioNegativo {
		if(precio >= 0) {
			this.precio = precio;
		} else {
			throw new ExcepcionPrecioNegativo();
		}
	}
	
	/**
	 * Mostramos el stock del articulo
	 * 
	 * @return Devuelve el stock del articulo
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	/**
	 * Modificamos el stock del articulo y comprobamos si es valido
	 * 
	 * @param cuantosQuedan Stock del articulo
	 * @throws ExcepcionStockNegativo 
	 */
	public void setCuantosQuedan(int cuantosQuedan) throws ExcepcionStockNegativo {
		if(cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new ExcepcionStockNegativo();
		}
	}
	
	/**
	 * Calclamos el precio total del producto y lo devolvemos
	 * 
	 * @return Devuelve el PVP
	 */
	public double getPVP() {
		double pvp;
		pvp = 0;
		pvp = precio + ((precio * IVA) / 100);
		return pvp;
	}
	
	/**
	 * Calcula el precio del producto con un descuento y lo devuelve
	 * 
	 * @param descuento Descuento del producto
	 * @return Devuelve el precio del producto con el descuento
	 */
	public double getPVPDescuento(int descuento) {
		double pvpDescuento;
		pvpDescuento = 0;
		pvpDescuento = precio + ((precio * IVA) / 100) - ((precio * descuento) / 100);
		return pvpDescuento;
	}
	
	/**
	 * Actualiza el valor del stock segun los que haya comprado el usuario si es valido y
	 * devolvemos true si se ha realizado o false si no se ha realizado
	 * 
	 * @param comprados Productos comprados por el usuario
	 */
	public boolean vende(int comprados) {
		boolean esValido = false;
		if(cuantosQuedan - comprados >= 0) {
			this.cuantosQuedan = cuantosQuedan - comprados;
			esValido = true;
		}
		return esValido;
	}
	
	/**
	 * Actualizamos el stock disponible segun el numero de unidades que dice el usuario que hay disponible si es valido
	 * 
	 * @param cantidad Numero de unidades que hay de un producto
	 */
	public void almacenar(int cantidad) {
		if(cuantosQuedan - cantidad >= 0) {
			this.cuantosQuedan = cuantosQuedan - cantidad;
		}
	}
	
	/**
	 * Devolvemos la informacion del producto
	 * 
	 * @return Devuelve la cadena con la informacion
	 */
	public String toString() {
		String cadena;
		cadena = nombre + " - Precio: " + precio + "€ - IVA: " + Articulo.IVA + "% - Stock: " + cuantosQuedan + " unidades";
		return cadena;
	}
}