package p100;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class Q100Test {

	@Test
	public void deveCalcularCiclo() {
		assertEquals(1l, Main.calcularCiclo(1));
		assertEquals(16l, Main.calcularCiclo(22));
		assertEquals(7l, Main.calcularCiclo(10));
	}
	
	
	@Test
	public void deveCalcularMaiorCiclo() {
		assertEquals(20, Main.calcularMaiorCiclo(1, 10));
		assertEquals(125, Main.calcularMaiorCiclo(100, 200));
		assertEquals(89, Main.calcularMaiorCiclo(201, 210));
		assertEquals(174, Main.calcularMaiorCiclo(900, 1000));
	}
	
	@Test
	public void testarOverflow() {
		assertEquals(525, Main.calcularMaiorCiclo(1, 1000000));
	}

	
}
