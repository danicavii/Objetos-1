package ejercicio10;

public class Gerente  extends EmpleadoJerarquico {

	public Gerente (String unNombre) {
		super(unNombre);
	}
	
	public double montoBasico() {
		return 57000;
	}
	public double aportes(){
		return montoBasico() * 0.05;
	}
}
