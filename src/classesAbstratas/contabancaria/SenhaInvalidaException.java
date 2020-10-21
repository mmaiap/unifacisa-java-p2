package classesAbstratas.contabancaria;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends Exception{
	public SenhaInvalidaException() {
		super("Senha invalida");
	}

}
