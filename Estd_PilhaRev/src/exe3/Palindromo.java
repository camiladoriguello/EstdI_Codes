package exe3;

import java.util.Scanner;
import java.util.Stack;

//3.Fazer um programa que testa se uma sequência de caracteres fornecida pelo usuário é um palíndromo, 
//ou seja, é uma palavra cuja primeira metade é simétrica à segunda metade. 
public class Palindromo {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in); //definindo variáveis do sistema
		System.out.print("Escreva uma palavra para verificar se é palíndromo:");
		String palavra = scanner.nextLine();
		scanner.next();
		
		char[] pOrdenada = palavra.toCharArray();
		char[] pInversa = new char[pOrdenada.length];
		
		for(int i = (pOrdenada.length - 1); i >= 0; i--) {
			for(int j = 0; j < pOrdenada.length; j++) {
				pInversa[i] = pOrdenada[j];
			}
		}
		
		for(int i = 0; i < pOrdenada.length; i++) {
			System.out.println(pInversa[i]);
		}
	}
	

}
