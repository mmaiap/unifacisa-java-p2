package excecoes4;

@SuppressWarnings("serial")
public class JogoEncerradoException extends RuntimeException{
	
	public JogoEncerradoException() {
		super("N�o � permitido tentar mais palpites, o jogo est� encerrado");
	}

}
