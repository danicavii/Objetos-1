package ejercicio5;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class Cartera {
	private String nombreInversor;
	private List<Inversiones> Inversiones;

	
	public Cartera() {
		this.Inversiones= new ArrayList<>();
	}
	
	public String getNombreInversor() {
		return this.nombreInversor;
	}
	
	public double sumaInversiones() {
		double monto=0;
		Iterator<Inversiones> it= Inversiones.iterator();
		while(it.hasNext()) {
			monto+= it.next().valorActual();
		}
		return monto;
	}
	public void agregarInversion(Inversiones inv) {
		Inversiones.add(inv);
	}
	
	public void sacarInversion(Inversiones inv) {
		if(Inversiones.contains(inv)) {
			boolean ok=false;
			Iterator<Inversiones> it= Inversiones.iterator();
			while(it.hasNext() && !ok) {
				Inversiones act= it.next();
				if(act.equals(inv)) {
					ok=true;
					Inversiones.remove(act);
				}
			}
		}
	}
}
