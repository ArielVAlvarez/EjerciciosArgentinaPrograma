package clase07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import clase05.persona;
import clase05.producto;

class carrito2Test {

	@Test
	void testPrecio() {
		persona per01 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
		producto prod1 = new producto("Jabon","01",850);
		producto prod2 = new producto("Shampu","02",1350);
		producto prod3 = new producto("Desodorante","03",730);
		
		Descuento desc = new descuentoFijo(0);
		carrito2 car01 = new carrito2(per01, prod1, prod2, prod3, LocalDateTime.now(), desc);
		assertEquals(car01.costofinal(), 48600);	//el importe es incorrecto

	}
	@Test
	void test02Precio() {
		persona per01 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
		producto prod1 = new producto("Jabon","01",850);
		producto prod2 = new producto("Shampu","02",1350);
		producto prod3 = new producto("Desodorante","03",730);
		
		Descuento desc = new descuentoFijo(0);
		carrito2 car01 = new carrito2(per01, prod1, prod2, prod3, LocalDateTime.now(), desc);
		assertEquals(car01.costofinal(), 2930);

	}	
	@Test
	void testDesFijo() {
		persona per01 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
		producto prod1 = new producto("Jabon","01",850);
		producto prod2 = new producto("Shampu","02",1350);
		producto prod3 = new producto("Desodorante","03",730);
		
		Descuento desc = new descuentoFijo(20);
		carrito2 car01 = new carrito2(per01, prod1, prod2, prod3, LocalDateTime.now(), desc);
		assertEquals(car01.costofinal(), 2910);	//valor esperado 2910

	}	
	@Test	void testDesPorc() {
		persona per01 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
		producto prod1 = new producto("Jabon","01",850);
		producto prod2 = new producto("Shampu","02",1350);
		producto prod3 = new producto("Desodorante","03",730);
		
		Descuento desc = new descuentoPorcentaje(.20);
		carrito2 car01 = new carrito2(per01, prod1, prod2, prod3, LocalDateTime.now(), desc);
		assertEquals(car01.costofinal(), 2344);	//valor esperado 2344

	}
	@Test	void testDesTope() {
		persona per01 = new persona("Alvarez","Ariel",LocalDateTime.parse("1975-03-18T00:00:00"));
		producto prod1 = new producto("Jabon","01",850);
		producto prod2 = new producto("Shampu","02",1350);
		producto prod3 = new producto("Desodorante","03",730);
		
		Descuento desc = new descuentoPorcentajeConTope(.20,1000);
		carrito2 car01 = new carrito2(per01, prod1, prod2, prod3, LocalDateTime.now(), desc);
		assertEquals(car01.costofinal(), 2730);	//valor esperado 2730

	}		
	
}
