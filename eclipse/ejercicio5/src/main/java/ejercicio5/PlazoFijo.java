package ejercicio5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PlazoFijo extends Inversiones {
	private LocalDate fechaConstitucion;
	private double valorInicial;
	private double porcentajeInteres;
	
	public PlazoFijo( double valor, double interes) {
		this.valorInicial=valor;
		this.porcentajeInteres=interes;
	}
	
	public double valorActual() {
		long dias = ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
		return (dias *this.porcentajeInteres)+ this.valorInicial;
	}
}
