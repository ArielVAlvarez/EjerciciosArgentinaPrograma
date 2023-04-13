package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class inicio {
	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<persona> listado =  new ArrayList<persona>();
		
		while (true) {
			System.out.println("Ingrese Nombre");
			String Nombre = sc.nextLine();
			System.out.println("Ingrese Apellido");
			String Apellido = sc.nextLine();
			System.out.println("Ingrese Fecha Nacimiento");
			String FechaNac = sc.nextLine();

			persona p1 = new persona();
			p1.setApellido(Apellido);
			p1.setNombre(Nombre);
			p1.setFechaNac(FechaNac);
			
			listado.add(p1);
			System.out.println("Desea Agregar otra Persona s/n");			
			String opcion = sc.nextLine();
			
			if (opcion.equals("n")) {break;}
			
		}
		
		for (persona per:listado) {
			System.out.println(per.getApellido() + " " + per.getNombre() + " " + per.getFechaNac());
		}
	}

}
