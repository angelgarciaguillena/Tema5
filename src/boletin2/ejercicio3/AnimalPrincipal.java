package boletin2.ejercicio3;

public class AnimalPrincipal {
	public static void main(String[] args) {
		
		/*Creamos a los animales domesticos*/
		Gato gato = new Gato("Gato", "Persa", 13.5, "Naranja");
		Perro perro = new Perro("Perro", "Pastor Aleman", 20.2, "Negro");
		
		/*LLamamos a las funciones del gato*/
		System.out.println("Gato");
		gato.comer();
		gato.dormir();
		gato.vacunar();
		gato.toserBolaPelo();
		System.out.println(gato.hacerCaso() ? "El gato ha hecho caso" : "El gato no ha hecho caso");
		gato.hacerRuido();
		
		/*LLamamos a las funciones del perro*/
		System.out.println( "\n" + "Perro");
		perro.comer();
		perro.dormir();
		perro.vacunar();
		perro.sacarPaseo();
		System.out.println(perro.hacerCaso() ? "El perro ha hecho caso" : "El perro no ha hecho caso");
		perro.hacerRuido();
	}
}	