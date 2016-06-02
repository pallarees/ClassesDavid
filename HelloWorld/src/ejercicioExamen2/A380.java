package ejercicioExamen2;

public class A380 extends Avion {

	final int MAXIMO_COMBUSTIBLE = 10000;
	
	public int pasajeros;
	
	public int combustible;
	
	final int VELOCIDAD_DE_NO_RETORNO = 300;
	
	public A380(int altitud, int velocidad, int peso, int pasajeros) {
		super(altitud, velocidad, peso, pasajeros);
		this.maximoPasajeros = 400;	
		this.pasajeros = pasajeros;
	}
	
	public void cargarCombustible(){
		if (combustible < MAXIMO_COMBUSTIBLE) combustible++;
	}
	
	public void soltarCombustible(){
		if (combustible > 0) combustible--;
	}
	
	public void abortarDespegue(){
		if (velocidad < VELOCIDAD_DE_NO_RETORNO) velocidad = 0;
	}
	
}