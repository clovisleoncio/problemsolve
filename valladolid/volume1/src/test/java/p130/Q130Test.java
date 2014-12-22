package p130;

import static junit.framework.Assert.*;

import org.junit.Test;

import p130.Main.Q130;

public class Q130Test {
	
	@Test
	public void deveAvancar() {
		assertEquals(1, new Q130(5,  2).setPessoas(new Integer[]{1, 2, 3, 4, 5}).avancar(-1));
		assertEquals(3, new Q130(5,  2).setPessoas(new Integer[]{1, null, 3, 4, 5}).avancar(1));
		assertEquals(4, new Q130(5,  2).setPessoas(new Integer[]{1, 4, 3, null, 5}).avancar(1));
		assertEquals(1, new Q130(5,  2).setPessoas(new Integer[]{1, 4, 3, null, null}).avancar(4));
		assertEquals(2, new Q130(5,  2).setPessoas(new Integer[]{1, null, 3, null, 4}).avancar(4));
		assertEquals(0, new Q130(5,  2).setPessoas(new Integer[]{1, null, null, null, 4}).avancar(2));
		assertEquals(2, new Q130(5,  2).setPessoas(new Integer[]{null, null, 1, null, 4}).avancar(2));
	}

	@Test
	public void deveObterUltimoMorrer() {
		assertEquals(2, new Q130(5, 1).calcularUltimoMorrer());
		assertEquals(4, new Q130(5, 2).calcularUltimoMorrer());
		assertEquals(1, new Q130(5, 3).calcularUltimoMorrer());
		assertEquals(2, new Q130(5, 4).calcularUltimoMorrer());
		assertEquals(4, new Q130(5, 5).calcularUltimoMorrer());
		assertEquals(5, new Q130(5, 6).calcularUltimoMorrer());
		assertEquals(1, new Q130(1, 1).calcularUltimoMorrer());
		assertEquals(1, new Q130(1, 5).calcularUltimoMorrer());
	}
	
	@Test
	public void deveObterPosicaoSegura() {
		assertEquals(5, new Q130(5, 1).calcularPosicaoSegura());
		assertEquals(3, new Q130(5, 2).calcularPosicaoSegura());
		assertEquals(1, new Q130(5, 3).calcularPosicaoSegura());
		assertEquals(5, new Q130(5, 4).calcularPosicaoSegura());
		assertEquals(3, new Q130(5, 5).calcularPosicaoSegura());
		assertEquals(2, new Q130(5, 6).calcularPosicaoSegura());
		assertEquals(1, new Q130(1, 1).calcularPosicaoSegura());
		assertEquals(1, new Q130(1, 5).calcularPosicaoSegura());
	}

}
