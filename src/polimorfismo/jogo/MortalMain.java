package polimorfismo.jogo;

public class MortalMain {
	
	public static void main(String[] args) {
		
		Lutador l1 = new SubZero("Foster");
		Lutador l2 = new Sonia("Ananias");
		Lutador l3 = new NightWolf("José");
		Lutador l4 = new Jax("Matheus");
		
		MortalKombat luta = new MortalKombat(l1, l2);
		MortalKombat luta1 = new MortalKombat(l3, l4);
		
		luta1.fight();
		System.out.println("\n\n");
		
		luta.fight();
		
		
		
		
		
		
		
	}

}
