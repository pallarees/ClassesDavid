package EntregaFinal;

import java.util.Scanner;

public class Main {

	public static String NIF;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Quieres gestionar amigos o familiares? (A/F): ");

		String opcion = scanner.next();
		if (opcion.length() > 0) {
			while (!(opcion.equals("A") || opcion.equals("F"))) {
				System.out.println("Dato incorrecto. ¿Quieres gestionar amigos o familiares? (A/F) ");
				opcion = scanner.next();
			}

			if (opcion.equals("A")) {
				gestionarAmigos(scanner);
			} else {
				// gestionarFamilares(scanner);
			}
		}

		scanner.close();
	}

	private static void gestionarAmigos(Scanner scanner) {
		Amigo[] amigos = new Amigo[10];

		System.out.println("Introduce 1 para dar de alta un amigo");
		System.out.println("Introduce 2 para modificar un amigo");
		System.out.println("Introduce 3 para eliminar un amigo");
		System.out.println("Introduce 4 para mostrar todos los amigos");
		System.out.println("Introduce 5 para mostrar un amigo");
		System.out.println("Introduce 6 para salir");

		String opcion = scanner.next();

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

			opcion = scanner.next();
		}
		System.out.println("FIN");
	}

	private static void eliminarAmigo(Scanner scanner, Amigo[] amigos) {
		int posicion = encontrarPorNIF(scanner, amigos);
		if (posicion < 0) {
			System.out.println("No se ha encontrado.");
		} else {
			amigos[posicion] = null;
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

		NIF = scanner.next();
		boolean encontrado = false;

		int i;

		for (i = 0; i < amigos.length && !encontrado; i++) {
			if (amigos[i].getNIF().equals(NIF)) {
				encontrado = true;
			}
		}

		return encontrado ? i : -1;

	}

	private static void mostrarAmigo(Scanner scanner, Amigo[] amigos) {
		System.out.println("Introduce el NIF de tu amigo: ");

		String NIF = scanner.next();

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
			nombre = scanner.next();
		} while (nombre.equals(""));

		amigo.setNombre(nombre);

		String apellido;

		do {
			System.out.println("Introduce el apellido de tu amigo: ");

			apellido = scanner.next();
		} while (apellido.equals(""));

		amigo.setApellido(apellido);

		String direccion;

		do {
			System.out.println("Introduce la dirección de tu amigo: ");
			direccion = scanner.next();
		} while (!direccion.equals(""));

		amigo.setDireccion(direccion);

		do {
			System.out.println("Introduce el NIF de tu amigo: ");
		} while (!NIF.equals(""));

		amigo.setNIF(NIF);

		System.out.println("Introduce el telefono de tu amigo: ");

		amigo.setTelefono(scanner.next());

		String edad;

		do {
			System.out.println("Introduce la edad de tu amigo: ");
			edad = scanner.next();
		} while (!esEntero(edad) && !edad.equals(""));

		amigo.setEdad(edad.equals("") ? 0 : Integer.parseInt(edad));

		Club club = new Club();

		System.out.println("Introduce el nombre del club de tu amigo: ");

		club.setNombre(scanner.next());

		System.out.println("Introduce la descripción del club de tu amigo: ");

		club.setDescripción(scanner.next());

		String miembros;
		do {
			System.out.println("Introduce el numero de miembros del club de tu amigo: ");
			miembros = scanner.next();
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
