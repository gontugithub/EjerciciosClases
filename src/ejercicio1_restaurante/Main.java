package ejercicio1_restaurante;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Restuarante r1 = new Restuarante("MULAN");
		
		r1.agregarProductoCarta("Fideos Chinos", 4.5f, 5);
		r1.agregarProductoCarta("Arroz Tres Delicias", 9.5f, 20);
		r1.agregarProductoCarta("Pollo al limon", 10f, 30);
		
		System.out.print(r1.getCarta().get(0).getNombre());
		System.out.println(r1.getCarta().get(0).getPrecio());
		
		
		
		
		for (int i = 0; i < r1.getCarta().size(); i++) {
			System.out.println(r1.getCarta().get(i).getNombre());
		}
		
	}
	
}
