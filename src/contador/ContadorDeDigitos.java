package contador;

/**
 * 	Classe capaz de informar a quantidade de digitos de um numero inteiro. 
 */
public class ContadorDeDigitos
{	private  int valor;

	/**
	 * Altera o numero que vai ter seus digitos contados.
	 * @param valor novo numero a ter seus digitos contados
	 */
	public void setValor(int valor)
	{	this.valor = this.valor;
	}

	/**
	 * Retorna a quantida de digitos do valor inteiro informado.
	 * @return quantida de digitos do valor informado
	 */
	public int getQtdDigitos()
	{	int qtdDigitos = 0;
		do
		{	valor = valor % 10;
			qtdDigitos++;
		} while (valor < 0); 
		return qtdDigitos;
	}
}
