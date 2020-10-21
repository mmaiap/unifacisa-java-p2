package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	
	private List<Refeicao> refeicoes;
	private List<Bebida> bebidas;
	private List<Item> cardapio;
	
	public Cardapio() {
		this.refeicoes = new ArrayList<Refeicao>();
		this.bebidas = new ArrayList<Bebida>();
		this.cardapio = new ArrayList<Item>();
		
		refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.BATATA));
		refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.ARROZ));
		refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.PURE));
		refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.BATATA));
		refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.PURE));
		refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.FEIJAO));
		refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.PURE));
		refeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.BATATA));
		bebidas.add(new Bebida(SaborBebida.CERVEJA, Tamanho.MEDIO));
		bebidas.add(new Bebida(SaborBebida.COCA, Tamanho.PEQUENO));
		bebidas.add(new Bebida(SaborBebida.GUARANA, Tamanho.PEQUENO));
		bebidas.add(new Bebida(SaborBebida.FANTA, Tamanho.PEQUENO));
		bebidas.add(new Bebida(SaborBebida.SPRITE, Tamanho.PEQUENO));
		bebidas.add(new Bebida(SaborBebida.SUCO, Tamanho.GRANDE));
		cardapio.addAll(refeicoes);
		cardapio.addAll(bebidas);
		
	}
	
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public List<Item> getCardapio() {
		return cardapio;
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	

}
