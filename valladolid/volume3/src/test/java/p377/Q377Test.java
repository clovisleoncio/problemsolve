package p377;

import static junit.framework.Assert.*;

import org.junit.Test;

import p377.Main.Q377;

public class Q377Test {
	
	@Test
	public void deveAplicarOperacaoL() {
		assertEquals("UV", new Q377("V", "U").operacaoL().getValor2());
	}
	
	@Test
	public void deveAplicarOperacaoR() {
		assertEquals("C", new Q377("V", "CC").operacaoR().getValor2());
		assertEquals("D", new Q377("V", "DD").operacaoR().getValor2());
	}
	
	@Test
	public void deveAplicarOperacaoA() {
		assertEquals("V", new Q377("V", "V").operacaoA().getValor2());
		assertEquals("U", new Q377("V", "U").operacaoA().getValor2());
		assertEquals("C", new Q377("V", "C").operacaoA().getValor2());
		assertEquals("D", new Q377("V", "D").operacaoA().getValor2());
		assertEquals("U", new Q377("U", "V").operacaoA().getValor2());
		assertEquals("C", new Q377("U", "U").operacaoA().getValor2());
		assertEquals("D", new Q377("U", "C").operacaoA().getValor2());
		assertEquals("UV", new Q377("U", "D").operacaoA().getValor2());
		assertEquals("C", new Q377("C", "V").operacaoA().getValor2());
		assertEquals("D", new Q377("C", "U").operacaoA().getValor2());
		assertEquals("UV", new Q377("C", "C").operacaoA().getValor2());
		assertEquals("UU", new Q377("C", "D").operacaoA().getValor2());
		assertEquals("D", new Q377("D", "V").operacaoA().getValor2());
		assertEquals("UV", new Q377("D", "U").operacaoA().getValor2());
		assertEquals("UU", new Q377("D", "C").operacaoA().getValor2());
		assertEquals("UC", new Q377("D", "D").operacaoA().getValor2());
	}
	
	@Test
	public void deveObterRepresentacaoResultado() {
		assertEquals("VVVVVVDV", new Q377("CC", "C").operacaoA().getResultado());
	}
	
	@Test
	public void devePassarInputsProblema() {
		Q377 primeiro = new Q377("VVVVU", "VVVVU");
		primeiro.operacaoA();
		primeiro.operacaoA();
		primeiro.operacaoA();
		assertEquals("VVVVVVUV", primeiro.getResultado());
		
		Q377 segundo = new Q377("VVCCV", "VVDCC");
		segundo.operacaoL();
		segundo.operacaoR();
		segundo.operacaoA();
		assertEquals("VVVVUCVC", segundo.getResultado());
		
		Q377 terceiro = new Q377("VVCCV", "VVDCC");
		terceiro.operacaoR();
		terceiro.operacaoL();
		terceiro.operacaoA();
		assertEquals("VVVVUCVV", terceiro.getResultado());
		
		Q377 quarto = new Q377("VVUUU", "VVVVU");
		quarto.operacaoA();
		assertFalse("VVVVVUCU".equals(quarto.getResultado()));
		
		Q377 quinto = new Q377("DDDDD", "VVVVU");
		quinto.operacaoA();
		quinto.operacaoL();
		quinto.operacaoL();
		assertEquals("UVVVVVVV", quinto.getResultado());
	}
	
}
