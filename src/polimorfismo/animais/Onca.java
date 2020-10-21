package polimorfismo.animais;

public class Onca extends Animal {
	
	public Onca(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ruaaaauuu");
	}
	
	public void correr() {
		System.out.println("Onça correu");
	}
	
	
	
	

}
