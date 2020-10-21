package polimorfismo.jogo;

public class Sonia extends SubZero {
	
	Sonia(String nome){
		super(nome);
	}
	
	@Override
	public void socar(Lutador lutador) {
		lutador.vida -= 8;
		super.socar(lutador);
	}
	
	@Override
	public void chutar(Lutador lutador) {
		lutador.vida -= 8;
		super.chutar(lutador);

	}
	
	@Override
	public String toString() {
		
		return "Sonia";
	}

}
