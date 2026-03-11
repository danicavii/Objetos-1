package ejercicio19;

import java.util.ArrayList;
public class Propiedad {
	private String direccion;
	private String nombreDes;
	private double precioNoche;
	private Usuario propietario;
	private ArrayList<Reserva> reservas;
	
	
	public Propiedad (String dic, String nombre, double precio, Usuario prop) {
		this.direccion=dic;
		this.nombreDes=nombre;
		this.precioNoche=precio;
		this.propietario=prop;
		this.reservas= new ArrayList<Reserva>();
	}
	
	public double getPrecio() {
		return this.precioNoche;
	}
	
	public boolean estaDisponible(DateLapse lapso) {
		lapso.
	}
}
