package Ejercicio7;

import java.util.Arrays;

public class Util {
	public static void sort(Articulo[] articulos) {
		boolean intercambiado = true;
		int j = 0;
		while (intercambiado) {
			intercambiado = false;
			j++;
			for (int i = 0; i < articulos.length - j; i++) {
				if (articulos[i].compareTo(articulos[i + 1]) == 1) {
					intercambiar(articulos, i);
					intercambiado = true;
				}
			}
		}
	}

	private static void intercambiar(Articulo[] articulos, int i) {
		Articulo temporal = articulos[i];
		articulos[i] = articulos[i + 1];
		articulos[i + 1] = temporal;
	}
}
