package interfaces;

public enum Carboidrato {
	
	FEIJAO(2, "Feijao carioca"), ARROZ(1.5, "Arroz a grega"), PURE(1.5, "Pure de batatas"), BATATA(1,"Batata frita");
	
	
	private double valor;
	private String descricao;
	
	
	Carboidrato(double valor, String descricao){
		this.valor = valor;
		this.descricao = descricao;
	
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	

}
