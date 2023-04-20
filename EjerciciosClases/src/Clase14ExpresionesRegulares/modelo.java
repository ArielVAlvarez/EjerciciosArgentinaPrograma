package Clase14ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern ;

public class modelo {

	public static void main(String[] args) {
			
		ValidarExpresion ve = new ValidarExpresion();
		ve.validaExpresion("([a-z]|[A-Z]|[ ]|[ñ])*([Parque]|[nubes])","archivos/expresionesRegulares.txt",false);
		System.out.println("/////////  Analiza archivo con grupos ////////");
		String exp = ("([a-z]|[A-Z])+(DNI[0-9]{8})([a-z]|[0-9])+@([a-z])+\\.([a-z])+");
		ve.validaExpresion(exp,"archivos/expresionesRegularesII.txt",true);
	}	
		
}
