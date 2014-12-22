package p101;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Q101 q101 = new Q101(scanner.nextInt());
		
		String comando;
		while ( !(comando = scanner.next()).trim().equals("quit") ) {
			q101.execute(comando, scanner.nextInt(), scanner.next(), scanner.nextInt());
		}
		
		q101.imprimir();
		
		scanner.close();
		
	}

	public static class Q101 {
		
		public Stack<Integer>[] pilhas;
		public Map<Integer, Integer> indice;
		
		public Q101(int numeroBlocos) {
			pilhas = new Stack[numeroBlocos];
			indice = new HashMap<Integer, Integer>(numeroBlocos, 2f);
			for (int i = 0; i < numeroBlocos; i++) {
				pilhas[i] = new Stack<Integer>();
				pilhas[i].push(i);
				indice.put(i, i);
			}
		}

		public void imprimir() {
			for (int i = 0; i < pilhas.length; i++) {
				System.out.print(i + ":");
				int limite = pilhas[i].size();
				for (int j = 0; j < limite; j++) {
					System.out.print(" " + pilhas[i].get(j));
				}
				System.out.println();
			}
		}

		public void execute(String comando1, Integer valor1, String comando2, Integer valor2) {
			if (valor1.equals(valor2)) {
				return ; // ignora mesmo valor
			}
			int posicao1 = indice.get(valor1);
			int posicao2 = indice.get(valor2);
			if (posicao1 == posicao2) {
				return ; // ignora mesma pilha
			}
			
			if (comando1.equals("move")) {
				desempilha(posicao1, valor1);
			}
			
			if (comando2.equals("onto")) {
				desempilha(posicao2, valor2);
			}
			
			
			Stack<Integer> aux = new Stack<Integer>();
			while (!pilhas[posicao1].peek().equals(valor1)) {
				aux.push(pilhas[posicao1].pop());
			}
			
			pilhas[posicao1].pop();
			pilhas[posicao2].push(valor1);
			indice.put(valor1, posicao2);
			
			while (!aux.isEmpty()) {
				Integer valor = aux.pop();
				pilhas[posicao2].push(valor);
				indice.put(valor, posicao2);
			}

		}

		private void desempilha(int posicao, Integer valor) {
			Stack<Integer> pilha = pilhas[posicao];
			while (!pilha.peek().equals(valor)) {
				Integer topo = pilha.pop();
				pilhas[topo].push(topo);
				indice.put(topo, topo);
			}
		}
		
	}
	
}
