package p494;

import static org.junit.Assert.*;

import org.junit.Test;

import p494.Main.Q494;

public class Q494Test {

	@Test
	public void deveContarPalavras() {
		Q494 q494 = new Q494();
		assertEquals(2, q494.palavras("Meep Meep!"));
		assertEquals(7, q494.palavras("I tot I taw a putty tat."));
		assertEquals(10, q494.palavras("I did! I did! I did taw a putty tat."));
		assertEquals(9, q494.palavras("Shhhhshhh ... I am hunting wabbits. He he he he ..."));
	}

}
