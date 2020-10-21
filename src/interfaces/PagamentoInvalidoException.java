package interfaces;

@SuppressWarnings("serial")
public class PagamentoInvalidoException extends NullPointerException {
	
	public PagamentoInvalidoException() {
		super("Pagamento invalido");
	}
	

}
