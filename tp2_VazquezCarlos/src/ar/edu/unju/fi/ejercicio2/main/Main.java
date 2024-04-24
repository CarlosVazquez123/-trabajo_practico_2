package ar.edu.unju.fi.ejercicio2.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

public class Main {

	public static void main(String[] args) {
		List<Efemeride> lista = new ArrayList();
		Scanner cin = new Scanner(System.in);
		String op;
		do 
		{
			System.out.println("--MENU--");
			System.out.println("1 - Crear efemeride");
			System.out.println("2 - Mostrar efemerides");
			System.out.println("3 - Eliminar efemeride");
			System.out.println("4 - Modicar efemeride");
			System.out.println("5 - Salir");
			System.out.println("Ingrese opcion mano:");
			op = cin.nextLine();
			
			switch(op) 
			{
				case "1": 	Efemeride efeme = new Efemeride();
							crearefem(efeme);
							lista.add(efeme);
							break;
				case "2": mostrarefem(lista);
							System.out.println("Presione ENTER para continuar");
							cin.nextLine();
							break;
				case "3": eliminarefem(lista);
							break;
				case "4": modefem(lista);
							break;
				case "5": System.out.println("YENDO...");
							break;
				default:System.out.println("Equivocado");
			}
		}while(!op.equals("5"));
	}
	
	public static void crearefem(Efemeride e) 
	{
		Scanner cin = new Scanner(System.in);
		System.out.print("Ingrese codigo: ");
		e.setCodigo(cin.nextInt());
		cin.nextLine();
		System.out.print("Ingrese el numero del mes en numero: ");
		e.setMes(Mes.values()[cin.nextInt()-1]);
		System.out.print("Ingrese dia: ");
		e.setDia(cin.nextInt());
		cin.nextLine();
		System.out.print("Ingrese detalles: ");
		e.setDetalle(cin.nextLine());
		cin.nextLine();
	}

	public static void mostrarefem(List<Efemeride> lista) 
	{
		for(Efemeride efem: lista)
		{
			System.out.println("Codigo: "+efem.getCodigo());
			System.out.println("Mes: "+efem.getMes());
			System.out.println("Dia: "+efem.getDia());
			System.out.println("Detalle: "+efem.getDetalle());
		}
	}
	public static void eliminarefem(List<Efemeride> lista)
	{
		Scanner cin = new Scanner(System.in);
		int codigo;
		boolean band = false;
		
		System.out.println("Ingrese codigo de Efemeride a eliminar: ");
		codigo = cin.nextInt();
		
		for(Efemeride efem: lista)
		{
			if(codigo == efem.getCodigo())
			{
				band = lista.remove(efem);
			}
		}
		if(band)
			System.out.println("Se elimino correctamente");
		else
			System.out.println("Codigo no existente");
		
	}
	public static void modefem(List<Efemeride> lista)
	{
		Scanner cin = new Scanner(System.in);
		int codigo;
		boolean band = false;
		
		System.out.println("Ingrese codigo de Efemeride a modificar: ");
		codigo = cin.nextInt();
		
		for(Efemeride efem: lista)
		{
			if(codigo == efem.getCodigo())
			{
				band = true;
		
				System.out.print("Ingrese codigo: ");
				efem.setCodigo(cin.nextInt());
				cin.nextLine();
				System.out.print("Ingrese numero del mes:");
				efem.setMes(Mes.values()[cin.nextInt()-1]);
				System.out.print("Ingrese dia: ");
				efem.setDia(cin.nextInt());
				cin.nextLine();
				System.out.print("Ingrese detalles: ");
				efem.setDetalle(cin.nextLine());
				cin.nextLine();
			}
				
			}
		if(!band)
			System.out.println("El codigo no pertence a un dia existente");
		}

}