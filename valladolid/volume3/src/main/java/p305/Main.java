package p305;

import java.util.Scanner;

public class Main {
	
	private static final int[] RESULTADOS = {0, 2, 7, 5, 30, 169, 441, 1872, 7632, 1740, 93313, 459901, 1358657, 2504881};
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		while ( (numero = scanner.nextInt()) != 0) {
			System.out.println(RESULTADOS[numero]);
		}
		
		scanner.close();
		
	}

	public static class Q305 {

		public int calcularNecessarioMatarMaus(int numeroBons) {
			int numeroPulos = numeroBons;
			int ordemBomMorto;
			do {
				numeroPulos++;
				ordemBomMorto = calcularPrimeiroBomMorto(numeroBons, numeroPulos);
			}
			while (ordemBomMorto <= numeroBons);
			return numeroPulos;
		}

		public int calcularPrimeiroBomMorto(int numeroBons, int numeroPulos) {
			int quantidade = numeroBons * 2;
			int posicao = 0;
			int i = 0;
			do {
				posicao = (posicao - 1 + numeroPulos) % quantidade;
				quantidade--;
				i++;
			} while (posicao >= numeroBons);
			return i;
		}

	}
	
}
