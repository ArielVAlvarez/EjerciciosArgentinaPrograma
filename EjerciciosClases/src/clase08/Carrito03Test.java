package clase08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import clase05.producto;
import clase07.descuentoFijo;
import clase07.descuentoPorcentaje;

class Carrito03Test {

	@Test
	void test() {
		 
		Carrito03 car01 = new Carrito03(null, null, null, null, null, new descuentoFijo(100));
		car01.setProductos(new producto("manzana", "A001", 100));
		Assertions.assertThrows(importeCeroException.class, () -> {car01.costofinal();});
	}
	@Test
	void test02() {
		 
		Carrito03 car02 = new Carrito03(null, null, null, null, null, new descuentoPorcentaje(1.20));
		car02.setProductos(new producto("manzana", "A001", 100));
		Assertions.assertThrows(importeCeroException.class, () -> {car02.costofinal();});
	}

}
