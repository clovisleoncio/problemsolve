package p10082;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Q10082 q10082 = new Q10082();
		
		String line;
		while ( (line = in.readLine()) != null) {
			System.out.println(q10082.translate(line));
		}
		
		in.close();
		
	}
	
	public static class Q10082 {
		
		private static final char[] MAP = new char[256];

		private static void fill(String text) {
			char[] row = text.toCharArray();
			for (int i = 1; i < row.length; i++) {
				int index = (int) row[i];
				MAP[index] = row[i - 1];
			}
		}
		
		static {
			fill("`1234567890-=");
			fill("QWERTYUIOP[]\\");
			fill("ASDFGHJKL;'");
			fill("ZXCVBNM,./");
			fill("  ");
		}

		public char translate(char c) {
			int index = (int) c;
			return MAP[index];
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
