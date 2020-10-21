package polimorfismo.jogo;

public class Jax extends Lutador {
	
	public Jax(String nome) {
		super(nome);
	}
	
	@Override
	public void socar(Lutador lutador) {
		lutador.vida -= 10;
		super.chutar(lutador);
		
	}
	
	@Override
	public String toString() {
		
		return "Jax";
	}
	

}
