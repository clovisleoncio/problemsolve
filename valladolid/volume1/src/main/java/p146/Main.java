package p146;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Q146 q146 = new Q146();
		
		String codigo;
		while ( !(codigo = scanner.next().trim()).equals("#") ) {
			if (q146.possuiSucessor(codigo)) {
				System.out.println(q146.calcularSucessor(codigo));
			}
			else {
				System.out.println("No Successor");
			}
		}
		
		scanner.close();
		
	}

	public static class Q146 {

		public boolean possuiSucessor(String codigo) {
			char anterior = codigo.charAt(0);
			for (int i = 1; i < codigo.length(); i++) {
				char letra = codigo.charAt(i);
				if (letra > anterior) {
					return true;
				}
				anterior = letra;
			}
			return false;
		}

		public String calcularSucessor(String codigo) {
			
			for (int i = codigo.length() - 1; i > 0; i--) {
				int posicaoMenor = obterPosicaoMenor(codigo, i);
				if (posicaoMenor != -1) {
					String trecho1 = codigo.substring(0, posicaoMenor);
					String trecho2 = codigo.substring(posicaoMenor, i);
					String trecho3 = codigo.substring(i + 1);
					
					char[] fim = (trecho2 + trecho3).toCharArray();
					Arrays.sort(fim);
					return trecho1 + codigo.charAt(i) + new String(fim);
				}
			}
			
			return null;
		}

		public int obterPosicaoMenor(String codigo, int referencia) {
			char charRef = codigo.charAt(referencia);
			for (int i = referencia; i >= 0; i--) {
				if (codigo.charAt(i) < charRef) {
					return i;
				}
			}
			return -1;
		}
		
	}
	
}
