package ejercicio2;
public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String unDetalle, int cantidad, double costo) {
		this.detalle=unDetalle;
		this.cantidad= cantidad;
		this.costoUnitario=costo;
	}
	
	public String getDetalle() {
		return this.detalle;
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.cantidad*this.costoUnitario;
	}
}
