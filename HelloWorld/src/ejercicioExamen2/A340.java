package ejercicioExamen2;

public class A340 extends Avion{
	
	
	int pasajeros;
	
	protected int combustible;
	
	protected int maximoCombustible;
	
	public A340(int altitud, int velocidad, int peso, int pasajeros) {
		super(altitud, velocidad, peso, pasajeros);
		this.maximoPasajeros = 250;
		this.maximoCombustible = 400;
		this.pasajeros = pasajeros;
	}
	
	public void cargarCombustible(){
		if (combustible < maximoCombustible) combustible++;
	}
	
	public void soltarCombustible(){
		if (combustible > 0) combustible--;
	}
	
	public boolean estaEnPerdida(){
		return velocidad < 120;
	}
}
