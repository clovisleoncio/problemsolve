package p118;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String linha = in.readLine();
		String[] tokens = linha.split(" ");
		Q118 q118 = new Q118(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		
		while ( (linha = in.readLine()) != null) {
			tokens = linha.split(" ");
			
			q118.init(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), tokens[2]);
			q118.executar(in.readLine());
			
			System.out.println(q118.getEstadoFinal());
		}
		
		in.close();
		
	}

	public static class Q118 {
		
		private static final String[] DIRECOES = {"N", "E", "S", "W"};
		
		private static final int[][] VETOR_DIRECAO = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		
		private Set<String> scents = new HashSet<String>();

		private int largura;
		private int altura;
		
		public int x;
		public int y;
		private int direcao;
		private boolean perdido;
		
		public Q118(int largura, int altura) {
			this.largura = largura;
			this.altura = altura;
		}
		
		public void init(int x, int y, String direcao) {
			this.x = x;
			this.y = y;
			this.perdido = false;
			
			this.direcao = indiceDirecao(direcao);
		}

		public int indiceDirecao(String direcao) {
			for (int i = 0; i < DIRECOES.length; i++) {
				if (DIRECOES[i].equals(direcao)) {
					return i;
				}
			}
			return -1;
		}
		
		public String letraDirecao() {
			return DIRECOES[this.direcao];
		}

		public void girarEsquerda() {
			direcao = ((direcao - 1) + DIRECOES.length) % DIRECOES.length;
		}

		public void girarDireita() {
			direcao = (direcao + 1) % DIRECOES.length;
		}

		public boolean andar() {
			int[] vetorDirecao = VETOR_DIRECAO[direcao];

			int novoX = x + vetorDirecao[0];
			int novoY = y + vetorDirecao[1];
			
			boolean fora = novoX < 0 || novoX > largura || novoY < 0 || novoY > altura;
			
			if (fora) {
				String scent = novoX + "#" + novoY;
				if (scents.contains(scent)) {
					return true;
				}
				else {
					scents.add(scent);
					perdido = true;
					return false;
				}
			}
			else {
				this.x = novoX;
				this.y = novoY;
				return true;
			}
		}

		public void executar(String comandos) {
			for (int i = 0; i < comandos.length(); i++) {
				char comando = comandos.charAt(i);
				switch (comando) {
				case 'L':
					girarEsquerda();
					break;
				case 'R':
					girarDireita();
					break;
				case 'F':
					if (!andar()) {
						return ;
					}
					break;
				}
			}
		}

		public String getEstadoFinal() {
			String estado = String.format("%d %d %s", x, y, letraDirecao());
			if (perdido) {
				estado += " LOST";
			}
			return estado;
		}

	}
	
}
