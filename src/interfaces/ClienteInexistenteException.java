package interfaces;

@SuppressWarnings("serial")
public class ClienteInexistenteException extends NullPointerException {
	
	public ClienteInexistenteException() {
		super("Cliente nao existe");
	}

}
