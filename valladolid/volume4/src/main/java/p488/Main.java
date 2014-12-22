package p488;

import java.util.Scanner;

public class Main {
	
	private static final String[] triangulos = {
		"1",
		"1\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"4444\n" +
		"333\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"4444\n" +
		"55555\n" +
		"4444\n" +
		"333\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"4444\n" +
		"55555\n" +
		"666666\n" +
		"55555\n" +
		"4444\n" +
		"333\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"4444\n" +
		"55555\n" +
		"666666\n" +
		"7777777\n" +
		"666666\n" +
		"55555\n" +
		"4444\n" +
		"333\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"4444\n" +
		"55555\n" +
		"666666\n" +
		"7777777\n" +
		"88888888\n" +
		"7777777\n" +
		"666666\n" +
		"55555\n" +
		"4444\n" +
		"333\n" +
		"22\n" +
		"1",
		"1\n" +
		"22\n" +
		"333\n" +
		"4444\n" +
		"55555\n" +
		"666666\n" +
		"7777777\n" +
		"88888888\n" +
		"999999999\n" +
		"88888888\n" +
		"7777777\n" +
		"666666\n" +
		"55555\n" +
		"4444\n" +
		"333\n" +
		"22\n" +
		"1",
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroCasos = scanner.nextInt();
				
		String separador = "";
		for (int i = 0; i < numeroCasos; i++) {
			int tamanhoTriangulo = scanner.nextInt();
			int numeroTriangulos = scanner.nextInt();
			
			System.out.print(separador);
			imprimirOnda(numeroTriangulos, tamanhoTriangulo);
			separador = "\n";
		}
		
		scanner.close();
	}
	
	private static void imprimirOnda(int numeroTriangulos, int tamanhoTriangulo) {
		String separador = "";
		String triangulo = triangulos[tamanhoTriangulo-1];
		for (int i = 0; i < numeroTriangulos; i++) {
			System.out.print(separador);
			System.out.println(triangulo);
			separador = "\n";
		}
	}


}
