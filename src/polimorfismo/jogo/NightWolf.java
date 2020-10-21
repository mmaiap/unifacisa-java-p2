package polimorfismo.jogo;

public class NightWolf extends Lutador {

	NightWolf(String nome) {
		super(nome);
	}
	
	@Override
	public void atirar(Lutador lutador) {
		lutador.vida -= 5;
		super.atirar(lutador);

	}
	
	@Override
	public void lancarMagia(Lutador lutador) {
		lutador.vida -= 6;
		super.lancarMagia(lutador);

	}
	
	@Override
	public String toString() {
		
		return "NightWolf";
	}
	
	

}
