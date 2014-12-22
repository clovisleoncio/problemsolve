package p483;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha;
		
		while ( (linha = in.readLine()) != null) {
		
			String tokens[] = linha.split(" ");
			String separador = "";
			for (String token : tokens) {
				System.out.print(separador);
				inverte(token);
				separador = " ";
			}
			System.out.println();
		}
		
		in.close();
		
	}

	private static void inverte(String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
	
}
