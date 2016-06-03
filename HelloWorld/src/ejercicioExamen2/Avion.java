package ejercicioExamen2;

public class Avion {

	final int VELOCIDAD_MINIMA = 100;
	
	int altitud;
	int velocidad;
	int peso;
	int pasajeros;
	
	protected int maximoPasajeros;
	
	boolean congelado = true;
	
	public Avion(int altitud, int velocidad, int peso, int pasajeros) {
		this.altitud = altitud;
		this.velocidad = velocidad;
		this.peso = peso;
		this.pasajeros = pasajeros;
	}
	
	public void aumentarVelocidad(){
		velocidad++;
	}
	
	public void disminuirVelocidad(){
		if(velocidad > 100) velocidad--;
	}
	
	public void descongelar(){
		congelado = false;
	}
	
	public int asientosLibres() {
		return maximoPasajeros - pasajeros;
	}	
}
