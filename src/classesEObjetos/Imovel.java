package classesEObjetos;

public class Imovel {
	
	String tipo, imobiliaria;
	int numPavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	double preco;
	
	
	public Imovel() {}
	
	public Imovel(String imobiliaria, int quartos, int suites,
			int banheiros, int metrosQuadrados, boolean piscina, boolean quadra) {
		
		this.tipo = "Casa";
		this.imobiliaria = imobiliaria;
		this.numPavimentos = 0;
		this.pavimento = 0;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = false;
		this.piscina = piscina;
		this.quadra = quadra;
		this.preco = 0;
		
		
	}
	
	public Imovel(String imobiliaria, int numPavimentos, int pavimento, int quartos, int suites,
			int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		
		this.tipo = "Apartamento";
		this.imobiliaria = imobiliaria;
		this.numPavimentos = numPavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		this.preco = 0;
		
	}
	
	public double calculaPreco() {
		
		preco = 5000 * metrosQuadrados;
		
		if(tipo.equalsIgnoreCase("apartamento")) {
			
			if(pavimento < 5) {
				
				preco += 0;
				
			}else if(pavimento == 5) {
				
				preco += 2000;
			}
			
			else {
				preco += (pavimento - 4) * 2000;
			}	
		}
		if(elevador) {
			preco += 2500;
		}
		if(piscina) {
			preco += 2500;
		}
		if(quadra) {
			preco += 2500;
		}
		
		return preco;
		
	}
	
	@Override
	
	public String toString() {
		
		String output = "";
		
		output += "Tipo: " + tipo + "\n";
		output += "Imobiliaria: " + imobiliaria + "\n";
		output += "N�mero de Pavimentos: " + numPavimentos + "\n";
		output += "Pavimento: " + pavimento + "\n";
		output += "N�mero de quartos: " + quartos + "\n";
		output += "N�meros de su�tes: " + suites + "\n";
		output += "N�meros de banheiros: " + banheiros + "\n";
		output += "Elevador: " + (elevador? "Sim":"N�o") + "\n";
		output += "Piscina: " + (piscina? "Sim":"N�o") + "\n";
		output += "Quadra: " + (quadra? "Sim":"N�o") + "\n";
		output += "Preco: " + preco + "\n";
		
		
		return output;
	}

}
