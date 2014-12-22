package p686;

import static org.junit.Assert.*;

import org.junit.Test;

import p686.Main.Q686;

public class Q686Test {

	@Test
	public void deveContarFatores() {
		Q686 q686 = new Q686();
		assertEquals(1, q686.contaFatores(6));
		assertEquals(2, q686.contaFatores(10));
		assertEquals(1, q686.contaFatores(12));
	}
	
}
