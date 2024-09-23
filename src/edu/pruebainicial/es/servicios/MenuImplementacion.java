package edu.pruebainicial.es.servicios;

import java.util.Scanner;
/*
 * Clase que implemenenta a la interfaz de los menus de la aplicaion
 * 19/09/2024
 * @author irodhan 
 */
public class MenuImplementacion implements MenuInterfaz{
	
	@Override
	public byte mostrarMenuYSeleccion() {
		Scanner sc = new Scanner(System.in);
		byte opcion=0;
		System.out.println("|----------------------|");
		System.out.println("|         Menú         |");
		System.out.println("|----------------------|");
		System.out.println("| 0. Cerrar Menu       |");
		System.out.println("| 1. Dar alta cliente  |");
		System.out.println("| 2. Modificar datos   |");
		System.out.println("| 3. Borrar cliente    |");
		System.out.println("|----------------------|");
		System.out.println("Que opcion desea utilizar: ");
		opcion=sc.nextByte();
		return opcion;
	}

	
}
