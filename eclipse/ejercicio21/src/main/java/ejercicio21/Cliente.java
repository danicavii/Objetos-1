package ejercicio21;

import java.util.ArrayList;

public abstract class Cliente {
	private ArrayList<Envio> envios;
	
	
	public Cliente() {
		this.envios= new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public ArrayList<Envio> getEnvios(){
		return this.envios;
	}
	
	public double montoToltal(CuadroTarifario tarifa) {
		double monto=0;
		for(Envio e : this.envios) {
			monto+= e.calcularMonto(tarifa);
		}
		return monto;
	}

}
