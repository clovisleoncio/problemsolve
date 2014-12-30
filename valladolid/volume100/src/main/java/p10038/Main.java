package p10038;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha;
		while( (linha = in.readLine()) != null) {
			String[] tokens = linha.split(" ");
			if (jolly(tokens)) {
				System.out.println("Jolly");
			}
			else {
				System.out.println("Not jolly");
			}
		}
		
		in.close();
	}

	public static boolean jolly(String[] tokens) {
		int quantidade = Integer.parseInt(tokens[0]);
		if (quantidade == 1) {
			return true;
		}
		
		boolean[] diferencas = new boolean[quantidade - 1];
		
		int anterior = Integer.parseInt(tokens[1]);
		for (int i = 2; i <= quantidade; i++) {
			int atual = Integer.parseInt(tokens[i]);
			int diferenca = Math.abs(anterior - atual) ;
			if (diferenca >= quantidade) {
				return false;
			}
			diferencas[diferenca - 1] = true;
			anterior = atual;
		}

		for (int i = 0; i < diferencas.length; i++) {
			if (!diferencas[i]) {
				return false;
			}
		}
		
		return true;
	}

}
