package examen;

import java.util.Objects;

public class MandoADistancia implements Comparable<MandoADistancia>{
	
	/**
	 * Atributo que almacena el modelo del mando
	 */
	private String modelo = "No especificado";
	
	/**
	 * Atributo que almacena la anchura del mando
	 */
	private double anchura = 0.1;
	
	/**
	 * Atributo que almacena la altura
	 */
	private double altura = 0.1;
	
	/*
	 * Atributo que almacena el precio del mando
	 */
	private double precio = 0;
	
	/**
	 * Atributo que almacena si el mando esta encendido o no
	 */
	private boolean encendido = false;
	
	/**
	 * Constructor que inicializa los atributos de la clase MandoADistancia comprobando
	 * si los valores son validos antes de asignarlos
	 * 
	 * @param modelo Modelo del mando
	 * @param anchura Anchura del mando
	 * @param altura Altura del mando
	 * @param precio Precio del mando
	 * @param encendido Encendido del mando
	 */
	public MandoADistancia(String modelo, double anchura, double altura, double precio, boolean encendido) {
		
		if(modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		
		if(anchura > 0) {
			this.anchura = anchura;
		}
		
		if(altura > 0) {
			this.altura = altura;
		}
		
		if(precio >= 0) {
			this.precio = precio;
		}
		
		this.encendido = encendido;
	}
	
	/**
	 * Funcion que devuelve el precio del mando
	 * 
	 * @return Devuelve el precio del mando
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Funcion que modifica el precio del mando si el valor es valido
	 * 
	 * @param precio Precio del mando
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * Funcion que devuelve el modelo del mando
	 * 
	 * @return Devuelve el modelo del mando
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Funcion que devuelve la anchura del mando
	 * 
	 * @return Devuelve la anchura del mando
	 */
	public double getAnchura() {
		return anchura;
	}
	
	/**
	 * Funcion que devuelve la altura del mando
	 * 
	 * @return Devuelve la altura del mando
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * Funcion que devuelve si el mando esta encendido o false si no
	 * 
	 * @return Devuelve true si el mando esta encendido o false si no
	 */
	public boolean isEncendido() {
		return encendido;
	}
	
	/**
	 * Funcion que comprueba si el mando esta encendido, si no lo esta lo enciende y devuelve true si se
	 * ha encendido o false si no se ha podido encender porque ya lo estaba
	 * 
	 * @return Devuelve true si se ha podido encender o false si no
	 */
	public boolean encender() {
		
		boolean realizado = false;
		
		if(!encendido) {
			this.encendido = true;
			realizado = true;
		}
		
		return realizado;
	}
	
	/**
	 * Funcion que comprueba si el mando esta encendido, si no lo esta lo enciende y devuelve true si se
	 * ha encendido o false si no se ha podido encender porque ya lo estaba
	 * 
	 * @return Devuelve true si se ha podido encender o false si no
	 */
	public boolean apagar() {
		
		boolean realizado = false;
		
		if(encendido) {
			this.encendido = false;
			realizado = true;
		}
		
		return realizado;
	}
	
	
	/**
	 * Funcion hashCode que devuelve el valor hash segun el modelo
	 * 
	 *  @return Devuelve el valor hash calculado a partir del modelo
	 */
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}
	
	/**
	 * Funcion que compara si dos mandos son iguales segun el modelo y si lo son
	 * devuelve true si no lo son devuelve false
	 * 
	 * @return Devuelve true si los mandos son iguales o false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		MandoADistancia mando2 = (MandoADistancia) obj;
		return this.modelo.equalsIgnoreCase(mando2.modelo);
	}
	
	/**
	 * Funcion que devuelve la informacion del mando
	 * 
	 * @return Devuelve la informacion del mando
	 */
	@Override
	public String toString() {
		String encendido;
		encendido = this.encendido ? "El mando esta encendido" : "El mando esta apagado";
		return "Modelo: " + this.modelo + " - Anchura: " + this.anchura + "m - Altura: " + this.altura + "m - Precio: " + this.precio + "€ - Encendido: " + encendido;
	}

	/**
	 * Funcion que calcula y devuelve la posicion de los mandos segun su orden alfabetico del modelo
	 * 
	 * @return Devuelve la posicion del mando segun el orden alfabetico del modelo
	 */
	@Override
	public int compareTo(MandoADistancia o) {
		return this.modelo.compareTo(o.modelo);
	}
}