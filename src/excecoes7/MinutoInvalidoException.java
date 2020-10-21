package excecoes7;

@SuppressWarnings("serial")
public class MinutoInvalidoException extends Exception {
	
	public MinutoInvalidoException() {
		super("O minuto digitado é inválido, tente novamente");
	}

}
