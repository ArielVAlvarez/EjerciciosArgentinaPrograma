package clase07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import clase05.carrito;
import clase05.persona;
import clase05.producto;
import clase08.importeCeroException;

public class Main {

	public static void main(String[] args) {
		Descuento fijo = new descuentoFijo(20);
		System.out.println("descuento fijo " + fijo.calculoFinal(200));
		
		descuentoPorcentaje porcentaje = new descuentoPorcentaje(.10);
		System.out.println("descuento porcentaje " + porcentaje.calculoFinal(100));
		
		Descuento descTop01 = new descuentoPorcentajeConTope(0.20, 500);
		System.out.println("descuento tope menor" + descTop01.calculoFinal(200));
		
		Descuento descTop02 = new descuentoPorcentajeConTope(0.20, 100);
		System.out.println("descuento tope menor" + descTop02.calculoFinal(200));
		
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
			
			Descuento Descfijo = new descuentoFijo(20);
			carrito2 car01 = new carrito2(per1,prod1,prod2,prod3,LocalDateTime.now(),Descfijo);
			
			try {
				System.out.println("Carrito Desc.Fijo Neto -> " + car01.neto()+
							" Costo final ->" + car01.costofinal());
			} catch (importeCeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Descuento Descporc = new descuentoPorcentaje(.10);
			carrito2 car02 = new carrito2(per1,prod1,prod2,prod3,LocalDateTime.now(),Descporc);
			
			try {
				System.out.println("Carrito Desc.Porcentaje -> " + car02.neto()+
							" Costo final ->" + car02.costofinal());
			} catch (importeCeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Descuento Desctope = new descuentoPorcentajeConTope(0.20, 15000);
			carrito2 car03 = new carrito2(per1,prod1,prod2,prod3,LocalDateTime.now(),Desctope);
			
			try {
				System.out.println("Carrito Desc.Con tope -> " + car03.neto()+
							" Costo final ->" + car03.costofinal());
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
