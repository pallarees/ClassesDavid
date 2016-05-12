package Ejercicio6;

public interface IVector {

	public void guardar(Object obj, int indice);
	
	public Object obtener(int indice);
	
	public void eliminar(int indice);
	
	public void eliminarTodos();
	
}
