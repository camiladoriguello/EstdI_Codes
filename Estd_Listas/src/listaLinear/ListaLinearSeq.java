package listaLinear;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaLinearSeq {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int option = -1;

		ArrayList myList = new ArrayList();
		
		do {
			int value = 1;
			int pos = 0;
			System.out.println("------------------------------------------------");
			System.out.println("Opçoes: 1-Inserir 2-Remover 3-Alterar 0-Encerrar");
			System.out.println("------------------------------------------------");
			
			option = scanner.nextInt();
			
			if(option == 1) {
				System.out.print("Valor a ser adicionado: ");
				value = scanner.nextInt();
				myList.add(value);
				System.out.println(myList);
			}	
			if(option == 2) {
				System.out.print("Posicao a ser removida: ");
				value = scanner.nextInt();
				myList.remove(value);
				System.out.println(myList);	
			}
			if(option == 3) {
				System.out.print("Valor: ");
				value = scanner.nextInt();
				System.out.print("Posição que será alterada: ");
				pos = scanner.nextInt();
				if (pos < myList.size()) {
					pos = scanner.nextInt();
					myList.set(pos, value);
					System.out.println(myList);	
				}else {
					System.out.println("Posição inválida!");
				}
			}
			
		} while (option != 0);
		System.out.println("FIM");
		
	}

}
