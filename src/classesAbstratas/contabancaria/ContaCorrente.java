package classesAbstratas.contabancaria;

public class ContaCorrente extends ContaBancaria {
	
public ContaCorrente(String nome, String senha, double saldo) {
		
		super.nome = nome;
		super.senha = senha;
		super.saldo = saldo;
		
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta)
			throws SaldoInsuficienteException, SenhaInvalidaException {
		
		if(!this.senha.equals(senha)) {
			throw new SenhaInvalidaException();
			
		}else {
			if(valor < 5000) {
				if(this.getSaldo() < valor + valor * 0.0025) {
					throw new SaldoInsuficienteException();
				}else {
					conta.saldo += valor;
					this.saldo -= valor + valor * 0.0025;
				}
				
				
			}else {
				if(this.getSaldo() < valor + 15) {
					throw new SaldoInsuficienteException();
				}
				else {
					conta.saldo += valor;
					this.saldo -= valor + 15;
				}
			}
		}
		
		
	}

}
