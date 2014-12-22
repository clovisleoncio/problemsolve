package p499;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			contar(linha);
		}
		
		in.close();
	}

	private static void contar(String linha) {
		int[] minusculas = new int[26];
		int[] maiusculas = new int[26];
		
		int frequencia = 0;
		
		for (int i = 0; i < linha.length(); i++) {
			char c = linha.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				int indice = c-'A';
				maiusculas[indice] = maiusculas[indice] + 1;
				if (maiusculas[indice] > frequencia) {
					frequencia = maiusculas[indice];
				}
			}
			else if (c >= 'a' && c <= 'z') {
				int indice = c-'a';
				minusculas[indice] = minusculas[indice] + 1;
				if (minusculas[indice] > frequencia) {
					frequencia = minusculas[indice];
				}
			}
		}
		
		for (int i = 0; i < maiusculas.length; i++) {
			if (maiusculas[i] == frequencia) {
				System.out.print((char) (i + 'A'));
			}
		}
		for (int i = 0; i < minusculas.length; i++) {
			if (minusculas[i] == frequencia) {
				System.out.print((char) (i + 'a'));
			}
		}
		System.out.println(" "+ frequencia);
	}

}
