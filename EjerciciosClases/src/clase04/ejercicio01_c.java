package clase04;

import java.util.Scanner;

public class ejercicio01_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numeros[] = new String[3];
		String ordenInput;
		if (args.length>0) {
			numeros[0]=args[0];
			numeros[1]=args[1];
			numeros[2]=args[2];
			ordenInput=args[3];
		}else {
			Scanner scn = new Scanner(System.in);
			System.out.println("Ingrese 3 numeros separados por espacio");
			String numerosInput = scn.nextLine();
			System.out.println("Ingrese tipo de ordenamiento a--ascendente d--descendente");
			ordenInput = scn.nextLine();
			
			
			numeros = numerosInput.split(" ");			
		}
		
		if (ordenInput.equals("a")) {
			ordenar.Ordenar(Integer.parseInt(numeros[0]),Integer.parseInt(numeros[1]),Integer.parseInt(numeros[2]),true);
		}else {
			
			ordenar.Ordenar(Integer.parseInt(numeros[0]),Integer.parseInt(numeros[1]),Integer.parseInt(numeros[2]),false);
		}		
	}

}
