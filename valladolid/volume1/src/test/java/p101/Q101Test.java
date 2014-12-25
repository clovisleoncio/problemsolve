package p101;

import static org.junit.Assert.*;

import org.junit.Test;

import p101.Main.Q101;

public class Q101Test {
	
	@Test
	public void deveExecutarMoveOnto() {
		Q101 q101 = new Q101(10);
		q101.execute("move", 1, "onto", 9);
		
		assertEquals(new Integer(9), q101.pilhas[9].elementAt(0));
		assertEquals(new Integer(1), q101.pilhas[9].elementAt(1));
		
		assertEquals(new Integer(9), q101.indice.get(9));
		assertEquals(new Integer(9), q101.indice.get(1));

		q101.execute("move", 9, "onto", 5);

		assertEquals(new Integer(5), q101.pilhas[5].elementAt(0));
		assertEquals(new Integer(9), q101.pilhas[5].elementAt(1));
		assertEquals(new Integer(1), q101.pilhas[1].elementAt(0));
		
		assertEquals(new Integer(5), q101.indice.get(9));
		assertEquals(new Integer(5), q101.indice.get(5));
		assertEquals(new Integer(1), q101.indice.get(1));

	}
	
	@Test
	public void deveExecutarMoveOver() {
		Q101 q101 = new Q101(10);
		q101.execute("move", 1, "onto", 9);
		q101.execute("move", 2, "over", 9);

		assertEquals(new Integer(9), q101.pilhas[9].elementAt(0));
		assertEquals(new Integer(1), q101.pilhas[9].elementAt(1));
		assertEquals(new Integer(2), q101.pilhas[9].elementAt(2));

		assertEquals(new Integer(9), q101.indice.get(9));
		assertEquals(new Integer(9), q101.indice.get(1));
		assertEquals(new Integer(9), q101.indice.get(2));
	}
	
	@Test
	public void deveExecutarPileOnto() {
		Q101 q101 = new Q101(10);
		q101.execute("pile", 1, "onto", 9);
		q101.execute("pile", 9, "onto", 2);
		
		assertEquals(new Integer(2), q101.pilhas[2].elementAt(0));
		assertEquals(new Integer(9), q101.pilhas[2].elementAt(1));
		assertEquals(new Integer(1), q101.pilhas[2].elementAt(2));

		assertEquals(new Integer(2), q101.indice.get(9));
		assertEquals(new Integer(2), q101.indice.get(1));
		assertEquals(new Integer(2), q101.indice.get(2));
	}
	
	@Test
	public void deveIgnorarIguais() {
		Q101 q101 = new Q101(10);
		assertEquals(1, q101.pilhas[9].size());
		q101.execute("move", 1, "onto", 9);
		assertEquals(2, q101.pilhas[9].size());
		q101.execute("move", 9, "onto", 9);
		assertEquals(2, q101.pilhas[9].size());
	}
	
	@Test
	public void deveIgnorarMesmaPilha() {
		Q101 q101 = new Q101(10);
		assertEquals(1, q101.pilhas[9].size());
		q101.execute("move", 1, "onto", 9);
		assertEquals(2, q101.pilhas[9].size());
		q101.execute("move", 1, "onto", 9);
		assertEquals(2, q101.pilhas[9].size());
	}

}
