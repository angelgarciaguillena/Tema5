package examen;

public class MandoMiniCadena extends MandoADistancia implements Volumen{
	
	private int volumen;
	
	public MandoMiniCadena(String modelo, double anchura, double altura, double precio, boolean encendido, int volumen) {
		super(modelo, anchura, altura, precio, encendido);
		
		if(volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}
	}
	
	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean subirVolumen() {

		boolean valido = false;
		
		if((this.volumen + 10) <= 100) {
			this.volumen += 10;
			valido = true;
		}
		
		return valido;
	}

	@Override
	public boolean bajarVolumen() {
		
		boolean valido = false;
		
		if((this.volumen - 10) >= 0) {
			this.volumen -= 10;
			valido = true;
		}
		
		return valido;	
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Volumen: " + this.volumen;
	}
}