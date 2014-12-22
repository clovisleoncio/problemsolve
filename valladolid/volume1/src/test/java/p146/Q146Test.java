package p146;

import static junit.framework.Assert.*;

import org.junit.Test;

import p146.Main.Q146;

public class Q146Test {
	
	@Test
	public void deveIdentificarSePossuiSucessor() {
		Q146 q146 = new Q146();
		assertTrue(q146.possuiSucessor("abaacb"));
		assertFalse(q146.possuiSucessor("cbbaa"));
		assertFalse(q146.possuiSucessor("c"));
		assertTrue(q146.possuiSucessor("bab"));
	}

	@Test
	public void deveObterPosicaoMenorReferencia() {
		Q146 q146 = new Q146();
		assertEquals(3, q146.obterPosicaoMenor("abaacb", 5));
		assertEquals(-1, q146.obterPosicaoMenor("abaacba", 6));
		assertEquals(3, q146.obterPosicaoMenor("abaacba", 5));
		assertEquals(-1, q146.obterPosicaoMenor("aba", 2));
		assertEquals(0, q146.obterPosicaoMenor("aba", 1));
		assertEquals(1, q146.obterPosicaoMenor("bab", 2));
	}
	
	@Test
	public void deveCalcularSucessor() {
		Q146 q146 = new Q146();
		assertEquals("ababac", q146.calcularSucessor("abaacb"));
		assertEquals("ababaac", q146.calcularSucessor("abaacba"));
		assertEquals("baa", q146.calcularSucessor("aba"));
		assertEquals("baa", q146.calcularSucessor("aba"));
		assertEquals("bba", q146.calcularSucessor("bab"));
	}

}
