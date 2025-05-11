package boletin4.ejercicio5;

/**
 * Clase encargada de crear un nuevo objeto CuentaAhorro y de 
 * representar sus funciones basicas
 * 
 * @author Angel
 */
public class CuentaAhorro extends CuentaBancaria{
	
	/**
	 * Atributo que almacena la cuota de mantenimiento
	 */
	private double cuotaMantenimiento;
	
	/**
	 * Atributo que almacena el interes anual de la cuenta
	 */
	private double interesAnual;
	
	/**
	 * Constructor que inicializa los atributos de la clase CuentaAhorro comprobando
	 * que los valores son validos antes de asignarlos
	 * 
	 * @param numeroCuenta Numero de la cuenta
	 * @param saldo Saldo de la cuenta
	 * @param titular Titular de la cuenta
	 * @param cuotaMantenimiento Cuota de mantenimiento de la cuenta
	 * @param interesAnual Interes anual de la cuenta
	 */
	public CuentaAhorro(int numeroCuenta, Titular titular, double cuotaMantenimiento, double interesAnual) {
		super(numeroCuenta, titular);
		
		if(cuotaMantenimiento > 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		}
		
		if(interesAnual > 0) {
			this.interesAnual = interesAnual;
		}
	}
	
	/**
	 * Funcion que devuelve la cuota de mantenimiento de la cuenta
	 * 
	 * @return Devuelve la cuota de mantenimiento de la cuenta
	 */
	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}
	
	/**
	 * Funcion que modifica la cuota de mantenimiento de la cuenta
	 * si el valor es valido
	 * 
	 * @param cuotaMantenimiento Nueva cuota de mantenimiento de la cuenta
	 */
	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		if(cuotaMantenimiento > 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		}
	}
	
	/**
	 * Funcion que devuelve el interes anual de la cuenta
	 * 
	 * @return Devuelve el interes anual de la cuenta
	 */
	public double getInteresAnual() {
		return interesAnual;
	}
	
	/**
	 * Funcion que modifica el interes anual de la cuenta
	 * si el valor es valido
	 * 
	 * @param interesAnual Nuevo interes anual de la cuenta
	 */
	public void setInteresAnual(double interesAnual) {
		if(interesAnual > 0) {
			this.interesAnual = interesAnual;
		}
	}

	/**
	 * Funcion que resta la cuota de mantenimiento al saldo de la cuenta y devuelve el saldo actual
	 * 
	 * @return Devuelve el saldo actual
	 */
	public double restarMantenimiento() {
		double saldo = this.getSaldo();
		return saldo - saldo * this.cuotaMantenimiento / 100;
	}
	
	/**
	 * Funcion que resta el interes al saldo de la cuenta y devuelve el saldo actual
	 * 
	 * @return Devuelve el saldo actual
	 */
	public double restarInteres() {
		double saldo = this.getSaldo();
		return saldo - saldo * this.interesAnual / 100;
	}
	
	/**
	 * Funcion que devuelve la informacion de la cuenta de ahorro
	 * 
	 * @return Devuelve la informacion de la cuenta de ahorro
	 */
	@Override
	public String toString() {
		return super.toString() + "Cuota de mantenimiento: " + cuotaMantenimiento + " - Interes anual: " + interesAnual;
	}	
}