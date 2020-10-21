package polimorfismo.animais;

public class Animal {
	
	private String nome;
	private int idade;
	
	Animal(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void emitirSom() {
		
		System.out.println("animal emitindo som");
	}

}
