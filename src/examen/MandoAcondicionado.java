package examen;

public class MandoAcondicionado extends MandoADistancia implements Velocidad{
	
	enum Modo{
		FRIO, CALOR
	}
	
	private Modo modo = Modo.FRIO;
	
	private int temperatura = 0;
	
	private int velocidad;
	
	public MandoAcondicionado(String modelo, double anchura, double altura, double precio, boolean encendido, String modo, int temperatura, int velocidad) {
		super(modelo, anchura, altura, precio, encendido);
		
		this.temperatura = temperatura;
		
		if(velocidad >= 0 && velocidad <= 5) {
			this.velocidad = velocidad;
		}
		
		switch(modo) {
		case "FRIO","CALOR" ->{
			this.modo = Modo.valueOf(modo);
		}
		}
	}
	
	public Modo getModo() {
		return modo;
	}

	public void setModo(String modo) {
		switch(modo) {
		case "FRIO","CALOR" ->{
			this.modo = Modo.valueOf(modo);
		}
		}
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public boolean subirVelocidad() {
		boolean valido = false;
		
		if((this.velocidad + 1) <= 5) {
			this.velocidad += 1;
			valido = true;
		}
		
		return valido;
	}

	@Override
	public boolean bajarVelocidad() {
		boolean valido = false;
		
		if((this.velocidad - 1) >= 0) {
			this.velocidad -= 1;
			valido = true;
		}
		
		return valido;
	}

	@Override
	public String toString() {
		return super.toString() + " - Temperatura: " + this.temperatura + " ºC - Velocidad: " + this.velocidad + " - Modo: " + this.modo;
	}	
}