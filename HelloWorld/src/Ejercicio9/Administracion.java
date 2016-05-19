package Ejercicio9;

public class Administracion extends Persona{

	public String cargo;
	
	public double sueldo;
	
	public String horario;
	
	@Override
	public String toString() {
		return "Administracion [cargo=" + cargo + ", sueldo=" + sueldo + ", horario=" + horario + ", departamento="
				+ departamento + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo
				+ ", NIF=" + NIF + "]";
	}

	public String departamento;
	
}
