package p382;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		System.out.println("PERFECTION OUTPUT");
		while ( (numero = scanner.nextInt()) != 0) {
			System.out.println(String.format("%5d  %s", numero, perfeicao(numero)));
		}
		System.out.println("END OF OUTPUT");
		scanner.close();
	}

	public static int divisores(int numero) {
		int somaDivisores = 1;
//		int limite = numero / 2;
		for (int i = 2; i < numero ; i++) {
			if (numero % i == 0) {
				somaDivisores += i;
			}
		}
		return somaDivisores;
	}

	public static String perfeicao(int numero) {
		int somaDivisores = divisores(numero);
		if (numero == somaDivisores) {
			return "PERFECT";
		}
		else if (somaDivisores < numero) {
			return "DEFICIENT";
		}
		else {
			return "ABUNDANT";
		}
	}
	
}
