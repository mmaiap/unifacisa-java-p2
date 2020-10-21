package variaveisEMetodosDeInstanciaEClasseQuestao1;


public class LojaDeCarros {
	
	public static void main(String[] args) {
		
		Carro palioBasico = new Carro("Pálio", "Fiat", 35000.0);
		palioBasico.calculaPreco();
		System.out.println(palioBasico);
		
		Carro palioPrata = new Carro("Pálio", "Fiat","Prata", 2, false, false, false, false, 35000.0);
		palioPrata.calculaPreco();
		System.out.println(palioPrata);
		
		Carro civic = new Carro("Civic", "Honda", "Preto", 4, true, true, true, true, 110000);
		civic.calculaPreco();
		System.out.println(civic);
		
		Carro corolla = new Carro("Corolla", "Toyota", "Branco", 2, true, true, false, true, 110000);
		corolla.calculaPreco();
		System.out.println(corolla);
		
		Carro gol = new Carro();
		gol.nome = "Gol";
		gol.marca = "Volkswagen";
		gol.cor = "Preto";
		gol.portas = 4;
		gol.vidroEletrico = true;
		gol.arCondicionado = true;
		gol.cambioAutomatico = true;
		gol.direcaoEletrica = true;
		gol.precoBase = 55000;
		gol.calculaPreco();
		System.out.println(gol);
		
		
	}
	

}
