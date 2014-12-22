package p541;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tamanhoMatriz;
		
		while ( (tamanhoMatriz = scanner.nextInt()) != 0) {
			
			boolean[] linhas = new boolean[tamanhoMatriz];
			boolean[] colunas = new boolean[tamanhoMatriz];
			
			for (int i = 0; i < tamanhoMatriz; i++) {
				for (int j = 0; j < tamanhoMatriz; j++) {
					int valor = scanner.nextInt();
					if (valor == 1) {
						linhas[i] = !linhas[i];
						colunas[j] = !colunas[j];
					}
				}
			}
			
			imprimir(linhas, colunas, tamanhoMatriz);
			
		}
		
		scanner.close();
		
	}

	private static void imprimir(boolean[] linhas, boolean[] colunas, int tamanhoMatriz) {
		int posicaoLinha = -1;
		int posicaoColuna = -1;
		
		for (int i = 0; i < tamanhoMatriz; i++) {
			if (linhas[i]) {
				if (posicaoLinha == -1) {
					posicaoLinha = i;
				}
				else {
					System.out.println("Corrupt");
					return;
				}
			}
			if (colunas[i]) {
				if (posicaoColuna == -1) {
					posicaoColuna = i;
				}
				else {
					System.out.println("Corrupt");
					return;
				}
			}
		}
		
		if (posicaoLinha == -1) {
			System.out.println("OK");
		}
		else {
			System.out.println(String.format("Change bit (%d,%d)", posicaoLinha + 1, posicaoColuna + 1));
		}
	}

}
