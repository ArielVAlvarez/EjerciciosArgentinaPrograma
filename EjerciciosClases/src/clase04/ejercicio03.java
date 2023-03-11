package clase04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
 

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ingreso = new Scanner(System.in);
		System.out.println("Tipo de Acccion cod=codificar dec=decodificar");
		String accion = ingreso.nextLine();
		System.out.println("Ingrese Valor a desplazar");
		String desplaza = ingreso.nextLine();
		System.out.println("Ingrese archivo de entrada incluya ruta completa");
		String archivoEntrada = ingreso.nextLine();
		System.out.println("Ingrese archivo de salida incluya ruta completa");
		String archivoSalida = ingreso.nextLine();
		String lineaCodificada ="";
		
		if (!Files.exists(Paths.get(archivoSalida))){
			try {
				Files.createFile(Paths.get(archivoSalida));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
			try {
				for (String line : Files.readAllLines(Paths.get(archivoEntrada))) {
					
					if (accion.equals("cod")) {
						lineaCodificada = encripta(line, Integer.parseInt(desplaza));
					}else {
						lineaCodificada = desencripta(line, Integer.parseInt(desplaza));
					}	
					
					
					Files.writeString(Paths.get(archivoSalida), lineaCodificada+"\n", StandardOpenOption.APPEND);
				}
				System.out.println("Proceso finalizado");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error en la Operacion");
			};	
				
			
	
	}

	public static String encripta(String cadena,int desplaza) {

		
		String crypto=" abcdefghijklmnñopqrstuvwxyz";
		String cadenaCrypto="";
		
		for (int m=0;m<cadena.length();m++) {
			if (crypto.indexOf(cadena.charAt(m))+desplaza<=crypto.length()-1) {
				cadenaCrypto=cadenaCrypto+crypto.charAt(crypto.indexOf(cadena.charAt(m))+desplaza);
			}else {
				int resto = (crypto.indexOf(cadena.charAt(m))+desplaza)-(crypto.length());
				cadenaCrypto=cadenaCrypto+crypto.charAt(resto);				
			}
		}

		return cadenaCrypto;
	}
	
	public static String desencripta(String cadena,int desplaza) {

		String crypto=" abcdefghijklmnñopqrstuvwxyz";
		String cadenaCrypto="";
		
		for (int m=0;m<cadena.length();m++) {
			if (crypto.indexOf(cadena.charAt(m))-desplaza>=0) {
				cadenaCrypto=cadenaCrypto+crypto.charAt(crypto.indexOf(cadena.charAt(m))-desplaza);
			}else {
				int resto = crypto.indexOf(cadena.charAt(m))-desplaza;				
				cadenaCrypto=cadenaCrypto+crypto.charAt(crypto.length()-(resto)*-1);
			}
		}

		return cadenaCrypto;
	}
	
}
