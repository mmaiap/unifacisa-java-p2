package listas.questao3;

import java.util.ArrayList;
import java.util.List;


public class LojaDeCarros {
	
	List<Carro> carrosDisponiveis = new ArrayList<Carro>();
	List<Carro> carrosVendidos = new ArrayList<Carro>();
	
	
	public void adicionarCarro(Carro carro) {
		
		carrosDisponiveis.add(carro);
		
	}
	public void exibirCarrosDisponiveis() {
		
		System.out.println(carrosDisponiveis);
		
		
	}
	
	public void VenderCarro(int id) {
		
		for(int i = 0; i < carrosDisponiveis.size(); i++) {
			
			if(id == carrosDisponiveis.get(i).id) {
				
				carrosVendidos.add(carrosDisponiveis.get(i));
				carrosDisponiveis.remove(i);
				
			}
		}
		
	}
	
	public void adicionarPromocao(int id) {
		
		double valor = 0;
		
		for(int i = 0; i < carrosDisponiveis.size(); i++) {
			
			if(id == carrosDisponiveis.get(i).id) {
				valor = carrosDisponiveis.get(i).precoBase;
				carrosDisponiveis.get(i).precoBase = valor - (valor * 0.15);
				
			}
			
		}
	}
	
	public double computaApuradoDasVendas() {
		
		double total = 0;
		
		for(int i = 0; i < carrosVendidos.size(); i++) {
			
			total += carrosVendidos.get(i).precoBase;
			
		}
		
		return total;
		
	}
	
	public void limparVendidos() {
		
		carrosVendidos.clear();
	}
	
			

}
