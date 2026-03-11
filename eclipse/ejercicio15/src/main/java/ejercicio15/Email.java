package ejercicio15;

import java.util.ArrayList;
public class Email {
	private String titulo;
	private String cuerpo;
	private ArrayList<Archivo> archivos;
	
	
	public Email(String titulo, String cuerpo, ArrayList<Archivo> a) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		this.archivos= a;
	}
	
	
	private int tamañoArchivos() {
		int suma=0;
		for(Archivo a : this.archivos) {
			suma+= a.tamaño();
		}
		return suma;
	}
	
	public int  espacioOcupado() {
		return this.titulo.length()+ this.cuerpo.length()+ this.tamañoArchivos();
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public ArrayList<Archivo> adjuntos(){
		return this.archivos;
	}
}
