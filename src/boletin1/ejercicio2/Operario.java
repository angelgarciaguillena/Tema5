package boletin1.ejercicio2;

public class Operario extends Empleado{
	
	/**
	 * Constructor que inicializa el atributo con el valor de la clase padre
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Operario(String nombre) {
		super(nombre);
	}
	
	/**
	 * Funcion para mostrar la informacion del empleado
	 * 
	 * @return Informacion del empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}

}
