package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int mesa;
	private List<Item> comanda;
	
	public Cliente(int mesa) {
		this.mesa = mesa;
		comanda = new ArrayList<Item>();
	}
	
	
	public int getMesa() {
		return mesa;
	}
	
	public List<Item> getComanda() {
		return comanda;
	}
	
	public void adicionarPedido(Item item) {
		comanda.add(item);
		
	}
	
	public void removerPedido(Item item) {
		comanda.remove(item);
		
	}
	
	
	public double getConta() {
		double conta = 0;
		
		for(Item e : comanda) {
			conta += e.getPreco();
		}
		
		return conta;
	}

}
