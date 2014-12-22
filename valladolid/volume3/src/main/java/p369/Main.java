package p369;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		while ( (n = scanner.nextInt()) != 0) {
			int m = scanner.nextInt();
			System.out.println(String.format("%d things taken %d at a time is %d exactly.", n, m, calcularCombinacao(n, m)));
		}
		scanner.close();
	}

	public static int calcularCombinacao(int n, int m) {
		int maior = Math.max(n-m, m);
		int menor = Math.min(n-m, m);
		
		BigInteger cima = BigInteger.ONE;
		for (int i = n; i > maior; i--) {
			cima = cima.multiply(new BigInteger(String.valueOf(i)));
		}
		BigInteger baixo = BigInteger.ONE;
		for (int i = menor; i > 1; i--) {
			baixo = baixo.multiply(new BigInteger(String.valueOf(i)));
		}
		return cima.divide(baixo).intValue();
	}
	
}
