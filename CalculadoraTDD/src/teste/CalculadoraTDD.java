package teste;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author 36115142016.2N
 * Test Drive Development 
 * *BabySteps
 */
public class CalculadoraTDD {

	@Test
	// método utilizado para teste. OBS: métodos testes não podem ter parâmetros
	public void testarSomaEntreInteiros() {
		Calculadora calculadora = new Calculadora();		
		assertEquals(calculadora.somar(2,2), 4);
		assertEquals(calculadora.somar(1, 1),2);
		assertTrue(calculadora.subtrair(3, 1) == 2);
		
	}
	
	@Test
	public void testarSubtracao() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.subtrair(6,5) == 1);
		assertTrue(calculadora.subtrair(6,6) == 0);
	}
	
	@Test	
	public void testarDivisao() {		
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.divisao(5.0,2.0) == 2.0);
		assertTrue(calculadora.divisao(2.0,0.0) == 0.0);
	}
	
	

}
