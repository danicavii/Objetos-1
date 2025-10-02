package ejercicio7;

public class Figura3D {
	public double Altura;
	public Figura2D caraBasal;
	
	public Figura3D() {
		this.Altura= 0;
		this.caraBasal=null;
	}
	
	public void setAltura(double valor) {
		this.Altura=valor;
	}
	public double getAltura() {
		return this.Altura;
	}
	
	public void setCaraBasal(Figura2D f) {
		this.caraBasal= f;
	}
	
	public double getVolumen() {
		return this.Altura * this.caraBasal.getArea();
	}
	
	public  double getSuperficieExterior() {
		double area= 2*this.caraBasal.getArea()+this.caraBasal.getPerimetro()*this.Altura;
		return area;
	}
}
