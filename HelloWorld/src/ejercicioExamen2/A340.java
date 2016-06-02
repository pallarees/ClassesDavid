package ejercicioExamen2;

public class A340 extends Avion{
	
	final int MAXIMO_COMBUSTIBLE = 400;
	
	int pasajeros;
	
	int combustible;
	
	public A340(int altitud, int velocidad, int peso, int pasajeros) {
		super(altitud, velocidad, peso, pasajeros);
		this.maximoPasajeros = 250;
		this.pasajeros = pasajeros;
	}
	
	public void cargarCombustible(){
		if (combustible < MAXIMO_COMBUSTIBLE) combustible++;
	}
	
	public void soltarCombustible(){
		if (combustible > 0) combustible--;
	}
	
	public boolean estaEnPerdida(){
		return velocidad < 120;
	}
}
