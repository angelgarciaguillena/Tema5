package boletin1.ejercicio2;

public class Empleado {
	
	/**
	 * Nombre del empleado
	 */
	private String nombre = "";
	
	/**
	 * Constructor que comprueba el valor y si es correcto lo asigna al atributo
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Empleado(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Funcion encargada de devolver el nombre del empleado
	 * 
	 * @return Devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Funcion encargada de modificar el nombre del empleado
	 * 
	 * @param nombre Nombre del empleado que queremos establecer
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Funcion para mostrar la informacion del empleado
	 */
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
}