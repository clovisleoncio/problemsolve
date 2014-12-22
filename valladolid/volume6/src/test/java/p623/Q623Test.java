package p623;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class Q623Test {
	
	@Test
	public void deveCalcularFatorial() {
		assertEquals(BigInteger.ONE, Main.calcularFatorial(0));
		assertEquals(BigInteger.ONE, Main.calcularFatorial(1));
		assertEquals(new BigInteger("3628800"), Main.calcularFatorial(10));
		assertEquals(new BigInteger("265252859812191058636308480000000"), Main.calcularFatorial(30));
		assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), Main.calcularFatorial(50));
		assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), Main.calcularFatorial(100));
		assertEquals(new BigInteger("0"), Main.calcularFatorial(1000));
	}

}
