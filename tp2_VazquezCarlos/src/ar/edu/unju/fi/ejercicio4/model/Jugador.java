package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	public Jugador() {
	}

	public void altaJugador() {
		Scanner sc = new Scanner(System.in);
		boolean error=false;
		System.out.print("Ingrese su nombre: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		apellido=sc.nextLine();
		do {
		try {
			error=false;
			System.out.println("Ingrese su Fecha de Nacimiento (dd/mm/yyyy): ");
			fechaNacimiento= LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			sc.nextLine();
		} catch ( DateTimeParseException e) {
			System.out.println("Fecha mal ingresada");
			error=true;
		}
		}while(error);
		System.out.println("Ingrese su Nacionalidad: ");
		nacionalidad= sc.nextLine();
		System.out.print("Ingrese su Estatura: ");
		estatura= sc.nextDouble();
		System.out.print("Ingrese su peso: ");
		peso=sc.nextDouble();
		this.menuposicion();
	}
	
	public int calcularEdad() {
		Period period = Period.between(fechaNacimiento, LocalDate.now());
		return period.getYears();
	}

	public void menuposicion()
    {
        boolean error;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                error=false;
		        System.out.println("Posicion");
		        System.out.println("1-Delantero");
		        System.out.println("2-Medio");
		        System.out.println("3-Defensa");
		        System.out.println("4-Arquero");
		        System.out.println("Elija opcion: ");
		        this.setPosicion(Posicion.values()[sc.nextInt()-1]);
            	} catch ( Exception e) {
	                System.out.println("Opcion Incorrecta");
	                error=true;
            		}
        }while(error);
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
}
