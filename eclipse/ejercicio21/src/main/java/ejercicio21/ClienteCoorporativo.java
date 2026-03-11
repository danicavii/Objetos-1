package ejercicio21;

public class ClienteCoorporativo extends Cliente {
	private String nombreEmpresa;
	private String direccion;
	private int CUIT;
	
	public ClienteCoorporativo(String nombre, String direccion,int cuit) {
		this.nombreEmpresa=nombre;
		this.direccion= direccion;
		this.CUIT=cuit;
	}
	
	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getCuit(){
		return this.CUIT;
	}
	
}
