package boletin5.ejercicio1;

/**
 * Clase hora destinada a crear una nueva hora
 * 
 * @author Angel
 */
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
	 * Segundos de la hora
	 */
	private int segundo = 0;
	
	/**
	 * Construcro que coumprueba si los valores de los atributos son correctos y si es
	 * asi les asigna los valores
	 * 
	 * @param hora Horas
	 * @param minuto Minutos
	 * @param segundo Segundos
	 * @throws NegativeSecondException 
	 * @throws NegativeMinuteException 
	 * @throws NegativeHourException 
	 */
	public Hora(int hora, int minuto, int segundo) throws NegativeSecondException, NegativeMinuteException, NegativeHourException {
		
		if(segundo >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
		
		if(minuto >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
		
		if(hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
	}
	
	/**
	 * Funcion que devuelve las horas
	 * 
	 * @return Devuelve las horas
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Funcion que modifica las horas si el valor es valido
	 * 
	 * @param hora Horas
	 * @throws NegativeHourException 
	 */
	public void setHora(int hora) throws NegativeHourException {
		if(hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
	}

	/**
	 * Funcion que devuelve los minutos
	 * 
	 * @return Devuelve los minutos
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * Funcion que modifica los minutos si el valor es valido
	 * 
	 * @param minuto Minuto
	 * @throws NegativeMinuteException 
	 */
	public void setMinuto(int minuto) throws NegativeMinuteException {
		if(minuto >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
	}
	
	/**
	 * Funcion que devuelve los segundos
	 * 
	 * @return Devuelve los segundos
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * Funcion que modifica los segundos si el valor es valido
	 * 
	 * @param segundo Segundos
	 * @throws NegativeSecondException 
	 */
	public void setSegundo(int segundo) throws NegativeSecondException {
		if(segundo >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
	}

	/**
	 * Funcion para incrementar 1 segundo la hora
	 */
	public void inc() {
		
		if(segundo == 59) {
			segundo = 0;
		} else {
			segundo++;
		}
		
		if(minuto == 59) {
			minuto = 0;
			hora += 1;
		} 
		
		if(hora >= 23) {
			hora = 0;
		}
	}	
	
	/**
	 * Funcion para mostrar la hora
	 * 
	 * @return Devuelve la hora
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		if(hora < 10) {
			cadena += "0" + hora + ":";
		} else {
			cadena += hora + ":";
		}
		
		if(minuto < 10) {
			cadena += "0" + minuto + ":";
		} else {
			cadena += minuto + ":";
		}
		
		if(segundo < 10) {
			cadena += "0" + segundo;
		} else {
			cadena += segundo;
		}
		
		return cadena;
	}
}
