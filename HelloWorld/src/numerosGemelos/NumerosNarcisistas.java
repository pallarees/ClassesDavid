package numerosGemelos;

public class NumerosNarcisistas {

	public static void main(String[] args) {
		
		int limite = 5;
		
		int actual = 0;
		
		int numero = 0;
		
		while(actual < limite){
			String numeroString = Integer.toString(numero);
			
			int suma = 0;
			for (int i = 0; i < numeroString.length(); i++) {
				suma += (int) Math.pow(numeroString.charAt(i), numeroString.length());
				if (suma == numero) System.out.println(numero);
				actual++;
			}
			
			numero++;
		}

	}

}
