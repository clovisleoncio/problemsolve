package p10038;

import static org.junit.Assert.*;

import org.junit.Test;

import p10038.Main;

public class Q10038Test {
	
	@Test
	public void deveIdentificarTamanho1Jolly() {
		assertTrue(Main.jolly(new String[]{"1", "1"}));
	}
	
	@Test
	public void deveIdentificarJolly() {
		assertTrue(Main.jolly(new String[]{"4", "1", "4", "2", "3"}));
		assertTrue(Main.jolly(new String[]{"2", "1", "2"}));
	}
	
	@Test
	public void deveIdentificarNaoJolly() {
		assertFalse(Main.jolly(new String[]{"5", "1", "4", "2", "-1", "6"}));
		assertFalse(Main.jolly(new String[]{"3", String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MIN_VALUE), "2"}));
	}

}
