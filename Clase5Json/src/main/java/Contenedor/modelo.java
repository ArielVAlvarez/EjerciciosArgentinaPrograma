package Contenedor;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class modelo {

	public static void main(String[] args)  {
			
		ObjectMapper om = new ObjectMapper();
		String jsText;
		try {
		
			cargarArchivo ca = new cargarArchivo("resource/archivoJsonProducto.csv","Json");
			ArrayList<String> ProductosJs = ca.leerArchivo();
			ArrayList<producto> listaProducto = new ArrayList();
			
			for(int m=0;m < ProductosJs.size();m++) {			
				listaProducto.add(om.readValue(ProductosJs.get(m),producto.class));				
			}
			
			for(producto xx : listaProducto) {
				System.out.println(xx);
			}
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
