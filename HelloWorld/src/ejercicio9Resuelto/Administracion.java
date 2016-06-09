//Ej9 realizado por Victor Calatayud

public class Administracion extends Persona {
	
	private String cargo, departamento;
	private double sueldo;
	private char horario; //no va en persona, ya que no es una propiedad que identifique a la persona
	
	public Administracion(String nombre, String apellidos, String nif, int edad, char sexo, String car, String dep, double s, char hor){
		super(nombre, apellidos, nif, edad, sexo);
		cargo= car;
		departamento= dep;
		sueldo= s;
		horario= hor;
	}
	
	
	
	public void modAdministracion(String n, String a, String e, String s, String c, String d, String su, String h){
	
		//si no esta vacio modifica si no no modifica
	
		if(!n.equals("")){
			nombre = n;
		}
		if(!a.equals("")){
			apellidos = a;
		}
		if(!e.equals("")){
			edad = Integer.parseInt(e);
		}
		if(!s.equals("")){
			sexo = s.charAt(0);
		}
		if(!c.equals("")){
			cargo = c;
		}
		if(!d.equals("")){
			departamento = d;
		}
		if(!su.equals("")){
			sueldo = Double.parseDouble(su);
		}
		if(!h.equals("")){
			horario = h.charAt(0);
		}
		
		
		
		
	}
	
	public String toString(){
		return super.toString() + "\nCargo: " + cargo + "\nDepartamento: " + departamento + "\nCobra " + sueldo + " euros \nTiene el horario de: " + horario; 
	}
	
}

