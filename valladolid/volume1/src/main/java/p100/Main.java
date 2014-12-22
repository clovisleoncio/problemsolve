package p100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			StringTokenizer stk = new StringTokenizer(linha);
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			System.out.println(String.format("%d %d %d", a, b, calcularMaiorCiclo(a, b)));
		}
		
		in.close();
	}
	
	public static int calcularCiclo(long n) {
		
		int ciclo = 1;
		while (n != 1) {
			
			if (n % 2 == 0) {
				n = n / 2;
			}
			else {
				n = 3 * n + 1;
			}
			
			ciclo++;
		}
		
		return ciclo;
		
	}

	public static int calcularMaiorCiclo(int a, int b) {
		int maiorCiclo = 0;
		int inicio = Math.min(a, b);
		int fim = Math.max(a, b);
		for (int i = inicio; i <= fim; i++) {
			int ciclo = calcularCiclo(i);
			if (ciclo > maiorCiclo) {
				maiorCiclo = ciclo;
			}
		}
		return maiorCiclo;
	}

}
