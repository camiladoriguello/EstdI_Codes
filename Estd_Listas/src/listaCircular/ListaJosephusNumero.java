package listaCircular;
import java.util.*;

public class ListaJosephusNumero {
	
    public static void main(String[] argv) {
    	
    	Scanner scanner = new Scanner(System.in);
    	Random random = new Random();
        List soldadosGo;
        
        System.out.print("Quantidade de soldados: ");
        int qSold = scanner.nextInt();
        
        int step = 0;
        do {
        	step = random.nextInt(qSold);
        }while(step == 0);
       
        
        System.out.println("Numero sorteado: " + step);
        
        int startNome = 0;
        do {
        	startNome = random.nextInt(qSold);
        }while(startNome == 0);
        
        //System.out.println(soldadosGo = josephus(qSold, step, startNome)); 
        
        //System.out.printf("Person is last\n" + soldadosGo);  
    }

    static Object josephus(int qSold, int step, int startNome) {
    	
    	Scanner scanner = new Scanner(System.in);
        if (qSold < 1 || step < 1 || startNome < 1) return null;

        List soldadosOrd = new LinkedList();
        System.out.println("Digite o nome dos soldados!");
        for (int i = 0; i < qSold; i++) {
        	System.out.print("Soldado " + (i+1) + ": ");
        	String nomeSoldado = scanner.next();
			scanner.nextLine();      
            soldadosOrd.add(nomeSoldado);
        }
       
        List soldadosGo = new LinkedList();
        int i = (startNome - 2) % qSold;
        for (int j = qSold; j > 0; j--) {
            i = (i + step) % qSold--;
            soldadosGo.add(soldadosOrd.remove(i--));
        }

        return soldadosGo.get(i);
    }
}