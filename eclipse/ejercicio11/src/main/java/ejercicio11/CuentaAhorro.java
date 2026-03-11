package ejercicio11;

public class CuentaAhorro extends Cuenta {
	
	public CuentaAhorro() {	
		super();
	}
	

	@Override
	public boolean puedeExtraer(double monto) {
		if(super.getSaldo() > monto + (monto*0.02)) {
			return true;
		}else {
			return false;
		}
	}
	
	public  void extraerSinControlar(double monto) { // protegido?
		double nueMonto= (monto + (monto*0.02));
		super.extraerSinControlar(nueMonto);
		
	}
	
	public void depositar(double monto) {
		double nueMonto= (monto - (monto*0.02));
		super.depositar(nueMonto);
	}
	
	
	
}
