//Ej9 realizado por Victor Calatayud

public abstract class Persona {
	
	
	protected String nombre, apellidos, nif;
	protected int edad;
	protected char sexo;
	
	Persona(String nom, String a, String n, int e, char s){
		nombre= nom;
		apellidos= a;
		nif= n;
		edad= e;
		sexo= s;
	}
	
	public String toString(){
		return nombre + " " + apellidos + "\nNIF: " + nif + "\n" + edad + " anyos \nAbreviatura sexo: " + sexo; 
	}
	
	
	
}

