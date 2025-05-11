package boletin5.ejercicio2;

import java.util.Scanner;

public class CuentaCorrientePrincipal {
	
	/*Creamos el Scanner*/
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la opcion del usuario*/
		int opcion;
		
		/*Creamos una variable para almacenar el dni*/
		String dni;
		
		/*Creamos una variable para almacenar el nombre*/
		String nombre;
		
		/*Creamos una variable para almacenar la nacionalidad*/
		String nacionalidad;
		
		/*Creamos una variable para almacenar el cambio de la cuenta*/
		double cambio;
		
		/*Creamos una variable que almacenara si los datos son validos o no*/
		boolean valido = false;
		
		/*Creamos un nuevo objeto cuenta*/
		CuentaCorriente cuenta = null;
		
		/*Creamos un bucle do while para que mientras la eleccion sea diferente a 7 seguir
		 * repitiendo*/
		do {
			
			/*Mostramos el menu llamando a la funcion*/
			menu();

			/*Pedimos al usuario que introduzca una opcion*/
			System.out.println("\n" + "Introduce una opcion");

			/*Leemos la eleccion del usuario*/
			opcion = sc.nextInt();
			sc.nextLine();
			
			/*Creamos un switch para que depende de la eleccion que introduzca el usuario
			 * realizar una funcion u otra*/
			switch (opcion) {

			/*Si la opcion es 1 mostramos las cuentas llamando a la funcion*/
			case 1 -> {
				System.out.println("Lista de cuentas:");
				CuentaCorrienteCRUD.mostrarCuentaCorriente();
			}

			/*Si la opcion es 2 añadimos una cuenta*/
			case 2 -> {
				
				/*Creamos una cuenta llamando a la funcion*/
				cuenta = crearCuenta();
				
				/*Mostramos al usuario si la cuenta se ha añadido o no*/
				if(CuentaCorrienteCRUD.añadirCuenta(cuenta)) {
					System.out.println("La cuenta se ha añadido correctamente");
				} else {
					System.out.println("La cuenta no se ha añadido");
				}
			}

			/*Si la opcion es 3 eliminamos una cuenta*/
			case 3 -> {
								
				/*Creamos un bucle do while para que siga pidiendo los datos en caso de que se produzca un error*/
				do {
					/*Creamos un try catch para notificar al usuario en caso de error*/
					try {
						
						/*Pedimos el dni al usuario llamando a la funcion*/
						dni = pedirDNI();
						
						/*Pedimos el nombre al usuario llamando a la funcion*/
						nombre = pedirNombre();
						
						/*Creamos una cuenta corriente con el dni*/
						cuenta = new CuentaCorriente(dni, nombre);
						valido = true;
						
					} catch (ExcepcionNombreVacio | ExcepcionDniVacio e) {
						System.out.println(e.getMessage());
					}
				} while(!valido);
				
				/*Reiniciamos la variable*/
				valido = false;
				
				/*Mostramos al usuario si el usuario se ha eliminado o no*/
				if(CuentaCorrienteCRUD.eliminarCuenta(cuenta)) {
					System.out.println("Se ha eliminado la cuenta");
				} else {
					System.out.println("No se ha podido eliminar la cuenta");
				}
			}
			
			/*Si la opcion es 4 modificamos la cuenta*/
			case 4 ->{
				
				/*Pedimos al usuario el dni llamando a la funcion*/
				dni = pedirDNI();
				
				/*Pedimos el nombre al usuario llamando a la funcion*/
				nombre = pedirNombre();
				
				/*Pedimos al usuario que introduzca la nacionalidad*/
				System.out.println("Introduce la nacionalidad");
				
				/*Leemos la nacionalidad del usuario*/
				nacionalidad = sc.nextLine();
				
				/*Mostramos al usuario si se ha modificado o no la nacionalidad de la cuenta*/
				if(CuentaCorrienteCRUD.modificarCuenta(dni, nombre, nacionalidad)) {
					System.out.println("Se ha modificado la cuenta");
				} else {
					System.out.println("No se ha podido modificar la cuenta");
				}
			}
			
			/*Si la opcion es 5 añadimos saldo a la cuenta*/
			case 5 ->{
				
				/*Pedimos al usuario el dni llamando a la funcion*/
				dni = pedirDNI();
				
				/*Pedimos el nombre al usuario llamando a la funcion*/
				nombre = pedirNombre();
				
				/*Pedimos al usuario que introduzca el aumento del saldo*/
				System.out.println("Introduce el saldo que quieres añadir a la cuenta");
				
				/*Leemos el cambio en la cuenta introducido por el usuario*/
				cambio = sc.nextDouble();
				sc.nextLine();
				
				/*Mostramos al usuario si se ha realizado el aumento o no*/
				if(CuentaCorrienteCRUD.añadirSaldo(dni, nombre, cambio)) {
					System.out.println("Se ha añadido el saldo a la cuenta");
				} else {
					System.out.println("No se ha podido añadir el saldo");
				}
			}
			
			/*Si la opcion es 6 sacamos saldo de la cuenta*/
			case 6 ->{
				
				/*Pedimos al usuario el dni llamando a la funcion*/
				dni = pedirDNI();
				
				/*Pedimos el nombre al usuario llamando a la funcion*/
				nombre = pedirNombre();
				
				/*Pedimos al usuario que introduzca el aumento del saldo*/
				System.out.println("Introduce el saldo que quieres sacar de la cuenta");
				
				/*Leemos el cambio en la cuenta introducido por el usuario*/
				cambio = sc.nextDouble();
				sc.nextLine();
				
				/*Mostramos al usuario si se ha podido sacar el dinero o no*/
				if(CuentaCorrienteCRUD.eliminarSaldo(dni, nombre, cambio)) {
					System.out.println("Se ha sacado el dinero de la cuenta");
				} else {
					System.out.println("No se ha podido sacar el dinero");
				}
			}

			/*Si la opcion es 7 informamos al usuario de que ha salido del programa*/
			case 7 -> {
				System.out.println("Has salido del programa");
			}
			
			/*Si la opcion no es valida se lo informamos al usuario*/
			default -> {
				System.out.println("Opcion no valida");
			}
			}
		} while (opcion != 7);

