package p156;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
//		Iterator<String> in = Arrays.asList(new String[]{"ladder", "came", "tape", "soon", "leader", "acme", "RIDE", "lone", "Dreis",
//				"peat", "ScAlE", "orb", "eye", "Rides", "dealer", "NotE", "derail", "LaCeS", "drIed", "noel", "dire", "Disk", "mace",
//				"Rob", "dries", "#"}).iterator();

		Map<String, List<String>> chavePalavras = new HashMap<String, List<String>>();
		String palavra;
		while ( !(palavra = in.next()).equals("#") ) {
			
			char[] chars = palavra.toLowerCase().toCharArray();
			Arrays.sort(chars);
			
			String chave = new String(chars);
			
			List<String> palavras = chavePalavras.get(chave);
			if (palavras == null) {
				palavras = new ArrayList<String>();
				chavePalavras.put(chave, palavras);
			}
			
			palavras.add(palavra);
		}
		
		List<String> palavras = new ArrayList<String>();
		for (Entry<String, List<String>> entry : chavePalavras.entrySet()) {
			if (entry.getValue().size() == 1) {
				palavras.add(entry.getValue().get(0));
			}
		}
		
		Collections.sort(palavras);
		
		for (String palavra2 : palavras) {
			System.out.println(palavra2);
		}
		
		in.close();
	}
	
}
