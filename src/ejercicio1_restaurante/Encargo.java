package ejercicio1_restaurante;

import java.util.ArrayList;

public class Encargo {
	
	private int numeropedido;
	private String direccionentrega;
	private ArrayList<Producto> listaProductos = new ArrayList<>();
	
	
	
	public Encargo(int numeropedido, String direccionentrega, ArrayList<Producto> listaProductos) {
		this.numeropedido = numeropedido;
		this.direccionentrega = direccionentrega;
		this.listaProductos = listaProductos;
	}



	public void nuevoProducto(int producto){
		
	}

}
