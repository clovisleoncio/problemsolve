package p133;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int quantidade;
		while ( (quantidade = scanner.nextInt()) != 0) {
			Q133 q133 = new Q133(quantidade, scanner.nextInt(), scanner.nextInt());
			q133.resolver();
		}
		
		scanner.close();
		
	}
	
	public static class Q133 {
		
		private boolean[] pessoas;
		private int avancar;
		private int retroceder;

		public Q133(int quantidade, int k, int m) {
			pessoas = new boolean[quantidade];
			for (int i = 0; i < quantidade; i++) {
				pessoas[i] = true;
			}
			this.avancar = k;
			this.retroceder = m;
		}
		
		public Q133 setPessoas(boolean[] pessoas) {
			this.pessoas = pessoas;
			return this;
		}

		public int avancar(int posicao) {
			return caminhar(posicao, avancar, 1);
		}
		
		public int retroceder(int posicao) {
			return caminhar(posicao, retroceder, -1);
		}

		private int caminhar(int posicao, int passos, int sentido) {
			for (int i = 0; i < passos; i++) {
				posicao = proximo(posicao, sentido);
			}
			return posicao;
		}

		private int proximo(int posicao, int sentido) {
			do {
				posicao = ((posicao + sentido) + pessoas.length) % pessoas.length;
			} while (!pessoas[posicao]);
			return posicao;
		}

		public void resolver() {
			int posicaoAvancar = -1;
			int posicaoRetroceder = pessoas.length;
			int restantes = pessoas.length;
			String separador = "";
			while (restantes > 0) {
				posicaoAvancar = avancar(posicaoAvancar);
				posicaoRetroceder = retroceder(posicaoRetroceder);
				
				System.out.print(String.format("%s%3d", separador, posicaoAvancar + 1));
				restantes--;
				pessoas[posicaoAvancar] = false;

				if (posicaoAvancar != posicaoRetroceder) {
					System.out.print(String.format("%3d", posicaoRetroceder + 1));
					restantes--;
					pessoas[posicaoRetroceder] = false;
				}
				separador = ",";
			}
			System.out.println();
		}

	}

}
