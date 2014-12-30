package p105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Q105 q105 = new Q105();
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			q105.addBuilding(linha);
		}
		
		q105.print();
		
		in.close();
	}

	public static class Q105 {
		
		private static final int LIMIT = 10000;
		private int[] skyline = new int[LIMIT * 2 + 1]; // +1 para permitir 0
		
		public void addBuilding(String string) {
			StringTokenizer stk = new StringTokenizer(string);
			addBuilding(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
		}

		public void addBuilding(int left, int height, int right) {
			
			int adjustedLeft = adjust(left);
			int adjustedRight = adjust(right);
			
			for (int i = adjustedLeft; i < adjustedRight; i++) {
				if (skyline[i] < height) {
					skyline[i] = height;
				}
			}
		}

		public Object getHeight(int i) {
			return skyline[adjust(i)];
		}
		
		private int adjust(int index) {
			return index + LIMIT;
		}

		public void print() {
			int referencia = 0;
			
			String separador = "";
			for (int i = 0; i < skyline.length; i++) {
				if (skyline[i] != referencia) {
					System.out.print(String.format("%s%d %d", separador, i - LIMIT, skyline[i]));
					referencia = skyline[i];
					separador = " ";
				}
			}
		}

	}

}
