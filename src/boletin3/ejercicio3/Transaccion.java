package boletin3.ejercicio3;

/**
 * Clase encargada de crear un nuevo objeto transaccion
 * 
 * @author Angel
 */
public class Transaccion {

	/**
	 * Atributo que almacena el dia de la transaccion
	 */
	private int dia;
	
	/**
	 * Atributo que almacena el mes de la transaccion
	 */
	private int mes;
	
	/**
	 * Atributo que almacena el año de la transaccion
	 */
	private int año;
	
	/**
	 * Atributo que almacena el concepto de la transaccion 
	 */
	private String concepto;
	
	/**
	 * Atributo que almacena el importe de la transaccion
	 */
	private double importe;
	
	/**
	 * Constructor que inicializa los atributos de la clase Transaccion comprobando que 
	 * los valores son validos antes de asignarlos
	 * 
	 * @param dia Dia de la transaccion
	 * @param mes Mes de la transaccion
	 * @param año Año de la transaccion
	 * @param concepto Concepto de la transaccion
	 * @param importe Importe de la transaccion
	 */
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {

		if (dia > 0 && dia < 32) {
			this.dia = dia;
		}

		if (mes > 0 && mes < 13) {
			this.mes = mes;
		}

		if (año > 0) {
			this.año = año;
		}

		if (concepto != null && !concepto.isBlank()) {
			this.concepto = concepto;
		}

		if (importe > 0) {
			this.importe = importe;
		}
	}
	
	/**
	 * Funcion que devuelve el dia de la transaccion
	 * 
	 * @return Devuelve el dia de la transaccion
	 */
	public int getDia() {
		return dia;
	}
	
	/**
	 * Funcion que devuelve el mes de la transaccion
	 * 
	 * @return Devuelve el mes de la transaccion
	 */
	public int getMes() {
		return mes;
	}
	
	/**
	 * Funcion que devuelve el año de la transaccion
	 * 
	 * @return Devuelve el año de la transaccion
	 */
	public int getAño() {
		return año;
	}
	
	/**
	 * Funcion que devuelve el concepto de la transaccion
	 * 
	 * @return Devuelve el concepto de la transaccion
	 */
	public String getConcepto() {
		return concepto;
	}
	
	/**
	 * Funcion que devuelve el importe de la transaccion
	 * 
	 * @return Devuelve el importe de la transaccion
	 */
	public double getImporte() {
		return importe;
	}
	
	/**
	 * Funcion que devuelve la informacion de la transaccion
	 * 
	 * @return Devuelve la informacion de la transaccion
	 */
	@Override
	public String toString() {
		return "Fecha transaccion: " + dia + "-" + mes + "-" + año + ", Concepto: " + concepto + ", Importe: " + importe + "€";
	}
}