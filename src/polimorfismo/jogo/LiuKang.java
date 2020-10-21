package polimorfismo.jogo;

public class LiuKang extends NightWolf{
	
	LiuKang(String nome){
		super(nome);
	}
	
	@Override
	public void chutar(Lutador lutador) {
		lutador.vida -= 9;
		super.chutar(lutador);

	}
	
	@Override
	public void lancarMagia(Lutador lutador) {
		lutador.vida -= 8;
		super.lancarMagia(lutador);

	}
	
	@Override
	public String toString() {
		
		return "LiuKang";
	}

}
