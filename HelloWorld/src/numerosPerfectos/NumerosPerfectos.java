package numerosPerfectos;

public class NumerosPerfectos {

	public static void main(String[] args) {

		int numerosPerfectos[] = new int[40];
		int numerosEncontrados = 0;

		int candidato = 1;
		
		while (numerosEncontrados < 40) {
			int sumaDivisores = 0;
			for (int j = 1; j < candidato; j++) {
				if(candidato % j == 0){
					sumaDivisores += j;
				}
			}
			
			if(sumaDivisores == candidato){
				numerosPerfectos[numerosEncontrados++] = candidato;
				System.out.println(candidato);
			}
			
			candidato++;
		}
		
		int sumaTotal = 0;
		
		for (int i = 0; i < numerosPerfectos.length; i++) {
			sumaTotal+=numerosPerfectos[i];
			System.out.println(numerosPerfectos[i]);
		}
		
		System.out.println("Suma total: "+sumaTotal);
		

	}

}
