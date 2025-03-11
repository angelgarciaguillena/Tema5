package boletin1.ejercicio2;

public class Directivo extends Empleado {
	
	/**
	 * Constructor que inicializa el nombre con el valor de la clase padre
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Directivo(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo para mostrar el cargo de operario
	 * 
	 * @return Informacion del empleado
	 */
	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
