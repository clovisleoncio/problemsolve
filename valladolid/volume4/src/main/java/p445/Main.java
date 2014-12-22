package p445;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Q445 q445 = new Q445();
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			if (linha.trim().equals("")) {
				System.out.println();
			}
			else {
				String[] tokens = q445.quebrar(linha);
				for (String token : tokens) {
					System.out.println(q445.parse(token));
				}
			}
		}
		
		in.close();
	}
	
	public static class Q445 {

		public String parse(String representacao) {
			StringBuilder builder = new StringBuilder();
			int tamanho = representacao.length();
			int valorNumero = 0;
			for (int i = 0; i < tamanho; i++) {
				char c = representacao.charAt(i);
				if (c >= '0' && c <= '9') {
					valorNumero += c - '0';
				}
				else {
					char print = c == 'b' ? ' ' : c;
					for (int j = 0; j < valorNumero; j++) {
						builder.append(print);
					}
					valorNumero = 0;
				}
			}
			return builder.toString();
		}

		public String[] quebrar(String linha) {
			return linha.split("!");
		}
		
	}

}
