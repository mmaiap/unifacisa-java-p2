package excecoes6;

@SuppressWarnings("serial")
public class ValorMinimoParcelaException extends Exception{
	
	public ValorMinimoParcelaException() {
		super("valor da parcela menor que o m�nimo, tente outra vez");
	}
	
	

}
