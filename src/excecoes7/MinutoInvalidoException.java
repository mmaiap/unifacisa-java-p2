package excecoes7;

@SuppressWarnings("serial")
public class MinutoInvalidoException extends Exception {
	
	public MinutoInvalidoException() {
		super("O minuto digitado � inv�lido, tente novamente");
	}

}
