package polimorfismo.animais;

public class Urso extends Animal {
	
	public Urso(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("aaaaaaaaaaaaaaoooooooooo");
	}
	
	public void correr() {
		System.out.println("Urso saiu rolando");
	}
}
