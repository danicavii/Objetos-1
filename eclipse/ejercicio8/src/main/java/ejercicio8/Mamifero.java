package ejercicio8;

import java.time.LocalDate;
public  class Mamifero {
	String identificador;
	String Especie;
	LocalDate  FechaNacimiento;
	Mamifero Padre;
	Mamifero Madre;

	public Mamifero( String id) {
		this.identificador=id;
	}
	public Mamifero() {
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return ((this.Padre== unMamifero)|| (this.Madre== unMamifero) || 
				(this.Padre != null && this.Padre.tieneComoAncestroA(unMamifero) ||
				(this.Madre != null && this.Madre.tieneComoAncestroA(unMamifero))));
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.Madre != null) {
			return this.Madre.getPadre();
		}
		return null;
	}
	public Mamifero getAbuelaMaterna() {
		if(this.Madre !=null) {
			return this.Madre.getMadre();
		}
		return null;
	}
	public Mamifero getAbueloPaterno() {
		if(this.Padre !=null) {
			return this.Padre.getPadre();
		}
		return null;
	}
	public Mamifero getAbuelaPaterna() {
		if(this.Padre !=null) {
			return this.Padre.getMadre();
		}
		return null;
	}

	public String getIdentificador(){
		return this.identificador;
	}
	public void setIdentificador (String id){
		this.identificador= id;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public Mamifero getPadre() {
		return Padre;
	}

	public void setPadre(Mamifero padre) {
		Padre = padre;
	}

	public Mamifero getMadre() {
		return Madre;
	}

	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	
	

}
