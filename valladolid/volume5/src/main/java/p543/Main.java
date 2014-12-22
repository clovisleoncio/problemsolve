package p543;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Q543 q543 = new Q543();
		
		int valor;
		while ( (valor = scanner.nextInt()) != 0) {
			q543.calcularFatores(valor);
		}
		
		scanner.close();
	}

	public static class Q543 {
		
		private boolean[] ehPrimo = new boolean[1000000 + 1];
		
		public Q543() {
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

		public void calcularFatores(int numero) {
			int limite = numero / 2;
			for (int i = 2; i <= limite; i++) {
				if (ehPrimo[i] && ehPrimo[numero - i]) {
					System.out.println(String.format("%d = %d + %d", numero, i, numero - i));
					return ;
				}
			}
			System.out.println("Goldbach's conjecture is wrong.");
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
		
	}
	
}
