//Ej9 realizado por Victor Calatayud

import java.util.Scanner;

public class Gestion {
	
	public static void main (String args[]) {
		
		/* **************************************************************
		 * Todas los metodos llamados en esta clase seran explicados	*
		 * en su clase correspondiente.									*
		 * *************************************************************/		
		
		Alumnos [] vectorAlumnos;
		Administracion [] vectorAdministracion;
		Scanner entrada= new Scanner(System.in);
		int contaVecAlum=0, contaVecAdmin=0, posicion;
		String tamanyo,opcion="";
		
		//Comun
		String nombre, apellidos, n, edad, sexo, horario;
			
		//Alumnos
		String ciclo,curso, notaMedia;
		
		//Administracion
		String cargo, departamento, sueldo;		
		
		System.out.println("Gestion de personal de administracion y alumnos" + "\n" + "===============================================" + "\n");
		
		//Introduccion del tamanyo para los vectores
		
		do{
			System.out.print("Introduce un numero de alumnos: ");
			tamanyo= entrada.nextLine();
		}while(!Utilidades.esEntero(tamanyo));
		
			vectorAlumnos= new Alumnos [Integer.parseInt(tamanyo)];		
		do{	
			System.out.print("Introduce un numero de personal de administracion: ");
			tamanyo= entrada.nextLine();
		}while(!Utilidades.esEntero(tamanyo));
			vectorAdministracion= new Administracion [Integer.parseInt(tamanyo)];			
		
		//Primer añadido de alumnos
		
		/* **************************************************************
		 * Para realizarlo se hace diferente al de menu altas, puesto   *
		 * que son diferentes.											*
		 * Se diferencian en que este si nombre es 's' para de anyadir. *
		 * *************************************************************/
		
		do{
			if(contaVecAlum != vectorAlumnos.length){
				
				System.out.println();
				
					
					do{
						System.out.print("Introduce nombre del alumno: ");
						nombre= entrada.nextLine();
					}while(nombre.equals(""));
					if(!nombre.equals("s")){
											
						do{
							System.out.print("Introduce apellidos del alumno: ");
							apellidos= entrada.nextLine();
						}while(apellidos.equals(""));
						do{
							System.out.print("Introduce nif del alumno: ");
							n= entrada.nextLine();
						}while(n.equals(""));
						do{
							System.out.print("Introduce edad del alumno: ");
							edad= entrada.nextLine();
						}while(!Utilidades.esEntero(edad) && !edad.equals(""));
						do{
							System.out.print("Introduce sexo (M/F) del alumno: ");
							sexo= entrada.nextLine();
						} while(!sexo.equals("M") && !sexo.equals("F") && !sexo.equals(""));
						do{
							System.out.print("Introduce horario (M/T) del alumno: ");
							horario= entrada.nextLine();
						} while(!horario.equals("M") && !horario.equals("T") && !horario.equals(""));
						System.out.print("Introduce ciclo del alumno: ");
						ciclo= entrada.nextLine();
						do{
							System.out.print("Introduce curso del alumno: ");
							curso= entrada.nextLine();
						}while(!Utilidades.esEntero(curso) && !curso.equals(""));
						do{
							System.out.print("Introduce nota media del alumno: ");
							notaMedia= entrada.nextLine();
						}while(!Utilidades.esDecimal(notaMedia) && !Utilidades.esEntero(notaMedia) && !notaMedia.equals(""));
						
						Utilidades.altaAlumno(vectorAlumnos, nombre, apellidos, n, edad, sexo, ciclo, curso,horario, notaMedia);
						contaVecAlum++;
					}
			} else{
					System.out.println("Ya has ingresado un maximo de alumnos");
					nombre="s";
			}
		
		}while(!nombre.equals("s"));
		
		System.out.println("====== FIN DE ENTRADA DE DATOS DE ALUMNOS ======");
		
		//Primer añadido del personal de administracion
		
		/* **************************************************************
		 * Para realizarlo se hace diferente al de menu altas, puesto   *
		 * que son diferentes.											*
		 * Se diferencian en que este si nombre es 's' para de anyadir. *
		 * *************************************************************/
			
		do{
				
			System.out.println();
			
			if(contaVecAdmin != vectorAdministracion.length){
				do{
					System.out.print("Introduce nombre de la persona de administracion: ");
					nombre= entrada.nextLine();
				}while(nombre.equals(""));
				if(!nombre.equals("s")){
					do{
						System.out.print("Introduce apellidos de la persona de administracion: ");
						apellidos= entrada.nextLine();
					}while(apellidos.equals(""));
					do{
						System.out.print("Introduce nif de la persona de administracion: ");
						n= entrada.nextLine();
					}while(n.equals(""));
					do{
						System.out.print("Introduce edad de la persona de administracion: ");
						edad= entrada.nextLine();
					}while(!Utilidades.esEntero(edad) && !edad.equals(""));
					do{
						System.out.print("Introduce sexo (M/F) de la persona de administracion: ");
						sexo= entrada.nextLine();
					} while(!sexo.equals("M") && !sexo.equals("F") && !sexo.equals(""));
					do{
						System.out.print("Introduce horario (M/T) de la persona de administracion: ");
						horario= entrada.nextLine();
					} while(!horario.equals("M") && !horario.equals("T") && !horario.equals(""));
					System.out.print("Introduce cargo de la persona de administracion: ");
					cargo= entrada.nextLine();
					System.out.print("Introduce departamento de la persona de administracion: ");
					departamento= entrada.nextLine();
					do{
						System.out.print("Introduce sueldo de la persona de administracion: ");
						sueldo= entrada.nextLine();
					}while(!Utilidades.esDecimal(sueldo)&& !Utilidades.esEntero(sueldo) && !sueldo.equals(""));
					
					Utilidades.altaAdministracion(vectorAdministracion, nombre, apellidos, n, edad, sexo, cargo, departamento, sueldo, horario);
					
					contaVecAdmin++;
				}
				
			} else{
				System.out.println("Ya has ingresado un maximo de personal de administracion");
				nombre="s";
			}
		
			
		}while(!nombre.equals("s"));		
		
		System.out.println("====== FIN DE ENTRADA DE DATOS DEL PERSONAL DE ADMINISTRACION ======");
		
		//MENU
				
		do{
			do{
				System.out.println();
				System.out.println("Que desea hacer?" + "\n" + "=================" + "\n");
				System.out.println("1- Anyadir alumno" + "\n" + "2- Anyadir personal de administracion" + "\n");
				System.out.println("3- Modificar alumno" + "\n" +"4- Modificar personal de administracion" + "\n" );
				System.out.println("5- Dar de baja a un alumno" + "\n" +"6- Dar de baja a un personal de administracion" + "\n" );
				System.out.println("7- Mostrar alumno" + "\n" +"8- Mostrar personal de administracion" + "\n" );
				System.out.println("9- Salir" + "\n" + "===========================================" + "\n\n");
				System.out.print("Introduce opcion: ");
				opcion= entrada.nextLine();
			}while(!Utilidades.esEntero(opcion));
			System.out.println();
			
			//Alta alumno
			
		/* **************************************************************
		 * Para realizarlo se hace diferente al anyadir alumno del		*
		 * principio, puesto que son diferentes.						*
		 * Se diferencian en que este no tiene la restriccion de la 's' *
		 * *************************************************************/
			
			if(opcion.equals("1")){
				if(contaVecAlum != vectorAlumnos.length){
					do{
						System.out.print("Introduce nombre del alumno: ");
						nombre= entrada.nextLine();
					}while(nombre.equals(""));
					do{
						System.out.print("Introduce apellidos del alumno: ");
						apellidos= entrada.nextLine();
					}while(apellidos.equals(""));
					do{
						System.out.print("Introduce nif del alumno: ");
						n= entrada.nextLine();
					}while(n.equals(""));
					do{
						System.out.print("Introduce edad del alumno: ");
						edad= entrada.nextLine();
					}while(!Utilidades.esEntero(edad) && !edad.equals(""));
					do{
						System.out.print("Introduce sexo (M/F) del alumno: ");
						sexo= entrada.nextLine();
					} while(!sexo.equals("M") && !sexo.equals("F") && !sexo.equals(""));
					do{
						System.out.print("Introduce horario (M/T) del alumno: ");
						horario= entrada.nextLine();
					} while(!horario.equals("M") && !horario.equals("T") && !horario.equals(""));
					System.out.print("Introduce ciclo del alumno: ");
					ciclo= entrada.nextLine();
					do{
						System.out.print("Introduce curso del alumno: ");
						curso= entrada.nextLine();
					}while(!Utilidades.esEntero(curso) && !curso.equals(""));
					do{
						System.out.print("Introduce nota media del alumno: ");
						notaMedia= entrada.nextLine();
					}while(!Utilidades.esDecimal(notaMedia) && !Utilidades.esEntero(notaMedia) && !notaMedia.equals(""));
					
					Utilidades.altaAlumno(vectorAlumnos, nombre, apellidos, n, edad, sexo, ciclo, curso,horario, notaMedia);
					contaVecAlum++;
				} else{
					System.out.println("Ya has ingresado un maximo de alumnos");
				}
			}
						
			//Alta persona de administracion
			
		/* **************************************************************
		 * Para realizarlo se hace diferente al anyadir personal del	*
		 * principio, puesto que son diferentes.						*
		 * Se diferencian en que este no tiene la restriccion de la 's' *
		 * *************************************************************/
			
			if(opcion.equals("2")){
				if(contaVecAdmin != vectorAdministracion.length){
					do{
						System.out.print("Introduce nombre de la persona de administracion: ");
						nombre= entrada.nextLine();
					}while(nombre.equals(""));
					do{
						System.out.print("Introduce apellidos de la persona de administracion: ");
						apellidos= entrada.nextLine();
					}while(apellidos.equals(""));
					do{
						System.out.print("Introduce nif de la persona de administracion: ");
						n= entrada.nextLine();
					}while(n.equals(""));
					do{
						System.out.print("Introduce edad de la persona de administracion: ");
						edad= entrada.nextLine();
					}while(!Utilidades.esEntero(edad) && !edad.equals(""));
					do{
						System.out.print("Introduce sexo (M/F) de la persona de administracion: ");
						sexo= entrada.nextLine();
					} while(!sexo.equals("M") && !sexo.equals("F") && !sexo.equals(""));
					do{
						System.out.print("Introduce horario (M/T) de la persona de administracion: ");
						horario= entrada.nextLine();
					} while(!horario.equals("M") && !horario.equals("T") && !horario.equals(""));
					System.out.print("Introduce cargo de la persona de administracion: ");
					cargo= entrada.nextLine();
					System.out.print("Introduce departamento de la persona de administracion: ");
					departamento= entrada.nextLine();
					do{
						System.out.print("Introduce sueldo de la persona de administracion: ");
						sueldo= entrada.nextLine();
					}while(!Utilidades.esDecimal(sueldo) && !Utilidades.esEntero(sueldo) && !sueldo.equals(""));
					
					Utilidades.altaAdministracion(vectorAdministracion, nombre, apellidos, n, edad, sexo, cargo, departamento, sueldo, horario);
					
					contaVecAdmin++;
					
				} else{
					System.out.println("Ya has ingresado un maximo de personal de administracion");
				}
			}		
			
			//Modificar alumno
			
		/* **************************************************************
		 * Para realizarlo se hace diferente al de altas de alumnos		*
		 * puesto que son diferentes.									*
		 * Se diferencian en que este no tiene ningun campo obligatorio *
		 * *************************************************************/
			
			if(opcion.equals("3")){
				System.out.print("Introduza el NIF del alumno a modificar: ");
				n= entrada.nextLine();
				
				posicion= Utilidades.comprobarNIF(vectorAlumnos, n);
				
				if(posicion != -1){
					
					System.out.print("Introduce nombre del alumno a modificar: ");
					nombre= entrada.nextLine();
					System.out.print("Introduce apellidos del alumno a modificar: ");
					apellidos= entrada.nextLine();
					do{
						System.out.print("Introduce edad del alumno a modificar: ");
						edad= entrada.nextLine();
					}while(!Utilidades.esEntero(edad) && !edad.equals(""));
					do{
						System.out.print("Introduce sexo (M/F) del alumno a modificar: ");
						sexo= entrada.nextLine();
					} while(!sexo.equals("M") && !sexo.equals("F") && !sexo.equals(""));
					do{
						System.out.print("Introduce horario (M/T) del alumno a modificar: ");
						horario= entrada.nextLine();
					} while(!horario.equals("M") && !horario.equals("T") && !horario.equals(""));
					System.out.print("Introduce ciclo del alumno a modificar: ");
					ciclo= entrada.nextLine();
					do{
						System.out.print("Introduce curso del alumno a modificar: ");
						curso= entrada.nextLine();
					}while(!Utilidades.esEntero(curso) && !curso.equals(""));
					do{
						System.out.print("Introduce nota media del alumno a modificar: ");
						notaMedia= entrada.nextLine();
					}while(!Utilidades.esDecimal(notaMedia) && !notaMedia.equals(""));
					
					
					vectorAlumnos[posicion].modAlumno(nombre, apellidos, edad, sexo, ciclo, curso, horario, notaMedia);
					
					System.out.println("Oprecaion realizada correctamente");
					
				} else{
					System.out.println("No se ha encontrado el alumno");
				}
				
				
			}
			
			//Modificar persona de administracion
			
		/* **************************************************************
		 * Para realizarlo se hace diferente al de altas de personal	*
		 * puesto que son diferentes.									*
		 * Se diferencian en que este no tiene ningun campo obligatorio *
		 * *************************************************************/			
			
			if(opcion.equals("4")){
				System.out.print("Introduza el NIF de la persona de administracion a modificar: ");
				n= entrada.nextLine();
				
				posicion= Utilidades.comprobarNIF(vectorAdministracion, n);
				
				if(posicion != -1){
						System.out.print("Introduce nombre de la persona de administracion a modificar: ");
						nombre= entrada.nextLine();

						System.out.print("Introduce apellidos de la persona de administracion a modificar: ");
						apellidos= entrada.nextLine();

					do{
						System.out.print("Introduce edad de la persona de administracion a modificar: ");
						edad= entrada.nextLine();
					}while(!Utilidades.esEntero(edad) && !edad.equals(""));
					do{
						System.out.print("Introduce sexo (M/F) de la persona de administracion a modificar: ");
						sexo= entrada.nextLine();
					} while(!sexo.equals("M") && !sexo.equals("F") && !sexo.equals(""));
					do{
						System.out.print("Introduce horario (M/T) de la persona de administracion a modificar: ");
						horario= entrada.nextLine();
					} while(!horario.equals("M") && !horario.equals("T") && !horario.equals(""));
					System.out.print("Introduce cargo de la persona de administracion a modificar: ");
					cargo= entrada.nextLine();
					System.out.print("Introduce departamento de la persona de administracion a modificar: ");
					departamento= entrada.nextLine();
					do{
						System.out.print("Introduce sueldo de la persona de administracion a modificar: ");
						sueldo= entrada.nextLine();
					}while(!Utilidades.esDecimal(sueldo) && !sueldo.equals(""));
					
					vectorAdministracion[posicion].modAdministracion(nombre, apellidos, edad, sexo, cargo, departamento, sueldo, horario);
					
					System.out.println("Oprecaion realizada correctamente");
					
				} else{
					System.out.println("No se ha encontrado la persona de administracion");
				}
			}
			
			//Dar de baja a un alumno
			
			if(opcion.equals("5")){	
				
				System.out.print("Introduza el NIF del alumno a dar de baja: ");
				n= entrada.nextLine();
				
				if(Utilidades.bajaAlumno(vectorAlumnos, n)){
					System.out.println("La operacion se ha realizado correctamente");
					contaVecAlum--;
				} else{
					System.out.println("No se ha encontrado el alumno");
				}
				
			}
			
			//Dar de baja a una persona de administracion
			
			if(opcion.equals("6")){	
				
				System.out.print("Introduza el NIF de la persona de administracion a dar de baja: ");
				n= entrada.nextLine();
				
				if(Utilidades.bajaAdministracion(vectorAdministracion,n)){
					System.out.println("La operacion se ha realizado correctamente");
					contaVecAdmin--;
				} else{
					System.out.println("No se ha encontrado a la persona de administracion");
				}
				
			}
			
			//Mostrar alumno
			
			if(opcion.equals("7")){	
				
				System.out.print("Introduza el NIF del alumno a mostrar: ");
				n= entrada.nextLine();
				
				posicion= Utilidades.comprobarNIF(vectorAlumnos, n);
				
				if(posicion != -1){
					System.out.println(vectorAlumnos[posicion].toString());
				} else{
					System.out.println("No se ha encontrado el alumno");
				}
				
			}
			
			//Mostrar persona de administracion
			
			if(opcion.equals("8")){	
				
				System.out.print("Introduza el NIF de la persona de administracion a mostrar: ");
				n= entrada.nextLine();
				
				posicion= Utilidades.comprobarNIF(vectorAdministracion, n);
				
				if(posicion != -1){
					System.out.println(vectorAdministracion[posicion].toString());
				} else{
					System.out.println("No se ha encontrado la persona de administracion");
				}
				
			}
			
			if(opcion.equals("9")){	
				System.out.println("====== FIN ======");
			}
			
		} while(!opcion.equals("9"));
		
	}
}

