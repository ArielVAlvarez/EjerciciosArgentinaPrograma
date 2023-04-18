package Clase13JDBC;

public class persona {
	private int dni;
	private String nombre;
	private String apellido;
	private int id_nacionalidad;
	private int id_departamento;
	
    public persona(int dni, String nombre, String apellido, int id_nacionalidad, int id_departamento) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_nacionalidad = id_nacionalidad;
		this.id_departamento = id_departamento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId_nacionalidad() {
		return id_nacionalidad;
	}

	public void setId_nacionalidad(int id_nacionalidad) {
		this.id_nacionalidad = id_nacionalidad;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	
	public String toStringInsert() {
		String rt = dni + "," + "\"" + nombre +"\"," + "\"" + apellido +"\"," + 
				id_nacionalidad + "," + id_departamento ;
		
		return rt;
	}
	
	

}
