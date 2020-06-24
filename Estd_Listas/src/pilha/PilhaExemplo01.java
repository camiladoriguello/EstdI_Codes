package pilha;

import java.util.ArrayList;

public class PilhaExemplo01 {
	public static void main (String [] args) {
		ArrayList<String> pilha = new ArrayList<String>();
		
		pilha.add("A");
		pilha.add("B");
		pilha.add("C");
		pilha.add("D");
		pilha.add("E");
		
		do {
			System.out.println(pilha + " -- SIZE: " + pilha.size());
			pilha.remove(pilha.size() - 1);
		}while(pilha.size() >= 1);
	}
}
