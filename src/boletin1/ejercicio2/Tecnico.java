package boletin1.ejercicio2;

public class Tecnico extends Operario {
	
	/**
	 * Constructor que asigna el valor del atributo de la clase Operario
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo para mostrar la informacion del empleado
	 * 
	 * @return Informacion del empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
}