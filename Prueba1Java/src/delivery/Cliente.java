package delivery;

public class Cliente extends Persona{
	
	private int codigo;
	private String comentarioCompra;
	
	public Cliente(String rut, String nombre, String mail, String direccion, int codigo, String comentarioCompra) {
		super(rut, nombre, mail, direccion);
		this.codigo = codigo;
		this.comentarioCompra = comentarioCompra;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getComentarioCompra() {
		return comentarioCompra;
	}

	public void setComentarioCompra(String comentarioCompra) {
		this.comentarioCompra = comentarioCompra;
	}

	
		

}
