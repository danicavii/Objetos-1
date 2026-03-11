package ejercicio14;

public abstract class Pieza {
	private String material;
	private String color;
	
	
	public Pieza(String unMaterial, String unColor) {
		this.material=unMaterial;
		this.color=unColor;
	}


	public abstract double getSuperficie();
	public abstract double getVolumen();
	//public abstract double cantidadSuperficies();
	
	public String getColor() {
		return this.color;
	}
	public String getMateria() {
		return this.material;
	}
	

}
