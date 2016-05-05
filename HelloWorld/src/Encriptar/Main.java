package Encriptar;

public class Main {

	public static void main(String[] args) {
		
		String cadena = encriptar.codificar("Hola");
		System.out.println(cadena);
		cadena = encriptar.decodificar(cadena);
		System.out.println(cadena);

	}

}
