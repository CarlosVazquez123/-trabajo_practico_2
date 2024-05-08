package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Categoria;
import ar.edu.unju.fi.ejercicio1.model.OrigenDeFabricacion;
import ar.edu.unju.fi.ejercicio1.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<Producto> gondola = new ArrayList();
		String op;
		do{
			System.out.println("--MENU--");
			System.out.println("1-Crear Producto");
			System.out.println("2-Mostrar Productos");
			System.out.println("3-Modificar Producto");
			System.out.println("4-Salir");
			System.out.println("Ingrese Opcion: ");
			op = cin.nextLine();
			
			switch(op) {
			
			case "1": Producto producto = new Producto();
					  crear(producto);
					  gondola.add(producto);
						break;
			case "2": mostrar(gondola);
						System.out.println("Enter para continuar");
						cin.nextLine();
						break;
			case "3": mod(gondola);
						break;
			case "4": System.out.println("YENDO...");
						break;
			default:System.out.println("Equivocado");
				
			}
			
		}while(!op.equals("4"));
		
		
	}
	
	public static void crear(Producto p){
		Scanner cin = new Scanner(System.in);
		boolean band;
		System.out.println("Ingrese Codigo: ");
		p.setCodigo(cin.nextInt());
		cin.nextLine();
		System.out.println("Ingrese Descripcion: ");
		p.setDescripcion(cin.nextLine());
		System.out.println("Ingrese Precio Unitario: ");
		p.setPreciouni(cin.nextInt());
		cin.nextLine();
		submenu(p);
		submenu2(p);
	}
	public static void submenu(Producto p) 
	{
			String op;
			Scanner cin = new Scanner(System.in);
			System.out.println("----Origen de Fabricacion----");
			System.out.println("1 - Argentina");
			System.out.println("2 - China");
			System.out.println("3 - Brasil");
			System.out.println("4 - Uruguay");
			System.out.println("Elija una opcion: ");
			op = cin.nextLine();
			
			switch(op) {
			
				case "1": p.setOrigenfab(OrigenDeFabricacion.ARGENTINA);
						break;
				case "2": p.setOrigenfab(OrigenDeFabricacion.CHINA);
						break;
				case "3": p.setOrigenfab(OrigenDeFabricacion.BRASIL);
						break;
				case "4": p.setOrigenfab(OrigenDeFabricacion.URUGUAY);
						break;
			default:  System.out.println("Equivocado");
				
			}
	}
	public static void submenu2(Producto p) 
	{
			String op;
			Scanner cin = new Scanner(System.in);
			System.out.println("----Categoria----");
			System.out.println("1 - Telefonia");
			System.out.println("2 - Informatica");
			System.out.println("3 - Electro Hogar");
			System.out.println("4 - Herramientas");
			System.out.println("Elija una opcion: ");
			op = cin.nextLine();
			
			switch(op) {
			
				case "1": p.setCategoria(Categoria.TELEFONIA);
						break;
				case "2": p.setCategoria(Categoria.INFORMATICA);;
						break;
				case "3": p.setCategoria(Categoria.ELECTROHOGAR);;
						break;
				case "4": p.setCategoria(Categoria.HERRAMIENTAS);;
						break;
			default:  System.out.println("Equivocado");
				
			}
	}
	public static void mostrar(List<Producto> gondola)
	{
		for(Producto producto: gondola)
			{
				System.out.println("Codigo: "+producto.getCodigo());
				System.out.println("Descripcion: "+producto.getDescripcion());
				System.out.println("Precio Unitario $: "+producto.getPreciouni());
				System.out.println("Origen de Fabricacion: "+producto.getOrigenfab());
				System.out.println("Categoria: "+producto.getCategoria());
			}
	}
	
	public static void mod(List<Producto> gondola)
	{
		Scanner cin = new Scanner(System.in);
		int codigo;
		boolean band = false;
		System.out.println("Ingrese codigo de producto a modificar:");
		codigo = cin.nextInt();
		for(Producto producto: gondola)
		{
			if(codigo == producto.getCodigo())
			{
				band = true;
				System.out.println("Ingrese Descripcion: ");
				producto.setDescripcion(cin.nextLine());
				System.out.println("Ingrese Precio Unitario: ");
				producto.setPreciouni(cin.nextInt());
				cin.nextLine();
				submenu(producto);
				submenu2(producto);
			}
			
		}
		if(!band)
			System.out.println("El codigo no pertenece a un producto existente");
			
	}
}
