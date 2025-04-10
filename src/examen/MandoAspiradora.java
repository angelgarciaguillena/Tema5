package examen;

public class MandoAspiradora extends MandoADistancia implements Velocidad{

	private int velocidad = 0;
	
	public MandoAspiradora(String modelo, double anchura, double altura, double precio, boolean encendido, int velocidad) {
		super(modelo, anchura, altura, precio, encendido);
		
		if(velocidad >= 0 && velocidad <= 3) {
			this.velocidad = velocidad;
		}
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public boolean subirVelocidad() {
		boolean valido = false;
		
		if((this.velocidad + 1) <= 3) {
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
		return super.toString() + " -  - Velocidad: " + this.velocidad;
	}	
}