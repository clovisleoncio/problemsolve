package p10018;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int quantidade = scanner.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			String numero = scanner.next();
			String invertido = new StringBuilder(numero).reverse().toString();
			int count = 0;
			while (!numero.equals(invertido)) {
				count++;
				long soma = Long.parseLong(numero) + Long.parseLong(invertido);
				numero = String.valueOf(soma);
				invertido = new StringBuilder(numero).reverse().toString();
			}
			
			System.out.println(String.format("%d %s", count, numero));
		}
		
		scanner.close();
	}

}
