package boletin3.ejercicio1;

/**
 * Clase Vehiculo destinada a crear un nuevo vehiculo y realizar
 * sus funciones principales
 */
public class Vehiculo {
	
	/**
	 * Atributo que almacena la marca del vehiculo
	 */
	private String marca = "No especificada";
	
	/**
	 * Atributo que almacena el modelo del vehiculo
	 */
	private String modelo = "No especificado";
	
	/**
	 * Atributo que almacena el color del vehiculo
	 */
	private String color = "No especificado";
	
	/**
	 * Atributo que almacena la matricula del vehiculo
	 */
	private String matricula = "No especificada";
	
	/**
	 * Atributo que almacena si el vehiculo esta encendido o no
	 */
	private boolean encendido = false;
	
	/**
	 * Atributo que almacena la marcha en la que se encuentra el vehiculo
	 */
	private int marcha = 0;
	
	/**
	 * Atributo que almacena la velocidad a la que va el vehiculo
	 */
	private int velocidad = 0;
	
	/**
	 * Constructor que inicializa os atributos de la clase Vehiculo comprobando si los valores
	 * son validos antes de asignarlos
	 * 
	 * @param marca Marca del vehiculo
	 * @param modelo Modelo del vehiculo
	 * @param color Color del vehiculo
	 * @param matricula Matricula del vehiculo
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		
		if(marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		
		if(modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		
		if(color != null && !color.isBlank()) {
			this.color = color;
		}
		
		if(matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}
	
	/**
	 * Funcion que devuelve el color del vehiculo
	 * 
	 * @return Devuelve el color del vehiculo
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Funcion que modifica el color del vehiculo
	 * si su valor es valido
	 * 
	 * @param color Color del vehiculo
	 */
	public void setColor(String color) {
		if(color != null && !color.isBlank()) {
			this.color = color;
		}
	}
	
	/**
	 * Funcion que devuelve true si el vehiculo esta encendido o false si no
	 * 
	 * @return Devuelve true si el vehiculo esta encendido o false si no
	 */
	public boolean isEncendido() {
		return encendido;
	}
	
	/**
	 * Funcion que modifica el encendido del vehiculo
	 * 
	 * @param encendido Estado de encendido del vehiculo
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	/**
	 * Funcion que devuelve la marcha del vehiculo
	 * 
	 * @return Devuelve la marcha del vehiculo
	 */
	public int getMarcha() {
		return marcha;
	}

	/**
	 * Funcion que modifica la marcha del vehiculo
	 * 
	 * @param marcha Marcha del vehiculo
	 */
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	/**
	 * Funcion que devuelve la velocidad del vehiculo
	 * 
	 * @return Devuelve la marcha del vehiculo
	 */
	public int getVelocidad() {
		return velocidad;
	}
	
	/**
	 * Funcion que modifica la velocidad del vehiculo
	 * 
	 * @param velocidad Velocidad del vehiculo
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * Funcion que devuelve la marca del vehiculo
	 * 
	 * @return Devuelve la marca del vehiculo
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * Funcion que devuelve el modelo del vehiculo
	 * 
	 * @return Devuelve el modelo del vehiculo
	 */
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Funcion que devuelve la matricula del vehiculo
	 * 
	 * @return Devuelve la matricula del vehiculo
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * Funcion para parar el vehiculo
	 */
	public void parar() {
		this.velocidad = 0;
		this.marcha = 0;
		this.encendido = false;
	}
	
	/**
	 * Funcion para encender el vehiculo
	 */
	public void arrancar() {
		this.encendido = true;
	}
	
	/**
	 * Funcion para subir la marcha del vehiculo
	 */
	public void subirMarcha() {
		if(this.marcha < 5) {
			this.marcha++;
		}
	}
	
	/**
	 * Funcion para bajar la marcha del vehiculo
	 */
	public void bajarMarcha() {
		if(this.marcha > 0) {
			this.marcha--;
		}
	}
	
	/**
	 * Funcion para aumentar la velocidad del vehiculo si el vehiculo esta encendido y devuelve true si se ha 
	 * aumentado la velocidad o false si no se ha aumentado
	 * 
	 * @param velocidad Velocidad a la que se quiere aumentar el vehiculo
	 * @return Devuelve true si se ha aumentado la velocidad o false si no se ha aumentado
	 */
	public boolean acelerar(int velocidad) {
		
		boolean realizado = false;
		
		if(this.encendido) {
			
			while (this.velocidad < velocidad) {
				this.velocidad++;
				
				if (cambiarMarcha()) {
					System.out.println("El vehiculo se encuentra en " + this.marcha + "ª marcha");
				}
				
				realizado = true;
			}	
		}
		
		return realizado;
	}
	
	/**
	 * Funcion para disminuir la velocidad del vehiculo si el vehiculo esta encendido y devuelve true si se ha 
	 * disminuido la velocidad o false si no se ha disminuido
	 * 
	 * @param velocidad Velocidad a la que se quiere disminuir el vehiculo
	 * @return Devuelve true si se ha disminuido la velocidad o false si no se ha disminuido
	 */
	public boolean desacelerar(int velocidad) {
		
		boolean realizado = false;
		
		if(this.encendido) {
			
			while (this.velocidad > velocidad) {
				this.velocidad--;

				if (cambiarMarcha()) {
					System.out.println("El vehiculo se encuentra en " + this.marcha + "ª marcha");
				}
				
				realizado = true;
			}
		}	
		
		return realizado;
	}
	
	/**
	 * Funcion para cambiar la marcha del vehiculo y devuelve true si se ha
	 * cambiado o false si no se ha realizado
	 * 
	 * @return Devuelve true si se ha cambiado o false si no se ha realizado
	 */
	private boolean cambiarMarcha() {
		boolean cambio = false;
		
		if (this.velocidad < 30) {
			this.marcha = 1;
			cambio = true;
			
		} else if (this.velocidad < 50) {
			this.marcha = 2;
			cambio = true;
			
		} else if (this.velocidad < 70) {
			this.marcha = 3;
			cambio = true;
			
		} else if (this.velocidad < 100) {
			this.marcha = 4;
			cambio = true;
			
		} else {
			this.marcha = 5;
			cambio = true;
		}
		
		return cambio;
	}
	
	/**
	 * Funcion que devuelve la informacion del vehiculo
	 * 
	 * @return Devuelve la informacion del vehiculo
	 */
	@Override
	public String toString() {
		return this.marca + " - " + this.modelo + " - " + this.color + " - " + this.matricula;
	}

	/**
	 * Funcion que devuelve true si los objetos son iguales o false
	 * si no lo son
	 * 
	 * @param obj Objeto para comparar
	 * @return Devuelve true si son iguales o false si no lo son
	 */
	@Override
	public boolean equals(Object obj) {
		Vehiculo vehiculo2 = (Vehiculo) obj;
		return this.matricula.equalsIgnoreCase(vehiculo2.matricula);
	}	
}