package edu.pruebainicial.es.servicios;

import java.util.List;

import edu.pruebainicial.es.dtos.AlumnoDto;

/*
 * Interfaz de las operativas de la aplicacion
 * 19/09/2024
 * @author irdohan
 */
public interface OperativaInterfaz {

	/*
	 * Método que  sirve para dar el alta aun un nuevo usuario
	 * 19/09/2024
	 * @author irodhan
	 */
	public void darAltaAlumno(List<AlumnoDto> listaAlumnos);
	/*
	 * Método que  sirve para modificar algun dato de un usuario
	 * 23/09/2024
	 * @author irodhan
	 */
	public void modificarCliente(List<AlumnoDto> listaAlumnos);
	/*
	 * Método que  sirve para borrar algun usuario
	 * 23/09/2024
	 * @author irodhan
	 */
	public void borrarCliente(List<AlumnoDto> listaAlumnos);
}
