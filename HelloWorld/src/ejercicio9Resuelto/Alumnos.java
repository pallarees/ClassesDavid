//Ej9 realizado por Victor Calatayud

public class Alumnos extends Persona {
	
	private String ciclo;
	private int curso;
	private char horario; //no va en persona, ya que no es una propiedad que identifique a la persona
	private double notaMedia;
	
	public Alumnos(String nombre, String apellidos, String nif, int edad, char sexo, String ci, int cur, char hor, double nota){
		super(nombre, apellidos, nif, edad, sexo);
		ciclo= ci;
		curso= cur;
		horario= hor;
		notaMedia= nota;
	}
	
	public void modAlumno(String n, String a, String e, String s, String c, String cur, String h, String nota){
		
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
			ciclo = c;
		}
		if(!cur.equals("")){
			curso = Integer.parseInt(cur);
		}
		if(!h.equals("")){
			horario = h.charAt(0);
		}
		if(!nota.equals("")){
			notaMedia = Double.parseDouble(nota);
		}
	}
	
	public String toString(){
		return super.toString() + "\nCiclo: " + ciclo + "\nCurso: " + curso + "\nHorario " + horario + "\nTiene una nota media de: " + notaMedia; 
	}
	
}

