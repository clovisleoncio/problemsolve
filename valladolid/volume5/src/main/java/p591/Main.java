package p591;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroSet = 0;
		int quantidade;
		
		while( (quantidade = scanner.nextInt()) != 0) {
			
			numeroSet++;
			
			int[] valores = new int[quantidade];
			int soma = 0;
			
			for (int i = 0; i < quantidade; i++) {
				int valor = scanner.nextInt();
				valores[i] = valor;
				soma += valor;
			}
			
			int media = soma / quantidade;
			
			int movimentos = 0;
			for (int i = 0; i < quantidade; i++) {
				if (valores[i] > media) {
					movimentos += valores[i] - media;
				}
			}
			
			System.out.println("Set #" + numeroSet);
			System.out.println("The minimum number of moves is " + movimentos + ".");
			System.out.println();
		}
		
		scanner.close();
	}

}
