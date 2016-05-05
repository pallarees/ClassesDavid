package vehiculos;

public class Coche extends Vehiculo{

	private int plazas;
	
	private final double suplemento = 1.5;
	
	Coche(String matricula, int diasAlquiler, int plazas) {
		super(matricula, diasAlquiler);
		this.plazas = plazas;
	}
	
	@Override
	public double getPrecioTotal(){
		return super.getPrecioTotal() + suplemento * plazas * getDiasAlquiler();
	}
}