package polimorfismo.animais;

public class Leao extends Animal {
	
	public Leao(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("rugido");
	}
	
	public void correr() {
		System.out.println("Leão correu");
	}
	
	

}
