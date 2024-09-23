package edu.pruebainicial.es.controladores;

import java.util.ArrayList;
import java.util.List;

import edu.pruebainicial.es.dtos.AlumnoDto;
import edu.pruebainicial.es.servicios.*;

/*
 * Clase principal de la aplicacion
 * 19/09/2024
 * @author irodhan
 */
public class Main {
	/*
	 * Metodo principal de la aplicacion 19/09/2024
	 * 
	 * @author irodhan
	 */
	public static List<AlumnoDto> listaAlumnos= new ArrayList();
	public static void main(String[] args) {
		// Objetos
		MenuInterfaz mI = new MenuImplementacion();
		OperativaInterfaz oI=new OperativaImplementacion();

		// Variables
		byte control = 0;
		boolean cerrarMenu = false;
		// Empezamos el bucle
		do {
			
			try{
				// Mostramos el menu y obtenemos la opcion indicada por el usuario
				control = mI.mostrarMenuYSeleccion();
				// Creamos un switch con la opcion indicada
				switch (control) {
					case 0:
						System.out.println("[INFO] - Ha selecciondo la opción cerrar menú");
						System.out.println("[INFO] - Esperamos que le haya servido la aplicación");
						cerrarMenu = true;
						break;
					case 1:
						System.out.println("[INFO] - Ha seleccionado la opción dar alta cliente");
						oI.darAltaAlumno(listaAlumnos);
						break;
					case 2:
						System.out.println("[INFO] - Ha seleccionado la opción modificar cliente");
						oI.modificarCliente(listaAlumnos);
						break;
					case 3:
						System.out.println("[INFO] - Ha seleccionada la opción borrar cliente");
						oI.borrarCliente(listaAlumnos);
						break;
					default:
						System.out.println("[INFO] - La opción seleccionda no coincide con ninguna opción mostrada anteriormente.");
						System.out.println("[INFO] - Seleccione otra opción para utilizar la aplicación");
						break;
				}
			}catch(Exception E){
				System.out.println("[INFO] - Ha ocurrido un error intentelo de nuevo:");
			}
		} while (!cerrarMenu);

	}

}
