package p167;

import static org.junit.Assert.*;

import org.junit.Test;

import p167.Main.Q167;

public class Q167Test {
	
	@Test
	public void deveRealizarSomatorio() {
		
		int[][] tabuleiro = {
				{ 1,  2,  3,  4,  5,  6,  7,  8},
				{ 9, 10, 11, 12, 13, 14, 15, 16},
				{17, 18, 19, 20, 21, 22, 23, 24},
				{25, 26, 27, 28, 29, 30, 31, 32},
				{33, 34, 35, 36, 37, 38, 39, 40},
				{41, 42, 43, 44, 45, 46, 47, 48},
				{49, 50, 51, 52, 53, 54, 55, 56},
				{57, 58, 59, 60, 61, 62, 63, 64},
		};
		
		Q167 q167 = new Q167();
		
		int[][] resposta = {{0, 3}, {1, 6}, {2, 2}, {3, 7}, {4, 1}, {5, 4}, {6, 0}, {7, 5}};
		
		assertEquals(4 + 15 + 19 + 32 + 34 + 45 + 49 + 62, q167.aplicarSoma(tabuleiro, resposta));
	}
	
	@Test
	public void deveResolver() {
		
		int[][] tabuleiro = {
				{ 1,  2,  3,  4,  5,  6,  7,  8},
				{ 9, 10, 11, 12, 13, 14, 15, 16},
				{17, 18, 19, 20, 21, 22, 23, 24},
				{25, 26, 27, 28, 29, 30, 31, 32},
				{33, 34, 35, 36, 37, 38, 39, 40},
				{41, 42, 43, 44, 45, 46, 47, 48},
				{49, 50, 51, 52, 53, 54, 55, 56},
				{57, 58, 59, 60, 61, 62, 63, 64},
		};

		Q167 q167 = new Q167();

		assertEquals(260, q167.maiorValor(tabuleiro));
	}

}
