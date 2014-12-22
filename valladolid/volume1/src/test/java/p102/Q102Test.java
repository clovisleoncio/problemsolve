package p102;

import static org.junit.Assert.*;
import org.junit.Test;

import p102.Main.Q102;

public class Q102Test {

	@Test
	public void deveCalcularSoma() {
		Q102 q102a = new Q102(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		assertEquals(30, q102a.soma(new int[]{3, 6, 2, 8, 1, 4}));
		
		Q102 q102b = new Q102(new int[]{5, 10, 5, 20, 10, 5, 10, 20, 10});
		assertEquals(50, q102b.soma(new int[]{5, 8, 0, 6, 1, 4}));
	}
	
	@Test
	public void deveResolver() {
		Q102 q102a = new Q102(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		assertEquals("BCG", q102a.resolver());;
		Q102 q102b = new Q102(new int[]{5, 10, 5, 20, 10, 5, 10, 20, 10});
		assertEquals("CBG", q102b.resolver());;
	}
	
}
