package delivery;

public class EntregaPedido {

	private int codioEntrega;
	private Cliente cliente;
	private Trabajador trabajador;
	private Pedido pedido;
	
	
	public EntregaPedido(int codioEntrega, Cliente cliente, Trabajador trabajador, Pedido pedido) {
		
		this.codioEntrega = codioEntrega;
		this.cliente = cliente;
		this.trabajador = trabajador;
		this.pedido = pedido;
	}


	public int getCodioEntrega() {
		return codioEntrega;
	}


	public void setCodioEntrega(int codioEntrega) {
		this.codioEntrega = codioEntrega;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Trabajador getTrabajador() {
		return trabajador;
	}


	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
