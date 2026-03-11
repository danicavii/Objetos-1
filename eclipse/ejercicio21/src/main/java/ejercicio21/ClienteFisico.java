package ejercicio21;

public class ClienteFisico extends Cliente{
	private String nombreCliente;
	private String direccion;
	private int DNI;
	private double descuento=0.1;
	
	public ClienteFisico(String nombre, String direccion , int dni) {
		this.nombreCliente=nombre;
		this.direccion=direccion;
		this.DNI=dni;
	}
	
	public String getNombreCliente() {
		return this.nombreCliente;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getDni() {
		return this.DNI;
	}
	
	public double getDescuento() {
		return this.descuento;
	}


}
