package Encriptar;


public final class  encriptar {
	
	private static final int desplazamiento=20;
	
	public static String codificar(String s)
	{
		String resultado="";
		int numero;
		char c;
		
		for(int i=0;i<s.length();i++)
		{
			numero=(int) s.charAt(i);
			numero=numero+desplazamiento;
			c=(char) numero;
			resultado=resultado+Character.toString(c);
		}
		return resultado;
	}
	
	public static String decodificar(String s)
	{
		String resultado="";
		int numero;
		char c;
		for(int i=0;i<s.length();i++)
		{
			numero=(int) s.charAt(i);
			numero=numero-desplazamiento;
			c=(char) numero;
			resultado=resultado+Character.toString(c);
		}
		return resultado;
	}
	
	
	public static void main (String args[]) {
		
		String texto="Hola Mariola";
		String textocod;
		textocod=codificar(texto);
		System.out.println(textocod);
		System.out.println(decodificar(textocod));
			
	}
}

