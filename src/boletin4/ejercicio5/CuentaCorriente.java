package boletin4.ejercicio5;

import java.util.TreeSet;

/**
 * Clase que se encarga de crear un nuevo objeto CuentaCorriente y 
 * de representar sus funciones basicas
 * 
 * @author Angel
 */
public class CuentaCorriente extends CuentaBancaria {
	
	/**
	 * Atributo que almacena el porcentaje de la transaccion
	 */
	private double porcentajeTransaccion;
	
	/**
	 * Atributo que almacena el numero de transacciones
	 */
	private int numeroTransacciones = 0;
	
	/**
	 * Atributo que almacena las transacciones
	 */
	private TreeSet<Transaccion> transacciones;
	
	/**
	 * Constrcutor que inicializa los atributos de la clase CuentaCorriente comprobando que los valores
	 * son validos antes de asignarlos
	 * 
	 * @param numeroCuenta Numero de cuenta 
	 * @param saldo Saldo de la cuenta
	 * @param titular Titular de la cuenta
	 * @param porcentajeTransaccion Porcentaje de la transaccion
	 */
	public CuentaCorriente(int numeroCuenta, Titular titular, double porcentajeTransaccion){
		super(numeroCuenta, titular);
		
		if(porcentajeTransaccion > 0) {
			this.porcentajeTransaccion = porcentajeTransaccion;
		}
	}
	
	/**
	 * Funcion que devuelve el porcentaje de la transaccion
	 * 
	 * @return Devuelve el porcentaje de la transaccion
	 */
	public double getPorcentajeTransaccion() {
		return porcentajeTransaccion;
	}
	
	/**
	 * Funcion que modifica el porcentaje de la transaccion si su valor
	 * es valido
	 * 
	 * @param porcentajeTransaccion Nuevo porcentaje de la transaccion
	 */
	public void setPorcentajeTransaccion(double porcentajeTransaccion) {
		this.porcentajeTransaccion = porcentajeTransaccion;
	}
	
	/**
	 * Funcion que devuelve el numero de transacciones
	 * 
	 * @return Devuelve el numero de transacciones
	 */
	public int getNumeroTransacciones() {
		return numeroTransacciones;
	}
	
	/**
	 * Funcion que devuelve las transacciones
	 * 
	 * @return Devuelve las transacciones
	 */
	public TreeSet<Transaccion> getTransacciones() {
		return transacciones;
	}
	
	/**
	 * Funcion que añade una transaccion a la lista y devuelve true si se ha añadido o 
	 * false si no se ha añadido
	 * 
	 * @param transaccion Transaccion que se va a realizar
	 * @return Devuelve true si se ha añadido la transaccion o false si no se ha añadido
	 */
	public boolean añadirTransaccion(Transaccion transaccion) {
		return transacciones.add(transaccion);
	}
	
	/**
	 * Funcion que devuelve la informacion de la cuenta corriente
	 * 
	 * @return Devuelve la informacion de la cuenta corriente
	 */
	@Override
	public String toString() {
		return super.toString() + "Porcentaje de transaccion: " + porcentajeTransaccion + " - Numero de transacciones: " + numeroTransacciones + " - Transacciones=" + transacciones;
	}
}