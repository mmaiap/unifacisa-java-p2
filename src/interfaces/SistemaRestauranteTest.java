package interfaces;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaRestauranteTest {
	
	
	
	private SistemaRestaurante sistema;
	private Cliente cliente;
	private Cliente cliente2;
	private Cliente cliente3;
	private Refeicao prato;
	private Refeicao prato2;
	private Bebida bebida;
	private Bebida bebida2;
	
	@Before
	public void inicio() {
		sistema = new SistemaRestaurante();
		cliente = new Cliente(1);
		cliente2 = new Cliente(2);
		cliente3 = new Cliente(3);
		prato = new Refeicao(Proteina.PICANHA, Carboidrato.PURE);
		prato2 = new Refeicao(Proteina.FRANGO, Carboidrato.BATATA);
		bebida = new Bebida(SaborBebida.CERVEJA, Tamanho.MEDIO);
		bebida2 = new Bebida(SaborBebida.COCA, Tamanho.PEQUENO);
	}
	

	@Test
	public void adicionarClienteTest() {
		sistema.adicionarCliente(cliente);
		sistema.adicionarCliente(cliente2);
		assertEquals(2, sistema.getClientes().size());
		sistema.adicionarCliente(cliente3);
		assertEquals(3, sistema.getClientes().size());
		
	}
	
	@Test
	public void adicionarPedidoTest() {
		sistema.adicionarCliente(cliente);
		sistema.adicionarPedido(1, prato);
		sistema.adicionarPedido(1, bebida2);
		assertEquals(2, cliente.getComanda().size());
		sistema.adicionarCliente(cliente2);
		sistema.adicionarPedido(2, prato);
		sistema.adicionarPedido(2, bebida2);
		assertEquals(2, cliente2.getComanda().size());
		sistema.adicionarCliente(cliente3);
		sistema.adicionarPedido(3, bebida);
		sistema.adicionarPedido(3, prato2);
		sistema.adicionarPedido(3, prato2);
		assertEquals(3, cliente3.getComanda().size());
	}
	
	@Test
	(expected = ClienteInexistenteException.class)
	public void testarClienteException() {
		sistema.adicionarPedido(4, prato);
	}
	
	
	@Test
	public void removerPedidoTest() {
		sistema.adicionarCliente(cliente);
		sistema.adicionarPedido(1, prato);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, bebida2);
		assertEquals(3, cliente.getComanda().size());
		sistema.removerPedido(1, bebida2);
		assertEquals(2, cliente.getComanda().size());

	}
	
	@Test
	(expected = PedidoInexistenteException.class)
	public void testarPedidoException() {
		sistema.removerPedido(4, prato2);
		
	}
	
	@Test
	public void computarPagamentoTest() {
		sistema.adicionarCliente(cliente);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, prato);
		sistema.adicionarPedido(1, prato2);
		sistema.adicionarPedido(1, bebida2);
		assertEquals(48.5, sistema.computarPagamento(1),0);
		
	}
	
	@Test
	public void receberPagamentoTest() {
		sistema.adicionarCliente(cliente);
		sistema.adicionarPedido(1, bebida);
		sistema.adicionarPedido(1, prato);
		sistema.adicionarPedido(1, prato2);
		sistema.adicionarPedido(1, bebida2);
		sistema.receberPagamento(1, 50);
		sistema.adicionarCliente(cliente2);
		sistema.adicionarPedido(2, bebida);
		sistema.adicionarPedido(2, prato);
		sistema.adicionarPedido(2, prato2);
		sistema.adicionarPedido(2, bebida2);
		sistema.receberPagamento(2, 48.5);
		
	}
	
	@Test
	(expected = PagamentoInvalidoException.class)
	public void testarPagamanto() {
		sistema.adicionarCliente(cliente3);
		sistema.adicionarPedido(3, prato);
		sistema.receberPagamento(3, 20);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
