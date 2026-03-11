package ejercicio14;

import java.util.List;
import java.util.ArrayList;


public class ReporteDeContruccion {
	private List<Pieza> piezas;
	
	
	public ReporteDeContruccion() {
		this.piezas= new ArrayList<>();
	}

	public boolean getIsEmpty(){
		return this.piezas.isEmpty();
	}
	
	
	public void agregarPieza(Pieza unaPieza) {
		this.piezas.add(unaPieza);
	}
	
	public double VolumenDeMaterial(String material) {
		double sumaVolumenes=0;
		for(Pieza p : this.piezas) {
			if(p.getMateria().equals(material)) {
				sumaVolumenes+=p.getVolumen();
			}
		}
		return sumaVolumenes;
	}
	
	public double SuperficieColor(String color) {
		double sumaSuperficies=0;
		for(Pieza p: this.piezas) {
			if(p.getColor().equals(color)) {
				sumaSuperficies+= p.getSuperficie();			}
		}
		return sumaSuperficies;
	}
}
