package ejercicio21;

public class EnvioInternacional extends Envio{

	
	public EnvioInternacional(boolean entrega,int fecha, String origen, String destino, double peso) {
		super(entrega,fecha,origen,destino,peso);
	}
	
	public double calcularMonto(CuadroTarifario tarifa) {
		return tarifa.getTarifaInternacional(super.getEntregaRapida(), super.getPeso());
	}
}
