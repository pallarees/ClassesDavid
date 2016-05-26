package ejercicioExamen2;

public class A320 extends Avion {

	int pasajeros;

	public A320(int altitud, int velocidad, int peso, int pasajeros) {
		super(altitud, velocidad, peso);
		this.pasajeros = pasajeros;
	}

	public int asientosLibres() {
		return 100 - pasajeros;
	}

}
