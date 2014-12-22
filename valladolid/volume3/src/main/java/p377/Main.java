package p377;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("COWCULATIONS OUTPUT");
		
		Scanner scanner = new Scanner(System.in);
		
		int quantidade = scanner.nextInt();
		
		for (int i = 0; i < quantidade; i++) {

			Q377 q377 = new Q377(scanner.next(), scanner.next());
			
			for (int j = 0; j < 3; j++) {
				String operacao = scanner.next();
				if (operacao.equals("A")) {
					q377.operacaoA();
				}
				else if (operacao.equals("L")) {
					q377.operacaoL();
				}
				else if (operacao.equals("R")) {
					q377.operacaoR();
				}
			}

			System.out.println(q377.getResultado().equals(scanner.next()) ? "YES" : "NO");
						
		}
		
		scanner.close();
		
		System.out.println("END OF OUTPUT");
	}

	public static class Q377 {
		
		private String valor2;
		private int numero1;

		public Q377(String valor1, String valor2) {
			numero1 = converterPalavraInteiro(valor1);
			this.valor2 = valor2;
		}
		
		private int converterPalavraInteiro(String representacao) {
			char[] convertido = new char[representacao.length()];
			for (int i = 0; i < convertido.length; i++) {
				convertido[i] = converterLetraPraNumero(representacao.charAt(i));
			}
			String convertidoStr = new String(convertido);
			return Integer.parseInt(convertidoStr, 4);
		}

		private char converterLetraPraNumero(char c) {
			switch (c) {
			case 'V':
				return '0';
			case 'U':
				return '1';
			case 'C':
				return '2';
			case 'D':
				return '3';
			}
			return '\0';
		}

		public Q377 operacaoA() {
			int numero2 = converterPalavraInteiro(valor2);
			numero2 = numero1 + numero2;
			valor2 = converterInteiroPalavra(numero2);
			return this;
		}

		public Q377 operacaoR() {
			valor2 = valor2.substring(0, valor2.length() - 1);
			return this;
		}
		
		public Q377 operacaoL() {
			valor2 = valor2 + "V";
			return this;
		}

		public String getValor2() {
			return valor2;
		}

		public String getResultado() {
			String resultadoStr = valor2;
			for (int i = resultadoStr.length(); i < 8; i++) {
				resultadoStr = "V" + resultadoStr;
			}
			return resultadoStr;
		}

		private String converterInteiroPalavra(int numero) {
			String numeroStr = Integer.toString(numero, 4);
			char[] resultado = new char[numeroStr.length()];
			for (int i = 0; i < resultado.length; i++) {
				resultado[i] = converterNumeroPraLetra(numeroStr.charAt(i));
			}
			return new String(resultado);
		}

		private char converterNumeroPraLetra(char numero) {
			switch (numero) {
			case '0':
				return 'V';
			case '1':
				return 'U';
			case '2':
				return 'C';
			case '3':
				return 'D';
			}
			return 0;
		}

	}
	
}
