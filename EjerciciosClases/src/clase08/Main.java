package clase08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import clase05.persona;
import clase05.producto;
import clase07.Descuento;
import clase07.descuentoFijo;
import clase07.descuentoPorcentaje;
import clase07.descuentoPorcentajeConTope;

public class Main {

	public static void main(String[] args) {
		try {
			String archivoProductos = "Archivos/productosdatos.txt";
			
			persona per1 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
			
			Descuento Descfijo = new descuentoFijo(120);
			Carrito03 car01 = new Carrito03(per1,null,null,null,LocalDateTime.now(),Descfijo);
			
			for (String fila:Files.readAllLines(Paths.get(archivoProductos))){
				String[] Producto = fila.split(",");
				
				
				car01.setProductos(new producto(Producto[0],Producto[1],Float.parseFloat(Producto[2])));
				
			}
			
			try {
				System.out.println("Carrito Desc.Fijo Neto -> " + car01.neto()+
						" Costo final ->" + car01.costofinal());
			} catch (importeCeroException e) {
				// TODO Auto-generated catch block
				e.validaError();
			}
			
			car01.setDescuento(new descuentoPorcentaje(1.20));
			try {
				System.out.println("Carrito Desc.Porcentaje Neto -> " + car01.neto()+
						" Costo final ->" + car01.costofinal());
			} catch (importeCeroException e) {
				// TODO Auto-generated catch block
				e.validaError();
			}
			
			car01.setDescuento(new descuentoPorcentajeConTope(0.20, 15000));
			try {
				System.out.println("Carrito Desc.PorcentajeTope Neto -> " + car01.neto()+
						" Costo final ->" + car01.costofinal());
			} catch (importeCeroException e) {
				// TODO Auto-generated catch block
				e.validaError();
			}				
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

