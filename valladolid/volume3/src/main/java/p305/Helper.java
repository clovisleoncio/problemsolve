package p305;

import p305.Main.Q305;

public class Helper {
	
	public static void main(String[] args) {
		
		Q305 q305 = new Q305();
		
		for (int i = 11; i < 14; i++) {
			System.out.println(String.format("%d -> %d", i, q305.calcularNecessarioMatarMaus(i)));
		}
		
	}

}
