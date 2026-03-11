package ejercicio21;

public class EnvioLocal extends Envio{

	
	public EnvioLocal(boolean entrega, int fecha, String origen, String destino, double peso) {
		super(entrega,fecha,origen,destino,peso);
	}
	
	public double calcularMonto(CuadroTarifario tarifa) {
		return tarifa.getTarifaLocal(super.getEntregaRapida());
	}
}
