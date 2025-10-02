package ejercicio6;


import java.util.List;
import java.util.ArrayList;
public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;
	
	public Usuario(String unNombre, String unDomicilio) {
		this.nombre=unNombre;
		this.domicilio= unDomicilio;
		consumos= new ArrayList<>();
	}
	
	public void RegistrarConsumo(Consumo unConsumo) {
		this.consumos.add(unConsumo);
	}
}
