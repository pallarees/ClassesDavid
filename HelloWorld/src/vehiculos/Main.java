package vehiculos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String matricula;
		
		int diasAlquiler;
		int plazas;
		double pma;
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Introduce la matr�cula para el veh�culo: ");
		matricula = scanner.next();
		
		System.out.println("Introduce los dias de alquiler: ");
		diasAlquiler = scanner.nextInt();
		
		Vehiculo vehiculo = new Vehiculo(matricula, diasAlquiler);		
		System.out.println("----------- TEST VEHICULO -----------");
		System.out.println("Matr�culo: "+ vehiculo.getMatricula());
		System.out.println("Precio total: " + vehiculo.getPrecioTotal());
		
		System.out.println("Introduce la matr�cula para el coche: ");
		matricula = scanner.next();
		
		System.out.println("Introduce los dias de alquiler: ");
		diasAlquiler = scanner.nextInt();
		
		System.out.println("Introduce el n�mero de plazas: ");
		plazas = scanner.nextInt();
		
		Coche coche = new Coche(matricula, diasAlquiler, plazas);
		System.out.println("----------- TEST COCHE -----------");
		System.out.println("Matr�culo: "+ coche.getMatricula());
		System.out.println("Precio total: " + coche.getPrecioTotal());
		
		System.out.println("Introduce la matr�cula para el microbus: ");
		matricula = scanner.next();
		
		System.out.println("Introduce los dias de alquiler: ");
		diasAlquiler = scanner.nextInt();
		
		System.out.println("Introduce el n�mero de plazas: ");
		plazas = scanner.nextInt();
		
		Microbus microbus = new Microbus(matricula, diasAlquiler, plazas);
		System.out.println("----------- TEST MICROBUS -----------");
		System.out.println("Matr�culo: "+ microbus.getMatricula());
		System.out.println("Precio total: " + microbus.getPrecioTotal());
		
		System.out.println("Introduce la matr�cula para el veh�culo de carga: ");
		matricula = scanner.next();
		
		System.out.println("Introduce los dias de alquiler: ");
		diasAlquiler = scanner.nextInt();
		
		System.out.println("Introduce el peso m�ximo autorizado: ");
		pma = scanner.nextDouble();
		
		Carga carga = new Carga(matricula, diasAlquiler, pma);
		System.out.println("----------- TEST CARGA -----------");
		System.out.println("Matr�culo: "+ carga.getMatricula());
		System.out.println("Precio total: " + carga.getPrecioTotal());
		
		System.out.println("Introduce la matr�cula para el camion: ");
		matricula = scanner.next();
		
		System.out.println("Introduce los dias de alquiler: ");
		diasAlquiler = scanner.nextInt();
		
		Camion camion = new Camion(matricula, diasAlquiler);
		System.out.println("----------- TEST CAMION -----------");
		System.out.println("Matr�culo: "+ camion.getMatricula());
		System.out.println("Precio total: " + camion.getPrecioTotal());
		
		scanner.close();
	}

}
