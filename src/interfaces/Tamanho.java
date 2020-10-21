package interfaces;

public enum Tamanho {
	
	PEQUENO(0),MEDIO(2),GRANDE(2.8);
	
	private double acrescimo;
	
	Tamanho(double acrescimo){
		this.acrescimo = acrescimo;
	}
	

	public double getAcrescimo() {
		return acrescimo;
	}



}
