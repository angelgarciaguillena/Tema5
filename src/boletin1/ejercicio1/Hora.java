package boletin1.ejercicio1;

public class Hora {
	
	/*Inicializamos los atributos de la clase Hora*/
	private int hora;
	private int minuto;
	
	public Hora(int hora, int minuto) {
		
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
		
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}
	
	public void inc() {
		
		if(minuto == 59) {
			minuto = 0;
			hora += 1;
		} else {
			minuto += 1;
		}
		
		if(hora >= 23) {
			hora = 0;
		}
	}
	
	public boolean setHora(int hora) {
		boolean valido = false;
		
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
			valido = true;
		}
		
		return valido;
	}

	

	public boolean setMinuto(int minuto) {
		boolean valido = false;
		
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			valido = true;
		}
		
		return valido;
	}
	
	@Override
	public String toString() {
		String horas = "";
		String minutos = "";
		
		if(hora < 10) {
			horas = "0" + hora;
		}
		
		if(minuto < 10) {
			minutos = "0" + minuto;
		}
		
		
		return horas + ":" + minutos;
	}

	
}
