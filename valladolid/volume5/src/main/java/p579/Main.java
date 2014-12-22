package p579;


public class Main {
	
	public static void main(String[] args) {
		
		calcular(12, 0);
		calcular(9, 0);
		calcular(8, 10);
		
	}

	private static void calcular(int hora, int minuto) {
		double d = (hora * 60 - minuto) / 2d;
		System.out.println(d);
		if (d > 180) {
			d = 360 - d;
		}
		System.out.println(d);
	}

}
