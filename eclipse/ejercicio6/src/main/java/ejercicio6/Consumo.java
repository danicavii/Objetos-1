package ejercicio6;

import java.time.LocalDate;

public class Consumo {
	private double EnergiaActiva;
	private double EnergiaReactiva;
	private CuadroTarifario CT;
	private LocalDate fecha;
	
	public Consumo(double EA, double ER) {
		this.fecha= LocalDate.now();
		this.EnergiaActiva=EA;
		this.EnergiaReactiva=ER;
	}
	
	private double medirConsumo() {
		double total = this.EnergiaActiva * this.CT.getPrecioKWH();
		return total;
	}
	
	private double calcularFactorPotencia() {
		if(this.EnergiaReactiva > 0.8) {
			return this.EnergiaReactiva*0.1;
		}else {
			return 0;
		}
	}
	
	public Factura generarFactura() {
		double monto= this.medirConsumo()- this.calcularFactorPotencia();
		Factura  t = new Factura(this.fecha,monto,this.calcularFactorPotencia());
		return t;
	}
}
