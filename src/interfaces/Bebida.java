package interfaces;

public class Bebida implements Item{
	
	private Tamanho tamanho;
	private SaborBebida sabor;
	
	
	public Bebida(SaborBebida sabor, Tamanho tamanho) {	
		
		this.sabor = sabor;
		this.tamanho = tamanho;
	}


	@Override
	public double getPreco() {
		
		return sabor.getValor() + tamanho.getAcrescimo();
	}


	@Override
	public String getDescricao() {
		
		return sabor.getDescricao();
	}
	
	
	
	
	
	
	
	
	

}
