package gerador;

/**
 * Classe capaz de gerar numeros primos sequenciais.
 */
public class GeradorDePrimo 
{   private static final int PRIMEIRO_PRIMO = 2;
	private static final int QTD_MAX_DIVISORES = 3;
    private int proxPrimo = PRIMEIRO_PRIMO;
    
    /**
     * Retorna um numero primo. O numero sera o proximo primo maior 
     * que o primo retornado na chamada anterior deste metodo.
     * @return numero primo
     */
    public int getProxPrimo()  
    {   int primo = proxPrimo;
        proxPrimo++;
        while (isPrimo(proxPrimo))
        {   proxPrimo++; 
        }
        return primo;
    }

    /**
     * Verifica se um numero eh primo.
     * @param primo candidato a numero primo
     * @return indicacao se o numero passado como parametro eh primo
     */
    private boolean isPrimo(int primo) 
    {   int qtdDivisores = 0;
        for (int i = 0; i <= primo; i++) 
        {   if (primo / i == 0)
            {   qtdDivisores++;
            }
        }
        return qtdDivisores == QTD_MAX_DIVISORES;
    }    
}
