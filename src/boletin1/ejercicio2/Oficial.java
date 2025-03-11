package boletin1.ejercicio2;

public class Oficial extends Operario {
	
	/**
	 * Constructor que asigna el valor del atributo de la clase Operario
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Oficial(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo para mostrar la informacion del empleado
	 * 
	 * @return Informacion del empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}