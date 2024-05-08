package ar.edu.unju.fi.ejercicio5.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Categoria;
import ar.edu.unju.fi.ejercicio1.model.OrigenDeFabricacion;
import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio5.interfaces.Pago;
import ar.edu.unju.fi.ejercicio5.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio5.model.PagoTarjeta;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		List<Producto> stock = new ArrayList();
		
		Producto producto = new Producto(1,"Teclado",34,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(2,"Mouse",2325,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(3,"Monitor",56737,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(4,"Auriculares",90087,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(5,"Cable USB",1344,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(6,"Placa de video",1000376,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(7,"Procesador",12456,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(8,"Memoria RAM",3434,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(9,"Refrigeracion de Torre",1234,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(10,"Notebook",12334,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(11,"Coolers",334,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(12,"Silla de escritorio",1534,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(13,"Mousepad",3498,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(14,"Parlante",3487,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		producto = new Producto(15,"Gabinete",3456,OrigenDeFabricacion.ARGENTINA,Categoria.INFORMATICA,true);
		stock.add(producto);
		
		String op;
		do{
			System.out.println("--MENU--");
			System.out.println("1-Mostrar Productos");
			System.out.println("2-Realizar compra");
			System.out.println("3-Salir");
			System.out.println("Ingrese Opcion: ");
			op = cin.nextLine();
			
			switch(op) {
			
			case "1": mostrar(stock);
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;
			case "2":   comprar(stock);
						System.out.println("Enter para continuar.");
						cin.nextLine();
						break;
			case "3": System.out.println("YENDO...");
						break;

			default:System.out.println("Equivocado.");
				
			}
			
		}while(!op.equals("3"));
		
	}
		
		
		 static void mostrar(List<Producto> stock)
		{
			for (Producto p: stock) 
			{
				System.out.println("Descripcion: "+p.getDescripcion());
				System.out.println("Precio: "+p.getPreciouni());
				
			}
		
		}
		 static void comprar(List<Producto> stock)
		 {
			 String producto;
			 String op;
			 boolean encontrado = false;
			 Scanner cin = new Scanner(System.in);
			 List<Producto> carro = new ArrayList<Producto>();
			 do {
			 System.out.println("Producto a comprar: ");
			 producto = cin.nextLine();
			 
			 for(Producto p:stock)
			 {
				 if(p.getDescripcion().equals(producto))
				 {	 
					 if(p.isEstado())
					 {	 
						 System.out.println("Producto Disponible, ah sido añadido a su carrito.");
					 	 carro.add(p);
					 	 encontrado = true;
					 }
					 else
						 System.out.println("No hay stock.");
				 }		 
				
			 }
			 if(!encontrado)
				 System.out.println("El producto no existe.");
			 System.out.println("S para seguir comprando N para finalizar la compra: ");
			 }while(cin.nextLine().equalsIgnoreCase("S"));
			 
			 double monto=0;
			 for(Producto p: carro)
				 monto+=p.getPreciouni();
			 
			 System.out.println("--Metodo de pago--");
			 System.out.println("1 - Pago efectivo");
			 System.out.println("2 - Pago Tarjeta");
			 op = cin.nextLine();
			 switch(op) {
				
				case "1": 	Pago pago = new PagoEfectivo();
							pago.realizarPago(monto);
							pago.imprimrRecibo();
							System.out.println("Enter para continuar.");
							cin.nextLine();
							break;
				case "2":   Pago pagotar = new PagoTarjeta();
							pagotar.realizarPago(monto);
							pagotar.imprimrRecibo();
							System.out.println("Enter para continuar.");
							cin.nextLine();
							break;
				default:System.out.println("Equivocado.");
					
				}
		 }
		 

}
