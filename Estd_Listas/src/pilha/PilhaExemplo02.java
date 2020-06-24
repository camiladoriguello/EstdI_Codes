package pilha;

public class PilhaExemplo02 {
	
	public Object[] pilha; //criação de um objeto - é onde serão empilahdos os dados
	public static int posicaoPilha; //indice que informa a posição
	
	public PilhaExemplo02(){ //construtor da classe
		this.posicaoPilha = -1; 
		//indica que a pilha está vazia
		this.pilha = new Object[5];
		//criação de um obejto de 100 posições
	}
	
	public boolean pilhaVazia() { //verifica se a pilha está vazia
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}
	
	public int tamanho() { //exibe o tamanho do vetor
		if(this.pilhaVazia()) {
			return 0;
		}
		return this.posicaoPilha + 1; //pois a pilha começa em 0
	}
	
	public Object exibeLast() { //exibe o último valor da pilha
		if(this.pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha]; 
	}
	
	public Object desempilhar() { //"retirada" do úlimo objeto que entrou
		if(pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha--]; //desprezar a ultima posição da pilha
	}
	
	public void empilhar (Object valor) { //empilhando objetos - o valor é passado como parâmetro
		if (this.posicaoPilha < this.pilha.length - 1) { //se a posição for menor que o tamanho permitido no caso [100]
			this.pilha[++posicaoPilha] = valor; // o objeto "pilha" recebe na ultima posição o objeto valor
		}else {
			System.out.println("Tamanho esgotado! Não foi possível inserir " + valor);
		}
	}
	
	public static void main (String [] args) {
		PilhaExemplo02 p = new PilhaExemplo02();
		
		p.empilhar("Lasanha");
		p.empilhar("Macarrão");
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
