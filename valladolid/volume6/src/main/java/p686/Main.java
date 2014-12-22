package p686;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Q686 q686 = new Q686();
		int numero;
		while ( (numero = scanner.nextInt()) != 0) {
			System.out.println(q686.contaFatores(numero));
		}
		scanner.close();
	}

	public static class Q686 {
		private boolean[] ehPrimo = new boolean[32768]; // 2^115;
		
		public Q686() {
			for (int i = 0; i < ehPrimo.length; i++) {
				ehPrimo[i] = true;
			}
			ehPrimo[0] = false;
			
			// aplicar crivo de "eratostenes"
			for (int i = 2; i < ehPrimo.length; ) {
				int indice = i + i;
				while (indice < ehPrimo.length) {
					ehPrimo[indice] = false;
					indice += i;
				}
				i = proximoPrimro(i);
			}
		}
		
		private int proximoPrimro(int inicio) {
			int i;
			for (i = inicio + 1; i < ehPrimo.length; i++) {
				if (ehPrimo[i]) {
					return i;
				}
			}
			return i;
		}
		
		public int contaFatores(int numero) {
			int limite = numero / 2;
			int numeroFatores = 0;
			for (int i = 2; i <= limite; i++) {
				if (ehPrimo[i] && ehPrimo[numero - i]) {
					numeroFatores++;
				}
			}
			return numeroFatores;
		}
	}
}
