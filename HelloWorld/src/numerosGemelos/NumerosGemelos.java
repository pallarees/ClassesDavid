package numerosGemelos;

public class NumerosGemelos {

	public static void main(String[] args) {

		int limite = 30;

		int i = 0;
		int numero = 2;
		while (i < limite) {
			if (esPrimo(numero) && esPrimo(numero + 2)) {
				System.out.println( i +" -> (" + numero + ", " + (int) (numero + 2) + ")");
				i++;
			}
			numero++;
		}

	}

	public static boolean esPrimo(int numero) {
		int aux;
		for (int cont = 2; cont < numero; cont++) {
			aux = numero % cont;
			if (aux == 0)
				return false;
		}
		return true;
	}
}
