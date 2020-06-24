package exe2;

import java.util.Scanner;
import java.util.Stack;

//2.Uma mensagem é criptografada invertendo cada palavra do texto.
//O texto "Uma mensagem confidencial" criptografado fica "amU megasnem laicnedifnoc". 
//Implemente a criptografia e a descriptografia de mensagem. Faça isso utilizando Pilha. 

public class Criptografia {

	public static void main (String [] args) {
		
		String message = "Uma mensagem confidencial ";
		int cont = 0;
		char[] letter = message.toCharArray(); //transforma a String em um vetor de char
		Stack<Character> word1 = new Stack<Character>(); //pilha palavra 1
		Stack<Character> word2 = new Stack<Character>(); //pilha palavra 2
		Stack<Character> word3 = new Stack<Character>(); //pilha palavra 3
		
		while(letter[cont] != ' ') {
			word1.push(letter[cont]);
			cont++;
		}
		cont++;
		while(letter[cont] != ' ') {
			word2.push(letter[cont]);
			cont++;
		}
		cont++;
		while(letter[cont] != ' ') {
			word3.push(letter[cont]);
			cont++;
		}
		
		for(int i = 0; i < word1.capacity(); i++) {
			word1.peek();
		}
		
		System.out.println(word1);
	}
	
	
}
