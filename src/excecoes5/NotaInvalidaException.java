package excecoes5;

@SuppressWarnings("serial")
public class NotaInvalidaException extends Exception{
	
	public NotaInvalidaException(Double nota) {
		super("A nota precisa estar entre 0 e 10, tente novamente");
	}

}
