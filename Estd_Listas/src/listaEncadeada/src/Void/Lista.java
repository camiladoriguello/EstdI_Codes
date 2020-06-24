package listaEncadeada.src.Void;
 /*
 * Classe que implementa e realiza manipula��o da lista.
 */

import java.util.ArrayList;

public class Lista {
	private Nodo primeiro = null, ultimo = null;	
	//Define n� como primeiro da lista.
	public void setPrimeiro(Nodo primeiro) {
		this.primeiro = primeiro;
	}
	//Retorna o primeiro n� da lista.
	public Nodo getPrimeiro() {
		return primeiro;
	}
	//Define n� como ultimo da lista.
	public void setUltimo(Nodo ultimo) {
		this.ultimo = ultimo;
	}
	//Retorna ultimo n� da lista.
	public Nodo getUltimo() {
		return ultimo;
	}
	//Percorre os n�s da lista atribuindo os valores de cada n� em um ArrayList enquanto o pr�ximo n� n�o for nulo.
	public ArrayList<String> Listar() throws EmptyListException  {
		ArrayList<String> lista = new ArrayList<String>();		
		if(primeiro == null)
			throw new EmptyListException("A lista esta vazia!");		
		else{
			Nodo aux = getPrimeiro();			
			while(aux != null){
				String vl = aux.getValor(); 
				lista.add(vl);
				aux = aux.getProximo();
			}
			return lista;
		}		
	}
	//Percorre os n�s da lista comparando os valores de cada n� com o valor passado por parametro enquanto o pr�ximo n� n�o for nulo.
	public boolean Procura(String valor){
		Nodo aux = getPrimeiro();		
		while(aux != null){
			if(valor.equals(aux.getValor())){
				return true;
			}
			aux = aux.getProximo();
		}
		return false;
	}
	//Insere valor passado por parametro no inicio da lista, se o valor n�o existir na lista.
	public void Insere_Inicio(String valor) throws ExistentValueException{		
		boolean procura = false;		
		procura = Procura(valor);		
		if (procura == false){		
			Nodo novo = new Nodo();			
			if (primeiro == null){
				novo.setValor(valor);
				setPrimeiro(novo);
				setUltimo(novo);
			}			
			else{
				primeiro.setAnterior(novo);
				novo.setValor(valor);
				novo.setProximo(primeiro);
				setPrimeiro(novo);				
			}
		}
		else{
			throw new ExistentValueException("Valor j� existe na lista!");
		}
	}
	//Insere valor passado por parametro no fim da lista, se o valor n�o existir na lista.
	public void Insere_Fim(String valor) throws ExistentValueException{
		Nodo novo = new Nodo();		
		boolean procura = false;		
		procura = Procura(valor);		
		if(procura == true)
			throw new ExistentValueException("Valor j� existe na lista!");		
		else{
			if(ultimo == null){			
				novo.setValor(valor);
				primeiro = novo;
				ultimo = novo;			
			}
			else{
				ultimo.setProximo(novo);
				novo.setValor(valor);
				ultimo = novo;
			}
		}
	}	
}
