package p382;

import static org.junit.Assert.*;
import org.junit.Test;

import p382.Main;

public class Q382Test {
	
	@Test
	public void deveObterDivisores() {
		assertEquals(6, Main.divisores(6));
		assertEquals(28, Main.divisores(28));
		assertEquals(4, Main.divisores(9));
		assertEquals(16, Main.divisores(12));
		assertEquals(1, Main.divisores(0));
		assertEquals(1, Main.divisores(1));
	}
	
	@Test
	public void deveDeterminarPerfeicao() {
		assertEquals("DEFICIENT", Main.perfeicao(15));
		assertEquals("PERFECT", Main.perfeicao(28));
		assertEquals("PERFECT", Main.perfeicao(6));
		assertEquals("ABUNDANT", Main.perfeicao(56));
		assertEquals("ABUNDANT", Main.perfeicao(60000));
		assertEquals("DEFICIENT", Main.perfeicao(22));
		assertEquals("PERFECT", Main.perfeicao(496));
	}

}