		/*Cerramos el Scanner*/
		sc.close();
	}
	
	public static void menu() {
		/*Mostramos el menu al usuario*/
		System.out.println("\n" + "Menu:");
		System.out.println("1. Listado");
		System.out.println("2. Nueva cuenta corrriente");
		System.out.println("3. Borrar cuenta corriente");
		System.out.println("4. Modificar cuenta corriente");
		System.out.println("5. Añadir saldo");
		System.out.println("6. Sacar saldo");
		System.out.println("7. Salir");		
	}
	
	private static String pedirDNI() {
		
		/*Creamos una funcion para almacenar el dni*/
		String dni;
		
		/*Pedimos al usuario que introduzca el dni*/
		System.out.println("Introduce el dni");
		
		/*Leemos el dni del usuario*/
		dni = sc.nextLine();
		
		/*Devolvemos el dni del usuario*/
		return dni;
	}
	
	private static String pedirNombre() {
		
		/*Creamos una variable para almacenar el nombre*/
		String nombre;
		
		/*Pedimos al usuario que introduzca el nombre*/
		System.out.println("Introduce el nombre");
		
		/*Leemos el nombre del usuario*/
		nombre = sc.nextLine();
		
		/*Devolvemos el nombre*/
		return nombre;
	}
	
	private static CuentaCorriente crearCuenta() {
		
		/*Creamos una variable para almacenar el dni*/
		String dni;
		
		/*Creamos una variable para almacenar el nombre*/
		String nombre;
		
		/*Creamos una variable para almacenar el saldo*/
		double saldo;
		
		/*Creamos una variable para almacenar la nacionalidad*/
		String nacionalidad;
		
		/*Creamos una variable que almacenara si los datos son validos o no*/
		boolean valido = false;
		
		/*Creamos un nuevo objeto cuenta*/
		CuentaCorriente cuenta = null;
		
		/*Creamos un bucle do while para que siga pidiendo los datos en caso de que se produzca un error*/
		do {
			/*Creamos un try catch para notificar al usuario en caso de error*/
			try {
				
				/*Pedimos al usuario que introduzca el dni*/
				System.out.println("Introduce el dni");
				
				/*Leemos el dni del usuario*/
				dni = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el nombre*/
				System.out.println("Introduce el nombre");
				
				/*Leemos el nombre del usuario*/
				nombre = sc.nextLine();
				
				/*Pedimos al usuario que introduzca el saldo*/
				System.out.println("Introduce el saldo");
				
				/*Leemos el saldo del usuario*/
				saldo = sc.nextDouble();
				sc.nextLine();
				
				/*Pedimos al usuario que introduzca la nacionalidad*/
				System.out.println("Introduce la nacionalidad");
				
				/*Leemos la nacionalidad del usuario*/
				nacionalidad = sc.nextLine();
				
				/*Añadimos las caracteristicas a la cuenta*/
				cuenta = new CuentaCorriente(dni, nombre, saldo, nacionalidad);
				valido = true;
				
			} catch (ExcepcionDniVacio | ExcepcionNombreVacio | ExcepcionSaldoNegativo e) {
				System.out.println(e.getMessage());
			}
		} while(!valido);
		/*Devolvemos la cuenta*/
		return cuenta;
	}
}