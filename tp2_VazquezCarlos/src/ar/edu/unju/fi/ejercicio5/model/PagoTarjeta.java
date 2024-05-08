package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoTarjeta implements Pago{
	
	private String NumTarjeta;
	private LocalDate fechaPag;
	private double MontoPagado;
	

	@Override
	public void realizarPago(double monto) {
		Scanner cin = new Scanner(System.in);
		MontoPagado = monto*1.15;
		System.out.println("Ingrese Numero de tarjeta: ");
		NumTarjeta = cin.nextLine();
		
		
	}

	@Override
	public void imprimrRecibo() {
		fechaPag = LocalDate.now();
		System.out.println("Numero de tarjeta: "+NumTarjeta);
		System.out.println("Fecha de pago: " +DateTimeFormatter.ofPattern("dd/MM/yy").format(fechaPag));
		System.out.println("Monto de pagado: "+MontoPagado);
		
	}

}
