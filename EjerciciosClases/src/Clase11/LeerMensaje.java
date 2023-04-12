package Clase11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerMensaje {

	public static void LeerMsg(String ArchivoMsg) {
		
		FileReader NombreArchivo;
		try {
			NombreArchivo = new FileReader("Archivos/" + ArchivoMsg + "_Msg.txt");
			BufferedReader br = new BufferedReader(NombreArchivo);
			String Msg = br.readLine();
			
			while (Msg != null) {
				System.out.println(Msg);
				Msg = br.readLine();
			}
			NombreArchivo.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
				
	}
}
