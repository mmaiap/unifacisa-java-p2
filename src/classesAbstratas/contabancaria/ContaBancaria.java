package classesAbstratas.contabancaria;

public abstract class ContaBancaria {
	
	protected String nome;
	protected String senha;
	protected double saldo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException;
	
	

}
