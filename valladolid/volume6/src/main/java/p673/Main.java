package p673;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numeroLinhas = Integer.parseInt(in.readLine().trim());
		for (int i = 0; i < numeroLinhas; i++) {
			System.out.println(isBalanced(in.readLine()) ? "Yes" : "No");
		}
		in.close();
	}

	private static boolean isBalanced(String entrada) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < entrada.length(); i++) {
			char c = entrada.charAt(i);
			if (c == ')' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				else {
					char topo = stack.pop();
					if ((c == ')' && topo != '(') || (c == ']' && topo != '[')) {
						return false;
					}
				}
			}
			else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
	
}
