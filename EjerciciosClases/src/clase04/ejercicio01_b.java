package clase04;

import java.util.Scanner;

public class ejercicio01_b {
	public static void main (String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese 3 numeros separados por espacio");
		String numerosInput = scn.nextLine();
		System.out.println("Ingrese tipo de ordenamiento a--ascendente d--descendente");
		String ordenInput = scn.nextLine();
		
		String numeros[] = new String[3];
		numeros = numerosInput.split(" ");
		
		if (ordenInput.equals("a")) {
			ordenar.Ordenar(Integer.parseInt(numeros[0]),Integer.parseInt(numeros[1]),Integer.parseInt(numeros[2]),true);
		}else {
			
			ordenar.Ordenar(Integer.parseInt(numeros[0]),Integer.parseInt(numeros[1]),Integer.parseInt(numeros[2]),false);
		}
		
	}

}
