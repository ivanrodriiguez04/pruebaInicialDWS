package edu.pruebainicial.es.servicios;

import java.util.List;
import java.util.Scanner;

import edu.pruebainicial.es.dtos.AlumnoDto;

/*
 * Clase que implementa a las operativas de la aplicacion
 * 19/09/2024
 * @author irodhan
 */
public class OperativaImplementacion implements OperativaInterfaz {

	@Override
	public void darAltaAlumno(List<AlumnoDto> listaAlumnos) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			AlumnoDto nuevoAlumno = new AlumnoDto();
			sc.nextLine();
			System.out.println("Introduzca sus apellidos: ");
			nuevoAlumno.setApellidosAlumno(sc.nextLine());
			nuevoAlumno.setIdAlumno(edu.pruebainicial.es.utils.Utilidades.asignarId(listaAlumnos));
			System.out.println("Introduzca su dni:");
			nuevoAlumno.setDniAlumno(sc.next());
			System.out.println("Introduzca su nombre: ");
			nuevoAlumno.setNombreAlumno(sc.next());
			System.out.println("Introduzca su email: ");
			nuevoAlumno.setEmailAlumno(sc.next());
			System.out.println("Introduzca se fecha de nacimiento(dd/MM/yyyy):");
			nuevoAlumno.setFchNacimientoAlumno(sc.next());
			System.out.println("Introduzca su numero de telefono: ");
			nuevoAlumno.setTelefonoAlumno(sc.nextInt());
			listaAlumnos.add(nuevoAlumno);
			System.out.println(nuevoAlumno.toString());
		} catch (Exception e) {
			System.out.println("Algun dato se ha introducido mal");
		}

	}

	@Override
	public void modificarCliente(List<AlumnoDto> listaAlumnos) {
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		System.out.println("Indique el dni del alumno que desea modificar: ");
		String dni=sc.next();
		
		for(AlumnoDto alumno : listaAlumnos)
		{
			if(alumno.getDniAlumno().equals(dni)) 
			{
				
			}
			else 
			{
				System.out.println("[INFO] - El dni indicado no coincide con ningun dni existente.");
			}			
		}

	}

	@Override
	public void borrarCliente(List<AlumnoDto> listaAlumnos) {
		// TODO Auto-generated method stub

	}

}
