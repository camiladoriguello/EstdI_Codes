package exe2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CarWash {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> cars = new LinkedList<Integer>();
		int option = -1;
		int totalHoursCont = 0;
		do {
			System.out.println("------- Menu -------");
			System.out.println("1 - Exibir quantidade de carros na fila");
			System.out.println("2 - Exibir tempo de espera atual");
			System.out.println("3 - Inserir um carro na fila");
			System.out.println("4 - Remover um carro da fila");
			System.out.println("5 - Exibir media de espera de todo o dia");	
			System.out.println("0 - Sair");
			option = scanner.nextInt();

			if (option == 1) {
				System.out.println("Ha " + cars.size() + " carros na fila.");
			}else if (option == 2) {
				int waitTime = cars.size() * 15;
				System.out.println("O tempo de espera atual e de: " + waitTime + " minutos.");
			}else if (option == 3) {
				System.out.println("Digite os números da placa do proximo veiculo: ");
				int placa = scanner.nextInt();
				cars.offer(placa);
				totalHoursCont = totalHoursCont + 15;
			}else if (option == 4) {
				System.out.println("Veiculo " + cars.poll() + " removido !!!");
			}else if (option == 5) {
				System.out.println("A media de espera durante o dia foi de " + totalHoursCont + " minutos.");
			}else if (option >= 6 || option < 0) {
				System.out.println("Opção Invalida!");
			}else if (option == 0) {
				System.out.println("Programa encerrado!");
				break;
			}
		}
		while(option != 0);
		scanner.close();
	}
}
