package p118;

import static org.junit.Assert.*;

import org.junit.Test;

import p118.Main.Q118;
import static p118.Main.Direction.*;

public class Q118Test {
	
	@Test
	public void deveColocarRoboMundo() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(2, 3, N);
		
		assertEquals(2, q118.getCoordinate().getX());
		assertEquals(3, q118.getCoordinate().getY());
		assertEquals(N, q118.getDirection());
	}

	@Test
	public void deveGirarEsquerda() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, N);
		
		assertEquals(N, q118.getDirection());
		q118.turnLeft();
		assertEquals(W, q118.getDirection());
		q118.turnLeft();
		assertEquals(S, q118.getDirection());
		q118.turnLeft();
		assertEquals(E, q118.getDirection());
		q118.turnLeft();
		assertEquals(N, q118.getDirection());
	}
	
	@Test
	public void deveGirarDireita() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, N);
		
		assertEquals(N, q118.getDirection());
		q118.turnRight();
		assertEquals(E, q118.getDirection());
		q118.turnRight();
		assertEquals(S, q118.getDirection());
		q118.turnRight();
		assertEquals(W, q118.getDirection());
		q118.turnRight();
		assertEquals(N, q118.getDirection());
	}
	
	@Test
	public void deveAndarNorte() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, N);
		
		q118.forward();
		assertEquals(1, q118.getCoordinate().getX());
		assertEquals(2, q118.getCoordinate().getY());
	}
	
	@Test
	public void deveAndarSul() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, S);
		
		q118.forward();
		assertEquals(1, q118.getCoordinate().getX());
		assertEquals(0, q118.getCoordinate().getY());
	}
	
	@Test
	public void deveAndarLeste() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, E);
		
		q118.forward();
		assertEquals(2, q118.getCoordinate().getX());
		assertEquals(1, q118.getCoordinate().getY());
	}
	
	@Test
	public void deveAndarOeste() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, W);
		
		q118.forward();
		assertEquals(0, q118.getCoordinate().getX());
		assertEquals(1, q118.getCoordinate().getY());
	}
	
	@Test
	public void deveIndicarQueSaiu() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, S);
		
		assertTrue(q118.forward());
		assertFalse(q118.forward());
	}
	
	@Test
	public void deveIgnorarOndeRoboAnteriorSaiu() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, S);
		
		assertTrue(q118.forward());
		assertFalse(q118.forward());
		
		q118.init(1, 1, S);
		
		assertTrue(q118.forward());
		assertEquals(1, q118.getCoordinate().getX());
		assertEquals(0, q118.getCoordinate().getY());
		assertTrue(q118.forward());
		assertEquals(1, q118.getCoordinate().getX());
		assertEquals(0, q118.getCoordinate().getY());
	}
	
	@Test
	public void deveResolverInputPassoAPasso() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(1, 1, E);
		q118.turnRight();
		q118.forward();
		q118.turnRight();
		q118.forward();
		q118.turnRight();
		q118.forward();
		q118.turnRight();
		q118.forward();
		
		assertEquals(1, q118.getCoordinate().getX());
		assertEquals(1, q118.getCoordinate().getY());
		assertEquals(E, q118.getDirection());
		
		q118.init(3, 2, N);
		q118.forward();
		q118.turnRight();
		q118.turnRight();
		q118.forward();
		q118.turnLeft();
		q118.turnLeft();
		q118.forward();
		assertFalse(q118.forward());
		
		assertEquals(3, q118.getCoordinate().getX());
		assertEquals(3, q118.getCoordinate().getY());
		assertEquals(N, q118.getDirection());

		q118.init(0, 3, W);
		q118.turnLeft();
		q118.turnLeft();
		q118.forward();
		q118.forward();
		q118.forward();
		q118.turnLeft();
		q118.forward();
		q118.turnLeft();
		q118.forward();
		q118.turnLeft();

		assertEquals(2, q118.getCoordinate().getX());
		assertEquals(3, q118.getCoordinate().getY());
		assertEquals(S, q118.getDirection());
	}
	
	@Test
	public void deveResolverStrings() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(1, 1, E);
		q118.execute("RFRFRFRF");

		assertEquals(1, q118.getCoordinate().getX());
		assertEquals(1, q118.getCoordinate().getY());
		assertEquals(E, q118.getDirection());

		q118.init(3, 2, N);
		q118.execute("FRRFLLFFRRFLL");

		assertEquals(3, q118.getCoordinate().getX());
		assertEquals(3, q118.getCoordinate().getY());
		assertEquals(N, q118.getDirection());

		q118.init(0, 3, W);
		q118.execute("LLFFFLFLFL");

		assertEquals(2, q118.getCoordinate().getX());
		assertEquals(3, q118.getCoordinate().getY());
		assertEquals(S, q118.getDirection());
	}
	
	@Test
	public void deveObterEstadoFinal() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(1, 1, E);
		q118.execute("RFRFRFRF");
		
		assertEquals("1 1 E", q118.getFinalState());

		q118.init(3, 2, N);
		q118.execute("FRRFLLFFRRFLL");

		assertEquals("3 3 N LOST", q118.getFinalState());

		q118.init(0, 3, W);
		q118.execute("LLFFFLFLFL");

		assertEquals("2 3 S", q118.getFinalState());
	}

}
