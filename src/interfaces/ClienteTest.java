package interfaces;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
	
	private Cliente cliente;
	private Refeicao refeicao;
	private Bebida bebida;
	
	
	@Before 
	public void inicio() {
		cliente = new Cliente(1);
		refeicao = new Refeicao(Proteina.FRANGO, Carboidrato.BATATA);
		bebida = new Bebida(SaborBebida.SUCO, Tamanho.GRANDE);
		cliente.adicionarPedido(refeicao);
		cliente.adicionarPedido(bebida);
	}
	
	@Test
	public void adicionarPedidoTest() {
		assertEquals(2, cliente.getComanda().size());
	}
	
	@Test
	public void  removerPedidoTest() {
		cliente.removerPedido(bebida);
		assertEquals(1, cliente.getComanda().size());
	}
	
	@Test 
	public void getContaTest() {
		
		
		assertEquals(21.8, cliente.getConta(),0);
		cliente.adicionarPedido(bebida);
		assertEquals(27.6, cliente.getConta(),0);
		
	}
	

	
	
	
	
	
	
	
	
}
