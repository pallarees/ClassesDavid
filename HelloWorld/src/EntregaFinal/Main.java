package EntregaFinal;

import java.util.Scanner;

public class Main {

	public static String NIF;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Quieres gestionar amigos o familiares? (A/F): ");

		String opcion = scanner.nextLine();
		if (opcion.length() > 0) {
			while (!(opcion.equals("A") || opcion.equals("F"))) {
				System.out.println("Dato incorrecto. ¿Quieres gestionar amigos o familiares? (A/F) ");
				opcion = scanner.next();
			}

			if (opcion.equals("A")) {
				gestionarAmigos(scanner);
			} else {
				gestionarFamilares(scanner);
			}
		}

		scanner.close();
	}

	private static void gestionarFamilares(Scanner scanner) {
		Familiar[] familiares = new Familiar[10];

		System.out.println("Introduce 1 para dar de alta un familiar");
		System.out.println("Introduce 2 para modificar un familiar");
		System.out.println("Introduce 3 para eliminar un familiar");
		System.out.println("Introduce 4 para mostrar todos los familiar");
		System.out.println("Introduce 5 para mostrar un familiar");
		System.out.println("Introduce 6 para salir");

		String opcion = scanner.nextLine();

		while (!opcion.equals("6")) {
			switch (opcion) {
			case "1":
				altaFamiliar(scanner, familiares);
				break;
			case "2":
				modificarFamiliar(scanner, familiares);
				break;
			case "3":
				eliminarFamiliar(scanner, familiares);
				break;
			case "4":
				mostrarTodosFamiliares(familiares);
				break;
			case "5":
				mostrarFamiliar(scanner, familiares);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
			System.out.println("Introduce otra opción para continuar: ");

			opcion = scanner.nextLine();
		}
		System.out.println("FIN");
		
	}

	private static void mostrarFamiliar(Scanner scanner, Familiar[] familiares) {
		System.out.println("Introduce el NIF de tu familiar: ");

		String NIF = scanner.nextLine();

		boolean encontrado = false;

		for (Familiar familiar : familiares) {
			if (familiar != null && familiar.NIF.equals(NIF)) {
				System.out.println(familiar);
				encontrado = true;
			}
		}
		if (!encontrado)
			System.out.println("No se ha encontrado tu familiar.");
		
	}

	private static void mostrarTodosFamiliares(Familiar[] familiares) {
		boolean encontrado = false;

		for (Familiar familiar : familiares) {
			if (familiar != null) {
				System.out.println(familiar);
				encontrado = true;
			}
		}

		if (!encontrado)
			System.out.println("Aun no tienes amigos.");
		
	}

	private static void eliminarFamiliar(Scanner scanner, Familiar[] familiares) {
		int posicion = encontrarPorNIF(scanner, familiares);
		if (posicion < 0 || familiares[posicion] == null) {
			System.out.println("No se ha encontrado.");
		} else {
			familiares[posicion] = null;
			System.out.println("Familiar borrado correctamente.");
		}
		
	}

	private static void modificarFamiliar(Scanner scanner, Familiar[] familiares) {
		int posicion = encontrarPorNIF(scanner, familiares);
		

		if (posicion < 0) {
			System.out.println("No se ha encontrado.");
		} else {
			familiares[posicion] = obtenerFamiliar(scanner);
		}
		
	}

	private static int encontrarPorNIF(Scanner scanner, Familiar[] familiares) {
		System.out.println("Introduce el NIF de tu familiar: ");

		NIF = scanner.nextLine();
		boolean encontrado = false;

		int i = 0;

		for (; i < familiares.length && !encontrado; i++) {
			if (familiares[i] != null && familiares[i].getNIF().equals(NIF)) {
				encontrado = true;
			}
		}

		i--;
		
		return encontrado ? i : -1;

	}

	private static void altaFamiliar(Scanner scanner, Familiar[] familiares) {
		Familiar familiar = obtenerFamiliar(scanner);

		int posicionLibre = posicionLibre(familiares);
		
		if (posicionLibre < 0) {
			System.out.println("La base de datos está llena.");
		} else {
			familiares[posicionLibre] = familiar;
		}
		
	}

	private static int posicionLibre(Familiar[] familiares) {
		for (int i = 0; i < familiares.length; i++) {
			if (familiares[i] == null)
				return i;
		}
		return -1;
	}

	private static Familiar obtenerFamiliar(Scanner scanner) {
		Familiar familiar = new Familiar();

		String nombre;
		do {
			System.out.println("Introduce el nombre de tu familiar: ");
			nombre = scanner.nextLine();
		} while (nombre.equals(""));

		familiar.setNombre(nombre);

		String apellido;

		do {
			System.out.println("Introduce el apellido de tu familiar: ");

			apellido = scanner.nextLine();
		} while (apellido.equals(""));

		familiar.setApellido(apellido);

		String direccion;

		do {
			System.out.println("Introduce la dirección de tu familiar: ");
			direccion = scanner.nextLine();
		} while (direccion.equals(""));

		familiar.setDireccion(direccion);

		do {
			System.out.println("Introduce el NIF de tu familiar: ");
			NIF = scanner.nextLine();
		} while (NIF.equals(""));

		familiar.setNIF(NIF);

		System.out.println("Introduce el telefono de tu familiar: ");

		familiar.setTelefono(scanner.nextLine());

		String edad;

		do {
			System.out.println("Introduce la edad de tu familiar: ");
			edad = scanner.nextLine();
		} while (!esEntero(edad) && !edad.equals(""));

		familiar.setEdad(edad.equals("") ? 0 : Integer.parseInt(edad));

		String nombreDelPadre;
		
		do {
			System.out.println("Introduce el nombre del padre de tu familiar: ");
			nombreDelPadre = scanner.nextLine();
		} while (nombreDelPadre.equals(""));

		familiar.setNombreDelPadre(nombreDelPadre);
		
		String relacionConmigo;
		
		do {
			System.out.println("Introduce la relación con tu familiar: ");
			relacionConmigo = scanner.nextLine();
		} while (relacionConmigo.equals(""));

		familiar.setRelacionConmigo(relacionConmigo);

		return familiar;
	}

	private static void gestionarAmigos(Scanner scanner) {
		Amigo[] amigos = new Amigo[10];

		System.out.println("Introduce 1 para dar de alta un amigo");
		System.out.println("Introduce 2 para modificar un amigo");
		System.out.println("Introduce 3 para eliminar un amigo");
		System.out.println("Introduce 4 para mostrar todos los amigos");
		System.out.println("Introduce 5 para mostrar un amigo");
		System.out.println("Introduce 6 para salir");

		String opcion = scanner.nextLine();

		while (!opcion.equals("6")) {
			switch (opcion) {
			case "1":
				altaAmigo(scanner, amigos);
				break;
			case "2":
				modificarAmigo(scanner, amigos);
				break;
			case "3":
				eliminarAmigo(scanner, amigos);
				break;
			case "4":
				mostrarTodosAmigos(amigos);
				break;
			case "5":
				mostrarAmigo(scanner, amigos);
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
			System.out.println("Introduce otra opción para continuar: ");

			opcion = scanner.nextLine();
		}
		System.out.println("FIN");
	}

	private static void eliminarAmigo(Scanner scanner, Amigo[] amigos) {
		int posicion = encontrarPorNIF(scanner, amigos);
		if (posicion < 0 || amigos[posicion] == null) {
			System.out.println("No se ha encontrado.");
		} else {
			amigos[posicion] = null;
			System.out.println("Amigo borrado correctamente.");
		}

	}

	private static void modificarAmigo(Scanner scanner, Amigo[] amigos) {
		int posicion = encontrarPorNIF(scanner, amigos);
	

		if (posicion < 0) {
			System.out.println("No se ha encontrado.");
		} else {
			amigos[posicion] = obtenerAmigo(scanner);
		}

	}

	private static int encontrarPorNIF(Scanner scanner, Amigo[] amigos) {
		System.out.println("Introduce el NIF de tu amigo: ");

		NIF = scanner.nextLine();
		boolean encontrado = false;

		int i = 0;

		for (; i < amigos.length && !encontrado; i++) {
			if (amigos[i] != null && amigos[i].getNIF().equals(NIF)) {
				encontrado = true;
			}
		}

		i--;
		
		return encontrado ? i : -1;

	}

	private static void mostrarAmigo(Scanner scanner, Amigo[] amigos) {
		System.out.println("Introduce el NIF de tu amigo: ");

		String NIF = scanner.nextLine();

		boolean encontrado = false;

		for (Amigo amigo : amigos) {
			if (amigo != null && amigo.NIF.equals(NIF)) {
				System.out.println(amigo);
				encontrado = true;
			}
		}
		if (!encontrado)
			System.out.println("No se ha encontrado tu amigo.");
	}

	private static void mostrarTodosAmigos(Amigo[] amigos) {

		boolean encontrado = false;

		for (Amigo amigo : amigos) {
			if (amigo != null) {
				System.out.println(amigo);
				encontrado = true;
			}
		}

		if (!encontrado)
			System.out.println("Aun no tienes amigos.");
	}

	private static void altaAmigo(Scanner scanner, Amigo[] amigos) {

		Amigo amigo = obtenerAmigo(scanner);

		int posicionLibre = posicionLibre(amigos);

		System.out.println(posicionLibre);
		
		if (posicionLibre < 0) {
			System.out.println("La base de datos está llena.");
		} else {
			amigos[posicionLibre] = amigo;
		}
	}

	private static Amigo obtenerAmigo(Scanner scanner) {
		Amigo amigo = new Amigo();

		String nombre;
		do {
			System.out.println("Introduce el nombre de tu amigo: ");
			nombre = scanner.nextLine();
		} while (nombre.equals(""));

		amigo.setNombre(nombre);

		String apellido;

		do {
			System.out.println("Introduce el apellido de tu amigo: ");

			apellido = scanner.nextLine();
		} while (apellido.equals(""));

		amigo.setApellido(apellido);

		String direccion;

		do {
			System.out.println("Introduce la dirección de tu amigo: ");
			direccion = scanner.nextLine();
		} while (direccion.equals(""));

		amigo.setDireccion(direccion);

		do {
			System.out.println("Introduce el NIF de tu amigo: ");
			NIF = scanner.nextLine();
		} while (NIF.equals(""));

		amigo.setNIF(NIF);

		System.out.println("Introduce el telefono de tu amigo: ");

		amigo.setTelefono(scanner.nextLine());

		String edad;

		do {
			System.out.println("Introduce la edad de tu amigo: ");
			edad = scanner.nextLine();
		} while (!esEntero(edad) && !edad.equals(""));

		amigo.setEdad(edad.equals("") ? 0 : Integer.parseInt(edad));

		Club club = new Club();

		System.out.println("Introduce el nombre del club de tu amigo: ");

		club.setNombre(scanner.nextLine());

		System.out.println("Introduce la descripción del club de tu amigo: ");

		club.setDescripción(scanner.nextLine());

		String miembros;
		do {
			System.out.println("Introduce el numero de miembros del club de tu amigo: ");
			miembros = scanner.nextLine();
		} while (!esEntero(miembros) && !miembros.equals(""));

		club.setNumeroMiembros(miembros.equals("") ? 0 : Integer.parseInt(miembros));

		amigo.setClub(club);

		return amigo;
	}

	private static int posicionLibre(Amigo[] amigos) {
		for (int i = 0; i < amigos.length; i++) {
			if (amigos[i] == null)
				return i;
		}
		return -1;
	}

	private static boolean esEntero(String cadena) {
		boolean correcto=false;
		if(!cadena.isEmpty()){
			correcto= true;
			for(int i=0; i<cadena.length() && correcto; i++){
				if(!Character.isDigit(cadena.charAt(i))){ 
					correcto= false;
				}
			}
		}
		return correcto;
	}

}
