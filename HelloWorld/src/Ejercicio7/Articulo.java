package Ejercicio7;

public class Articulo implements Comparable{

	private String id;
	private String nombre;
	private double detalle;
	private int cantidad;
	private double precio;

	public Articulo(String id, String nombre, String detalle, String cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.detalle = Double.parseDouble(detalle);
		this.cantidad = Integer.parseInt(cantidad);		
		
		if (this.detalle > 400)
			this.precio = this.detalle * 0.5;
		else if (this.detalle > 200)
			this.precio = this.detalle * 0.6;
		else
			this.precio = this.detalle * 0.7;

		this.precio = Math.round(100 * this.precio) / 100d;
		
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getDetalle() {
		return detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Object obj) {
		final int MENOR = -1;
	    final int IGUAL = 0;
	    final int MAYOR = 1;

	    Articulo otroArticulo = (Articulo) obj;
	    
	    if( this == otroArticulo) return IGUAL;
	    if( this.getPrecio() > otroArticulo.getPrecio()) return MAYOR;
	    if (this.getPrecio() < otroArticulo.getPrecio()) return MENOR;
	    return IGUAL;
	}

	@Override
	public String toString() {
		return "Articulo [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
	
}
