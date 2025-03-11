package boletin1.ejercicio2;

public class EmpleadoPrincipal {
	public static void main(String[] args) {
		
		/*Creamos al empleado*/
		Empleado E1 = new Empleado("Rafa");
		
		/*Creamos al directivo*/
		Directivo D1 = new Directivo("Mario");
		
		/*Creamos al operario*/
		Operario OP1 = new Operario("Alfonso");
		
		/*Creamos al oficial*/
		Oficial OF1 = new Oficial("Luis");
		
		/*Creamos al tecnico*/
		Tecnico T1 = new Tecnico("Pablo");
		
		/*Mostramos al empleado*/
		System.out.println(E1);
		
		/*Mostramos al directivo*/
		System.out.println(D1);
		
		/*Mostramos al operario*/
		System.out.println(OP1);
		
		/*Mostramos al oficial*/
		System.out.println(OF1);
		
		/*Mostramos al tecnico*/
		System.out.println(T1);
	}
}