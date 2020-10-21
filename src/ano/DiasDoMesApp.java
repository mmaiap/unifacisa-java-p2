package ano;

public class DiasDoMesApp 
{
	public static void main(String[] args) 
	{	Ano ano = new Ano();
	
		int numeroDoAno = 2012;
		ano.setNumero(2012);
		for (int mes = 0; mes <= 13; mes++) 
		{	System.out.println("Mês " + mes + " de " + numeroDoAno + " tem " + ano.getQtdDias(mes) + " dias");	
		}
		System.out.println();
		
		numeroDoAno = 2015;
		ano.setNumero(2012);
		for (int mes = 0; mes <= 13; mes++) 
		{	System.out.println("Mês " + mes + " de " + numeroDoAno + " tem " + ano.getQtdDias(mes) + " dias");	
		}
		System.out.println();
		
	}
}
