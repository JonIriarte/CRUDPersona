package entities;

public class Persona {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	private float cotizacion;

	public Persona() {

	}

	public Persona(int id, String nombre, String apellidos, int edad, float cotizacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cotizacion = cotizacion;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the cotizacion
	 */
	public float getCotizacion() {
		return cotizacion;
	}

	/**
	 * @param cotizacion the cotizacion to set
	 */
	public void setCotizacion(float cotizacion) {
		this.cotizacion = cotizacion;
	}
}
