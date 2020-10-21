package listas.questao2;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	List<String> procurados = new ArrayList<String>();
	
	public void adicionarProcurados(String nome) {
		
		procurados.add(nome);
		
			}
	
	public boolean ehProcurado(String nome) {
		
		if(procurados.contains(nome)) {
			return true;
		}else {
			return false;
		}
	}
	

}
