package boletin4.ejercicio5;

import java.util.Comparator;

/**
 * Clase que se encarga de devolver el orden de las cuentas bancarias
 * 
 * @author Angel
 */
public class ComparadoraSaldo implements Comparator<CuentaBancaria> {
	
	/**
	 * Funcion que devuelve la posicion correspondiente de la cuenta bancaria segun
	 * su saldo
	 * 
	 * @return Devuelve la posicion de la cuenta bancaria
	 */
	@Override
	public int compare(CuentaBancaria c1, CuentaBancaria c2) {
		return (int) (c2.getSaldo() - c1.getSaldo());
	}
}