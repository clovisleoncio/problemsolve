package p151;

import static org.junit.Assert.*;

import org.junit.Test;

import p151.Main.Q151;

public class Q151Test {
	
	@Test
	public void deveObterUltimoComNumeroPassos() {
		assertEquals(13, new Q151(13).ultimo(1));
		assertEquals(10, new Q151(13).ultimo(2));
	}
	
	@Test
	public void deveIdentificarNumeroPassos() {
		assertEquals(1, new Q151(13).numeroPassos());
		assertEquals(7, new Q151(17).numeroPassos());
	}

}
