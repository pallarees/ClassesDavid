package Ejercicio63;

public class Jugar {

	public static void main(String[] args) {
		
		Sorteo sorteo = new Dado();

		sorteo.lanzar();
		
		sorteo.saludar();
		
		sorteo = new Moneda();
		
		sorteo.lanzar();
		
		sorteo.saludar();
	}

}
