package listaEncadeada.src.Void;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testa_Lista {	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		Lista lista = new Lista();		
		String valor = null, resp = null;		
		do{			
			System.out.println("OPÇÕES:\n1->Inserir no início:\n2->Inserir no Fim:\n3->Pesquisar um Valor:\n4->Listar Valores da Lista:");		
			resp = sc.next();			
			if(resp.equals("1")){
				System.out.println("Digite um valor:");
				valor = sc.next();
				//Insere valore no inicio da lista.
				try {
					lista.Insere_Inicio(valor);
				} 
				catch (ExistentValueException e) {					
					e.printStackTrace();
				}
			}				
			else if(resp.equals("2")){
				System.out.println("Digite um valor:");
				valor = sc.next();
				//Insere valores no final da lista.
				try {
					lista.Insere_Fim(valor);
				} 
				catch (ExistentValueException e) {					
					e.printStackTrace();
				}			
			}				
			else if(resp.equals("3")){
				System.out.println("Digite um valor:");
				valor = sc.next();
				//Pesquisa por valores na lista.
				if(lista.Procura(valor) == true)
					System.out.println("Valor existe na lista!");
				else
					System.out.println("Valor não existe na lista!");				
			}			
			else if(resp.equals("4")){
				ArrayList<String> listar = new ArrayList<String>();
				//Recebe os valores da lista em um ArrayList e os imprime.
				try {
					 listar = lista.Listar();
				} 
				catch (EmptyListException e) {
					e.printStackTrace();					
				}
				
				for(String elemento : listar){
					System.out.print(elemento + " ");
				}
				System.out.println();
			}
			else
				System.out.println("Opção inválida!");
		}
		while(resp != "9");		
	}

}
