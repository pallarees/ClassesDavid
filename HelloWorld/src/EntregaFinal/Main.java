package EntregaFinal;

import java.util.Scanner;

public class Main {

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

		int amigoActual = 0;

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
				altaAmigo(scanner, amigos, amigoActual++);
				break;
			case "2":
				break;
			case "3":
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
			if (amigo != null){
				System.out.println(amigo);
				encontrado = true;
			}
		}
		
		if (!encontrado) System.out.println("Aun no tienes amigos.");
	}

	private static void altaAmigo(Scanner scanner, Amigo[] amigos, int amigoActual) {

		Amigo amigo = new Amigo();

		System.out.println("Introduce el nombre de tu amigo: ");

		amigo.setNombre(scanner.next());

		System.out.println("Introduce el apellido de tu amigo: ");

		amigo.setApellido(scanner.next());

		System.out.println("Introduce la dirección de tu amigo: ");

		amigo.setDireccion(scanner.next());

		System.out.println("Introduce el NIF de tu amigo: ");

		amigo.setNIF(scanner.next());

		System.out.println("Introduce el telefono de tu amigo: ");

		amigo.setTelefono(scanner.next());

		// System.out.println("Introduce la edad de tu amigo: ");

		// char edad = scanner.next();
		//
		// if (Character.isDigit(edad)) {
		// amigo.setEdad(Integer.parseInt(edad));
		// } else {
		// System.out.println("Dato incorrecto. Introduce la edad de tu amigo:
		// ");
		// edad = scanner.next();
		// while (!Character.isDigit(edad)) {
		// System.out.println("Dato incorrecto. Introduce la edad de tu amigo:
		// ");
		// edad = scanner.next();
		// }
		// amigo.setEdad(Integer.parseInt(edad));
		// }

		Club club = new Club();

		System.out.println("Introduce el nombre del club de tu amigo: ");

		club.setNombre(scanner.next());

		System.out.println("Introduce la descripción del club de tu amigo: ");

		club.setDescripción(scanner.next());

		System.out.println("Introduce el numero de miembros del club de tu amigo: ");

		// String miembros = scanner.next();
		//
		// if (miembros.length() > 0) {
		// if (esEntero(miembros)) {
		// club.setNumeroMiembros(Integer.parseInt(miembros));
		// } else {
		// while (!scanner.hasNextInt()) {
		// System.out.println("Dato incorrecto. el numero de miembros del club
		// de tu amigo: ");
		// miembros = scanner.next();
		// }
		// club.setNumeroMiembros(Integer.parseInt(miembros));
		// }
		// }

		amigo.setClub(club);

		amigos[amigoActual++] = amigo;

		System.out.println(amigo);
	}

	private static boolean esEntero(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
		}
		return false;
	}

}
