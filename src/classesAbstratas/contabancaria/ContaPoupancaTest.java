package classesAbstratas.contabancaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaPoupancaTest {
	
	private ContaBancaria conta;
	private ContaBancaria conta2;
	
	@Before
	public void inicio() {
		conta = new ContaPoupanca("Matheus", "123456", 50);
		conta2 = new ContaPoupanca("Carlos", "456789", 60);
		
	}

	@Test
	public void transferirTeste() throws SaldoInsuficienteException, SenhaInvalidaException {
		conta.transferir("123456", 15, conta2);
		assertEquals(30, conta.getSaldo(), 0);
		assertEquals(75, conta2.getSaldo(), 0);	
	}
	
	@Test 
	(expected = SaldoInsuficienteException.class)
	public void testeSaldoInsuficiente() throws SaldoInsuficienteException, SenhaInvalidaException {
		conta.transferir("123456", 50, conta2);
		
	}
	
	@Test 
	(expected = SenhaInvalidaException.class)
	public void testeSenhaInvalida() throws SaldoInsuficienteException, SenhaInvalidaException {
		conta.transferir("1236", 15, conta2);
		
	}
	
	

}
