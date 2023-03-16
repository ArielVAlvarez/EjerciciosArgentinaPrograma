package clase06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void Multiplica() {
		assertEquals(Calculadora.Multiplicar(80,3),240);
		
	}

	@Test	//
	void Sumar() {
		double suma = Calculadora.Sumar(150,180);
		double divi = Calculadora.Dividir(suma, 3);
		
		assertEquals(divi, 110);
	}
	
	@Test	//es falso
	void Test02() {
		double resta = Calculadora.Restar(90, 50);
		double multi = Calculadora.Multiplicar(resta, 15);
		assertEquals(multi, 605);
	}
	
	@Test	//es falso
	void Test03() {
		double suma = Calculadora.Sumar(70, 40);
		double multi = Calculadora.Multiplicar(suma, 25);
		assertEquals(multi, 2700);
	}
}
