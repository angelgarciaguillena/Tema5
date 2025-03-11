package boletin1.ejercicio1;

public class HoraExacta extends Hora {
	
	/**
	 * Segundos de la hora
	 */
	private int segundo = 0;
	
	/**
	 * Constructor que inicializa los atributos de la clase HoraExacta y comprueba 
	 * si los valores son correctos para asignarselos a los atributos
	 * 
	 * @param hora Horas de la hora
	 * @param minuto Minutos de la hora
	 * @param segundo Segundos de la hora
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}
	
	/**
	 * Funcion para modificar los segundos de la hora
	 * 
	 * @param segundo Segundos a modificar
	 * @return Devuelve true si se ha realizado el cambio o false si no se ha podido hacer
	 */
	public boolean setSegundo(int segundo) {
		boolean valido = false;
		
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
			valido = true;
		}
		
		return valido;
	}
	
	/*
	 * Funcion para incrementar 1 segundo la hora
	 */
	public void inc() {	
		
		if(this.segundo == 59) {
			this.segundo = 0;
		} else {
			this.segundo++;
		}
		
		super.inc();
	}
	
	/**
	 * Funcion para mostrar la hora
	 * 
	 * @return Devuelve la hora
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		if(this.segundo < 10) {
			cadena = super.toString() + ":0" + segundo;
		} else {
			cadena = super.toString() + ":" + segundo;
		}
		
		return cadena;
	}
}
