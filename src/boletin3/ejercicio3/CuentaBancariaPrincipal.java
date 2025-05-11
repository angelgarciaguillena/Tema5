package boletin3.ejercicio3;

public class CuentaBancariaPrincipal {
	public static void main(String[] args) {
		
		/*Creamos un titular*/
		Titular titular1 = new Titular("12345678A", "Pepe", "Martinez", 123456789);
		
		/*Creamos una cuenta bancaria*/
		CuentaCorriente cuenta1 = new CuentaCorriente(1234, titular1, 0.21);
		
		/*Mostramos la cuenta bancaria*/
		System.out.println(cuenta1);
	}
}