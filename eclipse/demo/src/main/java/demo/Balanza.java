package demo;

import java.util.ArrayList;
import java.util.List;
public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;

	
	public Balanza() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;
		productos= new ArrayList<>();
	}
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}



	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}



	public double getPrecioTotal() {
		return precioTotal;
	}



	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}



	public double getPesoTotal() {
		return pesoTotal;
	}



	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}



	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.pesoTotal=0;
		this.precioTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		this.precioTotal+= producto.getPrecioPorKilo();
		this.pesoTotal+= producto.getPeso();
		this.cantidadDeProductos++;
	}
	
	public Ticket emitirTicket() {
		Ticket tk = new Ticket(this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
		return tk;
	}
}

