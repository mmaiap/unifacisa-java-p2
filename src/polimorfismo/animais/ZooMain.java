package polimorfismo.animais;

public class ZooMain {
	
	public static void main(String[] args) {
		
		Animal a1 = new Leao("leao", 10);
		Animal a2 = new Onca("onca", 1);
		Animal a3 = new Arara("arara", 15);
		Animal a4 = new Urso("urso", 3);
		Animal a5 = new Preguica("preguica", 2);
		
		Zoologico z = new Zoologico();
		z.adicionarAnimal(a1);
		z.adicionarAnimal(a2);
		z.adicionarAnimal(a3);
		z.adicionarAnimal(a4);
		z.adicionarAnimal(a5);
		
		
		for(Animal a : z.getJaulas()) {
			z.cutucar(a);
			if(a instanceof Leao || a instanceof Urso || a instanceof Onca) {
				z.carreira(a);
			}
			
		}
		
	}

}
