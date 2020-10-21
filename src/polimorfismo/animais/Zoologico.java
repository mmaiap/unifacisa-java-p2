package polimorfismo.animais;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private List<Animal> jaulas = new ArrayList<Animal> ();
	
	public void adicionarAnimal(Animal animal) {
		jaulas.add(animal);
	}
	
	public List<Animal> getJaulas() {
		return jaulas;
	}
	
	public void cutucar(Animal animal) {
		animal.emitirSom();
	}
	
	public void carreira(Animal animal) {
		if(animal instanceof Urso) {
			((Urso) animal).correr();
		}else if(animal instanceof Leao) {
			((Leao) animal).correr();
		}else if(animal instanceof Onca) {
			((Onca) animal).correr();
		}
		
	}
	
	
	
	

}
