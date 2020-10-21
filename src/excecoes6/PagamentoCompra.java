package excecoes6;

import java.util.Scanner;

public class PagamentoCompra {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor total da venda: ");
		double totalVenda = teclado.nextDouble();
		boolean qtdParcelasOk = false;
		Venda venda = new Venda(totalVenda);
		while(!qtdParcelasOk) {
			System.out.println("Digite a quantidade de parcelas: ");
			try {
				int qtdParcelas = teclado.nextInt();
				venda.setQtdParcelas(qtdParcelas);
				qtdParcelasOk = true;
				
			}catch (ValorMinimoParcelaException e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Valor da parcela: " + venda.getValorParcela());
		teclado.close();
	}
}