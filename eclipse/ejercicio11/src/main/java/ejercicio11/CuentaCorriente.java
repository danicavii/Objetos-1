package ejercicio11;

public class CuentaCorriente extends Cuenta {
	private double limite;
	
	public CuentaCorriente() {
		super();
		this.limite=0;
	}
	
	public void setLimite(double unLimite) {
		this.limite= unLimite;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	@Override
	public boolean puedeExtraer(double monto) {
		if(this.limite + super.getSaldo() >= monto) {
			return true;
		}else {
			return false;
		}
	}
}
