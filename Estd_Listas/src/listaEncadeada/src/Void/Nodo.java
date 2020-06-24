package listaEncadeada.src.Void;

public class Nodo {
	private Nodo anterior;		
	private Nodo proximo;
	private String valor;
	
	//Define valor do n�.
	public void setValor(String valor) {
		this.valor = valor;
	}
	//Retorna valor do n�.
	public String getValor() {
		return valor;
	}
	//Define n� anterior.
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	//Retorna n� anterior
	public Nodo getAnterior() {
		return anterior;
	}
	//Define proximo n�.
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	//Retorna proximo n�
	public Nodo getProximo() {
		return proximo;
	}
}
