package delivery;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creo Trabajadores
		Trabajador trabajador1 = new Trabajador("18.262.342-9", "Manuel Rodriguez", "manuelr@gmail.com", "Pasaje el Roble 213",1, "Repartidor");
		Trabajador trabajador2 = new Trabajador("17.423.342-0", "Ana Garcia", "anag@gmail.com",  "Condor 678", 2,  "Acomoda los pedidos");
		Trabajador trabajador3 = new Trabajador("7.423.145-1", "Pedro Perez", "pedrop@gmail.com", "San Diego 25", 3, "Recepciona el pedido");
		
		//Creo Clientes 
		Cliente cliente1 = new Cliente("18.923.145-6","Javiera Pacheco", "javierap@gmail.com", "Estacion Central 345 ", 1, "Dejarlo en Recepcion");
		Cliente cliente2 = new Cliente("25.444.234-0", "David Moya", "davidm@gmail.com", "Tarapaca 1889", 2, "Los ajos que no sean tan grandes");
		Cliente cliente3 = new Cliente("20.517.262-1", "Elena Padilla", "elenap@gmail.com", "Trinidad 1567", 3,"Las papas tamaño mediano");
		
		//Creo Proveedores
		Proveedor proveedor1 = new Proveedor("14.517.262-1", "La Vega Central");
		Proveedor proveedor2 = new Proveedor("17.678.55-2", "Lo Valledor");
		
		//Creo el Pedido
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto(1, "Ajo,", proveedor1));
		productos.add(new Producto(2, "Papa,", proveedor1));
		productos.add(new Producto(3, "Lechuga,", proveedor2));
		productos.add(new Producto(4, "Brocoli. ", proveedor2));
		
	     String procustosP = "";
         for (int i=0; i < productos.size(); i++) {
        	 procustosP = procustosP + productos.get(i).getNombre()+ " ";
         }
         
         Pedido pedido1 = new Pedido(1, "Pedido 1", productos);
		 //System.out.println("Descripcion: " + " " + pedido1.getDescripcion()+" " +"que tiene la cantidad de "+ productos.size() + " " + "productos.");
         
         System.out.println("----------------------------------------------");
	     System.out.println("             DELIVERY DE VERDURAS             ");
	     System.out.println("----------------------------------------------");
		 //Creo la Entrega del Pedido
		 EntregaPedido entregaPedido1 = new EntregaPedido(1, cliente3, trabajador3, pedido1);
		 System.out.println("Cliente: " + entregaPedido1.getCliente().getNombre()+" " +  
		                    "\nRut : " +entregaPedido1.getCliente().getRut()+
		                    "\nDireccion : " +entregaPedido1.getCliente().getDireccion()+
		                    "\n----------------------------------------------"+
			                "\n" +
			                "Pedido realizado por:" + entregaPedido1.getTrabajador().getNombre() +
			                "\nDetalle del Pedido:" + entregaPedido1.getPedido().getProducto().size() + " " + "productos."       
		                    
				 );
		 System.out.println("Lista de productos: " + procustosP);
			   	
	}

}
