package boletin3.ejercicio2;

public class FichaPrincipal {
	
	public static void main(String[] args) {
		
		/*Creamos varios objetos*/
		Libro libro = new Libro(1, "Libro", "Autor", "Editorial");
		Revista revista1 = new Revista(2, "Revista", 1, 1976);
		Revista revista2 = new Revista(2, "Revista2", 2, 2004);
		DVD DVD = new DVD(3, "DVD", "Director", 1867, "SERIE");
		
		/*Mostramos el libro*/
		System.out.println("Libro");
		System.out.println(libro.toString());
		System.out.println(libro.tiempoPrestamo() + " dias de prestamo");
		
		/*Mostramos la revista*/
		System.out.println("\n" + "Revista");
		System.out.println(revista1.toString());
		System.out.println(revista1.tiempoPrestamo() + " dias de prestamo");
		
		/*Mostramos el dvd*/
		System.out.println("\n" + "DVD");
		System.out.println(DVD.toString());
		System.out.println(DVD.tiempoPrestamo() + " dias de prestamo");
		
		/*Mostramos si las dos revistas son iguales*/
		System.out.println();
		System.out.println(revista1.equals(revista2));
	}
}