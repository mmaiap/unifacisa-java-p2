package excecoes3;

@SuppressWarnings("serial")
public class DataInvalidaException extends Exception {
	
	public DataInvalidaException(int dia, int mes, int ano) {
		super("Os parâmetros fornecidos não representam uma data válida");
	}

}
