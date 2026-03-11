package ejercicio10;

public class ejer10 {

	public static void main(String[] args) {
		
		
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		System.out.println(aportesDeAlan);
		System.out.println(sueldoBasicoDeAlan);

	}

}
