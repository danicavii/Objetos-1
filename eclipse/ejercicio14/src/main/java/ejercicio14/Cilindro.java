package ejercicio14;

public class Cilindro extends Pieza{
	private double radio;
	private double altura;
	
	public Cilindro (double radio, double altura, String material, String color) {
		super(material,color);
		this.radio=radio;
		this.altura=altura;
	}
	
	
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public double getSuperficie() {
		return 2 * Math.PI*radio*altura+2*Math.PI*Math.pow(radio, 2);
	}
	
	public double getVolumen() {
		return Math.PI* Math.pow(this.radio, 2) *this.altura;
	}



	
}
