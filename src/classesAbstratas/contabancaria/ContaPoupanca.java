package classesAbstratas.contabancaria;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca(String nome, String senha, double saldo) {
		
		super.nome = nome;
		super.senha = senha;
		super.saldo = saldo;
		
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException{
		if(!this.senha.equals(senha)) {
			throw new SenhaInvalidaException();
			
		}else {
			if(this.getSaldo() < valor + 5) {
				throw new SaldoInsuficienteException();
			}else {
				conta.saldo += valor;
				this.saldo -= valor + 5;
			}
		}
		
	}

}
