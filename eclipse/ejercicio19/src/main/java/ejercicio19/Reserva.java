package ejercicio19;

import java.time.LocalDate;

public class Reserva {
	private DateLapse lapso;
	private Usuario huesped;
	private Propiedad Propiedad;
	
	public Reserva(DateLapse lapso, Usuario hues, Propiedad propiedad) {
		this.lapso=lapso;
		this.huesped= hues;
		this.Propiedad=propiedad;
	}
	
	
	public double CalcularPrecio() {
		return this.lapso.sizeInDays() * this.Propiedad.getPrecio();
	}
	
	public boolean estaEnCurso(LocalDate hoy) {
		return this.lapso.includesDate(hoy);
	}
	
}
