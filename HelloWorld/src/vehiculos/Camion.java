package vehiculos;

public class Camion extends Vehiculo{

	private final double suplemento = 40;
	
	Camion(String matricula, int diasAlquiler) {
		super(matricula, diasAlquiler);	
	}
	
	@Override
	public double getPrecioTotal(){
		return super.getPrecioTotal() + suplemento;
	}
}
