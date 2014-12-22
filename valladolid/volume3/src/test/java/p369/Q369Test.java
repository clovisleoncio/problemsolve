package p369;

import static org.junit.Assert.*;

import org.junit.Test;

import p369.Main;

public class Q369Test {
	
	@Test
	public void deveCalcularCombinacoes() {
		
		assertEquals(1192052400, Main.calcularCombinacao(100, 6));
		assertEquals(15504, Main.calcularCombinacao(20, 5));
		assertEquals(18564, Main.calcularCombinacao(18, 6));
		
	}

}
