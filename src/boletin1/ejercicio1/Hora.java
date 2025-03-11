package boletin1.ejercicio1;

public class Hora {
	
	/**
	 * Horas de la hora 
	 */
	private int hora = 0;
	
	/**
	 * Minutos de la hora
	 */
	private int minuto = 0;
	
	/**
	 * Construcro que coumprueba si los valores de los atributos son correctos y si es
	 * asi les asigna los valores
	 * 
	 * @param hora Horas
	 * @param minuto Minutos
	 */
	public Hora(int hora, int minuto) {
		
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
		
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
	}
	
	/**
	 * Funcion para incrementar 1 minuto la hora
	 */
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
	
	/**
	 * Funcion para modificar las horas
	 * 
	 * @param hora Horas a la que queremos modificar
	 * @return Devuelve true si se ha realizado o false si no se ha podido realizar
	 */
	public boolean setHora(int hora) {
		boolean valido = false;
		
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
			valido = true;
		}
		
		return valido;
	}
	
	/**
	 * Funcion para modificar los minutos
	 * 
	 * @param minuto Minutos al que queremos modificar
	 * @return Devuelve true si es valida la operacion o false si no lo es
	 */
	public boolean setMinuto(int minuto) {
		boolean valido = false;
		
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			valido = true;
		}
		
		return valido;
	}
	
	
	/**
	 * Funcion para mostrar la hora
	 * 
	 * @return Devuelve la hora
	 */
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
