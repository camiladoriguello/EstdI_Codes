package exe2;

import java.util.Scanner;
import java.util.Stack;

//2.Uma mensagem é criptografada invertendo cada palavra do texto.
//O texto "Uma mensagem confidencial" criptografado fica "amU megasnem laicnedifnoc". 
//Implemente a criptografia e a descriptografia de mensagem. Faça isso utilizando Pilha. 

public class Criptografia {
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		String mensagem = "Uma Mensagem Confidencial";
		int opcao = 0; 
		
		do {
			System.out.println("\n\n1 = Criptografar Mensagem.");
			System.out.println("2 = Descriptograar Mensagem.");
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				criptografaMensagem(mensagem);
			}else if(opcao == 2) {
				descriptografaMensagem(mensagem);
			}
		}while(opcao == 1 || opcao == 2);
		
	}
	
	public static void criptografaMensagem(String mensagem) {
		
		String[] letter = mensagem.split(" "); 
		
		System.out.println("Criptografando a mensagem!");
		char[] p1 = letter[0].toCharArray();
		for(int i = 2; i >= 0; i--) {
			System.out.print(p1[i]);
		}
		System.out.print(" ");
		
		char[] p2 = letter[1].toCharArray();
		for(int i = 7; i >= 0; i--) {
			System.out.print(p2[i]);
		}
		System.out.print(" ");
		
		char[] p3 = letter[2].toCharArray();
		for(int i = 11; i >= 0; i--) {
			System.out.print(p3[i]);
		}
		System.out.print(" ");
	}
	
	public static void descriptografaMensagem(String mensagem) {
		String[] letter = mensagem.split(" "); 
		
		System.out.println("Descriptografando a mensagem!");
		for(int i = 0; i < 3; i++) {
			System.out.print(letter[i]);
		}
	}
}
