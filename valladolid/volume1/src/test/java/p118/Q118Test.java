package p118;

import static org.junit.Assert.*;

import org.junit.Test;

import p118.Main.Q118;

public class Q118Test {
	
	@Test
	public void deveObterIndiceDirecao() {
		
		Q118 q118 = new Q118(5, 3);
		
		assertEquals(0, q118.indiceDirecao("N"));
		assertEquals(1, q118.indiceDirecao("E"));
		assertEquals(2, q118.indiceDirecao("S"));
		assertEquals(3, q118.indiceDirecao("W"));
	}

	@Test
	public void deveGirarEsquerda() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "N");
		
		assertEquals("N", q118.letraDirecao());
		q118.girarEsquerda();
		assertEquals("W", q118.letraDirecao());
		q118.girarEsquerda();
		assertEquals("S", q118.letraDirecao());
		q118.girarEsquerda();
		assertEquals("E", q118.letraDirecao());
		q118.girarEsquerda();
		assertEquals("N", q118.letraDirecao());
	}
	
	@Test
	public void deveGirarDireita() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "N");
		
		assertEquals("N", q118.letraDirecao());
		q118.girarDireita();
		assertEquals("E", q118.letraDirecao());
		q118.girarDireita();
		assertEquals("S", q118.letraDirecao());
		q118.girarDireita();
		assertEquals("W", q118.letraDirecao());
		q118.girarDireita();
		assertEquals("N", q118.letraDirecao());
	}
	
	@Test
	public void deveAndarNorte() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "N");
		
		q118.andar();
		assertEquals(1, q118.x);
		assertEquals(2, q118.y);
	}
	
	@Test
	public void deveAndarSul() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "S");
		
		q118.andar();
		assertEquals(1, q118.x);
		assertEquals(0, q118.y);
	}
	
	@Test
	public void deveAndarLeste() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "E");
		
		q118.andar();
		assertEquals(2, q118.x);
		assertEquals(1, q118.y);
	}
	
	@Test
	public void deveAndarOeste() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "W");
		
		q118.andar();
		assertEquals(0, q118.x);
		assertEquals(1, q118.y);
	}
	
	@Test
	public void deveIndicarQueSaiu() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "S");
		
		assertTrue(q118.andar());
		assertFalse(q118.andar());
	}
	
	@Test
	public void deveIgnorarOndeRoboAnteriorSaiu() {
		Q118 q118 = new Q118(5, 3);
		q118.init(1, 1, "S");
		
		assertTrue(q118.andar());
		assertFalse(q118.andar());
		
		q118.init(1, 1, "S");
		
		assertTrue(q118.andar());
		assertEquals(1, q118.x);
		assertEquals(0, q118.y);
		assertTrue(q118.andar());
		assertEquals(1, q118.x);
		assertEquals(0, q118.y);
	}
	
	@Test
	public void deveResolverInputPassoAPasso() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(1, 1, "E");
		q118.girarDireita();
		q118.andar();
		q118.girarDireita();
		q118.andar();
		q118.girarDireita();
		q118.andar();
		q118.girarDireita();
		q118.andar();
		
		assertEquals(1, q118.x);
		assertEquals(1, q118.y);
		assertEquals("E", q118.letraDirecao());
		
		q118.init(3, 2, "N");
		q118.andar();
		q118.girarDireita();
		q118.girarDireita();
		q118.andar();
		q118.girarEsquerda();
		q118.girarEsquerda();
		q118.andar();
		assertFalse(q118.andar());
		
		assertEquals(3, q118.x);
		assertEquals(3, q118.y);
		assertEquals("N", q118.letraDirecao());

		q118.init(0, 3, "W");
		q118.girarEsquerda();
		q118.girarEsquerda();
		q118.andar();
		q118.andar();
		q118.andar();
		q118.girarEsquerda();
		q118.andar();
		q118.girarEsquerda();
		q118.andar();
		q118.girarEsquerda();

		assertEquals(2, q118.x);
		assertEquals(3, q118.y);
		assertEquals("S", q118.letraDirecao());
	}
	
	@Test
	public void deveResolverStrings() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(1, 1, "E");
		q118.executar("RFRFRFRF");

		assertEquals(1, q118.x);
		assertEquals(1, q118.y);
		assertEquals("E", q118.letraDirecao());

		q118.init(3, 2, "N");
		q118.executar("FRRFLLFFRRFLL");

		assertEquals(3, q118.x);
		assertEquals(3, q118.y);
		assertEquals("N", q118.letraDirecao());

		q118.init(0, 3, "W");
		q118.executar("LLFFFLFLFL");

		assertEquals(2, q118.x);
		assertEquals(3, q118.y);
		assertEquals("S", q118.letraDirecao());

	}
	
	@Test
	public void deveObterEstadoFinal() {
		Q118 q118 = new Q118(5, 3);
		
		q118.init(1, 1, "E");
		q118.executar("RFRFRFRF");
		
		assertEquals("1 1 E", q118.getEstadoFinal());

		q118.init(3, 2, "N");
		q118.executar("FRRFLLFFRRFLL");

		assertEquals("3 3 N LOST", q118.getEstadoFinal());

		q118.init(0, 3, "W");
		q118.executar("LLFFFLFLFL");

		assertEquals("2 3 S", q118.getEstadoFinal());
	}

}
