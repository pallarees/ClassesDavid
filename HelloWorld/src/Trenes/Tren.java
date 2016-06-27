package Trenes;

public class Tren {
	
	final int MAXIMO_VAGONES  = 20;
	
	int vagones_actuales = 0;
	
	public void cargar(){
		if(! (vagones_actuales == MAXIMO_VAGONES)) vagones_actuales++;
	}
	
	public void descargar(){
		if (! (vagones_actuales == 0)) vagones_actuales--;
	}
	
	final int MAXIMO_PASAJEROS = 20;
	
	int pasajeros_actuales = 0;
	
	public void reservar(){
		if (! (pasajeros_actuales == MAXIMO_PASAJEROS)) pasajeros_actuales++;
	}
	
	public 

}
