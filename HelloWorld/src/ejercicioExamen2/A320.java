package ejercicioExamen2;

public class A320 extends Avion {

	int pasajeros;

	public A320(int altitud, int velocidad, int peso, int pasajeros) {
		super(altitud, velocidad, peso, pasajeros);
		this.pasajeros = pasajeros;
		this.maximoPasajeros = 100;
	}
}
