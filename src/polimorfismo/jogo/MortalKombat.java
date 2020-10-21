package polimorfismo.jogo;

import java.util.Random;

public class MortalKombat {
	
	private Lutador lutador1;
	private Lutador lutador2;
	
	public MortalKombat(Lutador lutador1, Lutador lutador2) {
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
		
	}
	
	
	public void fight() {
		
		while(lutador1.getVida() > 0 && lutador2.getVida() > 0) {
			Random sorteio1 = new Random();
			int vezJogador = sorteio1.nextInt(2);
			if(vezJogador == 0) {
				Random sorteio2 = new Random();
				int golpe = sorteio2.nextInt(4);
				System.out.println("Vez de "+ lutador1.getNome());
				if(golpe == 0) {
					System.out.println(lutador1 + " deu um soco em " + lutador2);
					System.out.println("A vida do "+ lutador1 + " eh " + lutador1.getVida() );
					lutador1.socar(lutador2);
				}else if(golpe == 1) {
					System.out.println(lutador1 + " chutou " + lutador2);
					System.out.println("A vida do "+ lutador1 + " eh " + lutador1.getVida() );
					lutador1.chutar(lutador2);
				}else if(golpe == 2) {
					System.out.println(lutador1 + " atirou em " + lutador2);
					System.out.println("A vida do "+ lutador1 + " eh " + lutador1.getVida() );
					lutador1.atirar(lutador2);
				}else {
					System.out.println(lutador1 + " lançou magia em " + lutador2);
					System.out.println("A vida do "+ lutador1 + " eh " + lutador1.getVida() );
					lutador1.lancarMagia(lutador2);
				}
			}else if (vezJogador == 1){
				Random sorteio2 = new Random();
				int golpe = sorteio2.nextInt(4);
				System.out.println("Vez de "+ lutador2.getNome());
				if(golpe == 0) {
					System.out.println(lutador2 + " deu um soco em " + lutador1);
					System.out.println("A vida do "+ lutador2 + " eh " + lutador2.getVida() );
					lutador2.socar(lutador1);
				}else if(golpe == 1) {
					System.out.println(lutador2 + " chutou " + lutador1);
					System.out.println("A vida do "+ lutador2 + " eh " + lutador2.getVida() );
					lutador2.chutar(lutador1);
				}else if(golpe == 2) {
					System.out.println(lutador2 + " atirou em " + lutador1);
					System.out.println("A vida do "+ lutador2 + " eh " + lutador2.getVida() );
					lutador2.atirar(lutador1);
				}else {
					System.out.println(lutador2 + " lançou magia em " + lutador1);
					System.out.println("A vida do "+ lutador2 + " eh " + lutador2.getVida() );
					lutador2.lancarMagia(lutador1);
				}
				
			}
			
			
		}
		if(lutador1.getVida() >= 0) {
			System.out.println("O jogador " + lutador1.getNome() + " venceu!");
		}else {
			System.out.println("O jogador " + lutador2.getNome() + " venceu!");
		}
		
		
	}

}
