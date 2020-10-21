package polimorfismo.jogo;

public class Lutador {
	
	protected String nome;
	protected int vida = 100;
	
	Lutador(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void socar(Lutador lutador) {
		lutador.vida -= 7;
		if(lutador.getVida() <= 0) {
			System.out.println("A vida de " + lutador + " agora eh zero ");
		}else {
			System.out.println("A vida de " + lutador + " agora eh " + lutador.getVida());
			System.out.println("-----------------------------------------");
		}
	}
	
	public void chutar(Lutador lutador) {
		lutador.vida -= 5;
		if(lutador.getVida() <= 0) {
			System.out.println("A vida de " + lutador + " agora eh zero ");
		}else {
			System.out.println("A vida de " + lutador + " agora eh " + lutador.getVida());
			System.out.println("-----------------------------------------");
		}
	}
	
	public void atirar(Lutador lutador) {
		lutador.vida -= 10;
		if(lutador.getVida() <= 0) {
			System.out.println("A vida de " + lutador + " agora eh zero ");
		}else {
			System.out.println("A vida de " + lutador + " agora eh " + lutador.getVida());
			System.out.println("-----------------------------------------");
			
		}
	}
	public void lancarMagia(Lutador lutador) {
		lutador.vida -= 12;
		if(lutador.getVida() <= 0) {
			System.out.println("A vida de " + lutador + " agora eh zero ");
		}else {
			System.out.println("A vida de " + lutador + " agora eh " + lutador.getVida());
			System.out.println("-----------------------------------------");
		}
	}
	
	

}
