package vehiculos;

public class Microbus extends Vehiculo{

	private final double suplemento = 2;
	
	private int plazas;
	
	Microbus(String matricula, int diasAlquiler, int plazas) {
		super(matricula, diasAlquiler);
		this.plazas = plazas;
	}
	
	@Override
	public double getPrecioTotal(){
		return super.getPrecioTotal() + suplemento * plazas; 
	}
	
}
