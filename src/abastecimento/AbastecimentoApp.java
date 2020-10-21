package abastecimento;

public class AbastecimentoApp 
{
	public static void main(String[] args) 
	{	Abastecimento abastecimento = new Abastecimento();
		
		double gasolina = 3.59;
		double alcool = 2.35;
		abastecimento.setGasolina(gasolina);
		abastecimento.setAlcool(alcool);
		System.out.println("Álcool: " + alcool + ", gasolina: " + gasolina + ", recomendacao: " + abastecimento.getRecomendacao());
		System.out.println();
		
		gasolina = 3.59;
		alcool = 3.59;
		abastecimento.setGasolina(gasolina);
		abastecimento.setAlcool(alcool);
		System.out.println("Álcool: " + alcool + ", gasolina: " + gasolina + ", recomendacao: " + abastecimento.getRecomendacao());
		System.out.println();
		
		gasolina = 2.35;
		alcool = 2.35;
		abastecimento.setGasolina(gasolina);
		abastecimento.setAlcool(alcool);
		System.out.println("Álcool: " + alcool + ", gasolina: " + gasolina + ", recomendacao: " + abastecimento.getRecomendacao());
		System.out.println();
		
		gasolina = 3.59;
		alcool = 2.50;
		abastecimento.setGasolina(gasolina);
		abastecimento.setAlcool(alcool);
		System.out.println("Álcool: " + alcool + ", gasolina: " + gasolina + ", recomendacao: " + abastecimento.getRecomendacao());
		System.out.println();
		
		gasolina = 3.59;
		alcool = 2.51;
		abastecimento.setGasolina(gasolina);
		abastecimento.setAlcool(alcool);
		System.out.println("Álcool: " + alcool + ", gasolina: " + gasolina + ", recomendacao: " + abastecimento.getRecomendacao());
		System.out.println();
		
		gasolina = 3.59;
		alcool = 2.52;
		abastecimento.setGasolina(gasolina);
		abastecimento.setAlcool(alcool);
		System.out.println("Álcool: " + alcool + ", gasolina: " + gasolina + ", recomendacao: " + abastecimento.getRecomendacao());
		System.out.println();
	}
}
