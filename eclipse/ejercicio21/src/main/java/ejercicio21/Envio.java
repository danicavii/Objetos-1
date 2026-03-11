package ejercicio21;

public abstract class Envio {
	//private CuadroTarifario cuadroTarifario;
	private boolean entregaRapida;
	private int fechaDespacho;
	private String DicOrigen;
	private String DicDestino;
	private double peso;
	
	public Envio(boolean entrega, int fecha, String origen, String destino, double peso) {
		this.entregaRapida=entrega;
		this.fechaDespacho=fecha;
		this.DicOrigen=origen;
		this.DicDestino=destino;
		this.peso=peso;
	}
	
	public abstract double calcularMonto(CuadroTarifario tarifa);
	
	public boolean getEntregaRapida() {
		return this.entregaRapida;
	}
	
	public int getFechaDespacho() {
		return this.fechaDespacho;
	}
	
	public String getDicOrigen() {
		return this.DicOrigen;
	}
	
	public String getDicDestino() {
		return this.DicDestino;
	}
	
	public double getPeso() {
		return this.peso;
	}

}
