package boletin1.ejercicio1;

public class HoraPrincipal {
	public static void main(String[] args) {
		
		/*Creamos un nuevo objeto*/
		HoraExacta hora = new HoraExacta (1,2,3);
		
		/*Mostramos la hora*/
		System.out.println(hora.toString());
		
		/*Incrementamos la hora*/
		hora.inc();
		
		/*Mostramos la hora*/
		System.out.println(hora.toString());
		
		/*Cambiamos la hora*/
		System.out.println(hora.setHora(23));
		
		/*Cambiamos los minutos*/
		System.out.println(hora.setMinuto(59));
		
		/*Cambiamos los segundos*/
		System.out.println(hora.setSegundo(59));
		
		/*Incrementamos la hora*/
		hora.inc();
		
		/*Mostramos la hora*/
		System.out.println(hora.toString());
		
		/*Incrementamos la hora*/
		hora.inc();
		
		/*Mostramos la hora*/
		System.out.println(hora.toString());
	}
}
