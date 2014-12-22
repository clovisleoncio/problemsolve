package p495;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Q495 q495 = new Q495();
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			int numero = Integer.parseInt(linha.trim());
			System.out.println(String.format("The Fibonacci number for %d is %s", numero, q495.fibonacci(numero)));
		}
		
		in.close();
		
	}
	
	public static class Q495 {
		
		private List<BigInteger> fibonacci = new ArrayList<BigInteger>();
		private int maior = 1;
		
		public Q495() {
			fibonacci.add(BigInteger.ZERO);
			fibonacci.add(BigInteger.ONE);
		}
		
		public BigInteger fibonacci(int numero) {
			if (numero > maior) {
				for (int i = maior + 1; i <= numero; i++) {
					fibonacci.add(fibonacci.get(i - 1).add(fibonacci.get(i - 2)));
				}
				maior = numero;
			}
			return fibonacci.get(numero);
		}
		
	}

}
