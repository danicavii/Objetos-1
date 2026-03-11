package ejercicio14;

public class Prisma extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public Prisma(double ladoMayor, double ladoMenor, double altura, String material, String color) {
		super(material, color);
		this.ladoMayor=ladoMayor;
		this.ladoMenor=ladoMenor;
		this.altura=altura;
	}
	
	public double getLadoMayor() {
		return this.ladoMayor;
	}
	
	public double getLadoMenor() {
		return this.ladoMenor;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getSuperficie() {
		return 2*(ladoMayor*ladoMenor+ladoMayor*altura+ladoMenor*altura);
	}
	
	public double getVolumen() {
		return ladoMayor*ladoMenor*altura;
	}

}
