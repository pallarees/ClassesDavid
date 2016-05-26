package ejercicioExamen1;

public class Main {
	public static void main(String[] args) {		
		Coche[] coches = new Coche[10];
		
		coches[0] = new Coche("Corsa", "Motor", 3, 10000);
		coches[1] = new Coche("Leon", "Motor", 5, 25000, "Rojo", "Automatico");
		coches[2] = new Coche("Cordoba", "Motor", 5, 9000, "Verde", "Manual");
		
		for(Coche coche : coches){
			if (coche != null) System.out.println(coche);
		}
	}
}