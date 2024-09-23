package edu.pruebainicial.es.utils;

import java.util.List;

import edu.pruebainicial.es.dtos.AlumnoDto;

/*
 * Clase que contiene los utils de la aplicacion
 * 19/09/2024
 * @author irodhan
 */
public class Utilidades {

	public static long asignarId(List<AlumnoDto>listaAlumnos) 
	{
		long id;
		int tamanyo=listaAlumnos.size();
		if(tamanyo>0) 
		{
			id=listaAlumnos.get(tamanyo-1).getIdAlumno()+1;
		}
		else 
		{
			id=1;
		}
		return id;
	}
}
