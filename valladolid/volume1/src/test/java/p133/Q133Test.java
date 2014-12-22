package p133;

import static org.junit.Assert.*;

import org.junit.Test;

import p133.Main.Q133;

public class Q133Test {
	
	@Test
	public void deveAvancar() {
		Q133 q133a = new Q133(10, 4, 3);
		assertEquals(3, q133a.setPessoas(new boolean[]{true, true, true, true, true, true, true, true, true, true}).avancar(-1));
		assertEquals(7, q133a.setPessoas(new boolean[]{true, true, true, true, true, true, true, true, true, true}).retroceder(10));
		assertEquals(8, q133a.setPessoas(new boolean[]{true, true, true, false, true, true, true, false, true, true}).avancar(3));
		assertEquals(4, q133a.setPessoas(new boolean[]{true, true, true, false, true, true, true, false, true, true}).retroceder(7));
		assertEquals(2, q133a.setPessoas(new boolean[]{true, true, true, false, false, true, true, false, false, true}).avancar(8));
		assertEquals(0, q133a.setPessoas(new boolean[]{true, true, true, false, false, true, true, false, false, true}).retroceder(4));
		assertEquals(1, q133a.setPessoas(new boolean[]{false, true, false, false, false, true, true, false, false, true}).avancar(2));
		assertEquals(5, q133a.setPessoas(new boolean[]{false, true, false, false, false, true, true, false, false, true}).retroceder(0));
		assertEquals(9, q133a.setPessoas(new boolean[]{false, false, false, false, false, false, true, false, false, true}).avancar(1));
		assertEquals(9, q133a.setPessoas(new boolean[]{false, false, false, false, false, false, true, false, false, true}).retroceder(5));
		assertEquals(6, q133a.setPessoas(new boolean[]{false, false, false, false, false, false, true, false, false, false}).avancar(9));
		assertEquals(6, q133a.setPessoas(new boolean[]{false, false, false, false, false, false, true, false, false, false}).retroceder(9));

		Q133 q133b = new Q133(8, 4, 3);
		assertEquals(3, q133b.setPessoas(new boolean[]{true, true, true, true, true, true, true, true}).avancar(-1));
		assertEquals(5, q133b.setPessoas(new boolean[]{true, true, true, true, true, true, true, true}).retroceder(8));

	}
	
	@Test
	public void deveResolver() {
		Q133 q133a = new Q133(10, 4, 3);
		q133a.resolver();

		Q133 q133b = new Q133(8, 4, 3);
		q133b.resolver();
	}

}
