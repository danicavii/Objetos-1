package ejercicio21;

public class EnvioInterUrbano  extends Envio {
	private double distancia;
	
	
	public EnvioInterUrbano(int fecha, String origen, String destino, double peso, double distancia) {
		super(false,fecha,origen,destino,peso);
		this.distancia=distancia;
	}
	
	
	public double calcularMonto(CuadroTarifario tarifa) {
		return tarifa.getTarifaInterUrbano(this.distancia, super.getPeso());
	}
}
