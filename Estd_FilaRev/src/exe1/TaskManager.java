package exe1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class TaskManager {
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random();
		Queue<Integer> process = new LinkedList<Integer>();
		int option = -1;
		
		do {
			System.out.println("\n------- Menu -------");
			System.out.println("1 - New process");
			System.out.println("2 - Remove process");
			System.out.println("3 - Show all process");
			System.out.println("0 - Sair");
			option = scanner.nextInt();
			
			if(option == 1) {
				process.offer(generator.nextInt());
				System.out.print("Added Process!");
			}else if (option == 2) {
				System.out.print("Removed " + process.poll() + " from list!");
			}else if (option == 3) {
				System.out.println("Active process");
				System.out.println();
				for(Integer i : process){
		            System.out.println(i);
		        }
			}
		}
		while(option != 0);
		
		scanner.close();
	}

}