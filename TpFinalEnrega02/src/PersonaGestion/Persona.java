package PersonaGestion;

public class Persona {
	private String Id;
	private String Nombre;
	private String Telefono;
	private String eMail;
	
	public Persona(String id, String nombre, String telefono, String eMail) {		
		this.Id = id;
		this.Nombre = nombre;
		this.Telefono = telefono;
		this.eMail = eMail;
	
			
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}		
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
}
