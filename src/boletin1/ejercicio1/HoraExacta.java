package boletin1.ejercicio1;

public class HoraExacta extends Hora {
	
	private int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	public boolean setSegundo(int segundo) {
		boolean valido = false;
		
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
			valido = true;
		}
		
		return valido;
	}
	
	public void inc() {	
		
		if(this.segundo == 59) {
			this.segundo = 0;
		} else {
			this.segundo++;
		}
		
		super.inc();
	}
	
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
