package clase04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ejercicio02_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String archivo = args[0];
		clase04.operacionesmatematicas hacerCalculo = new clase04.operacionesmatematicas();
		
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))) {
				//System.out.println(linea);
				
				if (args[1].equals("+")) {
					hacerCalculo.valoresSuma(Integer.parseInt(linea));
				}else {
					hacerCalculo.valoresMultiplicacion(Integer.parseInt(linea));
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		if (args[1].equals("+")) {
			System.out.println(hacerCalculo.resultadoSuma());
		}else {
			System.out.println(hacerCalculo.resultadoMultiplicacion());
		}
		
	}

}
