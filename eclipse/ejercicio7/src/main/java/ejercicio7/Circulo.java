package ejercicio7;

public class Circulo extends Figura2D {
	private double Radio;
	private double Diametro;
	
	
	public Circulo() {
		this.Radio=0;
	}
	
	public double getDiametro() {
		return this.Diametro= Math.PI * this.Radio;	
	}
	
	public void setDiametro(double valor) {
		this.Diametro= valor;
	}
	public double getRadio() {
		return this.Radio;
	}
	public void setRadio(double valor) {
		this.Radio=valor;
	}
	
	public double getPerimetro(){
		return Math.PI * this.Diametro;
	}
	public double getArea() {
		return Math.PI * Math.pow(this.Radio, 2);
	}
}
