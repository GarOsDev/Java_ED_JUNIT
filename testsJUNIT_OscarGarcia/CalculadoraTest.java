
package testUnitarios;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import calcualdora.CerebroCalculadoraED;
import calcualdora.Operaciones;



class CalculadoraTest {
	
	
	
	CerebroCalculadoraED cebCal = new CerebroCalculadoraED();
	static double resultado;
	

	// TEST SUMA
	
	@Test
	public void testOperacionSuma() {
		
		cebCal.procesarOperacion("1");
		assertEquals(10, cebCal.resultado);
		resultado = cebCal.resultado;
		
	}
	
	
	// TEST RESTA

	@Test
	public void testOperacionResta() {
		cebCal.procesarOperacion("2");
		assertEquals(3, cebCal.resultado);
	}
	
	
	// TEST MULTIPLICACION

	@Test
	public void testOperacionMultiplicar() {
		cebCal.procesarOperacion("3");
		assertEquals(6, cebCal.resultado);
	}
	
	
	// TEST DIVISIÓN

	@Test
	public void testOperacionDivide() {
		cebCal.procesarOperacion("4");
		assertEquals(4, cebCal.resultado);
	}
	
	
	// TEST SUMAR AL ULTIMO RESULTADO

	@Test
	public void testOperacionSumaRes() {
		
		cebCal.resultado = resultado;
		
		cebCal.procesarOperacion("5");
		assertEquals(17, cebCal.resultado);	
	}

	
	// TEST RESTAR AL ULTIMO RESULTADO
	
	@Test
	public void testOperacionRestaRes() {
		
		cebCal.resultado = resultado;
		
		cebCal.procesarOperacion("6");
		assertEquals(2, cebCal.resultado);
	}


	// TEST MULTIPLICAR AL ULTIMO RESULTADO

	@Test
	public void testOperacionMultiplicaRes() {
		
		cebCal.resultado = resultado;
		
		cebCal.procesarOperacion("7");
		assertEquals(20, cebCal.resultado);
	}

	
	// TEST DIVIDIR AL ULTIMO RESULTADO

	@Test
	public void testOperacionDivideRes() {
		
		cebCal.resultado = resultado;
		
		cebCal.procesarOperacion("8");
		assertEquals(2, cebCal.resultado);
	}
	

	// TEST ULTIMO RESULTADO
	
	@Test
	public void testOperacionResultado() {
		
		cebCal.resultado = resultado;
		cebCal.procesarOperacion("9");
		assertEquals(6, cebCal.resultado);
	}
	
	
	// TEST NUMERO ALEATORIO

	@Test
	public void testOperacionRandom() {
		
		cebCal.procesarOperacion("10");
		assertTrue(cebCal.resultado >= 0 
				&& cebCal.resultado <= 100);
	}

	
	// TEST HISTORIAL OPERACIONES
	
	@Test
	public void testHistorial() {
	
		cebCal.procesarOperacion("1");
		cebCal.procesarOperacion("2");
		cebCal.procesarOperacion("3");
		cebCal.procesarOperacion("4");
		cebCal.procesarOperacion("5");
		cebCal.procesarOperacion("11");	
		Operaciones historial = Operaciones.HISTORIAL;
		assertNotNull(historial);
	}

	
	
}
