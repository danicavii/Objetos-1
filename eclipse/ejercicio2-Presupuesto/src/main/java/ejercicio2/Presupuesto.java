package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String unCliente) {
		this.fecha = LocalDate.now();
		this.cliente=unCliente;
		items= new ArrayList<>();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	public String getCliente() {
		return this.cliente;
	}
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		double total=0;
		Iterator<Item> it = items.iterator();
		while(it.hasNext()) {
			total+= it.next().costo();
		}
		return total;
	}
}
