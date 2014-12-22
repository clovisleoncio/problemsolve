package p305;

import static junit.framework.Assert.*;

import org.junit.Test;

import p305.Main.Q305;

public class Q305Test {

	@Test
	public void deveObterPrimeiroBomMorto() {
		Q305 q305 = new Q305();

		assertEquals(2, q305.calcularPrimeiroBomMorto(3, 4));
		assertEquals(4, q305.calcularPrimeiroBomMorto(3, 5));
	}
	
	@Test
	public void deveDeterminarNumeroPulos() {
		Q305 q305 = new Q305();
		
		//                                          1  2  3  4   5    6    7     8     9     10
//		private static final int[] RESULTADOS = {0, 2, 7, 5, 30, 169, 441, 1872, 7632, 1740, 93313};

		
		assertEquals(2, q305.calcularNecessarioMatarMaus(1));
		assertEquals(7, q305.calcularNecessarioMatarMaus(2));
		assertEquals(5, q305.calcularNecessarioMatarMaus(3));
		assertEquals(30, q305.calcularNecessarioMatarMaus(4));
		assertEquals(169, q305.calcularNecessarioMatarMaus(5));
		assertEquals(441, q305.calcularNecessarioMatarMaus(6));
		assertEquals(1872, q305.calcularNecessarioMatarMaus(7));
		assertEquals(7632, q305.calcularNecessarioMatarMaus(8));
		assertEquals(1740, q305.calcularNecessarioMatarMaus(9));
		assertEquals(93313, q305.calcularNecessarioMatarMaus(10));
		assertEquals(459901, q305.calcularNecessarioMatarMaus(11));
		assertEquals(1358657, q305.calcularNecessarioMatarMaus(12));
		assertEquals(2504881, q305.calcularNecessarioMatarMaus(13));
	}

}
