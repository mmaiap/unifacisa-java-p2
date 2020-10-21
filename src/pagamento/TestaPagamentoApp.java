package pagamento;

public class TestaPagamentoApp 
{
	public static void main(String[] args) 
	{	Pagamento pagamento = null;
	
		pagamento = new PagamentoAVista(800);
		double valor = pagamento.getValor();
		double valorAPagar = pagamento.getValorAPagar();
		int qtdParcelas = pagamento.getQtdParcelas();
		double valorParcela = pagamento.getValorParcela();
		System.out.println(valor + " - desconto  = " + valorAPagar + " = " + qtdParcelas + " x " + valorParcela);
		System.out.println();
		
		pagamento = new PagamentoAVistaComDesconto(800, 5);
		valor = pagamento.getValor();
		valorAPagar = pagamento.getValorAPagar();
		qtdParcelas = pagamento.getQtdParcelas();
		valorParcela = pagamento.getValorParcela();
		System.out.println(valor + " - desconto  = " + valorAPagar + " = " + qtdParcelas + " x " + valorParcela);
		System.out.println();
		
		pagamento = new PagamentoParcelado(800, 5);
		valor = pagamento.getValor();
		valorAPagar = pagamento.getValorAPagar();
		qtdParcelas = pagamento.getQtdParcelas();
		valorParcela = pagamento.getValorParcela();
		System.out.println(valor + " - desconto  = " + valorAPagar + " = " + qtdParcelas + " x " + valorParcela);
		System.out.println();
		
		
	}
}
