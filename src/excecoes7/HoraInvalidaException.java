package excecoes7;

@SuppressWarnings("serial")
public class HoraInvalidaException extends Exception{
	
	public HoraInvalidaException() {
		super("A hora digitada � inv�lida, tente novamente");
	}

}
