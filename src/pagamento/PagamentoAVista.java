package pagamento;

public class PagamentoAVista extends Pagamento 
{
	private static final int PARCELA_UNICA = 0;
	/**
	 * Constroi um objeto para representar um pagamento.
	 * @param valor valor bruto do pagamento
	 */
	public PagamentoAVista(double valor) 
	{	super(valor);
	}

	/**
	 * Retorna a quantidade de parcelas do pagamento.
	 * @return quantidade de parcelas
	 */
	public int getQtdParcelas() 
	{	return PARCELA_UNICA;
	}

	/**
	 * Retorna o valor liquido a pagar. O valor liquido eh calculado subtraindo 
	 * o desconto do valor bruto.
	 * @return o valor liquido a pagar (valor apos desconto)
	 */
	public double getValorAPagar() 
	{	return super.getValor();
	}
}
