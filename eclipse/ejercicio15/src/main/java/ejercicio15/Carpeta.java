package ejercicio15;

import java.util.ArrayList;

public class Carpeta {
	private String nombre;
	private ArrayList<Email> emails;
	
	
	public Carpeta(String unNombre) {
		this.emails= new ArrayList<Email>();
		this.nombre= unNombre;
	}
	
	
	public Email buscar (String texto) {
		for (Email e: this.emails){
			if(e.getTitulo().equals(texto) || e.getCuerpo().equals(texto)) {
				return e;
			}
		}
		return null;
	}
	public int espacioOcupado() {
		int suma=0;
		for(Email e: this.emails) {
			suma+= e.espacioOcupado();
		}
		return suma;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void añadirEmail(Email unEmail) {
		this.emails.add(unEmail);
	}
	
	public void mover (Email email, Carpeta Destino) {
		if(this.emails.contains(email)) {
			Destino.añadirEmail(email);
			this.emails.remove(email);
		}
	}
}
