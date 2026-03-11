package ejercicio14;

public class Esfera extends Pieza {
	private double radio;
	
	public Esfera(double radio, String Material, String color) {
		super(Material,color);
		this.radio=radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	public double getSuperficie() {
		return 4*Math.PI*Math.pow(radio, 2);
	}
	
	public double getVolumen() {
		return (4/3)*Math.PI*Math.pow(radio, 3);
	}

}
