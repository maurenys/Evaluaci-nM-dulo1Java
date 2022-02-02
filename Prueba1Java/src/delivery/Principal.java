package delivery;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo Trabajadores
		Trabajador trabajador1 = new Trabajador(null, null, null, null, 0, null);
		Trabajador trabajador2 = new Trabajador(null, null, null, null, 0, null);
		Trabajador trabajador3 = new Trabajador(null, null, null, null, 0, null);
		
		//Creo Clientes 
		Cliente cliente1 = new Cliente(null, null, null, null, 0, null);
		Cliente cliente2 = new Cliente(null, null, null, null, 0, null);
		Cliente cliente3 = new Cliente(null, null, null, null, 0, null);
		
		//Creo Proveedores
		Proveedor proveedor1 = new Proveedor(null, null);
		Proveedor proveedor2 = new Proveedor(null, null);
		
		//Creo Producto 
		Producto producto1 = new Producto(0, null, proveedor1);
		Producto producto2 = new Producto(0, null, proveedor1);
		Producto producto3 = new Producto(0, null, proveedor2);
		Producto producto4 = new Producto(0, null, proveedor2);
		
		//Creo el Pedido
		Pedido pedido1 = new Pedido(0, null, null);
		
		
		//Creo la Entrega del Pedido
		EntregaPedido entregaPedido1 = new EntregaPedido(0, cliente3, trabajador3, pedido1);
		
		
		
		
	}

}
