package Clase11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

final class EscribirMensaje  {
	
	public String ArchivoMsg;
	
	public EscribirMensaje(String ArchivoMsg) {
		this.ArchivoMsg = ArchivoMsg;
		
	}
	
	public void EscribirMsg () {
		Scanner msg = new Scanner(System.in);
		
		System.out.println("Ingrese Mensaje");
		String Mensaje = msg.nextLine();
		
		
		File NombreArchivo = new File("Archivos/" + this.ArchivoMsg + "_Msg.txt");
		BufferedWriter bf;
		FileWriter fw;
		
		if (!NombreArchivo.exists()) {
			try {
				NombreArchivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			 fw = new FileWriter(NombreArchivo.getAbsoluteFile(), true);
		     bf = new BufferedWriter(fw);
		     bf.write(Mensaje + "\n");
			
		     bf.close();
		     fw.close();
		    
		        
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				
			}
			
			
		
	}
	
}
