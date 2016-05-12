package Ejercicio63;

import java.util.Random;

public class Moneda extends Sorteo {

	private int numeroRandom;
	
	@Override
	public int lanzar() {
		
		super.posibilidades = 2;
		
		Random random = new Random();
		
		numeroRandom = random.nextInt(super.posibilidades) + 1;

		System.out.println(numeroRandom == 1 ? "Cara" : "Cruz");
			
		return numeroRandom;	
	}
	
	@Override
	public void saludar(){
		System.out.println("Hola, soy una moneda.");
	}
	
	

}
