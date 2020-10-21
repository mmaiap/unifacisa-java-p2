package excecoes;

@SuppressWarnings("serial")
public class MesInvalidoException extends Exception {
	
	public MesInvalidoException(int numeroEscolhido) {
		super("O número do mês deve estar contido no intervalo [1, 12]\n" + "voce digitou: " + numeroEscolhido);
	}

}
