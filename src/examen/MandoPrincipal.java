package examen;

import java.util.Arrays;

public class MandoPrincipal {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los mandos*/
		MandoADistancia lista[] = new MandoADistancia[4];
		
		/*Creamos los mandos*/
		MandoADistancia m1 = new MandoTelevision("AZ", 21, 7, 50, true, 50, 20);
		MandoADistancia m2 = new MandoMiniCadena("AC", 21, 7, 20, false, 20);
		MandoADistancia m3 = new MandoAcondicionado("AF", 15, 6, 50, true, "FRIO", 16, 1);
		MandoADistancia m4 = new MandoAspiradora("AA", 15, 6, 50, true, 1);
		
		/*Añadimos los mandos*/
		lista[0] = m1;
		lista[1] = m2;
		lista[2] = m3;
		lista[3] = m4;
		
		/*Ordenamos los mandos*/
		Arrays.sort(lista);
		
		//Recorremos la tabla
		for(MandoADistancia ej : lista) {
			/*Mando de television*/
			if (ej instanceof MandoTelevision) {
				System.out.println(ej);
				((MandoTelevision) ej).subirVolumen();
				((MandoTelevision) ej).bajarVolumen();
				System.out.println(ej);
			}
			/*Mando de minicadena*/
			if (ej instanceof MandoMiniCadena) {
				System.out.println(ej);
				((MandoMiniCadena) ej).subirVolumen();
				((MandoMiniCadena) ej).bajarVolumen();
				System.out.println(ej);
			}
			/*Mando de aspiradora*/
			if (ej instanceof MandoAspiradora) {
				System.out.println(ej);
				((MandoAspiradora) ej).subirVelocidad();
				((MandoAspiradora) ej).bajarVelocidad();
				System.out.println(ej);
			}
			/*Mando de aire acondicionado*/
			if (ej instanceof MandoAcondicionado) {
				System.out.println(ej);
				((MandoAcondicionado) ej).setModo("CALOR");
				((MandoAcondicionado) ej).setTemperatura(23);
				((MandoAcondicionado) ej).subirVelocidad();
				((MandoAcondicionado) ej).bajarVelocidad();
				System.out.println(ej);
				
			}
		}
	}
}