package p495;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import p495.Main.Q495;

public class Q495Test {
	
	@Test
	public void deveObterFibonacci() {
		Q495 q495 = new Q495();
		assertEquals(BigInteger.ZERO, q495.fibonacci(0));
		assertEquals(BigInteger.ONE, q495.fibonacci(1));
		assertEquals(new BigInteger("5"), q495.fibonacci(5));
		assertEquals(new BigInteger("13"), q495.fibonacci(7));
		assertEquals(new BigInteger("89"), q495.fibonacci(11));
	}

}
