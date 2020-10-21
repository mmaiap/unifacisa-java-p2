package interfaces;

public class Refeicao implements Item {
	
	private Proteina proteina;
	private Carboidrato carboidrato;
	
	public Refeicao(Proteina proteina, Carboidrato carboidrato) {
		this.carboidrato = carboidrato;
		this.proteina = proteina;
	}
	
	

	@Override
	public double getPreco() {
		
		return proteina.getValor() + carboidrato.getValor();
	}

	@Override
	public String getDescricao() {
		
		return proteina.getDescricao() + " com " + carboidrato.getDescricao();
	}
	


}
