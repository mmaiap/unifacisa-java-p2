package encapsulamento;

public class Musica {
	
	private String nome, artista;
	private int anoLancamento, numReproducoes, duracao;
	private Genero genero; 
	private double custo;
	
	public Musica() {}
	
	public Musica(String nome, String artista, Genero genero, int anoLancamento, int numReproducoes, int duracao) {
		
		this.nome = nome;
		this.artista = artista;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.numReproducoes = 0;
		this.duracao = duracao;
		calculaCusto();
		
	}
	
	public void reproduzir() {
		numReproducoes++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public int getNumReproducoes() {
		return numReproducoes;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	private double calculaCusto() {
		switch(genero) {
			case SAMBA:
			case FUNK:
			case PAGODE:
				custo = 0.5;
				break;
			case FORRO:
			case ROCK:
				custo = 0.6;
				
		}
		
		return custo;
		
		
	}

}
