package p105;

import static junit.framework.Assert.*;

import org.junit.Test;

import p105.Main.Q105;

public class Q105Test {
	
	@Test
	public void deveAdicionarString() {
		Q105 q105 = new Q105();
		q105.addBuilding("1  11  5");
		assertEquals(11, q105.getHeight(1));
		assertEquals(0, q105.getHeight(5));
	}
	
	@Test
	public void deveFormarSkyline() {
		Q105 q105 = new Q105();
		
		q105.addBuilding(1, 11, 5);
		q105.addBuilding(2, 6, 7);
		q105.addBuilding(3, 13, 9);
		q105.addBuilding(12, 7, 16);
		q105.addBuilding(14, 3, 25);
		q105.addBuilding(19, 18, 22);
		q105.addBuilding(23, 13, 29);
		q105.addBuilding(24, 4, 28);
		
		assertEquals(11, q105.getHeight(1));
		assertEquals(13, q105.getHeight(3));
		assertEquals(0, q105.getHeight(9));
		assertEquals(7, q105.getHeight(12));
		assertEquals(3, q105.getHeight(16));
		assertEquals(18, q105.getHeight(19));
		assertEquals(3, q105.getHeight(22));
		assertEquals(13, q105.getHeight(23));
		assertEquals(0, q105.getHeight(29));
		
		q105.print();

	}
	
	@Test
	public void devePermitirNegativo() {
		Q105 q105 = new Q105();
		
		q105.addBuilding(-5, 5 ,1 );
		q105.addBuilding(1, 6, 2);
		q105.addBuilding(1, 2, 7);
		q105.addBuilding(3, 12, 10);
		q105.addBuilding(4, 3, 5);
		q105.addBuilding(7, 5, 20);
		q105.addBuilding(8, 15, 12);
		q105.addBuilding(11, 12, 13);
		q105.addBuilding(16, 14, 19);
		q105.addBuilding(21, 2, 22);
		q105.addBuilding(23, 1, 30);
		q105.addBuilding(26, 10, 28);
		q105.addBuilding(26, 12, 27);
		q105.addBuilding(32, 5, 36);
		q105.addBuilding(34, 3, 38);
		q105.addBuilding(34, 3, 40);
		q105.addBuilding(37, 2, 42);
		q105.addBuilding(38, 2, 44);
		q105.addBuilding(45, 1, 46);

		assertEquals(5, q105.getHeight(-5));
		assertEquals(6, q105.getHeight(1));
		assertEquals(2, q105.getHeight(2));
		assertEquals(12, q105.getHeight(3));
		assertEquals(15, q105.getHeight(8));
		assertEquals(12, q105.getHeight(12));
		assertEquals(5, q105.getHeight(13));
		assertEquals(14, q105.getHeight(16));
		assertEquals(5, q105.getHeight(19));
		assertEquals(0, q105.getHeight(20));
		assertEquals(2, q105.getHeight(21));
		assertEquals(0, q105.getHeight(22));
		assertEquals(1, q105.getHeight(23));
		assertEquals(12, q105.getHeight(26));
		assertEquals(10, q105.getHeight(27));
		assertEquals(1, q105.getHeight(28));
		assertEquals(0, q105.getHeight(30));
		assertEquals(5, q105.getHeight(32));
		assertEquals(3, q105.getHeight(36));
		assertEquals(2, q105.getHeight(40));
		assertEquals(0, q105.getHeight(44));
		assertEquals(1, q105.getHeight(45));
		assertEquals(0, q105.getHeight(46));

	}

	@Test
	public void devePermitirLimitePositivo() {
		Q105 q105 = new Q105();
		
		q105.addBuilding(9999, 2, 10000);
		
		assertEquals(2, q105.getHeight(9999));
		assertEquals(0, q105.getHeight(10000));
	}
	
	@Test
	public void devePermitirLimiteNegativo() {
		Q105 q105 = new Q105();
		
		q105.addBuilding(-10000, 2, -9999);
		
		assertEquals(2, q105.getHeight(-10000));
		assertEquals(0, q105.getHeight(-9999));
	}
	
}
