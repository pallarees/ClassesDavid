package ejercicioExamen2;

public class Avion {

	int altitud;
	int velocidad;
	int peso;
	
	boolean congelado = true;
	
	public Avion(int altitud, int velocidad, int peso) {
		this.altitud = altitud;
		this.velocidad = velocidad;
		this.peso = peso;
	}
	
	public void aumentarVelocidad(){
		velocidad++;
	}
	
	public void disminuirVelocidad(){
		velocidad--;
	}
	
	public void descongelar(){
		congelado = false;
	}
	
	
	
}
