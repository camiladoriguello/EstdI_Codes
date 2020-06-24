package listaCircular;
import java.util.*;
public class ListaJosephus {

	public static void main (String [] args) {
		
		//----------Atributtos necessários----------
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		List soldados = new LinkedList();
		
		//----------Informando a quantidadade de soldados----------
		System.out.println("Quantidade de soldados: ");
		int qtdSoldados = scanner.nextInt();
		
		//----------Inserindo nomes----------
		System.out.println("Informe o nome dos soldados!");
		for (int i = 0; i < qtdSoldados; i++) {
			System.out.print((i + 1) + ": ");
			String nomeSoldado = scanner.next();
			scanner.nextLine();
			soldados.add(nomeSoldado);
		}
		
		//----------Sorteando N e a posição do nome----------
		int n = random.nextInt(qtdSoldados);
		int i = random.nextInt(qtdSoldados);
		while (n <= 0 || i <= 0) {
			n = random.nextInt(qtdSoldados);
			i = random.nextInt(qtdSoldados);
		}
		System.out.println("Número sorteado: " + n);
		System.out.println("Comecerá do soldado " + i);
		
		//----------Removendo dados----------
		n = n + i;
		while(soldados.size() != 1) {
			if(n > soldados.size()) {
				n = n - soldados.size();
			}else {
				soldados.remove(n - 1);
				n = (n - 1) + i;
			}	
		}
		
		System.out.println("O soldado escolhido é: " + soldados);
		
		//---------------TESTE---------------
		/*while(soldados.size() != 1) {
			for (int j = i; j <= n; j++) {
				if(n > soldados.size()) {
					n = n - soldados.size();
				}else {
					soldados.remove(j);
					j = n - 1;
				}
			}	
		}------------------------------------*/
	}
	
}
	
