package delivery;

public class Producto {

	private int codigo;
	private String nombre;
	private Proveedor proveedor;
	
	public Producto(int codigo, String nombre, Proveedor proveedor) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.proveedor = proveedor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	

	
	
}
