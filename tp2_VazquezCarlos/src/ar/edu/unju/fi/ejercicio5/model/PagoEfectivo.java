package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago{
	private LocalDate fechaPag;
	private double MontoPagado;

	@Override
	public void realizarPago(double monto) {
		MontoPagado = monto*0.9;
		
	}

	@Override
	public void imprimrRecibo() {
		fechaPag = LocalDate.now();
		System.out.println("Fecha de pago: " +DateTimeFormatter.ofPattern("dd/MM/yy").format(fechaPag));
		System.out.println("Monto de pagado: "+MontoPagado);
		
	}

}
