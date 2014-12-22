package p575;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String numero;
		
		while ( !(numero = scanner.next()).trim().equals("0") ) {
			System.out.println(converte(numero));
		}
		
		scanner.close();
		
	}

	public static int converte(String representacao) {
		int total = 0;
		int tamanho = representacao.length();
		for (int i = tamanho - 1; i >= 0; i--) {
			char c = representacao.charAt(i);
			if (c != '0') {
				int indice = tamanho - i;
				int valorIndice = c - '0';
				total += executarUnidade(indice, valorIndice);
			}
		}
		
		return total;
	}

	public static int executarUnidade(int indice, int valorIndice) {
		return valorIndice * ((2 << (indice - 1)) - 1);
	}

}
