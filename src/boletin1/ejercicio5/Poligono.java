package boletin1.ejercicio5;

/**
 * Clase abstracta Poligono que se encargada de crear distintos poligonos con 
 * sus correspondientes atributos y funciones
 * 
 * @author Angel
 */
public abstract class Poligono {
	
	/**
	 * Atributo que almacena el numero de lados del poligono
	 */
	private int numeroLados = 3;
	
	/**
	 * Constructor que inicializa el atributo de la clase Poligono comprobando si su valor
	 * es valido antes de asignarlo al atributo
	 * 
	 * @param numeroLados Numero de lados del poligono
	 */
	public Poligono(int numeroLados) {
		if(numeroLados >= 3) {
			this.numeroLados = numeroLados;
		}
	}
	
	/**
	 * Funcion que devuelve el numero de lados del poligono
	 * 
	 * @return Devuelve el numero de lados del poligono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}
	
	/**
	 *Funcion encargada de devolver la informacion del poligono
	 *
	 *@return Devuelve la informacion del poligono
	 */
	@Override
	public String toString() {
		return "Poligono: " + numeroLados + " lados";
	}
	
	/**
	 * Funcionn que obliga a las clases hijas a tener una funcion 
	 * que calcule y devuelva el area del poligono
	 * 
	 * @return Devuelve el area del poligono
	 */
	public abstract double area();	
}