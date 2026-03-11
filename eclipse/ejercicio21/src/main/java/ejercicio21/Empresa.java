package ejercicio21;


import java.util.ArrayList;
public class Empresa {
	private ArrayList<Cliente>  Clientes;
	
	
	public Empresa() {
		this.Clientes=new ArrayList<Cliente>();
	}
	
	public ArrayList<Cliente> getClientes() {
		return this.Clientes;
	}
	
	public void registrarCliente(Cliente cliente) {
		this.Clientes.add(cliente);
	}
	
}
	