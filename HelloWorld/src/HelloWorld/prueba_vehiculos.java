package HelloWorld;


public class prueba_vehiculos {
	
	public static void main (String args[]) {
		
		vehiculo coche1=new vehiculo("Fiesta","Ford",5,1500,"rojo","1343Bv343HJ",'M',12500);
		System.out.println(coche1.getMarca());
		System.out.println(coche1.getModelo());
		System.out.println(coche1.getPuertas());
		System.out.println(coche1.getCilindrada());
		System.out.println(coche1.getColor());
		System.out.println(coche1.getBastidor());
		System.out.println(coche1.getCambio());
		System.out.println(coche1.getPeso());
		coche1.setPuertas(3);
		coche1.setCambio('A');
		System.out.println("-------------------------------------------");
		System.out.println(coche1.getMarca());
		System.out.println(coche1.getModelo());
		System.out.println(coche1.getPuertas());
		System.out.println(coche1.getCilindrada());
		System.out.println(coche1.getColor());
		System.out.println(coche1.getBastidor());
		System.out.println(coche1.getCambio());
		System.out.println(coche1.getPeso());
		System.out.println("-------------------------------------------");
		System.out.println(coche1.toString());
		
	}
}

