package excecoes;

@SuppressWarnings("serial")
public class MesInvalidoException extends Exception {
	
	public MesInvalidoException(int numeroEscolhido) {
		super("O n�mero do m�s deve estar contido no intervalo [1, 12]\n" + "voce digitou: " + numeroEscolhido);
	}

}
