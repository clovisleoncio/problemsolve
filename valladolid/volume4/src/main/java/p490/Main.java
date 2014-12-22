package p490;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		List<List<Character>> invertido = new ArrayList<List<Character>>();
		
		String linha;
		while ( (linha = in.readLine()) != null) {
			int i = 0;
			for (; i < linha.length(); i++) {
				char c = linha.charAt(i);
				List<Character> l;
				if (invertido.size() > i) {
					l = invertido.get(i);
				}
				else {
					l = new ArrayList<Character>();
					invertido.add(l);
				}
				l.add(0, c);
			}
			for (; i < invertido.size(); i++) {
				List<Character> l = invertido.get(i);
				l.add(0, ' ');
			}
		}
		
		for (List<Character> l : invertido) {
			for (char c : l) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		in.close();
		
	}

}
