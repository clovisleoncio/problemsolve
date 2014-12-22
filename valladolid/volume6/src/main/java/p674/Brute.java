package p674;

import java.util.Scanner;

public class Brute {
	
	public static void main(String[] args) {
		Q674 q674 = new Q674(new Scanner(System.in).nextInt());
		System.out.println(q674.numeroCombinacoes());
	}
	
	public static class Q674 {

		private static final int[] OPCOES = {50, 25, 10, 5, 1};
		
		private int valor;
		private int combinacoes = 0;

		public Q674(int valor) {
			this.valor = valor;
		}

		public int numeroCombinacoes() {
			calcularCombinacoes(valor, 0);
			return combinacoes;
		}
		
		private void calcularCombinacoes(int valor, int indiceInicial) {
			for (int i = indiceInicial; i < OPCOES.length; i++) {
				int possibilidade = OPCOES[i];
				int parcial = valor - possibilidade;
				if (parcial == 0) {
					combinacoes++;
				}
				else if (parcial > 0) {
					calcularCombinacoes(parcial, i);
				}
			}
		}
	}

}
