package delivery;

public class Persona {
	
	 private String rut;
	 private String nombre;
	 private String mail;
	 private String direccion;
	 
	public Persona(String rut, String nombre, String mail, String direccion) {
		
		this.rut = rut;
		this.nombre = nombre;
		this.mail = mail;
		this.direccion = direccion;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	 
	
}
