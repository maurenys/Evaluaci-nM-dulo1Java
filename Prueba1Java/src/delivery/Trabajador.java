package delivery;

public class Trabajador extends Persona{

	private int codigo;
	private String descripcionCargo;
	
	
	public Trabajador(String rut, String nombre, String mail, String direccion, int codigo, String descripcionCargo) {
		super(rut, nombre, mail, direccion);
		this.codigo = codigo;
		this.descripcionCargo = descripcionCargo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcionCargo() {
		return descripcionCargo;
	}


	public void setDescripcionCargo(String descripcionCargo) {
		this.descripcionCargo = descripcionCargo;
	}
	
	
	
}
