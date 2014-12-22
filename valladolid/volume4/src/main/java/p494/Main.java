package p494;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Q494 q494 = new Q494();
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			System.out.println(q494.palavras(linha));
		}
		
		in.close();
		
	}

	public static class Q494 {
		
		public int palavras(String str) {
			int numero = 0;
			str = str.toLowerCase();
			boolean ultimoLetra = false;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c >= 'a' && c <= 'z') {
					if (!ultimoLetra) {
						numero++;
					}
					ultimoLetra = true;
				}
				else {
					ultimoLetra = false;
				}
			}
			return numero;
		}

	}
	
}
