package polimorfismo.animais;

public class Arara extends Animal {
	
	public Arara(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("rarararara");
	}
	
	

}
