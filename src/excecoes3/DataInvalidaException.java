package excecoes3;

@SuppressWarnings("serial")
public class DataInvalidaException extends Exception {
	
	public DataInvalidaException(int dia, int mes, int ano) {
		super("Os par�metros fornecidos n�o representam uma data v�lida");
	}

}
