package p167;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper {
	
	public static void main(String[] args) {
		
		String solucao1Str =
				"***Q****" + 
				"******Q*" + 
				"**Q*****" + 
				"*******Q" + 
				"*Q******" + 
				"****Q***" + 
				"Q*******" + 
				"*****Q**";
		
		String solucao2Str =
				"****Q***" + 
				"*Q******" + 
				"***Q****" + 
				"******Q*" + 
				"**Q*****" + 
				"*******Q" + 
				"*****Q**" + 
				"Q*******";
		
		String solucao3Str =
				"***Q****" + 
				"*Q******" + 
				"******Q*" + 
				"**Q*****" + 
				"*****Q**" + 
				"*******Q" + 
				"****Q***" + 
				"Q*******";
		
		String solucao4Str =
				"***Q****" + 
				"*****Q**" + 
				"*******Q" + 
				"**Q*****" + 
				"Q*******" + 
				"******Q*" + 
				"****Q***" + 
				"*Q******";
		
		String solucao5Str =
				"**Q*****" + 
				"*****Q**" + 
				"*******Q" + 
				"Q*******" + 
				"***Q****" + 
				"******Q*" + 
				"****Q***" + 
				"*Q******";
		
		String solucao6Str =
				"****Q***" + 
				"**Q*****" + 
				"*******Q" + 
				"***Q****" + 
				"******Q*" + 
				"Q*******" + 
				"*****Q**" + 
				"*Q******";
		
		String solucao7Str =
				"****Q***" + 
				"******Q*" + 
				"***Q****" + 
				"Q*******" + 
				"**Q*****" + 
				"*******Q" + 
				"*****Q**" + 
				"*Q******";
		
		String solucao8Str =
				"***Q****" + 
				"Q*******" + 
				"****Q***" + 
				"*******Q" + 
				"*****Q**" + 
				"**Q*****" + 
				"******Q*" + 
				"*Q******";
		
		String solucao9Str =
				"**Q*****" + 
				"*****Q**" + 
				"***Q****" + 
				"Q*******" + 
				"*******Q" + 
				"****Q***" + 
				"******Q*" + 
				"*Q******";
		
		String solucao10Str =
				"*****Q**" + 
				"*Q******" + 
				"******Q*" + 
				"Q*******" + 
				"***Q****" + 
				"*******Q" + 
				"****Q***" + 
				"**Q*****";
		
		String solucao11Str =
				"***Q****" + 
				"******Q*" + 
				"Q*******" + 
				"*******Q" + 
				"****Q***" + 
				"*Q******" + 
				"*****Q**" + 
				"**Q*****";
		
		String solucao12Str =
				"*****Q**" + 
				"***Q****" + 
				"******Q*" + 
				"Q*******" + 
				"*******Q" + 
				"*Q******" + 
				"****Q***" + 
				"**Q*****";
		
		List<boolean[][]> solucoes = new ArrayList<boolean[][]>();
		solucoes.addAll(criarSolucoes(solucao1Str));
		solucoes.addAll(criarSolucoes(solucao2Str));
		solucoes.addAll(criarSolucoes(solucao3Str));
		solucoes.addAll(criarSolucoes(solucao4Str));
		solucoes.addAll(criarSolucoes(solucao5Str));
		solucoes.addAll(criarSolucoes(solucao6Str));
		solucoes.addAll(criarSolucoes(solucao7Str));
		solucoes.addAll(criarSolucoes(solucao8Str));
		solucoes.addAll(criarSolucoes(solucao9Str));
		solucoes.addAll(criarSolucoes(solucao10Str));
		solucoes.addAll(criarSolucoes(solucao11Str));
		solucoes.addAll(criarSolucoes(solucao12Str));
		
		for (boolean[][] solucao : solucoes) {
//			imprimir(solucao);
			gerarRepresentacaoArray(solucao);
		}
		
	}

	private static void gerarRepresentacaoArray(boolean[][] solucao) {
		System.out.print("{");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (solucao[i][j]) {
					System.out.print(String.format("{%d, %d}, ", i, j));
					break;
				}
			}
		}
		System.out.println("}, ");
	}

	private static List<boolean[][]> criarSolucoes(String solucaoStr) {
		boolean[][] solucao = criarSolucao(solucaoStr);
		boolean[][] alternativa1 = girar90(solucao);
		boolean[][] alternativa2 = girar90(alternativa1);
		boolean[][] alternativa3 = girar90(alternativa2);
		
		boolean[][] solucaoEspelhada = espelhar(solucao);
		boolean[][] alternativa1Espelhada = espelhar(alternativa1);
		boolean[][] alternativa2Espelhada = espelhar(alternativa2);
		boolean[][] alternativa3Espelhada = espelhar(alternativa3);
		return Arrays.asList(new boolean[][][]{solucao, alternativa1, alternativa2, alternativa3,
				solucaoEspelhada, alternativa1Espelhada, alternativa2Espelhada, alternativa3Espelhada});
	}

	private static boolean[][] espelhar(boolean[][] solucao) {
		boolean[][] espelhada = new boolean[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				espelhada[i][7-j] = solucao[i][j];
			}
		}
		return espelhada;
	}

	private static boolean[][] girar90(boolean[][] solucao) {
		boolean[][] alternativa = new boolean[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				alternativa[j][7-i] = solucao[i][j];
			}
		}
		return alternativa;
	}

	private static boolean[][] criarSolucao(String solucaoStr) {
		boolean[][] solucao = new boolean[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				solucao[i][j] = solucaoStr.charAt(i*8 + j) == 'Q';
			}
		}
		return solucao;
	}

}
