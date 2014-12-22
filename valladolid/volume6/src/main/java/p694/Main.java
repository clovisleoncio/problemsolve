package p694;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int caso = 0;
		long n;
		while ( (n = scanner.nextLong()) != -1) {
			caso++;
			long limite = scanner.nextLong();
			System.out.println(String.format("Case %d: A = %d, limit = %d, number of terms = %d", caso, n, limite, calcularCiclo(n, limite)));
		}
		
		scanner.close();
	}
	
	public static int calcularCiclo(long n, long limite) {
		
		int ciclo = 1;
		while (n != 1) {
			
			if (n % 2 == 0) {
				n = n / 2;
			}
			else {
				n = 3 * n + 1;
			}

			if (n > limite) {
				break;
			}
			
			ciclo++;
			
		}
		
		return ciclo;
		
	}

}
