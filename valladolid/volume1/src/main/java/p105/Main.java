package p105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Q105 q105 = new Q105();

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		
		while ((linha = in.readLine()) != null) {
			linha = linha.trim();
			if (!linha.equals("")) {
				StringTokenizer stk = new StringTokenizer(linha);
				int inicio = Integer.parseInt(stk.nextToken());
				int altura = Integer.parseInt(stk.nextToken());
				int fim = Integer.parseInt(stk.nextToken());
				q105.addBuilding(inicio, altura, fim);
			}
		}

		q105.print();
	}

	public static class Q105 {

		private static final int LIMITE = 10000;
		
		private int[] skyline = new int[LIMITE * 2 + 1];
		int ultimoX = -LIMITE;
		int primeiroX = LIMITE;
		
		public Q105() {
			for (int i = 0; i < skyline.length; i++) {
				skyline[i] = 0;
			}
		}
		
		public int getAltura(int i) {
			return skyline[i + LIMITE];
		}

		public void addBuilding(int inicio, int altura, int fim) {
			for (int i = inicio; i < fim; i++) {
				if (skyline[i + LIMITE] < altura) {
					skyline[i + LIMITE] = altura;
				}
			}
			if (fim > ultimoX) {
				ultimoX = fim;
			}
			if (inicio < primeiroX) {
				primeiroX = inicio;
			}
		}
		
		public void print() {
			int valor = 0;
			String separador = "";
			for (int i = primeiroX; i <= ultimoX; i++) {
				if (skyline[i + LIMITE] != valor) {
					valor = skyline[i + LIMITE];
					System.out.print(String.format("%s%d %d", separador, i, valor));
					separador = " ";
				}
			}
		}
		
	}
	
}
