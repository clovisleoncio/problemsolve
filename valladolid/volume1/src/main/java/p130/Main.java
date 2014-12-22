package p130;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		while ( (n = scanner.nextInt()) != 0) {
			Q130 q130 = new Q130(n, scanner.nextInt());
			System.out.println(q130.calcularPosicaoSegura());
		}

		scanner.close();
	}

	public static class Q130 {

		private Integer[] pessoas;
		private int k;
		private int quantidade;

		public Q130(int quantidade, int k) {
			this.k = k;
			this.quantidade = quantidade;
			this.pessoas = new Integer[quantidade];
			for (int i = 0; i < quantidade; i++) {
				pessoas[i] = i + 1;
			}
		}

		public int calcularUltimoMorrer() {
			int posicao = -1;
			while (quantidade > 1) {
				posicao = avancar(posicao);
				pessoas[posicao] = null;
				int substituto = avancar(posicao);
				pessoas[posicao] = pessoas[substituto];
				pessoas[substituto] = null;
				quantidade--;
			}
			return pessoas[avancar(posicao)];
		}
		
		public Q130 setPessoas(Integer[] pessoas) {
			this.pessoas = pessoas;
			return this;
		}
		
		public int avancar(int posicao) {
			int i = 0;
			do {
				posicao = (posicao + 1) % pessoas.length;
				if (pessoas[posicao] != null) {
					i++;
				}
			} while (i < k);
			
			return posicao;
		}

		public int calcularPosicaoSegura() {
			int ultimoMorrer = calcularUltimoMorrer();
			int voltar = ultimoMorrer - 1;
			int posicaoSegura = (pessoas.length - voltar) % pessoas.length;
			return posicaoSegura + 1;
		}
		
	}
	
}
