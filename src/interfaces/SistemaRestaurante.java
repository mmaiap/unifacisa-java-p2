package interfaces;

import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
	
	
	private List<Cliente> clientes;
	
	public SistemaRestaurante() {
		clientes = new ArrayList<Cliente>();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
		
	}
	
	public void adicionarPedido(int mesa, Item item) {
		
		boolean adicionou = false;
		for(Cliente c : clientes) {
			
			if(c.getMesa() == mesa) {
				c.adicionarPedido(item);
				adicionou = true;
			}
			
		}
		if(adicionou == false) {
			throw new ClienteInexistenteException();
		}
		
		
	}
	
	public void removerPedido(int mesa, Item item) {
		
		boolean removeu = false;
		for(Cliente c : clientes) {
			
			if(c.getMesa() == mesa) {
				c.removerPedido(item);
				removeu = true;
			}
		}
		if(removeu == false) {
			throw new PedidoInexistenteException();
		}
		
	}
	
	public double computarPagamento(int mesa) {
		
		double valor = 0;
		
		for(Cliente c : clientes) {
			if(c.getMesa() == mesa) {
				valor += c.getConta();
			}
		}
		return valor;
		
	}
	
	public void receberPagamento(int mesa, double pagamento) {
		
		if(computarPagamento(mesa) <= pagamento) {
			System.out.println("Conta paga! volte sempre!");
		}else {
			throw new PagamentoInvalidoException();
		}
		
	}
	
	

}
