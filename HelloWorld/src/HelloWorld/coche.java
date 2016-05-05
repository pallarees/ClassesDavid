package HelloWorld;


public class coche {
	
	private String color;
	private String bastidor;
	private char cambio;
	private double peso;
	
	
	coche(String color,String bastidor, char cambio,double peso)
	{
		this.color=color;
		this.bastidor=bastidor;
		this.cambio=cambio;
		this.peso=peso;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setBastidor(String bastidor)
	{
		this.bastidor=bastidor;
	}
	public void setCambio(char cambio)
	{
		this.cambio=cambio;
	}
	public void setPeso(double peso)
	{
		this.peso=peso;
	}
	
	public String getColor()
	{
		return color;
	}
	public String getBastidor()
	{
		return bastidor;
	}
	public char getCambio()
	{
		return cambio;
	}
	public double getPeso()
	{
		return peso;
	}
}

