package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean on;
	private ArrayList<Farola> Farolas;
	
	public Farola() {
		this.on= false;
		this.Farolas = new ArrayList<Farola>();
	}
	
	
	public void AgregarFarola(Farola unaFarola) {
		this.Farolas.add(unaFarola);
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.Farolas.contains(otraFarola)) { // Evitar los duplicados , si ya existe la farola como vecina
			this.AgregarFarola(otraFarola); // agrego la farola como vecina de this
			otraFarola.AgregarFarola(this);// agrego a la lista de la otra farola this , ambas se reconocen entre si 
		}
	}
	
	public void turnOn() {
		if(this.isOn()) {
			return;
		}else {
			this.on= true;
			for(Farola f: this.Farolas){
				f.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(this.isOff()) {
			return;
		}else {
			this.on=false;
			for(Farola f: this.Farolas) {
				f.turnOff();
			}
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.Farolas;
	}

	
	public boolean isOff() {
		return !this.on;
	}

	public boolean isOn() {
		return this.on;
	}
}
