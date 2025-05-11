package boletin5.ejercicio2;

import java.util.Objects;

public class CuentaCorriente {
	
	/*DNI de la persona*/
	private String dni = "No insertado";
	
	/*Nombre de la persona*/
	private String nombre = "No insertado";
	
	/*Saldo de la persona*/
	private double saldo = 0;
	
	/*Nacionalidad de las personas*/
	private Nacionalidad nacionalidad = Nacionalidad.ESPAÑOLA;
	
	/*Nacionalidades posibles de las personas*/
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}
	
	/**
	 * Constructor que inicializa los atributos nombre y dni de la clase CuentaCorriente
	 * y comprueba si los valores son validos
	 * 
	 * @param dni Dni de la cuenta
	 * @param nombre Nombre de la cuenta
	 * @throws ExcepcionNombreVacio 
	 * @throws ExcepcionDniVacio 
	 */
	public CuentaCorriente(String dni, String nombre) throws ExcepcionNombreVacio, ExcepcionDniVacio {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		} else {
			throw new ExcepcionDniVacio();
		}
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new ExcepcionNombreVacio();
		}
	}
	
	/**
	 * Constructor que inicializa los atributos dni y saldo de la clase CuentaCorriente
	 * si los valores son correctos
	 * 
	 * @param dni DNI de la persona
	 * @param saldo Saldo de la persona
	 * @throws ExcepcionDniVacio 
	 * @throws ExcepcionSaldoNegativo 
	 */
	public CuentaCorriente(String dni, double saldo) throws ExcepcionDniVacio, ExcepcionSaldoNegativo {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		} else {
			throw new ExcepcionDniVacio();
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new ExcepcionSaldoNegativo();
		}
	}
	
	/**
	 * Constructor que inicializa los atributos dni, nombre y saldo de la clase CuentaCorriente
	 * si los valores son correctos
	 * 
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param saldo Saldo de la persona
	 * @throws ExcepcionSaldoNegativo 
	 * @throws ExcepcionNombreVacio 
	 * @throws ExcepcionDniVacio 
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) throws ExcepcionSaldoNegativo, ExcepcionNombreVacio, ExcepcionDniVacio {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		} else {
			throw new ExcepcionDniVacio();
		}
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new ExcepcionNombreVacio();
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new ExcepcionSaldoNegativo();
		}
	}
	
	/**
	 * Constructor que inicializa los atributos dni, nombre, saldo y nacionalidad de la clase CuentaCorriente
	 * si los valores son correctos
	 * 
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona
	 * @param saldo Saldo de la persona
	 * @param nacionalidad Nacionalidad de la persona
	 * @throws ExcepcionDniVacio 
	 * @throws ExcepcionNombreVacio 
	 * @throws ExcepcionSaldoNegativo 
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) throws ExcepcionDniVacio, ExcepcionNombreVacio, ExcepcionSaldoNegativo {
		
		if(dni != null && dni.length() == 9) {
			this.dni = dni;
		} else {
			throw new ExcepcionDniVacio();
		}
		
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new ExcepcionNombreVacio();
		}
		
		if(saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new ExcepcionSaldoNegativo();
		}
		
		if(nacionalidad != null) {
			if(nacionalidad.equalsIgnoreCase("Extranjera")) {
				this.nacionalidad = Nacionalidad.EXTRANJERA;
			} else {
				this.nacionalidad = Nacionalidad.ESPAÑOLA;
			}
		}
	}
	
	/**
	 * Mostramos el DNI
	 * 
	 * @return Devuelve el DNI
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Mostramos el nombre
	 * 
	 * @return Devolvemos el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificamos el nombre y lo actualizamos si es valido
	 * 
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Muestra el saldo
	 * 
	 * @return Devuelve el saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Modificamos el saldo y lo actualizamos si es valido
	 * 
	 * @param saldo Saldo de la persona
	 */
	public void setSaldo(double saldo) {
		if(saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	/**
	 * Mostramos la nacionalidad
	 * 
	 * @return Devuelve la nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	
	/**
	 * Modificamos la nacionalidad y lo actualizamos si es valido
	 * 
	 * @param nacionalidad Nacionalidad de la persona
	 */
	public void setNacionalidad(String nacionalidad) {
		if(nacionalidad != null) {
			if(nacionalidad.equalsIgnoreCase("Extranjera")) {
				this.nacionalidad = Nacionalidad.EXTRANJERA;
			} else {
				this.nacionalidad = Nacionalidad.ESPAÑOLA;
			}
		}
	}
	
	/**
	 * Si el dinero que se quiere sacar es menos o igual al que existe
	 * en la cuenta devolvera que la operacion es valida y restara el dinero
	 * de la cuenta
	 * 
	 * @param dinero Dinero que quiere retirar
	 * @return Devuelve si la operacion es valida o no
	 */
	public boolean sacarDinero(double dinero) {
		
		boolean esValido = false;
		
		if((saldo - dinero) >= 0) {
			saldo = saldo - dinero;
			esValido = true;
		}
		
		return esValido;
	}
	
	/**
	 * Si el dinero que se quiere meter a la cuenta es valido se devolvera que la operacion es valida 
	 * 
	 * @param dinero Dinero que se quiere añadir
	 * @return Devuelve si la operacion es valida o no
	 */
	public boolean ingresarDinero(double dinero) {
		
		boolean valido = false;
				
		if((saldo + dinero) > saldo) {
			saldo += dinero;
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Devolvemos una cadena con la informacion de la cuenta
	 * 
	 * @return cadena Devuelve la cadena con la informacion de la cuenta
	 */
	@Override
	public String toString() {
		
		String cadena;
		
		cadena = "DNI del titular: " + dni + " - Nombre del titular de la cuenta: " + nombre + " - Saldo de la cuenta: " + saldo + " - Nacionalidad: " + nacionalidad;
		
		return cadena;
	}
	
	/**
	 * Metodo hash de la clase CuentaCorriente
	 * 
	 * @return Devuelve el objeto cuenta corriente
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
	}

	/**
	 * Devuelve si dos cuentas corrientes son iguales o no
	 * 
	 * @return Devuelve si son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		
		CuentaCorriente cuenta = (CuentaCorriente) obj;
		
		boolean iguales = false;
		
		if(this.nombre.equalsIgnoreCase(cuenta.nombre) && this.dni.equalsIgnoreCase(cuenta.dni)) {
			iguales = true;
		}
		
		return iguales;
	}
}