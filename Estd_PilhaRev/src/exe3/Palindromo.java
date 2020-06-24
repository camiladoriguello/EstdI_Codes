package exe3;

import java.util.Scanner;
import java.util.Stack;

//3.Fazer um programa que testa se uma sequ�ncia de caracteres fornecida pelo usu�rio � um pal�ndromo, 
//ou seja, � uma palavra cuja primeira metade � sim�trica � segunda metade. 
public class Palindromo {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in); //definindo vari�veis do sistema
		Stack<Character> string = new Stack<Character>();
		Stack<Character> palind = new Stack<Character>();
		
		System.out.print("P:"); 
		String word = scanner.next(); //lendo a palavra a ser testada
		char[] wordChar = word.toCharArray();
		
		for(int i = 0; i < wordChar.length; i++) { //transformando o vetor de caracteres em uma pilha
			string.push(wordChar[i]);
		}
		
		for(int i = 0; i < wordChar.length; i++) {
			palind.push(string.peek());
		}
		
		System.out.println(palind);
	}
	

}
