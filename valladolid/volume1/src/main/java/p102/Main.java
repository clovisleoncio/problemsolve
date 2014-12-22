package p102;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		
		String linha;
		while ( (linha = in.readLine()) != null){
			String[] numerosStr = linha.trim().split(" ");
			int[] numeros = new int[numerosStr.length];
			for (int i = 0; i < numerosStr.length; i++) {
				numeros[i] = Integer.parseInt(numerosStr[i]);
			}
			Q102 q102 = new Q102(numeros);
			q102.resolver();
		}
		
		in.close();
		
	}
	
	public static class Q102 {
		
		private static final Map<String, int[]> nomeToMovimentos = new LinkedHashMap<String, int[]>();
		static {
			nomeToMovimentos.put("BCG", new int[]{3, 6, 2, 8, 1, 4});
			nomeToMovimentos.put("BGC", new int[]{3, 6, 1, 7, 2, 5});
			nomeToMovimentos.put("CBG", new int[]{5, 8, 0, 6, 1, 4});
			nomeToMovimentos.put("CGB", new int[]{5, 8, 1, 7, 0, 3});
			nomeToMovimentos.put("GBC", new int[]{4, 7, 0, 6, 2, 5});
			nomeToMovimentos.put("GCB", new int[]{4, 7, 2, 8, 0, 3});
		}
		
		private int[] totais;

		public Q102(int[] totais) {
			this.totais = totais;
		}
		
		public int soma(int[] indices) {
			return totais[indices[0]] + totais[indices[1]]
					+ totais[indices[2]]  + totais[indices[3]]
					+ totais[indices[4]]  + totais[indices[5]]; 
		}

		public String resolver() {
			String resposta = null;
			int minimoMovimentos = Integer.MAX_VALUE;
			for (Entry<String, int[]> par : nomeToMovimentos.entrySet()) {
				int soma = soma(par.getValue());
				if (soma < minimoMovimentos) {
					minimoMovimentos = soma;
					resposta = par.getKey();
				}
			}
			System.out.println(String.format("%s %d", resposta, minimoMovimentos));
			return resposta;
		}
		
	}

}
