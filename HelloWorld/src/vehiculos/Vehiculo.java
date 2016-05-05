package vehiculos;

public class Vehiculo {
	
	private String matricula;
	
	private final int precioDia = 50;
	
	private int diasAlquiler;
	
	Vehiculo(String matricula, int diasAlquiler){
		this.matricula = matricula;
		this.diasAlquiler = diasAlquiler;
	}
	
	public double getPrecioTotal(){
		return precioDia * diasAlquiler;
	}

	public String getMatricula() {
		return matricula;
	}	
	
	public double getDiasAlquiler(){
		return diasAlquiler;
	}
}
