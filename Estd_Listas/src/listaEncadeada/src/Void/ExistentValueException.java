package listaEncadeada.src.Void;

/**
 * @author wdmatheus 
 * Classe para excessão de valor existente na lista com herança da classe Exception
 */
public class ExistentValueException extends Exception{	
	public ExistentValueException(){
		super();
	}	
	public ExistentValueException(String msg){
		super(msg);
	}
}
