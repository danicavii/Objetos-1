package ejercicio19;

import java.util.ArrayList;
public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private ArrayList<Propiedad> propiedadesAlquiler;
	private ArrayList<Reserva> reservas;
	
	public Usuario(String nombre, String dic,int DNI) {
		this.nombre=nombre;
		this.direccion=dic;
		this.DNI= DNI;
	}
	
	public Reserva reservar(Propiedad prop, DateLapse lapso) {
		
	}
}
