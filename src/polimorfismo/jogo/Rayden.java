package polimorfismo.jogo;

public class Rayden extends Jax {
	
	Rayden(String nome){
		super(nome);
	}
	
	@Override
	public void lancarMagia(Lutador lutador) {
		lutador.vida -= 9;
		super.lancarMagia(lutador);
	}
	
	@Override
	public String toString() {
		
		return "Rayden";
	}

}
