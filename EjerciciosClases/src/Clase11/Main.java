package Clase11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese su Nombre para el Chat \n");
		String nombrePersona = scn.nextLine();
		
		EscribirMensaje EscribeMsg = new EscribirMensaje(nombrePersona);
		
		String opcionChat="0";
		while (!opcionChat.equals("2")) {
			System.out.println("Seleccione Opcion : (0)-> Escribir Mensaje (1)-> Leer Mensaje (2)-> Salir \n");
			 opcionChat = scn.nextLine();
			
			if (opcionChat.equals("0")) {
				EscribeMsg.EscribirMsg();
				
			   
			}
			if (opcionChat.equals("1")) {
				LeerMensaje.LeerMsg(nombrePersona);
				
			   
			}
		}
		System.out.println("Sesion Finalizada");
		}
	}


