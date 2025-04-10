package examen;

public class MandoTelevision extends MandoADistancia implements Volumen{
	
	private int volumen = 0;
	
	private int canal = 0;
	
	public MandoTelevision(String modelo, double anchura, double altura, double precio, boolean encendido, int volumen, int canal) {
		super(modelo, anchura, altura, precio, encendido);
		
		if(volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}
		
		if(canal > 0) {
			this.canal = canal;
		}
	}
	
	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if(canal > 0) {
			this.canal = canal;
		}
	}

	@Override
	public boolean subirVolumen() {
		
		boolean valido = false;
		
		if((this.volumen + 5) <= 100) {
			this.volumen += 5;
			valido = true;
		}
		
		return valido;
	}

	@Override
	public boolean bajarVolumen() {
		
		boolean valido = false;
		
		if((this.volumen - 5) >= 0) {
			this.volumen -= 5;
			valido = true;
		}
		
		return valido;
	}

	@Override
	public String toString() {
		return super.toString() + " - Volumen: " + this.volumen + " - Canal: " + this.canal;
	}
	
	
	
	
}
