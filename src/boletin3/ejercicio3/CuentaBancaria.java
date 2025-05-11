package boletin3.ejercicio3;

import java.util.TreeSet;

/**
 * Funcion encargada de crear un nuevo objeto cuenta bancaria y de
 * representar sus funciones basicas
 * 
 * @author Angel
 */
public class CuentaBancaria {
	
	/**
	 * Atributo que almacena el numero de cuenta
	 */
	private int numeroCuenta;
	
	/**
	 * Atributo que almacena el saldo de la cuenta
	 */
	private double saldo = 0;
	
	/**
	 * Atributo que almacena los titulares de la cuenta
	 */
	private TreeSet<Titular> titulares = new TreeSet<Titular>();
	
	/**
	 * Constructor que inicializa los atributos de la clase CuentaBancaria comprobando
	 * que los valores son correctos antes de asignarlos 
	 * 
	 * @param numeroCuenta Numero de cuenta
	 * @param saldo Saldo de la cuenta
	 * @param titular Titular de la cuenta
	 */
	public CuentaBancaria(int numeroCuenta, Titular titular) {
		
		if (numeroCuenta > 0) {
			this.numeroCuenta = numeroCuenta;
		}
		
		if (titular != null) {
			añadirTitular(titular);
		}
	}
	
	/**
	 * Funcion que devuelve el numero de la cuenta
	 * 
	 * @return Devuelve el numero de la cuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	/**
	 * Funcion que devuelve el saldo de la cuenta
	 * 
	 * @return Devuelve el saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Funcion que devuelve los titulares de la cuenta
	 * 
	 * @return Devuelve los titulares de la cuenta
	 */
	public TreeSet<Titular> getTitulares() {
		return titulares;
	}

	/**
	 * Funcion que ingresa una cantidad de dinero al saldo de la cuenta y
	 * devuelve true si se ha añadido o false si no 
	 * 
	 * @param cantidad Cantidad que se va a añadir a la cuenta
	 * @return Devuelve true si se ha realizado o false si no
	 */
	public boolean ingresar(double cantidad) {
		
		boolean realizado = false;
		
		if(this.saldo >= 0) {
			this.saldo += cantidad;
			realizado = true;
		} else {
			realizado = false;
		}
		
		return realizado;
	}
	
	/**
	 * Funcion que retira una cantidad de dinero del saldo de la cuenta y
	 * devuelve true si se ha retirado o false si no 
	 * 
	 * @param cantidad Cantidad que se va a retirar de la cuenta
	 * @return Devuelve true si se ha retirado o false si no
	 */
	public boolean retirar(double cantidad) {
		boolean realizado = false;
		
		if((this.saldo - cantidad) >= 0) {
			this.saldo -= cantidad;
			realizado = true;
		} else {
			realizado = false;
		}
		
		return realizado;
	}

	/**
	 * Funcion que añade un nuevo titular a la cuenta y devuelve true si se ha 
	 * añadido o false si no
	 * 
	 * @param titular Titular que se va a añadir
	 * @return Devuelve true si se ha añadido o false si no
	 */
	public boolean añadirTitular(Titular titular) {
		
		boolean realizado = false;
		
		if (this.titulares.size() < 3) {
			this.titulares.add(titular);
			realizado = true; 
		} else {
			realizado = false;
		}
		
		return realizado;
	}
	
	/**
	 * Funcion que elimina a un titular de la cuenta y devuelve true si se 
	 * ha eliminado o false si no
	 * 
	 * @param titular Titular de la cuenta que se va a eliminar
	 * @return Devuelve true si se ha eliminado o false si no
	 */
	public boolean eliminarTitular(Titular titular) {
		
		boolean realizado = false;
		
		if (this.titulares.size() > 1) {
			this.titulares.remove(titular);
			realizado = true;
		} else {
			realizado = false;
		}
		
		return realizado;
	}
	
	/**
	 * Funcion que devuelve la informacion de la cuenta bancaria
	 * 
	 * @return Devuelve la informacion de la cuenta bancaria
	 */
	@Override
	public String toString() {
		return "Numero de cuenta: " + numeroCuenta + " - Saldo: " + saldo + " - Titulares=" + titulares;
	}

	/**
	 * Funcion que calcula si dos objetos son iguales y devuelve true si lo son o false si no
	 * 
	 * @return Devuelve true si los objetos son iguales o false si no
	 */
	@Override
	public boolean equals(Object obj) {
		CuentaBancaria cuenta2 = (CuentaBancaria) obj;
		return this.numeroCuenta == cuenta2.numeroCuenta;
	}	
}