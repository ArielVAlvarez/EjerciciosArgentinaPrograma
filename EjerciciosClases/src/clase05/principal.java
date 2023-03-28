package clase05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import clase08.importeCeroException;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona per1 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
		

		try {
			String archivoProductos = "productosdatos.txt";
			List<String> listaProductos;			
			listaProductos = Files.readAllLines(Paths.get(archivoProductos));
			
			String[] linea01 = listaProductos.get(1).split(" ");
			String[] linea02 = listaProductos.get(2).split(" ");
			String[] linea03 = listaProductos.get(3).split(" ");
			
			producto prod1 = new producto(linea01[0],linea01[1],Float.parseFloat(linea01[2]));
			producto prod2 = new producto(linea02[0],linea02[1],Float.parseFloat(linea02[2]));
			producto prod3 = new producto(linea03[0],linea03[1],Float.parseFloat(linea03[2]));
			
			carrito car01 = new carrito(per1,prod1,prod2,prod3,LocalDateTime.now());
		
			try {
				System.out.println(car01.costofinal());
			} catch (importeCeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
