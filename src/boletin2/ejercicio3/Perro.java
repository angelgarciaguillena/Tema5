package boletin2.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico{
	
	/**
	 * Constructor que inicializa los atributos de la clase Perro 
	 * heredados de la clase AnimalDomestico comprobando si sus 
	 * valores son validos antes de asignarlos
	 * 
	 * @param nombre Nombre del perro
	 * @param raza Raza del perro
	 * @param peso Peso del perro
	 * @param color Color del perro
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	/**
	 * Metodo encargado de indicar que el perro ha salido de paseo
	 */
	public void sacarPaseo() {
		System.out.println("El perro sale de paseo");
	}
	
	/**
	 * Metodo hacerRuido que se encarga de que el perro
	 * emita el sonido de ladrido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau");	
	}
	
	/**
	 * Método hacerCaso que se encarga de que el perro haga
     * caso el 90% de las veces y devuelve true si hace caso 
     * o false si no lo hace.
     * 
     * @return Devuelve true si hace caso o false si no lo hace
	 */
	@Override
	public boolean hacerCaso() {
		Random rand = new Random();
		return rand.nextInt(0, 101) <= 90;
	}
}