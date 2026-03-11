package ejercicio11;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo=0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void depositar(double monto) {
		this.saldo+=monto;
	}
	public void extraerSinControlar(double monto) { // sin controlar
		this.saldo-=monto;
	}
	
	public abstract boolean puedeExtraer(double monto);
	
	public boolean extraer (double monto) {
		if(puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar((monto + (monto*0.02)));
			return true;
		}else {
			return false;
		}
		
	}
}
