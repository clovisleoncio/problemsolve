package p623;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public static final BigInteger[] FATORIAIS = new BigInteger[1001];
	static {
		FATORIAIS[0] = BigInteger.ONE;
		FATORIAIS[1] = BigInteger.ONE;
	}
	public static int maior = 1;

	public static BigInteger calcularFatorial(int valor) {
		for (int i = maior + 1; i <= valor; i++) {
			FATORIAIS[i] = FATORIAIS[i-1].multiply(new BigInteger(String.valueOf(i)));
		}
		return FATORIAIS[valor];
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		while ( (linha = in.readLine()) != null) {
			int valor = Integer.parseInt(linha.trim());
			BigInteger fatorial = calcularFatorial(valor);
			System.out.println(valor + "!");
			System.out.println(fatorial);
		}
		in.close();
	}

}
