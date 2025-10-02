package ejercicio6;

import java.time.LocalDate;
public class Factura {
	private String usuario;
	private LocalDate fechaEmision;
	private double Bonificacion;
	private double montoFinal;
	
	public Factura(String u,LocalDate fe, double b, double m ) {
		this.usuario=u;
		this.fechaEmision=fe;
		this.Bonificacion=b;
		this.montoFinal=m;
	}
}
