package boletin2.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico{
	
	/**
	 * Constructor que inicializa los atributos de la clase Gato 
	 * heredados de la clase AnimalDomestico comprobando si sus 
	 * valores son validos antes de asignarlos
	 * 
	 * @param nombre Nombre del gato
	 * @param raza Raza del gato
	 * @param peso Peso del gato
	 * @param color Color del gato
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	/**
	 * Metodo encargado de indicar que el gato ha expulsado la
	 * bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println("El gato ha expulsado la bola de pelo");
	}
	
	/**
	 * Metodo hacerRuido que se encarga de que el gato
	 * emita el sonido de maullido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}
	
	/**
	 * Método hacerCaso que se encarga de que el gato haga
     * caso el 5% de las veces y devuelve true si hace caso 
     * o false si no lo hace.
     * 
     * @return Devuelve true si hace caso o false si no lo hace
	 */
	@Override
	public boolean hacerCaso() {
		Random rand = new Random();
		return rand.nextInt(0, 101) <= 5;
	}
}