package p445;

import static org.junit.Assert.*;

import org.junit.Test;

import p445.Main.Q445;


public class Q445Test {
	
	@Test
	public void deveFazerParsingInstrucaoSimples() {
		Q445 q445 = new Q445();
		assertEquals("T TTTTT", q445.parse("1T1b5T"));
	}
	
	@Test
	public void deveFazerParsingDoisNumeros() {
		Q445 q445 = new Q445();
		assertEquals("XX   X", q445.parse("11X21b1X"));
	}
	
	@Test
	public void deveQuebrarString() {
		Q445 q445 = new Q445();
		String[] resultado = q445.quebrar("1T1b5T!1T2b1T1b2T!1T1b1T2b2T!1T3b1T1b1T!3T3b1T!1T3b1T1b1T!5T1*1T");
		assertEquals(7, resultado.length);
		assertEquals("1T1b5T", resultado[0]);
		assertEquals("1T2b1T1b2T", resultado[1]);
	}

}
