package junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void somaTest() {
		Calculadora calc  = new Calculadora();
		Assertions.assertTrue(calc.soma(2, 3) == 5);
		Assertions.assertEquals(5, calc.soma(2, 3));
	}
	
	@Test
	public void assertivas() {
		Assertions.assertEquals("Casa", "Casa");
		Assertions.assertNotEquals("Casa", "casa");
	}
	
	@Test
	public void retornoInteiro() {
		Calculadora calc  = new Calculadora();
		float resultado = calc.dividir(4, 2);
		Assertions.assertEquals(resultado, 2);  
	}
	
	@Test
	public void retornaNumerosNegativos() {
		Calculadora calc  = new Calculadora();
		float resultado = calc.dividir(6, -2);
		Assertions.assertEquals(resultado, -3);  
	}
}
