package ejercicio5;

public class Acciones extends Inversiones {
	private String nombre;
	private int cantAcciones;
	private int valorUnitario;
	
	
	public Acciones(String nom, int cantAcciones) {
		this.nombre=nom;
		this.cantAcciones=cantAcciones;
		this.valorUnitario=0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double valorActual() {
		return this.valorUnitario * this.cantAcciones;
	}
}
