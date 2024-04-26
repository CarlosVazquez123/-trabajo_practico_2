package ar.edu.unju.fi.ejercicio4.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		List<Jugador>plantel = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int op;
		String pausa;
		do {
		System.out.println("------------------------");
		System.out.println("1- Alta de Jugador");
		System.out.println("2- Mostrar los datos de los jugadores"); 
		System.out.println("3- Modificar posicion de un jugador");
		System.out.println("4- Eliminar un jugador");
		System.out.println("5- Salir");
		System.out.print("Ingrese Opcion: "); 
		op= sc.nextInt();
		switch(op) 
		{
			case 1: Jugador jg = new Jugador();
					jg.altaJugador();
					plantel.add(jg);
					break;
			case 2:	mostrarDatos(plantel);
					break;
			case 3: modJugador(plantel);
					break;
			case 4: eliminar(plantel);
					break;
			default: System.out.println("opcion incorrecta");
		 }
		pausa=sc.nextLine();
		System.out.println("Presione ENTER para continuar...");
		pausa=sc.nextLine();
		}while(op!=5);
		sc.close();
	}

	public static void mostrarDatos(List<Jugador> plantel) {
		for(Jugador j: plantel) {
		System.out.println("");
		System.out.println("Nombre:"+ j.getNombre());
		System.out.println("Apellido:"+ j.getApellido());
		System.out.println("Fecha de Nacimiento:"+ j.getFechaNacimiento());
		System.out.println("Nacionalidad:"+ j.getNacionalidad());
		System.out.println("Estatura:"+ j.getEstatura());
		System.out.println("Peso:"+ j.getPeso());
		System.out.println("Posicion:"+ j.getPosicion());
		System.out.println("");
		}
	}
	
	public static void modJugador(List<Jugador> plantel) {
			
			Scanner sc = new Scanner(System.in);
			String nombre;
			String apellido;
			System.out.print("Ingrese el nombre de jugador: ");
			nombre=sc.nextLine();
			System.out.print("Ingrese su apellido: ");
			apellido=sc.nextLine();
			for(Jugador j: plantel) {
				if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido))
					j.menuposicion();
			}
		}
	
	public static void eliminar (List<Jugador> plantel) {
			
			Scanner sc = new Scanner(System.in);
			String nombre;
			String apellido;
			Boolean borrado=false;
			System.out.print("Ingrese el nombre de jugador: ");
			nombre=sc.nextLine();
			System.out.print("Ingrese su apellido: ");
			apellido=sc.nextLine();
			for(int i=0;i<plantel.size();i++) 
				if(plantel.get(i).getNombre().equals(nombre) && plantel.get(i).getApellido().equals(apellido))
					{
					plantel.remove(i);
					borrado=true;
					}
			if (borrado)
				System.out.println("Jugador eliminado");
			else 
				System.out.println("Jugador no encontrado");
		}
}