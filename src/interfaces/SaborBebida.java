package interfaces;

public enum SaborBebida {
	
	
	COCA(4, "Refrigerante Coca-cola de 350ml"), GUARANA(4, "Refrigerante Guarana de 350ml"),
	SPRITE(4,"Refrigerante Sprite de 350ml"), FANTA(3.5, "Refrigerante Fanta de 350ml"),SUCO(3, "Suco de fruta natural"),
	CERVEJA(5, "Cerveja 600ml");
	
	private double valor;
	private String descricao;
	
	SaborBebida(double valor, String descricao){
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
