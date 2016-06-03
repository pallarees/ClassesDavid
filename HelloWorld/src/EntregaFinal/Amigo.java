package EntregaFinal;

public class Amigo {


	String nombre;
	
	String apellido;
	
	String NIF;
	
	String direccion;
	
	String telefono;
	
	int edad;
	
	Club club;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", edad=" + edad + ", club=" + club + "]";
	}
	
	
}
