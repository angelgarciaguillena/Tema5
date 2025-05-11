package boletin5.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorrienteCRUD {
	
	/**
	 * Creamos una lista para almacenar las cuentas
	 */
	private static Set<CuentaCorriente> cuentas = new HashSet<CuentaCorriente>();
	
	/**
	 * Funcion para mostrar las cuentas existentes
	 */
	public static void mostrarCuentaCorriente() {
		for(CuentaCorriente cuenta : cuentas) {
			System.out.println(cuenta);
		}
	}
	
	/**
	 * Funcion para añadir una nueva cuenta al conjunto
	 * 
	 * @param cuenta Cuenta a añadir
	 * @return Devuelve true si se ha añadido o false si no se ha podido añadir
	 */
	public static boolean añadirCuenta(CuentaCorriente cuenta) {
		return cuentas.add(cuenta);
	}
	
	/**
	 * Funcion para eliminar una cuenta del conjunto
	 * 
	 * @param cuenta Cuenta a eliminar
	 * @return Devuelve true si se ha realizado o false si no se ha podido eliminar
	 */
	public static boolean eliminarCuenta(CuentaCorriente cuenta) {
		return cuentas.remove(cuenta);
	}
	
	/**
	 * Funcion que modifica la cuenta bancaria
	 * 
	 * @param dni Dni de la persona
	 * @param nombre Nombre de la persona
	 * @param nacionalidad Nacionalidad de la persona
	 * @return Devuelve true si se ha modificado o false si no se ha podido realizar
	 */
	public static boolean modificarCuenta(String dni, String nombre, String nacionalidad) {
		boolean modificado = false;
		
		CuentaCorriente cuenta = buscarCuenta(dni, nombre);
		
		if(cuenta != null) {
			cuenta.setNacionalidad(nacionalidad);
			modificado = true;
		}
		
		return modificado;
	}
	
	/**
	 * Funcion para añadir saldo a la cuenta
	 * 
	 * @param dni Dni de la persona
	 * @param nombre Nombre de la persona
	 * @param cambio Aumento del saldo de la cuenta
	 * @return Devuelve true si se ha realizado o false si no se ha podido incrementar-
	 */
	public static boolean añadirSaldo(String dni, String nombre, double cambio) {
		
		boolean modificado = false;
		
		CuentaCorriente cuenta = buscarCuenta(dni, nombre);
		
		if(cuenta != null && (cuenta.getSaldo() + cambio) > cuenta.getSaldo()) {
			cuenta.setSaldo(cuenta.getSaldo() + cambio);
			modificado = true;
		}
		
		return modificado;
	}
	
	/**
	 * Funcion para reducir el saldo de la cuenta
	 * 
	 * @param dni Dni de la persona
	 * @param nombre Nombre de la persona
	 * @param cambio Reduccion del saldo de la cuenta
	 * @return Devuelve true si se ha realizado la reduccion y false si no se ha podido realizar
	 */
	public static boolean eliminarSaldo(String dni, String nombre, double cambio) {
		
		boolean modificado = false;
		
		CuentaCorriente cuenta = buscarCuenta(dni, nombre);
		
		if(cuenta != null && (cuenta.getSaldo() - cambio) >= 0) {
			cuenta.setSaldo(cuenta.getSaldo() - cambio);
			modificado = true;
		}
		
		return modificado;
	}
	
	/**
	 * Funcion que busca una cuenta en el conjunto
	 * 
	 * @param dni Dni de la persona
	 * @param nombre Nombre de la persona
	 * @return Devuelve la cuenta con sus valores si ha sido encontrada y sino devuelve la cuenta con valor null
	 */
	private static CuentaCorriente buscarCuenta(String dni, String nombre) {
		CuentaCorriente cuenta = null;
		
		for(CuentaCorriente cuentasB : cuentas) {
			if(cuentasB.getDni().equalsIgnoreCase(dni) && cuentasB.getNombre().equalsIgnoreCase(nombre)) {
				cuenta = cuentasB;
			}
		}
		
		return cuenta;
	}
}