package ejercicioExamen2;

public class A380 extends A340 {
	
	public int pasajeros;
	
	final int VELOCIDAD_DE_NO_RETORNO = 300;
	
	public A380(int altitud, int velocidad, int peso, int pasajeros) {
		super(altitud, velocidad, peso, pasajeros);
		this.maximoPasajeros = 400;	
		this.maximoCombustible = 10000;
		this.pasajeros = pasajeros;
	}
	
	public void abortarDespegue(){
		if (velocidad < VELOCIDAD_DE_NO_RETORNO) velocidad = 0;
	}
	
}