package p1055;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha;
		while( (linha = in.readLine()) != null) {
			String[] tokens = linha.split(" ");
			long numero1 = Long.parseLong(tokens[0]);
			long numero2 = Long.parseLong(tokens[1]);
			System.out.println(Math.abs(numero1 - numero2));
		}
		
		in.close();
	}

}
