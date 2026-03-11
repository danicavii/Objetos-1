package ejercicio19;

import java.util.ArrayList;

public class Plataforma {
	private ArrayList<Reserva>	Reservas;
	private ArrayList<Propiedad>Propiedades;	
	private ArrayList<Usuario>Usuarios;
	
	public Plataforma() {
		this.Usuarios= new ArrayList<Usuario>();
		this.Reservas= new ArrayList<Reserva>();
		this.Propiedades= new ArrayList<Propiedad>();
	}
	
	public void RegistrarPropiedad(Propiedad prop) {
		this.Propiedades.add(prop);
	}
	
	public void RegistarUsuario(Usuario usr) {
		this.Usuarios.add(usr);
	}
	
}

