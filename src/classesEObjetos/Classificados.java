package classesEObjetos;

public class Classificados {
	
	public static void main(String[] args) {
		
		Imovel casa1 = new Imovel("Falcão", 3, 1, 2, 120, true, false);
		casa1.calculaPreco();
		System.out.println(casa1);
		
		Imovel apartamento1 = new Imovel("Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		apartamento1.calculaPreco();
		System.out.println(apartamento1);
		
		Imovel casa2 = new Imovel();
		casa2.tipo = "Casa";
		casa2.imobiliaria = "Altaman";
		casa2.quartos = 4;
		casa2.suites = 2;
		casa2.banheiros = 3;
		casa2.metrosQuadrados = 240;
		casa2.piscina = true;
		casa2.quadra = true;
		casa2.elevador = true;
		casa2.numPavimentos = 2;
		casa2.preco = 0;
		casa2.calculaPreco();
		System.out.println(casa2);
		
		Imovel casa3 = new Imovel();
		casa3.tipo = "Casa";
		casa3.imobiliaria = "Leblon";
		casa3.quartos = 6;
		casa3.suites = 3;
		casa3.banheiros = 5;
		casa3.metrosQuadrados = 540;
		casa3.piscina = true;
		casa3.quadra = true;
		casa3.elevador = true;
		casa3.numPavimentos = 2;
		casa3.preco = 0;
		
		casa3.calculaPreco();
		System.out.println(casa3);
		
		Imovel apartamento2 = new Imovel("Alto Branco", 3, 2, 2, 1, 2, 60, false, false, false);
		apartamento2.calculaPreco();
		System.out.println(apartamento2);
		
	}

}
