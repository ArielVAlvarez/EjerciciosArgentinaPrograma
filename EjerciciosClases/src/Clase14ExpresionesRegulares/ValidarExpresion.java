package Clase14ExpresionesRegulares;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarExpresion {

	
	public void validaExpresion(String expresion,String archivo,Boolean mostrargrupo) {
		FileReader fileDatos = null;
		BufferedReader brFilas = null;
		Pattern pattern = null;
		Matcher matcher = null;
		
	try {
		fileDatos = new FileReader(archivo);	
		brFilas = new BufferedReader(fileDatos);	
		String unaFila = brFilas.readLine();	
		int numFilas=0;
		while (unaFila != null) {
			
			numFilas++;
			
			if (mostrargrupo==false) {
				System.out.println(unaFila);
				System.out.println("Linea numero " + numFilas + " -->"+unaFila.matches(expresion));
			}else {
				pattern= Pattern.compile(expresion, Pattern.MULTILINE);
				 matcher = pattern.matcher(unaFila);			

				while (matcher.find()) {
					System.out.println("Full match: " + matcher.group(0));
					for (int i = 1; i <= matcher.groupCount(); i++) {
						System.out.println("Group " + i + ": " + matcher.group(i));
					}				
			}
			}
			unaFila = brFilas.readLine();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if (brFilas != null) {
			try {
				brFilas.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (fileDatos != null) {
			try {
				fileDatos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
}
