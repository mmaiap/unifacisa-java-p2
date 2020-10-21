package polimorfismo.jogo;

public class SubZero extends Lutador {
	
	SubZero(String nome){
		super(nome);
	}
	
	@Override
	public void lancarMagia(Lutador lutador) {
		lutador.vida -= 8;
		super.lancarMagia(lutador);

	}
	
	@Override
	public String toString() {
		
		return "SubZero";
	}
	
	

}
