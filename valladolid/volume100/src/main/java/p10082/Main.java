package p10082;


public class Main {
	
	public static class Q10082 {
		
		private static final int ADJUST = 32;
		
		private static final char[] MAP = new char[]{
			' ', // space
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'M', // ,
			'\0', //
			'\0', //
			'.', // /
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', //
			'\0', // A
			'\0', // B
			'\0', // C
			'\0', // D
			'\0', // E
			'D', // F
			'F', // G
			'\0', // H
			'\0', // I
			'\0', // J
			'\0', // K
			'\0', // L
			'N', // M
			'\0', // N
			'I', // O
			'O', // P
			'\0', // Q
			'E', // R
			'A', // S
			'\0', // T
			'Y', // U
			'\0', // V
			'\0', // W
			'\0', // X
			'T', // Y
			'\0', // Z
			};

		public char translate(char c) {
			int index = (int) c;
			return MAP[index - ADJUST];
		}
		
		public String translate(String text) {
			char[] translated = new char[text.length()];
			for (int i = 0; i < translated.length; i++) {
				translated[i] = translate(text.charAt(i));
			}
			return new String(translated);
		}
		
	}

}
