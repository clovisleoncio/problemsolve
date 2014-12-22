package p674;

import static org.junit.Assert.*;

import org.junit.Test;

import p674.Brute.Q674;

public class Q674Test {

	@Test
	public void deveObterNumeroCombinacoes() {
		assertEquals(4, new Q674(11).numeroCombinacoes());
		assertEquals(2, new Q674(5).numeroCombinacoes());
		assertEquals(18, new Q674(30).numeroCombinacoes());
		assertEquals(50, new Q674(50).numeroCombinacoes());
		assertEquals(292, new Q674(100).numeroCombinacoes());
		assertEquals(9590, new Q674(300).numeroCombinacoes());
		assertEquals(59576, new Q674(500).numeroCombinacoes());
		assertEquals(801451, new Q674(1000).numeroCombinacoes());
	}
	
}
