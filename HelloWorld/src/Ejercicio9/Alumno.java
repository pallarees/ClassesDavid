package Ejercicio9;

public class Alumno extends Persona{

	public String ciclo;
	
	public int curso;
	
	public String horario;

	public double notaMedia;
	
	@Override
	public String toString() {
		return "Alumno [ciclo=" + ciclo + ", curso=" + curso + ", horario=" + horario + ", notaMedia=" + notaMedia
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", NIF=" + NIF
				+ "]";
	}

}
