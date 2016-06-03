package EntregaFinal;

public class Club {

	String nombre;
	
	String descripción;
	
	int numeroMiembros;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public int getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(int numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}

	
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", descripción=" + descripción + ", numeroMiembros=" + numeroMiembros + "]";
	}
	
}
