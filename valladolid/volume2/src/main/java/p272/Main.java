package p272;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Q272 q272 = new Q272();
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			for (int i = 0; i < linha.length(); i++) {
				char c = linha.charAt(i);
				if (c == '"') {
					System.out.print(q272.recuperaDelimitador());
				}
				else {
					System.out.print(c);
				}
			}
			System.out.println();
		}
		
		in.close();
	}
	
	public static class Q272 {

		public boolean inicio = true;

		public String recuperaDelimitador() {
			String delimitador = inicio ? "``" : "''";
			inicio = !inicio;
			return delimitador;
		}
		
	}

}
