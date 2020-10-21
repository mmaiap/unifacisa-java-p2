package classesEObjetos;

public class Carro {
	
	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	public Carro() {}
	
	public Carro(String nome, String marca, double precoBase) {
		
		this.nome = nome;
		this.marca = marca;
		this.portas = 2;
		this.cor = "Branco";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.precoBase = precoBase;
		
	}
	
	public Carro(String nome, String marca, String cor, int portas, 
			boolean vidroEletrico, boolean arCondicionado, boolean cambioAutomatico,
			boolean direcaoEletrica, double precoBase) {
		
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
						
		
	}
	
	public double calculaPreco() {
		
		switch(cor) {
		case "Branco":
		case "Azul":
		case "Vermelho":
		case "Preto":
			precoBase += 0;
			break;
		default:
			precoBase += 1000;
		}
		
		if(vidroEletrico) {
			precoBase += 1250;
		}
		if(arCondicionado) {
			precoBase += 1250;	
		}
		if(cambioAutomatico) {
			precoBase += 1250;
		}
		if(direcaoEletrica) {
			precoBase += 1250;
		}
		
		return precoBase;
	}
	
	@Override 
	
	public String toString() {
		
		String output = "";
		output += "Nome: "+ nome + "\n";
		output += "Marca: " + marca + "\n";
		output += "Cor: " + cor + "\n";
		output += "Portas: "+ portas + "\n";
		output += "Vidro eletrico: " + (vidroEletrico? "Sim" : "Não") + "\n";
		output += "Ar-condicionado: " + (arCondicionado? "Sim" : "Não") + "\n";
		output += "Câmbio automático: " + (cambioAutomatico? "Sim" : "Não") + "\n";
		output += "Direção elétrica: " + (direcaoEletrica? "Sim" : "Não") + "\n";
		output += "Preço: " + precoBase + "\n";
		
		
		return output;
		
		
	}

	
	
	
	
}
