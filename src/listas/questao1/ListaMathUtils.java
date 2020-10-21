package listas.questao1;

import java.util.ArrayList;

import java.util.List;

public class ListaMathUtils {
	
	
	public static List<Integer> calculaDivisores(int num){
		
		List<Integer> divisores = new ArrayList<Integer>();
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				divisores.add(i);
			}
			
		}
		
		return divisores;
		
	}
	
	public static double computaMaior(List numeros) {
		
		double maior = (double) numeros.get(0);
		
		for(int i = 0; i < numeros.size(); i++) {
			
			if((double)numeros.get(i) >= maior) {
				maior = (double )numeros.get(i);
			}
			
		}
		
		return maior;
		
	}
	
	public static double computaMenor(List numeros) {
			
			double menor = (double) numeros.get(0);
			
			for(int i = 0; i < numeros.size(); i++) {
				
				if((double)numeros.get(i) <= menor) {
					menor = (double )numeros.get(i);
				}
				
			}
			
			return menor;
	
	
	
	}
	public static double computaMedia(List numeros) {
		
		double soma = 0;
		double media;
		
		
		for(int i = 0; i < numeros.size(); i++) {
			
			soma += (double) numeros.get(i);
			
		}
		
		media = soma / numeros.size();
		
		
		return media;
		
	}
	
	public static boolean temNumRepetido(List numeros) {
		
		int repetido = 0;
		double contador1 = 0;
		double contador2 = 0;
		
		
		for(int i = 0; i < numeros.size()-1; i++) {
			contador1 = (double) numeros.get(i);
			for(int k = i+1; k < numeros.size(); k++) {
				contador2 = (double) numeros.get(k);
				
				if(contador1 == contador2) {
					
					repetido++;
				
			}
			
			}
			
		}
		
		if(repetido != 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	

}
