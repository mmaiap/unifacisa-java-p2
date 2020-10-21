package interfaces;

@SuppressWarnings("serial")
public class PedidoInexistenteException extends NullPointerException {
	
	public PedidoInexistenteException() {
		super("Pedido inexistente");
	}

}
