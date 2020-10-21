package listas.questao3;



public class CarrosTest {
	
	public static void main(String[] args) {
		
		LojaDeCarros lista = new LojaDeCarros();
		
		
		
		Carro palioPrata = new Carro("Pálio", "Fiat","Prata", 1 ,2, false, false, false, false, 35000.0);
		palioPrata.calculaPreco();
		
		
		
		Carro civic = new Carro("Civic", "Honda", "Preto",3, 4, true, true, true, true, 110000);
		civic.calculaPreco();
		
		
		Carro corolla = new Carro("Corolla", "Toyota", "Branco",0, 2, true, true, false, true, 110000);
		corolla.calculaPreco();
		
		
		lista.adicionarCarro(palioPrata);
		lista.adicionarCarro(civic);
		lista.adicionarCarro(corolla);
		
		lista.adicionarPromocao(1);
		lista.VenderCarro(1);
		System.out.println("Total em vendas: "+ lista.computaApuradoDasVendas());
		System.out.println();
		lista.exibirCarrosDisponiveis();
		System.out.println(lista.carrosVendidos);
		lista.limparVendidos();
		System.out.println(lista.carrosVendidos);
		
				
	}

}
