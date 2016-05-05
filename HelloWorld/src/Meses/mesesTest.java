package Meses;


public class mesesTest {
	
	public static void main (String args[]) 
	{
	
		Meses mes=new Meses(35);
		mes = new Meses();
		System.out.println("El nombre del mes es: "+mes.getMonthName());
		System.out.println("El numero de dias del mes son: "+mes.getNumberOfDays());
		
	}
}

