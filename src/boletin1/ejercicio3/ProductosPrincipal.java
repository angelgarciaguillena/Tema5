package boletin1.ejercicio3;

public class ProductosPrincipal {
	public static void main(String[] args) {
		
		/*Creamos un nuevo producto no perecedero*/
		NoPerecedero noPerecedero = new NoPerecedero("Arroz", 2.7, "Cereales");
		
		/*Creamos un nuevop producto perecedero*/
		Perecedero perecedero = new Perecedero("Carne", 7, 3);
		
		/*Mostramos los calculos*/
		System.out.println(noPerecedero.calcular(2));
		System.out.println(perecedero.calcular(2));
		
		/*Cambiamos los valores*/
		noPerecedero.setPrecio(3);
		perecedero.setPrecio(4.6);
		
		/*Mostramos los productos*/
		System.out.println(noPerecedero.toString());
		System.out.println(perecedero.toString());
		
		/*Mostramos los calculos*/
		System.out.println(noPerecedero.calcular(2));
		System.out.println(perecedero.calcular(1));
	}
}