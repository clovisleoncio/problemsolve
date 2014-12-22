package p272;

import static org.junit.Assert.*;

import org.junit.Test;

import p272.Main.Q272;

public class Q272Test {
	
	@Test
	public void deveConverterAbertura() {
		Q272 q272 = new Q272();
		q272.inicio = true;
		assertEquals("``", q272.recuperaDelimitador());
	}
	
	@Test
	public void deveConverterFechamento() {
		Q272 q272 = new Q272();
		q272.inicio = false;
		assertEquals("''", q272.recuperaDelimitador());
	}

}
