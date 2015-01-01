package p10082;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import p10082.Main.Q10082;

public class Q10082Test {
	
	@Test
	public void deveTraduzirCadaCaractere() {
		Q10082 q10082 = new Q10082();

		assertEquals('I', q10082.translate('O'));
		assertEquals('A', q10082.translate('S'));
		assertEquals('M', q10082.translate(','));
		assertEquals('F', q10082.translate('G'));
		assertEquals('I', q10082.translate('O'));
		assertEquals('N', q10082.translate('M'));
		assertEquals('E', q10082.translate('R'));
		assertEquals('T', q10082.translate('Y'));
		assertEquals('O', q10082.translate('P'));
		assertEquals('D', q10082.translate('F'));
		assertEquals('A', q10082.translate('S'));
		assertEquals('Y', q10082.translate('U'));
		assertEquals('.', q10082.translate('/'));
		assertEquals(' ', q10082.translate(' '));
		fail();
	}
	
	@Test
	public void deveTraduzirTexto() {
		Q10082 q10082 = new Q10082();
		
		assertEquals("I AM FINE TODAY.", q10082.translate("O S, GOMR YPFSU/"));
		fail();
	}

}
