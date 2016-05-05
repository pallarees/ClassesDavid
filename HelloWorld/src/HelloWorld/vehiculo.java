package HelloWorld;


public class vehiculo extends coche {
	
	private String modelo;
	private String marca;
	private int puertas;
	private double cilindrada;
	
	vehiculo(String modelo,String marca,int puertas,double cilindrada,String color,String bastidor,char cambio, double peso)
	{
		super(color,bastidor,cambio,peso);
		this.modelo=modelo;
		this.marca=marca;
		this.puertas=puertas;
		this.cilindrada=cilindrada;
		
		
	}
		
	public void setModelo(String modelo)
	{
		this.modelo=modelo;
	}
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	public void setPuertas(int puertas)
	{
		this.puertas=puertas;
	}
	public void setCilindrada(double cilindrada)
	{
		this.cilindrada=cilindrada;
	}
	
	public String getModelo()
	{
		return modelo;
	}
	public String getMarca()
	{
		return marca;
	}
	public int getPuertas()
	{
		return puertas;
	}
	public double getCilindrada()
	{
		return cilindrada;
	}
	
	@Override
	public String toString() {
		return "vehiculo [modelo=" + modelo + ", marca=" + marca + ", puertas=" + puertas + ", cilindrada=" + cilindrada
				+ "]";
	}
	
	
}

