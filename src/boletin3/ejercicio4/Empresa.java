package boletin3.ejercicio4;

/**
 * Clase destinada a crear un nuevo objeto Empresa
 * 
 * @author Angel
 */
public class Empresa extends Contacto {
	
	/**
	 * Atributo que almacena la pagina web de la empresa
	 */
	private String paginaWeb = "No especificado";
	
	/**
	 * Constructor que inicializa los atributos de la clase Empresa y los heredados de la
	 * clase Contacto y comprueba si sus valores son validos antes de asignarlos
	 * 
	 * @param nombre Nombre de la empresa
	 * @param telefono Telefono de la empresa
	 * @param paginaWeb Pagina web de la empresa
	 */
	public Empresa(String nombre, int telefono, String paginaWeb) {
		super(nombre, telefono);
		
		if(paginaWeb != null && !paginaWeb.isBlank()) {
			this.paginaWeb = paginaWeb;
		}
	}
	
	/**
	 * Funcion que devuelve la pagina web de la empresa
	 * 
	 * @return Devuelve la pagina web de la empresa
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Funcion que modifica el valor de la pagina web de la empresa si su valor
	 * es valido
	 * 
	 * @param paginaWeb Pagina web de la empresa
	 */
	public void setPaginaWeb(String paginaWeb) {
		if(paginaWeb != null && !paginaWeb.isBlank()) {
			this.paginaWeb = paginaWeb;
		}
	}
	
	/**
	 * Funcion que devuelve la informacion de la empresa
	 * 
	 * @return Devuelve la informacion de la empresa
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + this.paginaWeb;
	}
}