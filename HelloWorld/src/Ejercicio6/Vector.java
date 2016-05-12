package Ejercicio6;

public class Vector implements IVector{
	
	private Object[] vector;
	private int tamanyo;
	
	public Vector(int tamanyo){
		this.tamanyo = tamanyo;
		vector = new Object[tamanyo];
	}
	
	@Override
	public void guardar(Object obj, int indice) {	
		vector[indice] = obj;		
	}

	@Override
	public Object obtener(int indice) {
		return vector[indice];
	}

	@Override
	public void eliminar(int indice) {
		vector[indice] = null;
	}

	@Override
	public void eliminarTodos() {
		vector = new Object[tamanyo];
	}
	
	public void decirHola(){
		System.out.println("Hola");
	}
	
}
