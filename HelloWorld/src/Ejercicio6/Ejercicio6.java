package Ejercicio6;

import java.util.LinkedList;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		int tamanyo = 10;
		
		IVector vector = new Vector(tamanyo); 
		
		for (int i = 0; i < tamanyo; i++) {
			vector.guardar(new String("Posicion " + i), i);
		}
		
		imprimir(tamanyo, vector);
		
		vector.eliminar(4);
		
		imprimir(tamanyo, vector);
		
		vector.eliminarTodos();

		imprimir(tamanyo, vector);
		
	}

	private static void imprimir(int tamanyo, IVector vector) {
		for (int i = 0; i < tamanyo; i++) {
			System.out.println(vector.obtener(i));
		}
	}

}
