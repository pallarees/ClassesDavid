package EntregaFinal;

public class Club {

	String nombre;
	
	String descripci�n;
	
	int numeroMiembros;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public int getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(int numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}

	
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", descripci�n=" + descripci�n + ", numeroMiembros=" + numeroMiembros + "]";
	}
	
}
