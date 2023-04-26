package Contenedor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class cargarArchivo {

	private String archivo;
	private String formato;
	
	public cargarArchivo(String archivo, String formato) {
	
		this.archivo = archivo;
		this.formato = formato;
	}
	
	public ArrayList<String> leerArchivo() {

		FileReader fileDatos;
		String unaFila="";
		ArrayList<String> productosJs = new ArrayList();
		
		try {
			
			fileDatos = new FileReader(this.archivo);
			BufferedReader brFilas = new BufferedReader(fileDatos);	//Genera buffer lectura escritura
			unaFila = brFilas.readLine();	//ler una linea
			//String[] datosProducto;
			
			while (unaFila != null) {
				//codigo la fila esta en el string unaFila
				
				//datosProducto = unaFila.split(",");
				productosJs.add(unaFila);
				unaFila = brFilas.readLine();
			} 
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				System.out.println("archivo no existe");
			e.printStackTrace();
			}	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("error lectura");
			}
			return productosJs;
		
	}
}
