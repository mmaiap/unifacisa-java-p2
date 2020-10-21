package encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Spotify {
	
	private Musica [] musicas ;
	private int tamanho;
	
	public Spotify() {
		
		this.musicas = new Musica[10];
		
	}
	
	public Spotify(int tamanho) {
		
		this.musicas = new  Musica[tamanho];
		this.tamanho = 0;
		
	}
	
	
	public void addMusica(Musica musica) {
		
		if(tamanho >= musicas.length) {
			Musica [] dobro = new Musica[2*musicas.length];
			for(int i = 0; i < tamanho; i++) {
				dobro[i] = musicas[i];
			}
			musicas = dobro;
			
		}
		musicas[tamanho] = musica;
		tamanho++;
		
	}
	
	public int numDeVezesTocadas(Musica musica) {
		
		return musica.getNumReproducoes();
		
	}
	
	public void reproduzirMusica(Musica musica) {
		
		reproduzirMusica(musica);
		
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public List<Musica> listarMusicasArtista(String artista){
		
		List<Musica> musicaArtista = new ArrayList<Musica>();
		
		for(Musica m : musicas) {
			
			if(m.getArtista().equalsIgnoreCase(artista)) {
				
				
				musicaArtista.add(m);
				
			}
			
			
		}
		
		return musicaArtista;
		
	}
	
	public List<Musica> listarMusicaPorAno(int ano){
		
		List<Musica> musicaAno = new ArrayList<Musica>();
		
		for(Musica year : musicas) {
			
			if(year.getAnoLancamento() == ano) {			
				musicaAno.add(year);			
			}	
		}
		
		return musicaAno;
		
	}
	
	public List<Musica> musicasPorGenero(Genero genero){
		
		List<Musica> numPorGenero = new ArrayList<Musica>();
		
		for(Musica m : musicas) {
			
			if(m.getGenero().equals(genero)) {
				numPorGenero.add(m);
			}
			
		}
		return numPorGenero;
	}
	
	public Musica maiorDuracao() {
		
		Musica maior = musicas[0];
		
		for(int i = 0; i < tamanho; i++) {
			
			if(musicas[i].getDuracao() >= maior.getDuracao()) {
				
				maior = musicas[i];	
			}
			
		}
		return maior;
		
		
	}
	public Musica menorDuracao() {
		
		Musica menor = musicas[0];
		
		for(int i = 0; i < tamanho; i++) {
			
			if(musicas[i].getDuracao() <= menor.getDuracao()) {
				
				menor = musicas[i];	
			}
			
		}
		return menor;
		
	}
	
	

}
