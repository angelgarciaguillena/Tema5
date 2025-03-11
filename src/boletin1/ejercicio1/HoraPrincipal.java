package boletin1.ejercicio1;

public class HoraPrincipal {
	public static void main(String[] args) {
		
		HoraExacta hora = new HoraExacta (1,2,3);
		
		System.out.println(hora.toString());

		hora.inc();

		System.out.println(hora.toString());

		System.out.println(hora.setHora(23));

		System.out.println(hora.setMinuto(59));

		System.out.println(hora.setSegundo(59));

		hora.inc();

		System.out.println(hora.toString());
		
		hora.inc();
		
		System.out.println(hora.toString());
		
	}
}
