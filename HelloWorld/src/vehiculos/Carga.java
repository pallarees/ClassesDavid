package vehiculos;

public class Carga extends Vehiculo{

	private final double suplemento = 20;
	
	private double pma;
	
	Carga(String matricula, int diasAlquiler, double pma) {
		super(matricula, diasAlquiler);
		this.pma = pma;
	}
	
	@Override
	public double getPrecioTotal(){
		return super.getPrecioTotal() + suplemento * pma;
	}
}