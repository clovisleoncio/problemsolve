package p575;

import static org.junit.Assert.*;
import org.junit.Test;

public class Q575Test {
	
	@Test
	public void deveExecutarUnidade() {
		assertEquals(0, Main.executarUnidade(1, 0));
		assertEquals(6, Main.executarUnidade(2, 2));
		assertEquals(7, Main.executarUnidade(3, 1));
		assertEquals(0, Main.executarUnidade(4, 0));
		assertEquals(31, Main.executarUnidade(5, 1));
	}
	
	@Test
	public void deveConverter() {
		assertEquals(44, Main.converte("10120"));
		assertEquals(2147483646, Main.converte("200000000000000000000000000000"));
		assertEquals(3, Main.converte("10"));
		assertEquals(2147483647, Main.converte("1000000000000000000000000000000"));
		assertEquals(4, Main.converte("11"));
		assertEquals(7, Main.converte("100"));
		assertEquals(1041110737, Main.converte("11111000001110000101101102000"));
	}

}
