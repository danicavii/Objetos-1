package demo;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int cant, double pesoT,double precioT) {
		this.fecha = LocalDate.now();
		this.cantidadProductos= cant;
		this.pesoTotal=pesoT;
		this.precioTotal=precioT;
	}
	
	public double impuesto() {
		return  this.precioTotal*0.21;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public int getCantidadDeProductos() {
		return this.cantidadProductos;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	@Override
	public String toString() {
	    return "Fecha: " + fecha +
	           "\nCantidad de productos: " + cantidadProductos +
	           "\nPeso total: " + pesoTotal +
	           "\nPrecio total: $" + precioTotal +
	           "\nImpuesto (21%): $" + impuesto();
	}
}
