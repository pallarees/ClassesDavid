package Ejercicio7;

public class Regalo {

	public static void main(String[] args) {
		Articulo[] articulos = new Articulo[10];
		
		for (int i = articulos.length  - 1; i >= 0 ; i--) {
			articulos[articulos.length - 1- i] = new Articulo("ID"+i, "Nombre"+i,Integer.toString(i),Integer.toString(i));
		}
		
		System.out.println("Artículos desordenados");
		imprimir(articulos);
		
		Util.sort(articulos);
		
		System.out.println("Artículos ordenados por precio");
		imprimir(articulos);
		
		
	}

	private static void imprimir(Articulo[] articulos) {
		for (int i = 0; i < articulos.length; i++){
			System.out.println(articulos[i]);
		}
	}

}
