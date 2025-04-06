package boletin3.ejercicio1;

/**
 * Clase Turismo que hereda de Vehiculo destinada a crear un nuevo objeto turismo
 */
public class Turismo extends Vehiculo{
	
	/**
	 * Enumerado con los tipos de uso de un turismo
	 */
	enum TipoUso{
		PROFESIONAL, PARTICULAR;
	}
	
	/**
	 * Atributo que almacena el numero de plazas del turismo
	 */
	private int plazas = 1;
	
	/**
	 * Atributo que almacena el uso del turismo
	 */
	private TipoUso uso = TipoUso.PARTICULAR;
	
	/**
	 * Constructor que inicializa los atributos de la clase Turismo y de la 
	 * clase Vehiculo comprobando que los parametros son correctos antes de 
	 * asignarlos
	 * 
	 * @param marca Marca del turismo
	 * @param modelo Modelo del turismo
	 * @param color Color del turismo
	 * @param matricula Matricula del turismo
	 * @param plazas Plazas del turismo
	 * @param uso Uso del turismo
	 */
	public Turismo(String marca, String modelo, String color, String matricula, int plazas, String uso) {
		super(marca, modelo, color, matricula);
		
		if(plazas > 0 && plazas <= 5) {
			this.plazas = plazas;
		}
		
		comprobarUso(uso);
	}
	
	/**
	 * Funcion que devuelve las plazas del turismo
	 * 
	 * @return Devuelve las plazas del turismo
	 */
	public int getPlazas() {
		return plazas;
	}

	/**
	 * Funcion que devuelve el uso del turismo
	 * 
	 * @return Devuelve el uso del turismo
	 */
	public TipoUso getUso() {
		return uso;
	}

	/**
	 * Funcion que modifica el uso del turismo si su valor
	 * es corrector
	 * 
	 * @param uso Uso del turismo
	 */
	public void setUso(String uso) {
		comprobarUso(uso);
	}

	/**
	 * Funcion para comprobar el uso del vehiculo
	 * 
	 * @param uso Uso del vehiculo
	 */
	private void comprobarUso(String uso) {
		uso = uso.toUpperCase();
		switch(uso) {
		case "PROFESIONAL", "PARTICULAR"->{
			this.uso = TipoUso.valueOf(uso);
		}
		}
	}
	
	/**
	 * Funcion que devuelve la informacion del turismo
	 * 
	 * @return Devuelve la informacion del turismo
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.plazas + " plazas - " + this.uso;
	}	
}