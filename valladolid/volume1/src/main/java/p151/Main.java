package p151;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroEstacoes;
		while ( (numeroEstacoes = scanner.nextInt()) != 0) {
			Q151 q151 = new Q151(numeroEstacoes);
			System.out.println(q151.numeroPassos());
		}
		scanner.close();
	}

	public static class Q151 {
		
		private List<Integer> estacoes;
		private int numeroEstacoes;
		
		public Q151(int numeroEstacoes) {
			this.numeroEstacoes = numeroEstacoes;
			estacoes = new ArrayList<Integer>(numeroEstacoes);
			for (int i = 0; i < numeroEstacoes; i++) {
				estacoes.add(i + 1);
			}
		}
		
		public int ultimo(int numeroPassos) {
			int posicao = 0 - numeroPassos;
			int restantes = numeroEstacoes;
			List<Integer> estacoesTemp = new ArrayList<Integer>(numeroEstacoes);
			estacoesTemp.addAll(estacoes);
			while (restantes != 1) {
				posicao = (posicao + numeroPassos) % restantes;
				estacoesTemp.remove(posicao);
				posicao--;
				restantes--;
			}
			return estacoesTemp.get(0);
		}

		public int numeroPassos() {
			int numeroPassos = 0;
			int ultimo;
			do {
				numeroPassos++;
				ultimo = ultimo(numeroPassos);
			} while (ultimo != 13);
			return numeroPassos;
		}
		
	}
	
}
