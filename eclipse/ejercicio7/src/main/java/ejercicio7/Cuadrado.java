package ejercicio7;

public class Cuadrado extends Figura2D {
	private double Lado;
	
	public Cuadrado() {
		this.Lado=0;
	}
	
	public void setLado(double valor) {
		this.Lado=valor;
	}
	
	public double getLado() {
		return this.Lado;
	}
	
	public double getPerimetro(){
		return 4 * this.Lado;
	}
	public double getArea() {
		return Math.pow(this.Lado, 2);
	}
	
}
