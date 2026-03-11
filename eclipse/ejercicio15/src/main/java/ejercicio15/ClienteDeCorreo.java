package ejercicio15;

import java.util.ArrayList;

public class ClienteDeCorreo {
	private ArrayList<Carpeta> Carpetas;
	private Carpeta Inbox;
	
	public ClienteDeCorreo() {
		this.Carpetas= new ArrayList<Carpeta>();
		this.Inbox= new Carpeta("Inbox");
	}
	
	public Carpeta getInbox() {
		return this.Inbox;
	}
	
	public void agregarCarpeta(Carpeta unaCarpeta) {
		this.Carpetas.add(unaCarpeta);
	}
	
	public void recibir(Email unEmail) {
		this.Inbox.añadirEmail(unEmail);
	}
	
	public Email buscar(String texto) {
		Email resul=null;
		for(Carpeta c: this.Carpetas) {
			resul= c.buscar(texto);
			if(resul !=null) {
				return resul;
			}
		}
		resul=Inbox.buscar(texto);
		if(resul !=null) {
			return resul;
		}
		return null;
	}
	
	
	public int espacioOcupado() {
		int suma=0;
		for(Carpeta c : this.Carpetas) {
			suma+= c.espacioOcupado();
		}
		return suma;
	}
}
