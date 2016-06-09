//Ej9 realizado por Victor Calatayud

public class Utilidades {
	
	//Utilidades de control de errores
	
	public static boolean esEntero(String numero){
		boolean correcto=false;
		if(!numero.isEmpty()){ //si esta vacio no sera un entero
			correcto= true;
			for(int i=0; i<numero.length() && correcto; i++){
				if(!Character.isDigit(numero.charAt(i))){ //si no es un numero no sera entero
					correcto= false;
				}
			}
		}
		
		return correcto;
		
	}
	
	public static boolean esDecimal(String numero){
		boolean correcto= false;
		int contador=0;
		if(!numero.isEmpty()){ //si esta vacio no sera un entero
			correcto= true;
			for(int i=0; i<numero.length() && correcto; i++){
				if(numero.charAt(i)=='.' && contador==0){ //si al recorrelo no ha salido un '.' que sume 1 y si ha salido no entrara e ira al segundo if
					contador++;
				}else{
					if(!Character.isDigit(numero.charAt(i))){//si no es un numero sera falso
						correcto= false;
					}
				}					
			}
		}
		
		return correcto;
		
	}
	
	//Utilidades generales
	
	public static int comprobarNIF(Persona [] vec, String n){
		boolean encontrado= false;
		int posicion=-1;
		for(int i=0; i<vec.length && !encontrado; i++){
			if(vec[i]!=null){
				if(vec[i].nif.equals(n)){ //compara nif si lo encuentra guarda la posicion
					encontrado= true;
					posicion=i;
				}
			}
		}
		
		if(encontrado){
			return posicion; //devuelve la posicion donde esta el objeto con ese nif
		} else{
			return -1; // no ha encontrado el objeto con ese nif
		}
	}
	
	//Utilidades para alumnos
	
	
	public static void altaAlumno(Alumnos [] vec, String nombre, String apellidos, String nif, String edad, String sexo, String ci, String cur, String hor, String nota){
		boolean lleno= true;
		
		for(int i=0; i<vec.length && lleno; i++){
			if(vec[i]==null){ //si es null es que hay una posicion vacia para anyadir el alumno
				lleno= false;
				
				//si estos campos estan vacios se pondran a por defecto
				
				if(edad.equals("")){
					edad = "0";
				}
				if(sexo.equals("")){
					sexo = " ";
				}
				if(cur.equals("")){
					cur = "0";
				}
				if(hor.equals("")){
					hor = " ";
				}   
				if(nota.equals("")){
					nota = "0.0";
				}
				vec[i]= new Alumnos(nombre, apellidos, nif, Integer.parseInt(edad), sexo.charAt(0), ci, Integer.parseInt(cur),hor.charAt(0), Double.parseDouble(nota));
			}
		}
		
	}
	
	public static boolean bajaAlumno(Alumnos [] vec, String nif){
		int posicion=comprobarNIF(vec,nif); //guarda la posicion del objeto con ese nif
		if(posicion != -1){ //si lo ha encontrado entra
			vec[posicion]= null;
			return true;
		} else{
			return false;
		}
		
	}
	
	
	//Utilidades para personal de Administracion
	
	public static void altaAdministracion(Administracion [] vec, String nombre, String apellidos, String nif, String edad, String sexo, String car, String dep, String s, String hor){
		boolean lleno= true;
		
		for(int i=0; i<vec.length && lleno; i++){
			if(vec[i]==null){ //si es null es que hay una posicion vacia para anyadir el personal
				lleno= false;
				
				//si estos campos estan vacios se pondran a por defecto
				
				if(edad.equals("")){
					edad = "0";
				}
				if(sexo.equals("")){
					sexo = " ";
				}
				if(s.equals("")){
					s ="0.0";
				}
				if(hor.equals("")){
					hor = " ";
				}
				vec[i]= new Administracion(nombre, apellidos, nif, Integer.parseInt(edad), sexo.charAt(0), car, dep, Double.parseDouble(s), hor.charAt(0));
			}
		}
		
	}
	
	public static boolean bajaAdministracion(Administracion [] vec, String nif){
		int posicion=comprobarNIF(vec,nif); //guarda la posicion del objeto con ese nif
		if(posicion != -1){ //si lo ha encontrado entra
			vec[posicion]= null;
			return true;
		} else{
			return false;
		}
		
	}
	
}

