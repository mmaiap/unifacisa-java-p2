package gerador;

public class ImprimePrimosApp 
{
	private static final int NUMERO_LIMITE = 100;
	
	public static void main(String[] args) 
	{	GeradorDePrimo gerador = new GeradorDePrimo();
		for (int i = 0; i < NUMERO_LIMITE; i++) 
		{	int primo = gerador.getProxPrimo();
			System.out.println(primo + " eh primo");
		}	
	}
}
