package p146;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Brute {
	
	public static void main(String[] args) throws Exception {
		for (int i = 1; i<= 5; i++) {
			new Brute(i).criar();
		}
	}

	private int quantidadeLetras;
	private PrintWriter in;
	private PrintWriter out;

	public Brute(int quantidadeLetras) {
		this.quantidadeLetras = quantidadeLetras;
	}

	private void criar() throws IOException {
		
		in = new PrintWriter(new FileWriter(String.format("/Users/clovisleoncio/Projetos/Valladolid/Volume1/p146/inout/%d.in", quantidadeLetras)));
		out = new PrintWriter(new FileWriter(String.format("/Users/clovisleoncio/Projetos/Valladolid/Volume1/p146/inout/%d.out", quantidadeLetras)));
		
		List<List<Character>> gruposLetras = criarGruposNLetras();
		
		for (List<Character> grupoLetras : gruposLetras) {
			List<String> combinacoesComRepeticao = criarCombinacoes(grupoLetras);
			Set<String> combinacoesSemRepeticao = new HashSet<String>(combinacoesComRepeticao);
			List<String> resultado = new ArrayList<String>(combinacoesSemRepeticao);
			Collections.sort(resultado);
			imprimirCombinacoes(resultado);
		}
		
		in.print("#");
		
		in.flush();
		in.close();
		out.flush();
		out.close();
	}

	private void imprimirCombinacoes(List<String> combinacoes) {
		int limite = combinacoes.size() - 1;
		int i = 0;
		for (; i < limite; i++) {
			in.println(combinacoes.get(i));
			out.println(combinacoes.get(i+1));
//			System.out.println(String.format("Sucessor de %s = %s", combinacoes.get(i), combinacoes.get(i+1)));
		}
		in.println(combinacoes.get(i));
		out.println("No Successor");
//		System.out.println(String.format("Sem sucessor para %s", combinacoes.get(i)));
	}

	private List<String> criarCombinacoes(List<Character> letras) {
		
		if (letras.size() == 1) {
			return Arrays.asList(new String[]{letras.get(0).toString()});
		}
		
		List<String> resultado = new ArrayList<String>();
		for (int i = 0; i < letras.size(); i++) {
			char letra = letras.get(i);
			
			List<Character> sublista = new ArrayList<Character>(letras);
			sublista.remove(i);

			List<String> parciais = criarCombinacoes(sublista);
			for (String parcial : parciais) {
				resultado.add(letra + parcial);
			}
		}
		return resultado;
	}

	private List<List<Character>> criarGruposNLetras() {
		
		int numeroRestante = this.quantidadeLetras;
		
		return criarGruposNLetras(numeroRestante);
	}

	private List<List<Character>> criarGruposNLetras(int numeroRestante) {
		if (numeroRestante == 1) {
			List<List<Character>> resultado = new ArrayList<List<Character>>();
			for (char c = 'a'; c <= 'z'; c++) {
				List<Character> parcial = new ArrayList<Character>();
				parcial.add(c);
				resultado.add(parcial);
			}
			return resultado;
		}
		else {
			List<List<Character>> resultado = new ArrayList<List<Character>>();
			List<List<Character>> parciais = criarGruposNLetras(numeroRestante - 1);
			for (List<Character> parcial : parciais) {
				for (char c = 'a'; c <= 'z'; c++) {
					List<Character> novaParcial = new ArrayList<Character>(parcial);
					novaParcial.add(c);
					resultado.add(novaParcial);
				}
			}
			return resultado;
		}
	}

}
