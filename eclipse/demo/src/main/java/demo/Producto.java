package demo;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto( String unaDescripcion, double unPeso, double unKilo) {
		this.peso=unPeso;
		this.precioPorKilo=unKilo;
		this.descripcion=unaDescripcion;
	}


	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo * this.peso;
	}
	
	public double getPrecio() {
		return this.precioPorKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPrecioPorKilo(double precio) {
		this.precioPorKilo=precio;
	}
}
