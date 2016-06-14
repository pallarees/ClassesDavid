package EntregaFinal;

public class Familiar extends Persona{

	String nombreDelPadre;

	String relacionConmigo;

	public String getNombreDelPadre() {
		return nombreDelPadre;
	}

	public void setNombreDelPadre(String nombreDelPadre) {
		this.nombreDelPadre = nombreDelPadre;
	}

	public String getRelacionConmigo() {
		return relacionConmigo;
	}

	public void setRelacionConmigo(String relacionConmigo) {
		this.relacionConmigo = relacionConmigo;
	}

	@Override
	public String toString() {
		return "Familiar [nombreDelPadre=" + nombreDelPadre + ", relacionConmigo=" + relacionConmigo + ", nombre="
				+ nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", direccion=" + direccion + ", telefono="
				+ telefono + ", edad=" + edad + "]";
	}
	
}
