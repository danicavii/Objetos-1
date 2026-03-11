package ejercicio21;

public class CuadroTarifario {
	private double entregaEstandar=1000;
	private double entregaRapidaLocal=500;
	
	private double montoMenor=20;
	private double montoIntermedio=25;
	private double montoMayor=30;
	
	private double montoDestino=5000;
	private double masUnKilo=12;
	private double hastaUnKilo=10;
	private double entregaRapida=800;
	
	
	
	public CuadroTarifario() {
		
	}
	
	
	public double getTarifaLocal(boolean entregaRapida) {
		double monto=this.entregaEstandar;
		if(entregaRapida) {
			monto+=this.entregaRapidaLocal;
		}
		return monto;
	}
	
	public double getTarifaInterUrbano(double distancia, double peso) {
		double monto=0;
		if(distancia <= 100) {
			monto+= this.montoMenor* peso;
		}else 
			if(distancia >100 && distancia < 500) {
				monto+= this.montoIntermedio * peso;
		}else {
			if(distancia  >500) {
				monto+= this.montoMayor * peso;
			}
		}
		return monto;
	}
	
	public double getTarifaInternacional(boolean entregaRapida, double peso) {
		double monto= this.montoDestino;
		if(peso <= 1000) {
			monto+= peso*this.hastaUnKilo;
		}else {
			if(peso > 1000) {
				monto+= peso* this.masUnKilo;
			}
		}
		if(entregaRapida) {
			monto+= this.entregaRapida;
		}
		return monto;
	}
}
