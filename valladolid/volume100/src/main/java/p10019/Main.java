package p10019;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int quantidade = scanner.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			String numeroStr = scanner.next();
			int numeroUnsDec = numeroUns(numeroStr, 10);
			int numeroUnsHex = numeroUns(numeroStr, 16);
			
			System.out.println(numeroUnsDec + " " + numeroUnsHex);
		}
		
		scanner.close();
		
	}

	private static int numeroUns(String numeroStr, int base) {
		int numero = Integer.parseInt(numeroStr, base);
		String numeroBin = Integer.toString(numero, 2);
		int numeroUns = 0;
		for (int i = 0; i < numeroBin.length(); i++) {
			if (numeroBin.charAt(i) == '1') {
				numeroUns++;
			}
		}
		return numeroUns;
	}

}
