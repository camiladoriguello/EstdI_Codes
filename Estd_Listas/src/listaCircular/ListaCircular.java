package listaCircular;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCircular {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList myList = new ArrayList();
		System.out.print("Tamanho do array: ");
		int sizeList = scanner.nextInt();
		
		int opc = -1;
		int localP = -1;
		int val;

		while(opc != 0) {
			val = -1;
			int pos = 0;
			System.out.println("------------------------------------------");
			System.out.println("Opçoes: 1 Inserir - 2 Remover - 0 Encerrar");
			System.out.println("------------------------------------------");
			
			opc = scanner.nextInt();
			
			if(opc == 1) {
				while(val != 0) {
					System.out.print("Valor: ");
					val = scanner.nextInt();
					if(val !=0 ) {
						if (myList.size() < sizeList) {
							localP = myList.size();
							myList.add(val);
						}else {
							localP++;
							if(localP >= sizeList){
								localP = 0;
							}
							myList.set(localP ,val);
						}
					}
					System.out.println("( T: " + myList.size() + ", P: " + localP + ") " + myList);
				}	
			}
			if(opc == 2) {
				myList.remove(myList.size()-1);
				System.out.println("( T: " + myList.size() + ") " + myList);
			}
		}
		scanner.close();
	}
}
