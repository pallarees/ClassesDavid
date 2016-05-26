package ejercicioExamen1;

public class Coche {
	
	String modelo;
	String motor;
	int numeroPuertas;
	double precio;
	String color;
	String cambio;
	
	public Coche(String modelo, String motor, int numeroPuertas, double precio, String color, String cambio){
		this.modelo = modelo;
		this.motor = motor;
		this.numeroPuertas = numeroPuertas;
		this.precio = precio;
		this.color = color;
		this.cambio = cambio;
	}
	
	public Coche(String modelo, String motor, int numeroPuertas, double precio){
		this(modelo, motor, numeroPuertas, precio, "Blanco", "Manual");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	public boolean isManual(){
		return this.cambio.equals("Manual");
	}
	
	public boolean hasPlanPive(){
		return 10000 <= this.precio && this.precio <= 22500;
	}
	
	public boolean hasDiscount(){
		return this.precio > 22500;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", motor=" + motor + ", numeroPuertas=" + numeroPuertas + ", precio="
				+ precio + ", color=" + color + ", cambio=" + cambio + ", isManual=" + this.isManual() + ", hasPlanPive=" + hasPlanPive()+
				", hasDiscount="+hasDiscount()+"]";
	}
}
