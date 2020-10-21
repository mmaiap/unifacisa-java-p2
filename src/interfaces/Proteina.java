package interfaces;

public enum Proteina {
	
	PICANHA(20.0, "Picanha na brasa"), MAMINHA(15.0, "Maminha"), FRANGO(15.0,"Frango no molho branco"), LINGUICA(10.0,"Linguica suina");
	
	private double valor;
	private String descricao;
	
	Proteina(double valor, String descricao) {
		
		this.valor = valor;
		this.descricao = descricao;
		
	}
	

	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}
		



}


