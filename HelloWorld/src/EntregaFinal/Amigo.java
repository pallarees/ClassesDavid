package EntregaFinal;

public class Amigo extends Persona {

	Club club;

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Amigo [club=" + club + ", nombre=" + nombre + ", apellido=" + apellido + ", NIF=" + NIF + ", direccion="
				+ direccion + ", telefono=" + telefono + ", edad=" + edad + "]";
	}
}
