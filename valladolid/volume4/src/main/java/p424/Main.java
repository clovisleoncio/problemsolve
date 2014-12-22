package p424;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BigInteger valor = BigInteger.ZERO;
		String linha;
		while ( !(linha = scanner.next()).trim().equals("0") ) {
			valor = valor.add(new BigInteger(linha));
		}
		
		System.out.println(valor);
		
		scanner.close();
	}

}
