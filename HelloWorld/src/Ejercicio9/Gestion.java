package Ejercicio9;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		int maximoAlumnos;
		int maximoAdministracion;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el numero máximo de alumnos: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Dato incorrecto. Introduce el numero máximo de alumnos: ");
			scanner.next();
		}
		maximoAlumnos = scanner.nextInt();
		System.out.println("Introduce el numero máximo de administrativos: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Dato incorrecto. Introduce el numero máximo de administrativos: ");
			scanner.next();
		}

		maximoAdministracion = scanner.nextInt();
		Alumno[] alumnos = new Alumno[maximoAlumnos];
		Administracion[] administrativos = new Administracion[maximoAdministracion];
		int alumnosActuales = 0;
		System.out.println("Nombre del alumno: ");
		String nombreAlumno = scanner.next();
		while (!nombreAlumno.equals("s")) {
			alumnos[alumnosActuales++] = altaAlumno(scanner, nombreAlumno);
			if (alumnosActuales == maximoAlumnos) {
				System.out.println("La base de datos de alumnos está llena.");
				break;
			}
			System.out.println("Nombre del administrativo: ");
			nombreAlumno = scanner.next();
		}

		String nombreAdministracion = scanner.next();
		int administrativosActuales = 0;
		while (!nombreAdministracion.equals("s")) {
			administrativos[administrativosActuales++] = altaAdministrativo(scanner, nombreAdministracion);
			if (administrativosActuales == maximoAdministracion) {
				System.out.println("La base de datos de administración está llena.");
				break;
			}
			System.out.println("Nombre del administrativo: ");
			nombreAlumno = scanner.next();
		}

		System.out.println("Introduce 1 para dar de alta un alumno");
		System.out.println("Introduce 2 para dar de alta un administrativo");
		System.out.println("Introduce 3 para modificar un alumno");
		System.out.println("Introduce 4 para modificar un administrativo");
		System.out.println("Introduce 5 para eliminar un alumno");
		System.out.println("Introduce 6 para eliminiar un administrativo");
		System.out.println("Introduce 7 para mostrar todos los alumnos");
		System.out.println("Introduce 8 para mostrar todos los administrativos");
		System.out.println("Introduce 9 para salir del programa");

		String opcion = scanner.next();

		while (opcion != "9") {
			switch (opcion) {
			case "1":
				altaAlumno(scanner, nombreAlumno);
				break;
			case "2":
				altaAdministrativo(scanner, nombreAdministracion);
				break;
			case "3":
				modificarAlumno();
				break;
			case "4":
				modificarAdministrativo();
				break;
			case "5":
				eliminarAlumno();
				break;
			case "6":
				eliminarAdministrativo();
				break;
			case "7":
				mostrarAlumnos(alumnos);
				break;
			case "8":
				mostrarAdministrativos(administrativos);
			default:
				break;
			}

			System.out.println("Introduce otra opción para continuar: ");

			opcion = scanner.next();

		}

		System.out.println("FIN");
		scanner.close();

	}

	private static void mostrarAdministrativos(Administracion[] administrativos) {
		for (int i = 0; i < administrativos.length; i++) {
			if (!(administrativos[i] == null))
				System.out.println(administrativos[i]);
		}
	}

	private static void mostrarAlumnos(Alumno[] alumnos) {
		// for (Alumno alumno : alumnos){
		// System.out.println(alumno);
		// }
		//
		for (int i = 0; i < alumnos.length; i++) {
			if (!(alumnos[i] == null))
				System.out.println(alumnos[i]);
		}

	}

	private static Administracion altaAdministrativo(Scanner scanner, String nombreAdministracion) {
		Administracion administracion = new Administracion();

		administracion.nombre = nombreAdministracion;

		System.out.println("Apellido del administrativo: ");

		administracion.apellido = scanner.next();

		System.out.println("Edad del administrativo: ");

		while (!scanner.hasNextInt()) {
			System.out.println("Dato incorrecto. Introduce la edad del administrativo: ");
			scanner.next();
		}

		administracion.edad = scanner.nextInt();

		System.out.println("Sexo del administrativo (M/F): ");

		String sexo = scanner.next();

		while (!(sexo.equals("M") || sexo.equals("F"))) {
			System.out.println("Dato incorrecto. Introduce el sexo del administrativo: ");
			sexo = scanner.next();
		}

		System.out.println("NIF del administrativo: ");

		administracion.NIF = scanner.next();

		System.out.println("Cargo del administrativo: ");

		administracion.cargo = scanner.next();

		System.out.println("Sueldo del administrativo: ");

		while (!scanner.hasNextDouble()) {
			System.out.println("Dato incorrecto. Introduce el sueldo del administrativo: ");
			scanner.next();
		}

		administracion.sueldo = scanner.nextDouble();

		System.out.println("Horario del administrativo (M/T): ");

		String horario = scanner.next();

		while (!(horario.equals("M") || horario.equals("T"))) {
			System.out.println("Dato incorrecto. Introduce el horario del administrativo: ");
			horario = scanner.next();
		}

		administracion.horario = horario;

		System.out.println("Departamento del administrativo: ");

		administracion.departamento = scanner.next();

		return administracion;
	}

	private static Alumno altaAlumno(Scanner scanner, String nombreAlumno) {
		Alumno alumno = new Alumno();

		alumno.nombre = nombreAlumno;

		System.out.println("Apellido del alumno: ");

		alumno.apellido = scanner.next();

		System.out.println("Edad del alumno: ");

		while (!scanner.hasNextInt()) {
			System.out.println("Dato incorrecto. Introduce la edad del alumno: ");
			scanner.next();
		}

		alumno.edad = scanner.nextInt();

		System.out.println("Sexo del alumno (M/F): ");

		String sexo = scanner.next();

		while (!(sexo.equals("M") || sexo.equals("F"))) {
			System.out.println("Dato incorrecto. Introduce el sexo del alumno: ");
			sexo = scanner.next();
		}

		System.out.println("NIF del alumno: ");

		alumno.NIF = scanner.next();

		System.out.println("Ciclo del alumno: ");

		alumno.ciclo = scanner.next();

		System.out.println("Horario del alumno (M/T): ");

		String horario = scanner.next();

		while (!(horario.equals("M") || horario.equals("T"))) {
			System.out.println("Dato incorrecto. Introduce el horario del alumno: ");
			horario = scanner.next();
		}

		alumno.horario = horario;

		System.out.println("Nota media del alumno: ");

		while (!scanner.hasNextDouble()) {
			System.out.println("Dato incorrecto. Introduce la nota media del alumno: ");
			scanner.next();
		}

		alumno.notaMedia = scanner.nextDouble();
		return alumno;
	}

}
