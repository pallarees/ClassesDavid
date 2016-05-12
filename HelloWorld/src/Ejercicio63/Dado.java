package Ejercicio63;

import java.util.Random;

public class Dado extends Sorteo{

	private int numeroRandom;
	
	@Override
	public int lanzar() {	
		super.posibilidades = 6;
		
		Random random = new Random();
		numeroRandom = random.nextInt(super.posibilidades) + 1;
		
		System.out.println(numeroRandom);
		return numeroRandom;
	}

}