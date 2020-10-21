package classesAbstratas.contabancaria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTest {
	
	
	private ContaBancaria conta;
	private ContaBancaria conta2;
	private ContaBancaria conta3;
	
	@Before
	public void inicio() {
		conta = new ContaCorrente("Matheus", "123456", 4000);
		conta2 = new ContaCorrente("Carlos", "456789", 6000);
		conta3 = new ContaCorrente("Ananias", "147899", 20000);
		
	}

	@Test
	public void transferirTeste() throws SaldoInsuficienteException, SenhaInvalidaException {
		conta.transferir("123456", 1000, conta2);
		assertEquals(2997.5, conta.getSaldo(), 0);
		assertEquals(7000, conta2.getSaldo(), 0);	
		conta3.transferir("147899", 5000, conta2);
		assertEquals(14985, conta3.getSaldo(), 0);
		assertEquals(12000, conta2.getSaldo(), 0);
	}
	
	@Test 
	(expected = SaldoInsuficienteException.class)
	public void testeSaldoInsuficiente() throws SaldoInsuficienteException, SenhaInvalidaException {
		conta.transferir("123456", 4000, conta2);
		
	}
	
	@Test 
	(expected = SenhaInvalidaException.class)
	public void testeSenhaInvalida() throws SaldoInsuficienteException, SenhaInvalidaException {
		conta.transferir("1236", 1000, conta2);
		
	}



}
