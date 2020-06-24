package pilha;

public class PilhaExemplo02 {
	
	public Object[] pilha; //cria��o de um objeto - � onde ser�o empilahdos os dados
	public static int posicaoPilha; //indice que informa a posi��o
	
	public PilhaExemplo02(){ //construtor da classe
		this.posicaoPilha = -1; 
		//indica que a pilha est� vazia
		this.pilha = new Object[5];
		//cria��o de um obejto de 100 posi��es
	}
	
	public boolean pilhaVazia() { //verifica se a pilha est� vazia
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}
	
	public int tamanho() { //exibe o tamanho do vetor
		if(this.pilhaVazia()) {
			return 0;
		}
		return this.posicaoPilha + 1; //pois a pilha come�a em 0
	}
	
	public Object exibeLast() { //exibe o �ltimo valor da pilha
		if(this.pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha]; 
	}
	
	public Object desempilhar() { //"retirada" do �limo objeto que entrou
		if(pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha--]; //desprezar a ultima posi��o da pilha
	}
	
	public void empilhar (Object valor) { //empilhando objetos - o valor � passado como par�metro
		if (this.posicaoPilha < this.pilha.length - 1) { //se a posi��o for menor que o tamanho permitido no caso [100]
			this.pilha[++posicaoPilha] = valor; // o objeto "pilha" recebe na ultima posi��o o objeto valor
		}else {
			System.out.println("Tamanho esgotado! N�o foi poss�vel inserir " + valor);
		}
	}
	
	public static void main (String [] args) {
		PilhaExemplo02 p = new PilhaExemplo02();
		
		p.empilhar("Lasanha");
		p.empilhar("Macarr�o");
		p.empilhar("Batata");
		p.empilhar("Arroz");
		p.empilhar("Laranja");
		p.empilhar("Morango");
		p.empilhar("Moranga");
		p.empilhar("Farinha");
		p.empilhar("Farofa");
		
		while(p.pilhaVazia() == false) {
			System.out.println("Saiu: " + posicaoPilha + " -- " + p.desempilhar());
		}
		
	}
}
