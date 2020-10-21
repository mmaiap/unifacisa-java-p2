package classesAbstratas.contabancaria;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException() {
		super("Saldo insuficiente");
	}

}
